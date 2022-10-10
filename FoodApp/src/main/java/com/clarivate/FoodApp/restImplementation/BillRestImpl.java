package com.clarivate.FoodApp.restImplementation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.FoodApp.constants.FoodAppConstants;
import com.clarivate.FoodApp.model.Bill;
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
			return billService.generateReport(requestMap);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return FoodAppUtils.getResponseEntity(FoodAppConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Bill>> getBills() {
		try {
			return billService.getBills();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ResponseEntity<byte[]> getPdf(Map<String, Object> requestMap) {
		// TODO Auto-generated method stub
		try {
			return billService.getPdf(requestMap);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
