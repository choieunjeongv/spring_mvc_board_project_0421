package com.javaeunjeong.MVCboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javaeunjeong.MVCboard.dao.BDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map =  model.asMap();
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
	
		String bId = request.getParameter("bId");
				
		
		BDao dao = new BDao();
		
		dao.delete(bId);
	}

}
