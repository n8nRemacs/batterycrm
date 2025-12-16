package c61;

/* compiled from: SignatureReader.java */
/* renamed from: c61.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C26948a {

    /* renamed from: a, reason: collision with root package name */
    public final String f57664a;

    public C26948a(String str) {
        this.f57664a = str;
    }

    public static int b(String str, int i12, AbstractC26949b abstractC26949b) {
        int i13;
        char cCharAt;
        int iB2 = i12 + 1;
        char cCharAt2 = str.charAt(i12);
        if (cCharAt2 != 'F') {
            if (cCharAt2 == 'L') {
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int i14 = iB2;
                    while (true) {
                        i13 = iB2 + 1;
                        cCharAt = str.charAt(iB2);
                        if (cCharAt == '.' || cCharAt == ';') {
                            break;
                        }
                        if (cCharAt == '<') {
                            String strSubstring = str.substring(i14, iB2);
                            if (z13) {
                                abstractC26949b.i(strSubstring);
                            } else {
                                abstractC26949b.e(strSubstring);
                            }
                            iB2 = i13;
                            while (true) {
                                char cCharAt3 = str.charAt(iB2);
                                if (cCharAt3 == '>') {
                                    break;
                                }
                                if (cCharAt3 != '*') {
                                    iB2 = (cCharAt3 == '+' || cCharAt3 == '-') ? b(str, iB2 + 1, abstractC26949b.o(cCharAt3)) : b(str, iB2, abstractC26949b.o('='));
                                } else {
                                    iB2++;
                                    abstractC26949b.p();
                                }
                            }
                            z12 = true;
                        } else {
                            iB2 = i13;
                        }
                    }
                    if (!z12) {
                        String strSubstring2 = str.substring(i14, iB2);
                        if (z13) {
                            abstractC26949b.i(strSubstring2);
                        } else {
                            abstractC26949b.e(strSubstring2);
                        }
                    }
                    if (cCharAt == ';') {
                        abstractC26949b.f();
                        return i13;
                    }
                    z12 = false;
                    z13 = true;
                    iB2 = i13;
                }
            } else if (cCharAt2 != 'V' && cCharAt2 != 'I' && cCharAt2 != 'J' && cCharAt2 != 'S') {
                if (cCharAt2 == 'T') {
                    int iIndexOf = str.indexOf(59, iB2);
                    abstractC26949b.q(str.substring(iB2, iIndexOf));
                    return iIndexOf + 1;
                }
                if (cCharAt2 != 'Z') {
                    if (cCharAt2 == '[') {
                        return b(str, iB2, abstractC26949b.b());
                    }
                    switch (cCharAt2) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        abstractC26949b.c(cCharAt2);
        return iB2;
    }

    public final void a(AbstractC26949b abstractC26949b) {
        char cCharAt;
        String str = this.f57664a;
        int length = str.length();
        int i12 = 0;
        if (str.charAt(0) == '<') {
            i12 = 2;
            do {
                int iIndexOf = str.indexOf(58, i12);
                abstractC26949b.h(str.substring(i12 - 1, iIndexOf));
                int iB2 = iIndexOf + 1;
                char cCharAt2 = str.charAt(iB2);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    iB2 = b(str, iB2, abstractC26949b.d());
                }
                while (true) {
                    i12 = iB2 + 1;
                    cCharAt = str.charAt(iB2);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        iB2 = b(str, i12, abstractC26949b.k());
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i12) != '(') {
            int iB3 = b(str, i12, abstractC26949b.n());
            while (iB3 < length) {
                iB3 = b(str, iB3, abstractC26949b.j());
            }
        } else {
            int iB4 = i12 + 1;
            while (str.charAt(iB4) != ')') {
                iB4 = b(str, iB4, abstractC26949b.l());
            }
            int iB5 = b(str, iB4 + 1, abstractC26949b.m());
            while (iB5 < length) {
                iB5 = b(str, iB5 + 1, abstractC26949b.g());
            }
        }
    }
}
