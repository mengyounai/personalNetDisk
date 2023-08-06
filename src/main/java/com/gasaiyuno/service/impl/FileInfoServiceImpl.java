package com.gasaiyuno.service.impl;


import com.gasaiyuno.entity.FileInfo;
import com.gasaiyuno.model.dto.SessionWebUserDto;
import com.gasaiyuno.model.dto.UploadResultDto;
import com.gasaiyuno.model.query.FileInfoQuery;
import com.gasaiyuno.model.vo.PaginationResultVO;
import com.gasaiyuno.service.FileInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.*;


/**
 * 文件信息 业务接口实现
 */
@Service("fileInfoService")
public class FileInfoServiceImpl implements FileInfoService {

    private static final Logger logger = LoggerFactory.getLogger(FileInfoServiceImpl.class);

    @Resource
    @Lazy
    private FileInfoServiceImpl fileInfoService;


    @Override
    public List<FileInfo> findListByParam(FileInfoQuery param) {
        return null;
    }

    @Override
    public Integer findCountByParam(FileInfoQuery param) {
        return null;
    }

    @Override
    public PaginationResultVO<FileInfo> findListByPage(FileInfoQuery param) {
        return null;
    }

    @Override
    public Integer add(FileInfo bean) {
        return null;
    }

    @Override
    public Integer addBatch(List<FileInfo> listBean) {
        return null;
    }

    @Override
    public Integer addOrUpdateBatch(List<FileInfo> listBean) {
        return null;
    }

    @Override
    public FileInfo getFileInfoByFileIdAndUserId(String fileId, String userId) {
        return null;
    }

    @Override
    public Integer updateFileInfoByFileIdAndUserId(FileInfo bean, String fileId, String userId) {
        return null;
    }

    @Override
    public Integer deleteFileInfoByFileIdAndUserId(String fileId, String userId) {
        return null;
    }

    @Override
    public UploadResultDto uploadFile(SessionWebUserDto webUserDto, String fileId, MultipartFile file, String fileName, String filePid, String fileMd5, Integer chunkIndex, Integer chunks) {
        return null;
    }

    @Override
    public FileInfo rename(String fileId, String userId, String fileName) {
        return null;
    }

    @Override
    public FileInfo newFolder(String filePid, String userId, String folderName) {
        return null;
    }

    @Override
    public void changeFileFolder(String fileIds, String filePid, String userId) {

    }

    @Override
    public void removeFile2RecycleBatch(String userId, String fileIds) {

    }

    @Override
    public void recoverFileBatch(String userId, String fileIds) {

    }

    @Override
    public void delFileBatch(String userId, String fileIds, Boolean adminOp) {

    }

    @Override
    public void checkRootFilePid(String rootFilePid, String userId, String fileId) {

    }

    @Override
    public void saveShare(String shareRootFilePid, String shareFileIds, String myFolderId, String shareUserId, String cureentUserId) {

    }

    @Override
    public Long getUserUseSpace(String userId) {
        return null;
    }

    @Override
    public void deleteFileByUserId(String userId) {

    }
}