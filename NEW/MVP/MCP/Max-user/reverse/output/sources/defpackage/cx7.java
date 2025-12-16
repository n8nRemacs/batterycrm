package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import org.apache.http.HttpStatus;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class cx7 implements Closeable {
    public final Reader a;
    public int b = Integer.MIN_VALUE;
    public final char[] c = new char[32];
    public int d;

    public cx7(Reader reader) {
        this.a = reader;
    }

    public final String P() {
        StringBuilder sb = new StringBuilder(32);
        int i = this.d;
        char[] cArr = this.c;
        if (i < 32) {
            sb.append(cArr, 0, i);
        } else {
            int i2 = i % 32;
            sb.append(cArr, i2, 32 - i2);
            sb.append(cArr, 0, i2);
        }
        return sb.toString();
    }

    public final String Q() throws IOException {
        String str;
        int i = this.b;
        if (i == 44) {
            str = ",";
        } else if (i == 58) {
            str = ":";
        } else if (i == 91) {
            str = "[";
        } else if (i == 93) {
            str = "]";
        } else if (i == 102) {
            y(97);
            y(108);
            y(115);
            y(HttpStatus.SC_SWITCHING_PROTOCOLS);
            str = "false";
        } else if (i == 110) {
            y(117);
            y(108);
            y(108);
            str = "null";
        } else if (i == 116) {
            y(114);
            y(117);
            y(HttpStatus.SC_SWITCHING_PROTOCOLS);
            str = "true";
        } else if (i == 123) {
            str = "{";
        } else {
            if (i != 125) {
                throw new AssertionError();
            }
            str = "}";
        }
        this.b = Integer.MIN_VALUE;
        return str;
    }

    public final String Z() throws IOException {
        StringBuilder sb = new StringBuilder();
        if (i0() != 34) {
            throw new IllegalStateException("Not at string");
        }
        while (true) {
            int i = read();
            if (i == 34) {
                this.b = Integer.MIN_VALUE;
                return sb.toString();
            }
            if (i <= 31) {
                throw JsonSyntaxException.a(this.d, P(), i);
            }
            if (i != 92) {
                sb.append((char) i);
            } else {
                int i2 = read();
                if (i2 == 34 || i2 == 47 || i2 == 92) {
                    sb.append((char) i2);
                } else if (i2 == 98) {
                    sb.append('\b');
                } else if (i2 == 102) {
                    sb.append('\f');
                } else if (i2 == 110) {
                    sb.append('\n');
                } else if (i2 == 114) {
                    sb.append('\r');
                } else if (i2 == 116) {
                    sb.append('\t');
                } else {
                    if (i2 != 117) {
                        throw JsonSyntaxException.a(this.d, P(), i2);
                    }
                    sb.append((char) ((zdi.c((char) l()) << 12) | ((char) ((zdi.c((char) l()) << 8) | ((char) ((zdi.c((char) l()) << 4) | ((char) zdi.c((char) l()))))))));
                }
            }
        }
    }

    public final void c(Appendable appendable) throws IOException {
        int i;
        int i2 = this.b;
        if (i2 == 45) {
            appendable.append((char) i2);
            i2 = read();
        }
        if (i2 == 48) {
            appendable.append((char) i2);
            i = read();
        } else {
            if (i2 < 49 || i2 > 57) {
                throw JsonSyntaxException.a(this.d, P(), i2);
            }
            appendable.append((char) i2);
            i = read();
            while (i >= 48 && i <= 57) {
                appendable.append((char) i);
                i = read();
            }
        }
        if (i == 46) {
            appendable.append((char) i);
            int i3 = read();
            if (i3 < 48 || i3 > 57) {
                throw JsonSyntaxException.a(this.d, P(), i3);
            }
            appendable.append((char) i3);
            i = read();
            while (i >= 48 && i <= 57) {
                appendable.append((char) i);
                i = read();
            }
        }
        if (i == 101 || i == 69) {
            appendable.append((char) i);
            int i4 = read();
            if (i4 == 43 || i4 == 45) {
                appendable.append((char) i4);
                i4 = read();
            }
            if (i4 < 48 || i4 > 57) {
                throw JsonSyntaxException.a(this.d, P(), i4);
            }
            appendable.append((char) i4);
            i = read();
            while (i >= 48 && i <= 57) {
                appendable.append((char) i);
                i = read();
            }
        }
        if (i == 9 || i == 10 || i == 13 || i == 32) {
            this.b = Integer.MIN_VALUE;
        } else {
            this.b = i;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b = Integer.MIN_VALUE;
        this.a.close();
    }

    public final void d(Appendable appendable) throws IOException {
        int i;
        appendable.append((char) this.b);
        loop0: while (true) {
            int i2 = read();
            if (i2 <= 31) {
                throw JsonSyntaxException.a(this.d, P(), i2);
            }
            appendable.append((char) i2);
            if (i2 == 34) {
                this.b = Integer.MIN_VALUE;
                return;
            }
            if (i2 == 92) {
                int i3 = read();
                if (i3 == 34 || i3 == 47 || i3 == 92 || i3 == 98 || i3 == 102 || i3 == 110 || i3 == 114 || i3 == 116) {
                    appendable.append((char) i3);
                } else {
                    if (i3 != 117) {
                        throw JsonSyntaxException.a(this.d, P(), i3);
                    }
                    appendable.append((char) i3);
                    for (int i4 = 0; i4 < 4; i4++) {
                        i = read();
                        if ((i < 48 || i > 57) && ((i < 97 || i > 102) && (i < 65 || i > 70))) {
                            break loop0;
                        }
                        appendable.append((char) i);
                    }
                }
            }
        }
        throw JsonSyntaxException.a(this.d, P(), i);
    }

    public final void h0() throws IOException {
        int iI0 = i0();
        if (iI0 == -1) {
            throw new IllegalStateException("EOF");
        }
        if (iI0 == 34) {
            d(ria.a);
            return;
        }
        if (iI0 != 91 && iI0 != 93) {
            if (iI0 == 102 || iI0 == 110 || iI0 == 116) {
                Q();
                return;
            }
            if (iI0 != 123 && iI0 != 125 && iI0 != 44) {
                if (iI0 != 45) {
                    switch (iI0) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            break;
                        case 58:
                            break;
                        default:
                            throw JsonSyntaxException.a(this.d, P(), this.b);
                    }
                }
                c(ria.a);
                return;
            }
        }
        this.b = Integer.MIN_VALUE;
    }

    public final void i(Appendable appendable) throws IOException {
        int iI0 = i0();
        if (iI0 == -1) {
            throw new IllegalStateException("EOF");
        }
        if (iI0 == 34) {
            d(appendable);
            return;
        }
        if (iI0 != 91 && iI0 != 93 && iI0 != 102 && iI0 != 110 && iI0 != 116 && iI0 != 123 && iI0 != 125 && iI0 != 44) {
            if (iI0 != 45) {
                switch (iI0) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        break;
                    case 58:
                        break;
                    default:
                        throw JsonSyntaxException.a(this.d, P(), this.b);
                }
            }
            c(appendable);
            return;
        }
        appendable.append(Q());
    }

    public final int i0() throws IOException {
        int i;
        int i2 = this.b;
        if (i2 >= -1) {
            return i2;
        }
        while (true) {
            i = read();
            if (i != 9 && i != 10 && i != 13 && i != 32 && (i != 65279 || this.d != 1)) {
                break;
            }
        }
        this.b = i;
        return i;
    }

    public final int j0() throws IOException {
        int iI0 = i0();
        if (iI0 == -1) {
            return 0;
        }
        int i = 34;
        if (iI0 != 34) {
            i = 91;
            if (iI0 != 91) {
                i = 93;
                if (iI0 != 93) {
                    if (iI0 == 102) {
                        return 98;
                    }
                    int i2 = 110;
                    if (iI0 != 110) {
                        if (iI0 == 116) {
                            return 98;
                        }
                        i2 = 123;
                        if (iI0 != 123) {
                            i2 = 125;
                            if (iI0 != 125) {
                                i2 = 44;
                                if (iI0 != 44) {
                                    if (iI0 == 45) {
                                        return 49;
                                    }
                                    switch (iI0) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            return 49;
                                        case 58:
                                            return 58;
                                        default:
                                            throw JsonSyntaxException.a(this.d, P(), this.b);
                                    }
                                }
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return i;
    }

    public final int l() throws IOException {
        int i = read();
        if ((i < 48 || i > 57) && ((i < 97 || i > 102) && (i < 65 || i > 70))) {
            throw JsonSyntaxException.a(this.d, P(), i);
        }
        return i;
    }

    public final int read() throws IOException {
        try {
            int i = this.a.read();
            if (i == -1) {
                return i;
            }
            char[] cArr = this.c;
            int i2 = this.d;
            cArr[i2 % 32] = (char) i;
            this.d = i2 + 1;
            return i;
        } catch (IOException e) {
            this.b = Integer.MIN_VALUE;
            throw e;
        }
    }

    public final void w(int i) throws IOException {
        int iJ0 = j0();
        if (iJ0 != i) {
            throw JsonSyntaxException.b(this.d, P(), iJ0);
        }
    }

    public final void y(int i) throws IOException {
        int i2 = read();
        if (i2 != i) {
            throw JsonSyntaxException.a(this.d, P(), i2);
        }
    }
}
