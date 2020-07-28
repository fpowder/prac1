let Books = Backbone.Collection.extend({
    url : '/books',
    parse : (data) => {
        console.log(data);
        return data["books"];
    }
})

