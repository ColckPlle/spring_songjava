package com.example.mvc.service;

import com.example.mvc.domain.Board;
import com.example.mvc.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 게시판 서비스
 * 
 * 
 * **/
@Service

public class BoardService {
    @Autowired
    public BoardRepository repository;
    public List<Board> getList(){
        return repository.getList();
    }
    public Board get(int boardSeq){
        return repository.get(boardSeq);
    }
    public void save(Board board){
        repository.save(board);
    }
    public void delete(int boardSeq){
        repository.delete(boardSeq);}
    public void update(Board board){
        repository.update(board);
    }
}
