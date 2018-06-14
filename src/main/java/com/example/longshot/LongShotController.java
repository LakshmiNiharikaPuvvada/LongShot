package com.example.longshot;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LongShotController implements Longshot{

	@Override
	public String rank() {
		return "Welcome to LongShot team";
	}

	@Override
	public String publish(String message) {
		return "publishy7";
	}

	@Override
	public ResponseBody tuneRelevance() {
		return null;
	}

	@Override
	public ResponseBody importRatings() {
		return null;
	}

	@Override
	public ResponseBody takeSnapshot() {
		return null;
	}

	@Override
	public ResponseBody selectCustomScorers() {
		return null;
	}

	@Override
	public ResponseBody updateSettings() {
		return null;
	}

}
