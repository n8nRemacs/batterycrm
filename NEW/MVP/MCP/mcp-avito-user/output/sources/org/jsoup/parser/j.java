package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;

/* compiled from: Tokeniser.java */
/* loaded from: classes7.dex */
final class j {

    /* renamed from: r, reason: collision with root package name */
    public static final char[] f421246r;

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f421247s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a, reason: collision with root package name */
    public final a f421248a;

    /* renamed from: b, reason: collision with root package name */
    public final e f421249b;

    /* renamed from: d, reason: collision with root package name */
    public Token f421251d;

    /* renamed from: i, reason: collision with root package name */
    public Token.i f421256i;

    /* renamed from: o, reason: collision with root package name */
    public String f421262o;

    /* renamed from: c, reason: collision with root package name */
    public k f421250c = k.f421292b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f421252e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f421253f = null;

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f421254g = new StringBuilder(1024);

    /* renamed from: h, reason: collision with root package name */
    public final StringBuilder f421255h = new StringBuilder(1024);

    /* renamed from: j, reason: collision with root package name */
    public final Token.h f421257j = new Token.h();

    /* renamed from: k, reason: collision with root package name */
    public final Token.g f421258k = new Token.g();

    /* renamed from: l, reason: collision with root package name */
    public final Token.c f421259l = new Token.c();

    /* renamed from: m, reason: collision with root package name */
    public final Token.e f421260m = new Token.e();

    /* renamed from: n, reason: collision with root package name */
    public final Token.d f421261n = new Token.d();

    /* renamed from: p, reason: collision with root package name */
    public final int[] f421263p = new int[1];

    /* renamed from: q, reason: collision with root package name */
    public final int[] f421264q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f421246r = cArr;
        Arrays.sort(cArr);
    }

    public j(a aVar, e eVar) {
        this.f421248a = aVar;
        this.f421249b = eVar;
    }

    public final void a(k kVar) {
        this.f421248a.a();
        this.f421250c = kVar;
    }

    public final void b(String str) {
        e eVar = this.f421249b;
        if (eVar.e()) {
            eVar.add(new d(this.f421248a.r(), "Invalid character reference: %s", str));
        }
    }

    public final int[] c(Character ch2, boolean z12) {
        int i12;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        int i13;
        String strC;
        char c17;
        int iIntValue;
        int i14;
        char c18;
        a aVar = this.f421248a;
        if (aVar.k()) {
            return null;
        }
        if (ch2 != null && ch2.charValue() == aVar.j()) {
            return null;
        }
        char[] cArr = f421246r;
        aVar.b();
        if (!aVar.k() && Arrays.binarySearch(cArr, aVar.f421127a[aVar.f421131e]) >= 0) {
            return null;
        }
        if (aVar.f421129c - aVar.f421131e < 1024) {
            aVar.f421130d = 0;
        }
        aVar.b();
        aVar.f421133g = aVar.f421131e;
        boolean zL2 = aVar.l("#");
        char c19 = 'A';
        int[] iArr = this.f421263p;
        if (zL2) {
            boolean zM2 = aVar.m("X");
            if (zM2) {
                aVar.b();
                int i15 = aVar.f421131e;
                while (true) {
                    i14 = aVar.f421131e;
                    if (i14 >= aVar.f421129c || (((c18 = aVar.f421127a[i14]) < '0' || c18 > '9') && ((c18 < c19 || c18 > 'F') && (c18 < 'a' || c18 > 'f')))) {
                        break;
                    }
                    aVar.f421131e = i14 + 1;
                    c19 = 'A';
                }
                strC = a.c(aVar.f421127a, aVar.f421134h, i15, i14 - i15);
            } else {
                aVar.b();
                int i16 = aVar.f421131e;
                while (true) {
                    i13 = aVar.f421131e;
                    if (i13 >= aVar.f421129c || (c17 = aVar.f421127a[i13]) < '0' || c17 > '9') {
                        break;
                    }
                    aVar.f421131e = i13 + 1;
                }
                strC = a.c(aVar.f421127a, aVar.f421134h, i16, i13 - i16);
            }
            if (strC.length() == 0) {
                b("numeric reference with no numerals");
                aVar.s();
                return null;
            }
            aVar.f421133g = -1;
            if (!aVar.l(";")) {
                b("missing semicolon");
            }
            try {
                iIntValue = Integer.valueOf(strC, zM2 ? 16 : 10).intValue();
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
                iIntValue = f421247s[iIntValue - 128];
            }
            iArr[0] = iIntValue;
            return iArr;
        }
        aVar.b();
        int i17 = aVar.f421131e;
        while (true) {
            int i18 = aVar.f421131e;
            if (i18 >= aVar.f421129c || (((c16 = aVar.f421127a[i18]) < 'A' || c16 > 'Z') && ((c16 < 'a' || c16 > 'z') && !Character.isLetter(c16)))) {
                break;
            }
            aVar.f421131e++;
        }
        while (true) {
            i12 = aVar.f421131e;
            if (i12 >= aVar.f421129c || (c15 = aVar.f421127a[i12]) < '0' || c15 > '9') {
                break;
            }
            aVar.f421131e = i12 + 1;
        }
        String strC2 = a.c(aVar.f421127a, aVar.f421134h, i17, i12 - i17);
        boolean zN2 = aVar.n(';');
        char[] cArr2 = Entities.f421054a;
        Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        int iBinarySearch = Arrays.binarySearch(escapeMode.f421060b, strC2);
        if ((iBinarySearch >= 0 ? escapeMode.f421061c[iBinarySearch] : -1) == -1) {
            Entities.EscapeMode escapeMode2 = Entities.EscapeMode.extended;
            int iBinarySearch2 = Arrays.binarySearch(escapeMode2.f421060b, strC2);
            if ((iBinarySearch2 >= 0 ? escapeMode2.f421061c[iBinarySearch2] : -1) == -1 || !zN2) {
                aVar.s();
                if (zN2) {
                    b("invalid named reference");
                }
                return null;
            }
        }
        if (z12 && (aVar.p() || ((!aVar.k() && (c14 = aVar.f421127a[aVar.f421131e]) >= '0' && c14 <= '9') || aVar.o('=', '-', '_')))) {
            aVar.s();
            return null;
        }
        aVar.f421133g = -1;
        if (!aVar.l(";")) {
            b("missing semicolon");
        }
        String str = Entities.f421055b.get(strC2);
        int[] iArr2 = this.f421264q;
        if (str != null) {
            iArr2[0] = str.codePointAt(0);
            iArr2[1] = str.codePointAt(1);
            c13 = 2;
            c12 = 0;
        } else {
            Entities.EscapeMode escapeMode3 = Entities.EscapeMode.extended;
            int iBinarySearch3 = Arrays.binarySearch(escapeMode3.f421060b, strC2);
            int i19 = iBinarySearch3 >= 0 ? escapeMode3.f421061c[iBinarySearch3] : -1;
            if (i19 != -1) {
                c12 = 0;
                iArr2[0] = i19;
                c13 = 1;
            } else {
                c12 = 0;
                c13 = 0;
            }
        }
        if (c13 == 1) {
            iArr[c12] = iArr2[c12];
            return iArr;
        }
        if (c13 == 2) {
            return iArr2;
        }
        throw new IllegalArgumentException("Unexpected characters returned for ".concat(strC2));
    }

    public final Token.i d(boolean z12) {
        Token.i iVar;
        if (z12) {
            iVar = this.f421257j;
            iVar.f();
        } else {
            iVar = this.f421258k;
            iVar.f();
        }
        this.f421256i = iVar;
        return iVar;
    }

    public final void e() {
        Token.g(this.f421255h);
    }

    public final void f(char c12) {
        g(String.valueOf(c12));
    }

    public final void g(String str) {
        if (this.f421253f == null) {
            this.f421253f = str;
            return;
        }
        StringBuilder sb2 = this.f421254g;
        if (sb2.length() == 0) {
            sb2.append(this.f421253f);
        }
        sb2.append(str);
    }

    public final void h(Token token) {
        if (this.f421252e) {
            throw new IllegalArgumentException("Must be false");
        }
        this.f421251d = token;
        this.f421252e = true;
        Token.TokenType tokenType = token.f421101a;
        if (tokenType == Token.TokenType.f421103c) {
            this.f421262o = ((Token.h) token).f421118b;
            return;
        }
        if (tokenType != Token.TokenType.f421104d || ((Token.g) token).f421126j == null) {
            return;
        }
        e eVar = this.f421249b;
        if (eVar.e()) {
            eVar.add(new d(this.f421248a.r(), "Attributes incorrectly present on end tag"));
        }
    }

    public final void i() {
        h(this.f421261n);
    }

    public final void j() {
        h(this.f421260m);
    }

    public final void k() {
        Token.i iVar = this.f421256i;
        if (iVar.f421120d != null) {
            iVar.o();
        }
        h(this.f421256i);
    }

    public final void l(k kVar) {
        e eVar = this.f421249b;
        if (eVar.e()) {
            eVar.add(new d(this.f421248a.r(), "Unexpectedly reached end of file (EOF) in input state [%s]", kVar));
        }
    }

    public final void m(k kVar) {
        e eVar = this.f421249b;
        if (eVar.e()) {
            a aVar = this.f421248a;
            eVar.add(new d(aVar.r(), "Unexpected character '%s' in input state [%s]", Character.valueOf(aVar.j()), kVar));
        }
    }

    public final boolean n() {
        return this.f421262o != null && this.f421256i.m().equalsIgnoreCase(this.f421262o);
    }
}
