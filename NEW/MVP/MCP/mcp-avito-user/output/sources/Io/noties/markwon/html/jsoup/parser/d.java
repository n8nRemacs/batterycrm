package io.noties.markwon.html.jsoup.parser;

import io.noties.markwon.html.jsoup.parser.Token;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Tokeniser.java */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: r, reason: collision with root package name */
    public static final char[] f401797r;

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f401798s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a, reason: collision with root package name */
    public final a f401799a;

    /* renamed from: b, reason: collision with root package name */
    public final c f401800b;

    /* renamed from: d, reason: collision with root package name */
    public Token f401802d;

    /* renamed from: i, reason: collision with root package name */
    public Token.h f401807i;

    /* renamed from: o, reason: collision with root package name */
    public String f401813o;

    /* renamed from: c, reason: collision with root package name */
    public e f401801c = e.f401843b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f401803e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f401804f = null;

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f401805g = new StringBuilder(1024);

    /* renamed from: h, reason: collision with root package name */
    public final StringBuilder f401806h = new StringBuilder(1024);

    /* renamed from: j, reason: collision with root package name */
    public final Token.g f401808j = new Token.g();

    /* renamed from: k, reason: collision with root package name */
    public final Token.f f401809k = new Token.f();

    /* renamed from: l, reason: collision with root package name */
    public final Token.b f401810l = new Token.b();

    /* renamed from: m, reason: collision with root package name */
    public final Token.d f401811m = new Token.d();

    /* renamed from: n, reason: collision with root package name */
    public final Token.c f401812n = new Token.c();

    /* renamed from: p, reason: collision with root package name */
    public final int[] f401814p = new int[1];

    /* renamed from: q, reason: collision with root package name */
    public final int[] f401815q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f401797r = cArr;
        Arrays.sort(cArr);
    }

    public d(a aVar, c cVar) {
        this.f401799a = aVar;
        this.f401800b = cVar;
    }

    public final void a(e eVar) {
        this.f401799a.a();
        this.f401801c = eVar;
    }

    public final void b(String str) {
        c cVar = this.f401800b;
        if (cVar.size() < 0) {
            a aVar = this.f401799a;
            cVar.add(new b(aVar.f401792f + aVar.f401791e, "Invalid character reference: %s", str));
        }
    }

    public final int[] c(Character ch2, boolean z12) {
        int i12;
        char c12;
        int length;
        char c13;
        char c14;
        char c15;
        int i13;
        String strC;
        char c16;
        int iIntValue;
        int i14;
        char c17;
        a aVar = this.f401799a;
        if (aVar.j()) {
            return null;
        }
        if (ch2 != null && ch2.charValue() == aVar.i()) {
            return null;
        }
        char[] cArr = f401797r;
        aVar.b();
        boolean zJ2 = aVar.j();
        char[] cArr2 = aVar.f401787a;
        if (!zJ2 && Arrays.binarySearch(cArr, cArr2[aVar.f401791e]) >= 0) {
            return null;
        }
        aVar.f401793g = aVar.f401791e;
        boolean zK2 = aVar.k("#");
        String[] strArr = aVar.f401794h;
        char c18 = 'A';
        int[] iArr = this.f401814p;
        if (zK2) {
            boolean zL2 = aVar.l("X");
            if (zL2) {
                aVar.b();
                int i15 = aVar.f401791e;
                while (true) {
                    i14 = aVar.f401791e;
                    if (i14 >= aVar.f401789c || (((c17 = cArr2[i14]) < '0' || c17 > '9') && ((c17 < c18 || c17 > 'F') && (c17 < 'a' || c17 > 'f')))) {
                        break;
                    }
                    aVar.f401791e = i14 + 1;
                    c18 = 'A';
                }
                strC = a.c(cArr2, strArr, i15, i14 - i15);
            } else {
                aVar.b();
                int i16 = aVar.f401791e;
                while (true) {
                    i13 = aVar.f401791e;
                    if (i13 >= aVar.f401789c || (c16 = cArr2[i13]) < '0' || c16 > '9') {
                        break;
                    }
                    aVar.f401791e = i13 + 1;
                }
                strC = a.c(cArr2, strArr, i16, i13 - i16);
            }
            if (strC.length() == 0) {
                b("numeric reference with no numerals");
                aVar.f401791e = aVar.f401793g;
                return null;
            }
            if (!aVar.k(";")) {
                b("missing semicolon");
            }
            try {
                iIntValue = Integer.valueOf(strC, zL2 ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                b("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (iIntValue >= 128 && iIntValue < 160) {
                b("character is not a valid unicode code point");
                iIntValue = f401798s[iIntValue - 128];
            }
            iArr[0] = iIntValue;
            return iArr;
        }
        aVar.b();
        int i17 = aVar.f401791e;
        while (true) {
            int i18 = aVar.f401791e;
            if (i18 >= aVar.f401789c || (((c15 = cArr2[i18]) < 'A' || c15 > 'Z') && ((c15 < 'a' || c15 > 'z') && !Character.isLetter(c15)))) {
                break;
            }
            aVar.f401791e++;
        }
        while (true) {
            i12 = aVar.f401791e;
            if (i12 >= aVar.f401789c || (c14 = cArr2[i12]) < '0' || c14 > '9') {
                break;
            }
            aVar.f401791e = i12 + 1;
        }
        String strC2 = a.c(cArr2, strArr, i17, i12 - i17);
        boolean zM2 = aVar.m(';');
        Map<String, String> map = io.noties.markwon.html.jsoup.nodes.c.f401764a;
        if (!map.containsKey(strC2) || !zM2) {
            aVar.f401791e = aVar.f401793g;
            if (!zM2) {
                return null;
            }
            b("invalid named referenece '" + strC2 + "'");
            return null;
        }
        if (z12 && (aVar.o() || ((!aVar.j() && (c13 = cArr2[aVar.f401791e]) >= '0' && c13 <= '9') || aVar.n('=', '-', '_')))) {
            aVar.f401791e = aVar.f401793g;
            return null;
        }
        if (!aVar.k(";")) {
            b("missing semicolon");
        }
        String str = map.get(strC2);
        int[] iArr2 = this.f401815q;
        if (str != null) {
            length = str.length();
            if (length == 1) {
                c12 = 0;
                iArr2[0] = str.charAt(0);
            } else {
                c12 = 0;
                iArr2[0] = str.charAt(0);
                iArr2[1] = str.charAt(1);
            }
        } else {
            c12 = 0;
            length = 0;
        }
        if (length == 1) {
            iArr[c12] = iArr2[c12];
            return iArr;
        }
        if (length == 2) {
            return iArr2;
        }
        throw new IllegalArgumentException("Unexpected characters returned for ".concat(strC2));
    }

    public final Token.h d(boolean z12) {
        Token.h hVar;
        if (z12) {
            hVar = this.f401808j;
            hVar.a();
        } else {
            hVar = this.f401809k;
            hVar.a();
        }
        this.f401807i = hVar;
        return hVar;
    }

    public final void e() {
        Token.b(this.f401806h);
    }

    public final void f(char c12) {
        h(String.valueOf(c12));
    }

    public final void g(Token token) {
        if (this.f401803e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f401802d = token;
        this.f401803e = true;
        Token.TokenType tokenType = token.f401765a;
        if (tokenType == Token.TokenType.f401767c) {
            this.f401813o = ((Token.g) token).f401778b;
            return;
        }
        if (tokenType != Token.TokenType.f401768d || ((Token.f) token).f401786j == null) {
            return;
        }
        c cVar = this.f401800b;
        if (cVar.size() < 0) {
            a aVar = this.f401799a;
            int i12 = aVar.f401792f + aVar.f401791e;
            b bVar = new b();
            bVar.f401795a = i12;
            bVar.f401796b = "Attributes incorrectly present on end tag";
            cVar.add(bVar);
        }
    }

    public final void h(String str) {
        if (this.f401804f == null) {
            this.f401804f = str;
            return;
        }
        StringBuilder sb2 = this.f401805g;
        if (sb2.length() == 0) {
            sb2.append(this.f401804f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f401812n);
    }

    public final void j() {
        g(this.f401811m);
    }

    public final void k() {
        Token.h hVar = this.f401807i;
        if (hVar.f401780d != null) {
            hVar.i();
        }
        g(this.f401807i);
    }

    public final void l(e eVar) {
        c cVar = this.f401800b;
        if (cVar.size() < 0) {
            a aVar = this.f401799a;
            cVar.add(new b(aVar.f401792f + aVar.f401791e, "Unexpectedly reached end of file (EOF) in input state [%s]", eVar));
        }
    }

    public final void m(e eVar) {
        c cVar = this.f401800b;
        if (cVar.size() < 0) {
            a aVar = this.f401799a;
            cVar.add(new b(aVar.f401792f + aVar.f401791e, "Unexpected character '%s' in input state [%s]", Character.valueOf(aVar.i()), eVar));
        }
    }

    public final boolean n() {
        return this.f401813o != null && this.f401807i.h().equalsIgnoreCase(this.f401813o);
    }

    public final Token o() {
        while (!this.f401803e) {
            this.f401801c.d(this, this.f401799a);
        }
        StringBuilder sb2 = this.f401805g;
        int length = sb2.length();
        Token.b bVar = this.f401810l;
        if (length > 0) {
            String string = sb2.toString();
            sb2.delete(0, sb2.length());
            this.f401804f = null;
            bVar.f401773b = string;
            return bVar;
        }
        String str = this.f401804f;
        if (str == null) {
            this.f401803e = false;
            return this.f401802d;
        }
        bVar.f401773b = str;
        this.f401804f = null;
        return bVar;
    }
}
