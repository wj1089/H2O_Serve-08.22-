package com.H2O.backend.board;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
interface BoardService {
    List<Board> findAll();
    void delete(Board selectBoard);
    Board update(Board selectBoard);
    List<Board> findOneBoard(String medCategory);
    Board findTitle(String title);
}
    @Service
    public class BoardServiceImpl implements BoardService {
        private final BoardRepository boardRepository;


        public BoardServiceImpl(BoardRepository boardRepository) {
            this.boardRepository = boardRepository;
        }


        @Override
        public List<Board> findAll() {
            return boardRepository.findAll();
        }

        @Override
        public Board update(Board selectBoard) {
            return boardRepository.save(selectBoard);
        }

        @Override
        public List<Board> findOneBoard(String medCategory) {
            return boardRepository.findAllByMedCategory(medCategory);
        }

        @Override
        public Board findTitle(String title) {
            return boardRepository.findAllByTitle(title);
        }

        @Override
        public void delete(Board selectBoard) {
            boardRepository.delete(selectBoard);
        }
    }

//    public Board findOne(String searchWord){
//
//        return boardRepository.findOneByWord(searchWord);
//    }

