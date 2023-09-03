package br.com.msemail.enums;

public enum StatusEmail {

    PROCESSING(1, "Processando"),
    SEND(2,"ENVIADO"),
    ERROR(3, "ERRO");

    private int code;
    private String descricao;

    private StatusEmail(int code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusEmail valueOf(Integer code) {

        if(code == null) {
            return null;
        }

        for (StatusEmail value : StatusEmail.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid orderStatus code");
    }
}
