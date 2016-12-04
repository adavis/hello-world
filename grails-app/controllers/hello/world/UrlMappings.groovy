package hello.world

class UrlMappings {

    static mappings = {
        "/books"(resources: 'books')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
