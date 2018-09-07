package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/brand")
//@Controller
@RestController //组合注解；@ResponseBody @Controller；对本来的所有方法生效
public class BrandController {

    @Reference
    private BrandService brandService;

    /**
     * 查询所有品牌列表
     * @return 品牌列表
     */
    //@RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @GetMapping("/findAll")
    //@ResponseBody
    public List<TbBrand> queryAll(){
        return brandService.queryAll();
    }
}
