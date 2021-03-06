package com.jerusalem.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerusalem.common.utils.PageUtils;
import com.jerusalem.goods.entity.SkuInfoEntity;
import com.jerusalem.goods.vo.SkuItemVo;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/****
 * 服务层接口
 * sku信息
 * @author jerusalem
 * @email 3276586184@qq.com
 * @date 2020-04-09 14:48:19
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    /**
    * 根据分类、品牌、价格、关键词进行分页查询
    * @param params
    * @return
    */
    PageUtils queryPageByCondition(Map<String, Object> params);

    /***
     * 保存SKU的基本信息
     * @param skuInfo
     */
    void saveSkuInfo(SkuInfoEntity skuInfo);

    /***
     * 根据spuId查询sku集合
     * @param spuId
     * @return
     */
    List<SkuInfoEntity> getSkuListBySpuId(Long spuId);

    /***
     * 商品详情封装
     * @param skuId
     * @return
     */
    SkuItemVo skuItem(Long skuId) throws ExecutionException, InterruptedException;
}

