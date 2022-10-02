package com.clarivate.FoodApp.restImplementation;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.FoodApp.constants.FoodAppConstants;
import com.clarivate.FoodApp.rest.BillRest;
import com.clarivate.FoodApp.service.BillService;
import com.clarivate.FoodApp.utils.FoodAppUtils;

@RestController
public class BillRestImpl implements BillRest{
	
	@Autowired
	BillService billService;

	@Override
	public ResponseEntity<String> generateReport(Map<String, Object> requestMap) {
		try {
			billService.generateReport(requestMap);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return FoodAppUtils.getResponseEntity(FoodAppConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
