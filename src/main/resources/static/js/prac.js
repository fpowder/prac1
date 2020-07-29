$(function () {
    console.log('hello');
    var Books = Backbone.Collection.extend({
        url: '/books',
        parse: function (data) {
            console.log(data);
            return data["books"];
        }
    });
    var sampleModel = new Books();
    sampleModel.fetch({
        success :function(data){
            console.log(data);
        }
    });

    _.each([1,2,3], console.log);

    //console.log(sampleModel);

    var $backCheck = new Array();

    $backCheck = $('[name=backCheck]:checkbox');
    console.log('$backCheck elements..');
    console.log($backCheck);

});

var checkBoxs = Backbone.View.extend({
    el: "#eventInfo",
    events:{
        "click #checkControl"                   : "checkboxButtonEvent",
        "click [name=backCheck]:checkbox"       : "eachCheckEvent",
        "click #allCheck"                       : "allCheckEvent"
    },
    checkboxButtonEvent: function(){

    },
    eachCheckEvent: function(){

    },
    allCheckEvent: function(){

    }


});

