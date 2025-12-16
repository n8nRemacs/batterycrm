package U01;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f16079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16080b;

    /* renamed from: c, reason: collision with root package name */
    public int f16081c;

    /* renamed from: d, reason: collision with root package name */
    public int f16082d;

    /* renamed from: e, reason: collision with root package name */
    public int f16083e;

    /* renamed from: f, reason: collision with root package name */
    public int f16084f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f16085g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f16079a = name;
        this.f16080b = name.length();
    }

    public final int a(int i12) {
        int i13;
        int i14;
        int i15 = i12 + 1;
        int i16 = this.f16080b;
        String str = this.f16079a;
        if (i15 >= i16) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f16085g;
        char c12 = cArr[i12];
        if (c12 >= '0' && c12 <= '9') {
            i13 = c12 - '0';
        } else if (c12 >= 'a' && c12 <= 'f') {
            i13 = c12 - 'W';
        } else {
            if (c12 < 'A' || c12 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i13 = c12 - '7';
        }
        char c13 = cArr[i15];
        if (c13 >= '0' && c13 <= '9') {
            i14 = c13 - '0';
        } else if (c13 >= 'a' && c13 <= 'f') {
            i14 = c13 - 'W';
        } else {
            if (c13 < 'A' || c13 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i14 = c13 - '7';
        }
        return (i13 << 4) + i14;
    }

    public final char b() {
        int i12;
        int i13 = this.f16081c + 1;
        this.f16081c = i13;
        int i14 = this.f16080b;
        if (i13 == i14) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f16079a);
        }
        char c12 = this.f16085g[i13];
        if (c12 != ' ' && c12 != '%' && c12 != '\\' && c12 != '_' && c12 != '\"' && c12 != '#') {
            switch (c12) {
                default:
                    switch (c12) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iA2 = a(i13);
                            this.f16081c++;
                            if (iA2 >= 128) {
                                if (iA2 >= 192 && iA2 <= 247) {
                                    if (iA2 <= 223) {
                                        iA2 &= 31;
                                        i12 = 1;
                                    } else if (iA2 <= 239) {
                                        iA2 &= 15;
                                        i12 = 2;
                                    } else {
                                        iA2 &= 7;
                                        i12 = 3;
                                    }
                                    for (int i15 = 0; i15 < i12; i15++) {
                                        int i16 = this.f16081c;
                                        int i17 = i16 + 1;
                                        this.f16081c = i17;
                                        if (i17 != i14 && this.f16085g[i17] == '\\') {
                                            int i18 = i16 + 2;
                                            this.f16081c = i18;
                                            int iA3 = a(i18);
                                            this.f16081c++;
                                            if ((iA3 & 192) == 128) {
                                                iA2 = (iA2 << 6) + (iA3 & 63);
                                            }
                                        }
                                    }
                                }
                                return '?';
                            }
                            return (char) iA2;
                    }
                case '*':
                case '+':
                case ',':
                    return c12;
            }
        }
        return c12;
    }

    public final String c() {
        int i12;
        int i13;
        int i14;
        char c12;
        char c13;
        char c14;
        int i15;
        char c15;
        char c16;
        while (true) {
            i12 = this.f16081c;
            i13 = this.f16080b;
            if (i12 >= i13 || this.f16085g[i12] != ' ') {
                break;
            }
            this.f16081c = i12 + 1;
        }
        if (i12 == i13) {
            return null;
        }
        this.f16082d = i12;
        this.f16081c = i12 + 1;
        while (true) {
            i14 = this.f16081c;
            if (i14 >= i13 || (c16 = this.f16085g[i14]) == '=' || c16 == ' ') {
                break;
            }
            this.f16081c = i14 + 1;
        }
        String str = this.f16079a;
        if (i14 >= i13) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f16083e = i14;
        if (this.f16085g[i14] == ' ') {
            while (true) {
                i15 = this.f16081c;
                if (i15 >= i13 || (c15 = this.f16085g[i15]) == '=' || c15 != ' ') {
                    break;
                }
                this.f16081c = i15 + 1;
            }
            if (this.f16085g[i15] != '=' || i15 == i13) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f16081c++;
        while (true) {
            int i16 = this.f16081c;
            if (i16 >= i13 || this.f16085g[i16] != ' ') {
                break;
            }
            this.f16081c = i16 + 1;
        }
        int i17 = this.f16083e;
        int i18 = this.f16082d;
        if (i17 - i18 > 4) {
            char[] cArr = this.f16085g;
            if (cArr[i18 + 3] == '.' && (((c12 = cArr[i18]) == 'O' || c12 == 'o') && (((c13 = cArr[i18 + 1]) == 'I' || c13 == 'i') && ((c14 = cArr[i18 + 2]) == 'D' || c14 == 'd')))) {
                this.f16082d = i18 + 4;
            }
        }
        char[] cArr2 = this.f16085g;
        int i19 = this.f16082d;
        return new String(cArr2, i19, i17 - i19);
    }
}
