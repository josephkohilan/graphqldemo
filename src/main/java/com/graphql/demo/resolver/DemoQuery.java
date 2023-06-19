package com.graphql.demo.resolver;

import com.graphql.demo.entities.DemoTable;
import com.graphql.demo.h2.entities.DemoTableH2;
import com.graphql.demo.h2.repository.DemoH2Repository;
import com.graphql.demo.repository.DemoRepository;
import com.graphql.demo.response.Response;
import com.graphql.demo.service.DemoService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class DemoQuery implements GraphQLQueryResolver {

    private DemoService demoService;
    private DemoRepository demoRepository;
    private DemoH2Repository demoH2Repository;

    public DemoQuery(DemoService demoService, DemoRepository demoRepository, DemoH2Repository demoH2Repository) {
        this.demoService = demoService;
        this.demoRepository = demoRepository;
        this.demoH2Repository = demoH2Repository;
    }

    public Response getDemoDataOne(String input) {
        DemoTable demoTable = demoRepository.getOne(1);
        DemoTableH2 demoTableH2 = demoH2Repository.getOne(1);
        Response response = new Response();
        response.setInputOne(input);
        response.setInputTwo(demoTable.getCol1());
        response.setInputThree(demoTableH2.getCol2());
        return response;
    }

    public Response getDemoDataTwo(String input) {
        Response response = new Response();
        response.setInputOne(input);
        response.setInputTwo("demo");
        response.setInputThree("getTwo");
        return response;
    }

}
