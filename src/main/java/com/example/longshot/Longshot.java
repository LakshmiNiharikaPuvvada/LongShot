package com.example.longshot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/longshot")
public interface Longshot {
	
	@GetMapping("/rank")
    public String rank();
	
	@PostMapping("/relavanceRank")
	public String publish(@RequestParam String message);

	@PostMapping("/tuneRelevance")
	public ResponseBody tuneRelevance();
	
	@PostMapping("/importRatings")
	public ResponseBody importRatings();
	
	@PostMapping("/takeSnapshot")
	public ResponseBody takeSnapshot();
	
	
	@GetMapping("/customScorers")
	public ResponseBody selectCustomScorers();
	
	@PutMapping("/updateSettings")
	public ResponseBody updateSettings();
}
