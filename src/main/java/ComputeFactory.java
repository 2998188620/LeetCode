import java.nio.channels.ClosedSelectorException;

public class ComputeFactory {

    private static final Sub sub = new Sub();
    private static final Add add = new Add();

    public static Computable getSymbol(String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
