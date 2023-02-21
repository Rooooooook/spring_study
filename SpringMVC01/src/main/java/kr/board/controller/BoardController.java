package kr.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.Board;

//@Controller : 해당 클래스가 컨트롤러라는 것을 알려줌
@Controller
public class BoardController {

	
	//클라이언트 요청을 받아서 처리
	//클라이언트에서 /boardList.do 요청
	@RequestMapping("/boardList.do") //HandlerMapping
	public String boardList(Model model) {
		Board vo = new Board();
 		vo.setIdx(1);
		vo.setTitle("게시판");
		vo.setWriter("홍길동");
		vo.setContent("내가1번이다.");
		vo.setCount(2);
		vo.setIndate("2023-02-21");
		List<Board> list = new ArrayList<Board>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		
		model.addAttribute("list", list);
		
		return "boardList"; // /WEB-INF/views/boardList.jsp -> forward
	}
	
}
