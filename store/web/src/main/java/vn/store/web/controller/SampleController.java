package vn.store.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.store.service.IActorService;

@Controller
public class SampleController {

    @Autowired
//    @Qualifier(value="actorService")
    private IActorService actorService;

    @RequestMapping(value = "/hello/{message}", method = RequestMethod.GET)
    public @ResponseBody SampleResponse sayHello(@PathVariable String message) {
    	int count = actorService.findAll().size();
        return new SampleResponse("hello " + count, "SUCCESS");
    }
}
