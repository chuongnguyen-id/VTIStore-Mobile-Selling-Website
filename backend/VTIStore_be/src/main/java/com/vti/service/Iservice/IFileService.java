package com.vti.service.Iservice;

import org.springframework.web.multipart.MultipartFile;

public interface IFileService {
	String uploadFile(MultipartFile file);

}
