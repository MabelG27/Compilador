// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\5"+
    "\1\6\1\7\1\10\1\0\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\11\25\1\0\1\26\1\27\1\30\1\31\2\0\17\32"+
    "\1\33\2\32\1\34\7\32\1\0\1\35\1\0\1\36"+
    "\1\37\1\0\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\32\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\32\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\7\0"+
    "\1\3\73\0\1\32\7\0\1\32\3\0\1\32\3\0"+
    "\1\32\1\0\1\32\6\0\1\32\1\0\1\32\4\0"+
    "\1\32\7\0\1\32\3\0\1\32\3\0\1\32\1\0"+
    "\1\32\6\0\1\32\1\0\1\32\u012b\0\2\3\326\0"+
    "\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\1\1\5\1\1"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\1"+
    "\2\15\1\16\1\17\1\20\1\17\2\21\1\22\1\1"+
    "\24\21\1\23\1\1\1\24\1\25\2\0\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\0\1\2"+
    "\1\36\2\0\1\17\5\0\1\37\1\0\1\40\13\0"+
    "\1\41\7\0\1\41\27\0\1\42\1\0\1\43\3\0"+
    "\2\44\1\45\32\0\1\46\20\0\1\47\14\0\1\50"+
    "\2\0\1\2\24\0\1\51\35\0\1\41\21\0\1\52"+
    "\5\0\1\53\25\0\1\54\5\0\1\55\4\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[294];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\73\0\73\0\166\0\261\0\354\0\u0127\0\u0162"+
    "\0\u019d\0\73\0\73\0\73\0\u01d8\0\u0213\0\73\0\u024e"+
    "\0\u0289\0\u02c4\0\u02ff\0\73\0\u033a\0\u0375\0\u03b0\0\73"+
    "\0\u03eb\0\73\0\u0426\0\u0461\0\u049c\0\u04d7\0\u0512\0\u054d"+
    "\0\u0588\0\u05c3\0\u05fe\0\u0639\0\u0674\0\u06af\0\u06ea\0\u0725"+
    "\0\u0760\0\u079b\0\u07d6\0\u0811\0\u084c\0\u0887\0\u08c2\0\73"+
    "\0\u08fd\0\73\0\73\0\u0938\0\u0973\0\73\0\73\0\73"+
    "\0\73\0\73\0\73\0\73\0\73\0\u09ae\0\u09e9\0\73"+
    "\0\u0a24\0\u0a5f\0\73\0\u0a9a\0\u0ad5\0\u0b10\0\u0b4b\0\u0b86"+
    "\0\73\0\u0bc1\0\73\0\u0bfc\0\u0c37\0\u0c72\0\u0cad\0\u0ce8"+
    "\0\u0d23\0\u0d5e\0\u0d99\0\u0dd4\0\u0e0f\0\u0e4a\0\u0e85\0\u0ec0"+
    "\0\u0efb\0\u0f36\0\u0f71\0\u0fac\0\u0fe7\0\u1022\0\73\0\u105d"+
    "\0\u1098\0\u10d3\0\u110e\0\u1149\0\u1184\0\u11bf\0\u11fa\0\u1235"+
    "\0\u1270\0\u12ab\0\u12e6\0\u1321\0\u135c\0\u1397\0\u13d2\0\u140d"+
    "\0\u1448\0\u1483\0\u14be\0\u14f9\0\u1534\0\u156f\0\73\0\u15aa"+
    "\0\73\0\u15e5\0\u1620\0\u165b\0\73\0\u1696\0\73\0\u16d1"+
    "\0\u170c\0\u1747\0\u1782\0\u17bd\0\u17f8\0\u1833\0\u186e\0\u18a9"+
    "\0\u18e4\0\u191f\0\u195a\0\u1995\0\u19d0\0\u1a0b\0\u1a46\0\u1a81"+
    "\0\u1abc\0\u1af7\0\u1b32\0\u1b6d\0\u1ba8\0\u1be3\0\u1c1e\0\u1c59"+
    "\0\u1c94\0\73\0\u1ccf\0\u1d0a\0\u1d45\0\u1d80\0\u1dbb\0\u1df6"+
    "\0\u1e31\0\u1e6c\0\u1ea7\0\u1ee2\0\u1f1d\0\u1f58\0\u1f93\0\u1fce"+
    "\0\u2009\0\u2044\0\73\0\u207f\0\u20ba\0\u20f5\0\u2130\0\u216b"+
    "\0\u21a6\0\u21e1\0\u221c\0\u2257\0\u2292\0\u22cd\0\u2308\0\73"+
    "\0\u2343\0\u237e\0\u1620\0\u23b9\0\u23f4\0\u242f\0\u246a\0\u24a5"+
    "\0\u24e0\0\u251b\0\u2556\0\u2591\0\u25cc\0\u2607\0\u2642\0\u267d"+
    "\0\u26b8\0\u26f3\0\u272e\0\u2769\0\u27a4\0\u27df\0\u281a\0\73"+
    "\0\u2855\0\u2890\0\u28cb\0\u2906\0\u2941\0\u297c\0\u29b7\0\u29f2"+
    "\0\u2a2d\0\u2a68\0\u2aa3\0\u2ade\0\u2b19\0\u2b54\0\u2b8f\0\u2bca"+
    "\0\u2c05\0\u2c40\0\u2c7b\0\u2cb6\0\u2cf1\0\u2d2c\0\u2d67\0\u2da2"+
    "\0\u2ddd\0\u2e18\0\u2e53\0\u2e8e\0\u2ec9\0\u2f04\0\u2f3f\0\u2f7a"+
    "\0\u2fb5\0\u2ff0\0\u302b\0\u3066\0\u30a1\0\u30dc\0\u3117\0\u3152"+
    "\0\u318d\0\u31c8\0\u3203\0\u323e\0\u3279\0\u32b4\0\u32ef\0\73"+
    "\0\u332a\0\u3365\0\u33a0\0\u33db\0\u3416\0\73\0\u3451\0\u348c"+
    "\0\u34c7\0\u3502\0\u353d\0\u3578\0\u35b3\0\u35ee\0\u3629\0\u3664"+
    "\0\u369f\0\u36da\0\u3715\0\u3750\0\u378b\0\u37c6\0\u3801\0\u2f04"+
    "\0\u383c\0\u3877\0\u38b2\0\73\0\u38ed\0\u3928\0\u3963\0\u399e"+
    "\0\u39d9\0\73\0\u3a14\0\u3a4f\0\u3a8a\0\u3ac5";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[294];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\2\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\2\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\30\1\44\1\30"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\3\30\1\60\1\61\1\62\75\0"+
    "\1\3\120\0\1\63\74\0\3\64\2\0\31\64\53\0"+
    "\1\65\52\0\1\66\54\0\1\67\15\0\1\70\72\0"+
    "\1\71\61\0\1\72\10\0\1\73\63\0\1\74\6\0"+
    "\1\75\60\0\1\76\4\0\1\77\4\0\1\100\62\0"+
    "\1\101\1\0\1\101\70\0\1\101\1\0\1\101\1\0"+
    "\2\23\74\0\1\102\1\103\11\0\1\104\5\0\1\105"+
    "\1\0\1\106\1\107\4\0\1\110\42\0\1\111\72\0"+
    "\1\103\123\0\1\112\41\0\1\113\75\0\1\114\117\0"+
    "\1\115\1\0\1\116\65\0\1\117\1\0\1\120\53\0"+
    "\1\121\6\0\1\122\1\123\1\0\1\124\2\0\1\125"+
    "\61\0\1\126\10\0\1\127\10\0\1\130\56\0\1\131"+
    "\1\0\1\132\10\0\1\133\57\0\1\134\2\0\1\135"+
    "\1\0\1\136\70\0\1\116\62\0\1\137\6\0\1\140"+
    "\73\0\1\141\55\0\1\142\21\0\1\143\50\0\1\144"+
    "\3\0\1\145\104\0\1\146\73\0\1\147\2\0\1\150"+
    "\54\0\1\151\70\0\1\152\4\0\1\153\1\154\10\0"+
    "\1\155\55\0\1\156\2\0\1\157\7\0\1\160\6\0"+
    "\1\161\60\0\1\162\3\0\1\163\62\0\1\164\4\0"+
    "\1\165\57\0\1\166\60\0\1\167\40\0\1\170\10\0"+
    "\1\171\22\0\3\64\2\0\31\64\57\0\1\172\16\0"+
    "\16\173\1\174\54\173\2\77\1\3\1\77\1\4\66\77"+
    "\24\0\1\175\1\176\75\0\1\177\117\0\1\200\2\0"+
    "\1\201\67\0\1\202\65\0\1\203\62\0\1\204\113\0"+
    "\1\205\70\0\1\206\53\0\1\207\105\0\1\137\100\0"+
    "\1\210\66\0\1\211\61\0\1\212\106\0\1\213\1\214"+
    "\51\0\1\215\106\0\1\137\56\0\1\216\106\0\1\217"+
    "\5\0\1\220\55\0\1\221\107\0\1\222\64\0\1\223"+
    "\76\0\1\213\74\0\1\224\66\0\1\225\2\0\1\226"+
    "\66\0\1\227\74\0\1\137\63\0\1\230\74\0\1\231"+
    "\6\0\1\232\65\0\1\233\66\0\1\234\103\0\1\235"+
    "\64\0\1\236\103\0\1\137\52\0\1\237\76\0\1\240"+
    "\4\0\1\241\56\0\1\242\77\0\1\243\1\0\1\244"+
    "\10\0\1\245\51\0\1\246\107\0\1\247\63\0\1\250"+
    "\20\0\1\251\43\0\1\252\2\0\1\253\13\0\1\254"+
    "\66\0\1\255\67\0\1\256\6\0\1\257\101\0\1\137"+
    "\62\0\1\260\64\0\1\261\7\0\1\262\62\0\1\263"+
    "\101\0\1\264\63\0\1\265\1\0\1\266\67\0\1\267"+
    "\30\0\1\270\127\0\1\271\30\0\16\173\1\272\72\173"+
    "\1\272\4\173\1\273\47\173\24\0\2\176\121\0\1\274"+
    "\77\0\1\275\71\0\1\276\72\0\1\277\73\0\1\300"+
    "\54\0\1\301\13\0\1\302\63\0\1\141\64\0\1\303"+
    "\105\0\1\137\67\0\1\232\60\0\1\304\76\0\1\137"+
    "\70\0\1\305\107\0\1\232\73\0\1\256\72\0\1\306"+
    "\1\307\72\0\1\137\51\0\1\310\73\0\1\311\71\0"+
    "\1\312\105\0\1\232\71\0\1\313\64\0\1\314\66\0"+
    "\1\315\76\0\1\316\76\0\1\317\70\0\1\232\100\0"+
    "\1\320\56\0\1\321\76\0\1\322\105\0\1\323\67\0"+
    "\1\324\6\0\1\325\70\0\1\326\63\0\1\327\70\0"+
    "\1\330\76\0\1\331\100\0\1\314\64\0\1\332\75\0"+
    "\1\315\67\0\1\333\62\0\1\334\107\0\1\335\53\0"+
    "\1\336\5\0\1\141\11\0\1\337\66\0\1\340\74\0"+
    "\1\137\67\0\1\145\61\0\1\341\103\0\1\123\65\0"+
    "\1\342\76\0\1\343\77\0\1\344\54\0\1\137\67\0"+
    "\1\345\72\0\1\346\104\0\1\347\20\0\16\173\1\272"+
    "\4\173\1\3\47\173\50\0\1\350\101\0\1\302\74\0"+
    "\1\351\72\0\1\352\60\0\1\353\73\0\1\350\1\0"+
    "\1\354\70\0\1\355\73\0\1\333\72\0\1\137\70\0"+
    "\1\137\104\0\1\356\61\0\1\357\104\0\1\360\62\0"+
    "\1\361\73\0\1\362\67\0\1\363\101\0\1\123\74\0"+
    "\1\232\65\0\1\265\72\0\1\213\57\0\1\364\111\0"+
    "\1\365\52\0\1\366\113\0\1\332\51\0\1\367\76\0"+
    "\1\370\76\0\1\371\102\0\1\372\73\0\1\373\56\0"+
    "\1\137\71\0\1\265\103\0\1\332\65\0\1\374\75\0"+
    "\1\375\61\0\1\315\102\0\1\325\63\0\1\376\4\0"+
    "\1\265\3\0\1\377\64\0\1\250\72\0\1\u0100\106\0"+
    "\1\u0101\71\0\1\u0102\70\0\1\u0103\75\0\1\u0104\65\0"+
    "\1\353\74\0\1\u0105\44\0\1\u0106\63\0\1\u0107\120\0"+
    "\1\u0108\76\0\1\u0109\55\0\1\u010a\107\0\1\u010b\70\0"+
    "\1\220\64\0\1\232\76\0\1\u010c\64\0\1\u010d\102\0"+
    "\1\213\76\0\1\u010e\75\0\1\u010f\72\0\1\213\53\0"+
    "\1\u0110\72\0\1\137\111\0\1\u0111\55\0\1\u0112\70\0"+
    "\1\356\106\0\1\137\60\0\1\332\66\0\1\u0113\72\0"+
    "\1\u0114\102\0\1\364\61\0\1\220\76\0\1\u0115\73\0"+
    "\1\u0116\75\0\1\352\64\0\1\353\77\0\1\353\66\0"+
    "\1\u0117\112\0\1\213\52\0\1\u0118\100\0\1\220\62\0"+
    "\1\u0119\107\0\1\135\76\0\1\333\55\0\1\135\105\0"+
    "\1\u011a\66\0\1\213\71\0\1\u011b\64\0\1\u011c\66\0"+
    "\1\u011d\72\0\1\u011e\74\0\1\u011f\106\0\1\u0120\57\0"+
    "\1\u0121\102\0\1\352\77\0\1\220\56\0\1\u0122\105\0"+
    "\1\u0123\57\0\1\u0124\72\0\1\u0125\100\0\1\u0126\101\0"+
    "\1\u0118\55\0\1\367\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[15104];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\6\1\3\11\2\1\1\11\4\1\1\11"+
    "\3\1\1\11\1\1\1\11\25\1\1\11\1\1\2\11"+
    "\2\0\10\11\1\0\1\1\1\11\2\0\1\11\5\0"+
    "\1\11\1\0\1\11\13\0\1\1\7\0\1\11\27\0"+
    "\1\11\1\0\1\11\3\0\1\11\1\1\1\11\32\0"+
    "\1\11\20\0\1\11\14\0\1\11\2\0\1\1\24\0"+
    "\1\11\35\0\1\1\21\0\1\11\5\0\1\11\25\0"+
    "\1\11\5\0\1\11\4\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[294];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "Error", yyline, yycolumn);
            }
            // fall through
          case 46: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 47: break;
          case 3:
            { return token(yytext(), "NEGACION", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          case 4:
            { return token(yytext(), "COMILLA_DOBLE", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 5:
            { return token(yytext(), "OPE_MOD", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 6:
            { return token(yytext(), "COMILLA_SIMPLE", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 7:
            { return token(yytext(), "PARENTESIS_A", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          case 8:
            { return token(yytext(), "PARENTESIS_C", yyline, yycolumn);
            }
            // fall through
          case 53: break;
          case 9:
            { return token(yytext(), "OPE_MULT", yyline, yycolumn);
            }
            // fall through
          case 54: break;
          case 10:
            { return token(yytext(), "OPE_SUMA", yyline, yycolumn);
            }
            // fall through
          case 55: break;
          case 11:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 56: break;
          case 12:
            { return token(yytext(), "OPE_RESTA", yyline, yycolumn);
            }
            // fall through
          case 57: break;
          case 13:
            { return token(yytext(), "NUMERO", yyline, yycolumn);
            }
            // fall through
          case 58: break;
          case 14:
            { return token(yytext(), "PUNTO_COMA", yyline, yycolumn);
            }
            // fall through
          case 59: break;
          case 15:
            { return token(yytext(), "OPE_REL", yyline, yycolumn);
            }
            // fall through
          case 60: break;
          case 16:
            { return token(yytext(), "OPE_ASIG", yyline, yycolumn);
            }
            // fall through
          case 61: break;
          case 17:
            { return token(yytext(), "LETRA", yyline, yycolumn);
            }
            // fall through
          case 62: break;
          case 18:
            { return token(yytext(), "OPE_DIV", yyline, yycolumn);
            }
            // fall through
          case 63: break;
          case 19:
            { return token(yytext(), "LLAVE_A", yyline, yycolumn);
            }
            // fall through
          case 64: break;
          case 20:
            { return token(yytext(), "LLAVE_C", yyline, yycolumn);
            }
            // fall through
          case 65: break;
          case 21:
            { return token(yytext(), "DIFERENTE", yyline, yycolumn);
            }
            // fall through
          case 66: break;
          case 22:
            { return token(yytext(), "OPE_ASIG_MOD", yyline, yycolumn);
            }
            // fall through
          case 67: break;
          case 23:
            { return token(yytext(), "OPE_AND", yyline, yycolumn);
            }
            // fall through
          case 68: break;
          case 24:
            { return token(yytext(), "OPE_ASIG_AND", yyline, yycolumn);
            }
            // fall through
          case 69: break;
          case 25:
            { return token(yytext(), "OPE_ASIG_PROD", yyline, yycolumn);
            }
            // fall through
          case 70: break;
          case 26:
            { return token(yytext(), "OPE_INCREMENTO", yyline, yycolumn);
            }
            // fall through
          case 71: break;
          case 27:
            { return token(yytext(), "OPE_ASIG_SUM", yyline, yycolumn);
            }
            // fall through
          case 72: break;
          case 28:
            { return token(yytext(), "OPE_DECREMENTO", yyline, yycolumn);
            }
            // fall through
          case 73: break;
          case 29:
            { return token(yytext(), "OPE_ASIG_REST", yyline, yycolumn);
            }
            // fall through
          case 74: break;
          case 30:
            { return token(yytext(), "OPE_ASIG_DIV", yyline, yycolumn);
            }
            // fall through
          case 75: break;
          case 31:
            { return token(yytext(), "OPE_IGUAL", yyline, yycolumn);
            }
            // fall through
          case 76: break;
          case 32:
            { return token(yytext(), "OPE_ASIG_XOR", yyline, yycolumn);
            }
            // fall through
          case 77: break;
          case 33:
            { return token(yytext(), "PAL_RESER", yyline, yycolumn);
            }
            // fall through
          case 78: break;
          case 34:
            { return token(yytext(), "OPE_ASIG_OR", yyline, yycolumn);
            }
            // fall through
          case 79: break;
          case 35:
            { return token(yytext(), "CADENA", yyline, yycolumn);
            }
            // fall through
          case 80: break;
          case 36:
            { return token(yytext(), "NUM_DEC", yyline, yycolumn);
            }
            // fall through
          case 81: break;
          case 37:
            { return token(yytext(), "DESPLZ_IZQ", yyline, yycolumn);
            }
            // fall through
          case 82: break;
          case 38:
            { return token(yytext(), "TIPO_DATO", yyline, yycolumn);
            }
            // fall through
          case 83: break;
          case 39:
            { return token(yytext(), "PAL_RES_STD", yyline, yycolumn);
            }
            // fall through
          case 84: break;
          case 40:
            { return token(yytext(), "OPE_OR", yyline, yycolumn);
            }
            // fall through
          case 85: break;
          case 41:
            { return token(yytext(), "CLASS_PRINC", yyline, yycolumn);
            }
            // fall through
          case 86: break;
          case 42:
            { return token(yytext(), "PAL_RES_USING", yyline, yycolumn);
            }
            // fall through
          case 87: break;
          case 43:
            { return token(yytext(), "LIBRERIA_C", yyline, yycolumn);
            }
            // fall through
          case 88: break;
          case 44:
            { return token(yytext(), "PAL_RES_INCL", yyline, yycolumn);
            }
            // fall through
          case 89: break;
          case 45:
            { return token(yytext(), "ESP_NOM", yyline, yycolumn);
            }
            // fall through
          case 90: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
