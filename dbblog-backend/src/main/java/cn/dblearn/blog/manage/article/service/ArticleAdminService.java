package cn.dblearn.blog.manage.article.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.manage.article.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * BlogArticleAdminService
 *
 * @author bobbi
 * @date 2018/11/21 12:47
 * @email 571002217@qq.com
 * @description
 */
public interface ArticleAdminService extends IService<Article> {

    /**
     * 分页查询博文列表
     * @param params
     * @return
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存博文文章
     * @param blogArticle
     */
    void saveArticle(Article blogArticle);

    /**
     * 批量删除
     * @param articleIds
     */
    void deleteBatch(Integer[] articleIds);

    /**
     * 更新博文
     * @param blogArticle
     */
    void updateArticle(Article blogArticle);
}
