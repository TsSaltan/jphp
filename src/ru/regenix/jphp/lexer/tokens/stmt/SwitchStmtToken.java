package ru.regenix.jphp.lexer.tokens.stmt;

import ru.regenix.jphp.lexer.TokenType;
import ru.regenix.jphp.lexer.tokens.TokenMeta;

public class SwitchStmtToken extends StmtToken {
    public SwitchStmtToken(TokenMeta meta) {
        super(meta, TokenType.T_SWITCH);
    }
}
