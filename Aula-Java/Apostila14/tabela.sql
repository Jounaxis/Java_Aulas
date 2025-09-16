create table t_tdspw_funcionario(
        cd_funcionario number(6,0) primary key,
        nm_funcionario varchar(100),
        vl_salario number(6,2),
        st_ativo number(1,0),
        ds_email varchar(80)
);