package com.H2O.backend.hospital;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHospital is a Querydsl query type for Hospital
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHospital extends EntityPathBase<Hospital> {

    private static final long serialVersionUID = -1234062594L;

    public static final QHospital hospital = new QHospital("hospital");

    public final StringPath addr = createString("addr");

    public final ListPath<com.H2O.backend.board.Board, com.H2O.backend.board.QBoard> board = this.<com.H2O.backend.board.Board, com.H2O.backend.board.QBoard>createList("board", com.H2O.backend.board.Board.class, com.H2O.backend.board.QBoard.class, PathInits.DIRECT2);

    public final ListPath<com.H2O.backend.doctor.Doctor, com.H2O.backend.doctor.QDoctor> doctor = this.<com.H2O.backend.doctor.Doctor, com.H2O.backend.doctor.QDoctor>createList("doctor", com.H2O.backend.doctor.Doctor.class, com.H2O.backend.doctor.QDoctor.class, PathInits.DIRECT2);

    public final StringPath hospitalName = createString("hospitalName");

    public final NumberPath<Long> hospitalNo = createNumber("hospitalNo", Long.class);

    public final StringPath hospitalType = createString("hospitalType");

    public final StringPath latitude = createString("latitude");

    public final StringPath logo = createString("logo");

    public final StringPath longitude = createString("longitude");

    public final StringPath medicalPerson = createString("medicalPerson");

    public final StringPath tel = createString("tel");

    public QHospital(String variable) {
        super(Hospital.class, forVariable(variable));
    }

    public QHospital(Path<? extends Hospital> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHospital(PathMetadata metadata) {
        super(Hospital.class, metadata);
    }

}

