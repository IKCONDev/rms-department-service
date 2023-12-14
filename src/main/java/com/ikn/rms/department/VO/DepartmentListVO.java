package com.ikn.rms.department.VO;

import java.util.List;

import com.ikn.rms.department.entity.Department;

import lombok.Data;

@Data
public class DepartmentListVO {

	private List<Department> department;
}
