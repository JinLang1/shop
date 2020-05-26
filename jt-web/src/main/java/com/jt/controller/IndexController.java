package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
	
	/**
	 * 问题:1.京东的页面为什么采用.html
	 * 答案:
	 * 	采用html静态的方式原因2
	 * 	1.静态页面浏览器加载的速度更快.
	 * 	2.以.html结尾的页面,更加的容易被搜索引擎收录. 可以提高网站的曝光率.
	 * 
	 * 问题2:为什么搜索引擎只收录静态页面,而不是动态页面?
	 * 搜索引擎的工作原理: 倒排索引
	 * 倒排索引:根据关键字检索文章的位置. 可以快速的获取查询的结果
	 * 
	 * 假设:收录了动态页面 数据是变化的!!!
	 *如果搜索引擎收录动态页面,则无法保证搜索准确性.
	 *
	 *  知识复习:
	 *  	如果需要通过.html的方式访问页面.则在webapp的目录中必须有一个与之
	 * 对应的静态文件才能予以展现.
	 * 
	 * 问题:京东的网址为
	 * https://item.jd.com/100009177374.html.那么京东家是否需要准备
	 * 100009177374个静态页面????
	 * 分析:京东一定采用了动态的页面的脚本技术实现该功能.
	 * 
	 * 问题:如何解决动态页面与静态面的平衡呢?
	 *
	 *伪静态说明:
	 *	伪静态是相对真实静态来讲的，通常我们为了增强搜索引擎的友好面，都将文章内容生成静态页面，
	 *	但是有的朋友为了实时的显示一些信息。或者还想运用动态脚本解决一些问题。不能用静态的方式来展示网站内容。但是这就损失了对搜索引擎的友好面。怎么样在两者之间找个中间方法呢，这就产生了伪静态技术。伪静态技术是指展示出来的是以html一类的静态页面形式，但其实是用ASP一类的动态脚本来处理的。
	 * 
	 * 	总结:以.html形式展现出来的动态页面.
	 * 
	 * 问题:如何实现??
	 * 实现思路: 拦截以.html结尾的请求即可.
	 * 
	 * 
	 */
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	
	
	
	
}
