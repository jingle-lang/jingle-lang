// Generated from JingleLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JingleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, VAR=2, ARRAY=3, CONST=4, DISPLAY=5, RETURN=6, IF=7, ELSE=8, 
		ELIF=9, FOR=10, TRUE=11, FALSE=12, FUNC=13, CLASS=14, LET=15, TRAIT=16, 
		DEFINE=17, PROTOCOL=18, ASSIGN=19, EQUALS=20, PLUS=21, MINUS=22, MULTIPLY=23, 
		DIVIDE=24, LESSTHAN=25, GREATERTHAN=26, NOTEQUAL=27, BANG=28, OR=29, EQEQ=30, 
		HASH=31, AMBERSAND=32, COMMA=33, SEMICOLON=34, LBRACKET=35, RBRACKET=36, 
		LBRACE=37, RBRACE=38, LSQRBRACKET=39, RSQRBRACKET=40, ARROW=41, FLOAT=42, 
		STRING=43, BOOLEAN=44, NULL=45, CHAR=46, INT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "DIGIT_CONT", "HEXDIGIT", "BINARY", "WHITESPACE", "COMMENT", 
			"VAR", "ARRAY", "CONST", "DISPLAY", "RETURN", "IF", "ELSE", "ELIF", "FOR", 
			"TRUE", "FALSE", "FUNC", "CLASS", "LET", "TRAIT", "DEFINE", "PROTOCOL", 
			"ASSIGN", "EQUALS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "LESSTHAN", 
			"GREATERTHAN", "NOTEQUAL", "BANG", "OR", "EQEQ", "HASH", "AMBERSAND", 
			"COMMA", "SEMICOLON", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LSQRBRACKET", 
			"RSQRBRACKET", "ARROW", "FLOAT", "STRING", "BOOLEAN", "NULL", "CHAR", 
			"INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'var'", "'array'", null, "'display'", "'return'", "'if'", 
			"'else'", "'elif'", "'for'", "'true'", "'false'", null, "'class'", "'let'", 
			"'trait'", "'def'", "'protocol'", "':'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'<'", "'>'", "'!='", "'!'", "'|'", "'=='", "'#'", "'&'", "','", 
			"';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'float'", "'string'", 
			"'bool'", "'null'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "VAR", "ARRAY", "CONST", "DISPLAY", "RETURN", "IF", 
			"ELSE", "ELIF", "FOR", "TRUE", "FALSE", "FUNC", "CLASS", "LET", "TRAIT", 
			"DEFINE", "PROTOCOL", "ASSIGN", "EQUALS", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "LESSTHAN", "GREATERTHAN", "NOTEQUAL", "BANG", "OR", "EQEQ", 
			"HASH", "AMBERSAND", "COMMA", "SEMICOLON", "LBRACKET", "RBRACKET", "LBRACE", 
			"RBRACE", "LSQRBRACKET", "RSQRBRACKET", "ARROW", "FLOAT", "STRING", "BOOLEAN", 
			"NULL", "CHAR", "INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JingleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JingleLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u014b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6u\n\6\r\6\16\6"+
		"v\3\6\3\6\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00d6\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\6\65\u0143\n\65\r\65\16\65\u0144\3\65\3\65\3\65\5\65\u014a\n\65"+
		"\2\2\66\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35"+
		"\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;"+
		"\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61\3\2"+
		"\7\3\2\62;\4\2\62;aa\6\2\62;CHaach\4\2\62\63aa\5\2\13\f\17\17\"\"\2\u0150"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2"+
		"\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13t\3\2\2\2\r~\3\2\2\2\17\u0080\3\2"+
		"\2\2\21\u0084\3\2\2\2\23\u0098\3\2\2\2\25\u009a\3\2\2\2\27\u00a2\3\2\2"+
		"\2\31\u00a9\3\2\2\2\33\u00ac\3\2\2\2\35\u00b1\3\2\2\2\37\u00b6\3\2\2\2"+
		"!\u00ba\3\2\2\2#\u00bf\3\2\2\2%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00dd\3"+
		"\2\2\2+\u00e1\3\2\2\2-\u00e7\3\2\2\2/\u00eb\3\2\2\2\61\u00f4\3\2\2\2\63"+
		"\u00f6\3\2\2\2\65\u00f8\3\2\2\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0107\3\2\2\2E"+
		"\u0109\3\2\2\2G\u010b\3\2\2\2I\u010e\3\2\2\2K\u0110\3\2\2\2M\u0112\3\2"+
		"\2\2O\u0114\3\2\2\2Q\u0116\3\2\2\2S\u0118\3\2\2\2U\u011a\3\2\2\2W\u011c"+
		"\3\2\2\2Y\u011e\3\2\2\2[\u0120\3\2\2\2]\u0122\3\2\2\2_\u0125\3\2\2\2a"+
		"\u012b\3\2\2\2c\u0132\3\2\2\2e\u0137\3\2\2\2g\u013c\3\2\2\2i\u0149\3\2"+
		"\2\2kl\t\2\2\2l\4\3\2\2\2mn\t\3\2\2n\6\3\2\2\2op\t\4\2\2p\b\3\2\2\2qr"+
		"\t\5\2\2r\n\3\2\2\2su\t\6\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"wx\3\2\2\2xy\b\6\2\2y\f\3\2\2\2z\177\7%\2\2{\177\13\2\2\2|}\7\61\2\2}"+
		"\177\7\61\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2\177\16\3\2\2\2\u0080\u0081"+
		"\7x\2\2\u0081\u0082\7c\2\2\u0082\u0083\7t\2\2\u0083\20\3\2\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7t\2\2\u0086\u0087\7t\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7{\2\2\u0089\22\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7u\2\2\u008e\u0099\7v\2\2\u008f\u0099\13\2\2"+
		"\2\u0090\u0091\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7p\2\2\u0093\u0094"+
		"\7u\2\2\u0094\u0095\7v\2\2\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0099\7v\2\2\u0098\u008a\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0090\3\2"+
		"\2\2\u0099\24\3\2\2\2\u009a\u009b\7f\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7u\2\2\u009d\u009e\7r\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7{\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8\30\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab\32\3\2\2"+
		"\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\u00b5\7h\2\2\u00b5\36\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7t\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc"+
		"\7t\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7g\2\2\u00be\"\3\2\2\2\u00bf\u00c0"+
		"\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\7p\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2"+
		"\u00cb\u00cc\7q\2\2\u00cc\u00d6\7p\2\2\u00cd\u00d6\13\2\2\2\u00ce\u00cf"+
		"\7h\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d6\7e\2\2\u00d2"+
		"\u00d6\13\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d6\7p\2\2\u00d5\u00c5\3\2"+
		"\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7n\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7u\2\2\u00dc(\3\2\2\2\u00dd"+
		"\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7v\2\2\u00e0*\3\2\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7k\2\2"+
		"\u00e5\u00e6\7v\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7g\2"+
		"\2\u00e9\u00ea\7h\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7"+
		"t\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7e\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7n\2\2\u00f3\60\3\2\2\2\u00f4\u00f5"+
		"\7<\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\64\3\2\2\2\u00f8\u00f9"+
		"\7-\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7/\2\2\u00fb8\3\2\2\2\u00fc\u00fd"+
		"\7,\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff<\3\2\2\2\u0100\u0101"+
		"\7>\2\2\u0101>\3\2\2\2\u0102\u0103\7@\2\2\u0103@\3\2\2\2\u0104\u0105\7"+
		"#\2\2\u0105\u0106\7?\2\2\u0106B\3\2\2\2\u0107\u0108\7#\2\2\u0108D\3\2"+
		"\2\2\u0109\u010a\7~\2\2\u010aF\3\2\2\2\u010b\u010c\7?\2\2\u010c\u010d"+
		"\7?\2\2\u010dH\3\2\2\2\u010e\u010f\7%\2\2\u010fJ\3\2\2\2\u0110\u0111\7"+
		"(\2\2\u0111L\3\2\2\2\u0112\u0113\7.\2\2\u0113N\3\2\2\2\u0114\u0115\7="+
		"\2\2\u0115P\3\2\2\2\u0116\u0117\7*\2\2\u0117R\3\2\2\2\u0118\u0119\7+\2"+
		"\2\u0119T\3\2\2\2\u011a\u011b\7}\2\2\u011bV\3\2\2\2\u011c\u011d\7\177"+
		"\2\2\u011dX\3\2\2\2\u011e\u011f\7]\2\2\u011fZ\3\2\2\2\u0120\u0121\7_\2"+
		"\2\u0121\\\3\2\2\2\u0122\u0123\7/\2\2\u0123\u0124\7@\2\2\u0124^\3\2\2"+
		"\2\u0125\u0126\7h\2\2\u0126\u0127\7n\2\2\u0127\u0128\7q\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7v\2\2\u012a`\3\2\2\2\u012b\u012c\7u\2\2\u012c\u012d"+
		"\7v\2\2\u012d\u012e\7t\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130"+
		"\u0131\7i\2\2\u0131b\3\2\2\2\u0132\u0133\7d\2\2\u0133\u0134\7q\2\2\u0134"+
		"\u0135\7q\2\2\u0135\u0136\7n\2\2\u0136d\3\2\2\2\u0137\u0138\7p\2\2\u0138"+
		"\u0139\7w\2\2\u0139\u013a\7n\2\2\u013a\u013b\7n\2\2\u013bf\3\2\2\2\u013c"+
		"\u013d\7e\2\2\u013d\u013e\7j\2\2\u013e\u013f\7c\2\2\u013f\u0140\7t\2\2"+
		"\u0140h\3\2\2\2\u0141\u0143\5\3\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3"+
		"\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014a\3\2\2\2\u0146"+
		"\u0147\7k\2\2\u0147\u0148\7p\2\2\u0148\u014a\7v\2\2\u0149\u0142\3\2\2"+
		"\2\u0149\u0146\3\2\2\2\u014aj\3\2\2\2\t\2v~\u0098\u00d5\u0144\u0149\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
