package br.com.study.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fabricante {
    private String nome;
    private ArrayList<Motor> modelosDeMotor;
}