package com.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validateCodeServlet")
public class ValidateCodeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//设置响应对象响应一个图片类型的内容
		resp.setContentType("image/jpeg");	
	
		int img_width=100;//图片的宽度
		
		int img_height=30;//图片的高度
		
		//创建一个图片对象	
		BufferedImage img=new BufferedImage(img_width, img_height, BufferedImage.TYPE_INT_RGB);
		//通过图片对象来创建画布对象
		Graphics2D graphics=(Graphics2D) img.getGraphics();
		//设置画布的背景
		graphics.setColor(Color.YELLOW);
		//在画布上绘制矩形
		graphics.fillRect(0, 0, img_width, img_height);
		//设置文字的颜色
		graphics.setColor(Color.BLACK);
		//设置文字格式
		graphics.setFont(new Font("宋体", Font.PLAIN, 20));
		//在画布上添加字符串
		graphics.drawString(this.getCode(), 30, 23);
		
		//将图片写到客户端
		ImageIO.write(img, "JPEG", resp.getOutputStream());
		
		//xml ,json
	}
	
	/*生成随机码*/
	public String getCode(){
		
		Random random=new Random();
		
		StringBuffer buf=new StringBuffer();
		
		for(int i=0;i<4;i++){
		
			int num=random.nextInt(10);
			
			buf.append(num);
		
		}
		
		return buf.toString();
	}

}
