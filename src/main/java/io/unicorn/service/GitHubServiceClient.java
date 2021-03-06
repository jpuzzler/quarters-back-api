package io.unicorn.service;

import io.unicorn.service.dto.Issue;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "qb-issues", url = "https://api.github.com")
public interface GitHubServiceClient {

    @RequestMapping("/issues")
    List<Issue> getAllIssues();
}
