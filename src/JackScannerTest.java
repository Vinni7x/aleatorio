import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class JackScannerTest {
	
    @Test
    void testNumeroBasico() {
        // "289" → <integerConstant> 289 </integerConstant>
        JackScanner scanner = new JackScanner("289");
        List<Token> tokens = scanner.tokenize();

        assertEquals("<integerConstant> 289 </integerConstant>", tokens.get(0).toXML());
    }

    @Test
    void testNumerosComXml() {
        
        String[][] casos = {
            { "0",     "<integerConstant> 0 </integerConstant>"   },
            { "289",   "<integerConstant> 289 </integerConstant>" },
            { "42",    "<integerConstant> 42 </integerConstant>"  },
            { " 123 ", "<integerConstant> 123 </integerConstant>" }, // com espaços
        };

        for (String[] caso : casos) {
            JackScanner scanner = new JackScanner(caso[0]);
            List<Token> tokens = scanner.tokenize();
            assertEquals(caso[1], tokens.get(0).toXML(), "Falhou para: " + caso[0]);
        }
    }
	

}
