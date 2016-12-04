package hello.world

import grails.rest.RestfulController

class BooksController extends RestfulController {
    static responseFormats = ['json']

    BooksController() {
        super(Book)
    }

    @Override
    def index() {
    	respond params?.q ? Book.findAllByTitleLike("%${params.q}%") : Book.list()
    }
}