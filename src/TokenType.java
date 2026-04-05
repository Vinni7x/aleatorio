
public enum TokenType {
	
    CLASS("keyword"),
    CONSTRUCTOR("keyword"),
    FUNCTION("keyword"),
    METHOD("keyword"),
    FIELD("keyword"),
    STATIC("keyword"),
    VAR("keyword"),
    INT("keyword"),
    CHAR("keyword"),
    BOOLEAN("keyword"),
    VOID("keyword"),
    TRUE("keyword"),
    FALSE("keyword"),
    NULL("keyword"),
    THIS("keyword"),
    LET("keyword"),
    DO("keyword"),
    IF("keyword"),
    ELSE("keyword"),
    WHILE("keyword"),
    RETURN("keyword");
  
    

    private final String xmlTag;

    TokenType(String xmlTag) {
        this.xmlTag = xmlTag;
    }

    public String getXmlTag() {
        return xmlTag;
    }
}

