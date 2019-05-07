package com.jerry.feign;
import com.jerry.service.MemberService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("member")
public interface MemberFeign extends MemberService {

}
