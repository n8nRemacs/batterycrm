package io.noties.markwon.html.jsoup.parser;

import j.N;
import java.util.Locale;

/* loaded from: classes8.dex */
public abstract class Token {

    /* renamed from: a, reason: collision with root package name */
    public final TokenType f401765a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TokenType {

        /* renamed from: b, reason: collision with root package name */
        public static final TokenType f401766b;

        /* renamed from: c, reason: collision with root package name */
        public static final TokenType f401767c;

        /* renamed from: d, reason: collision with root package name */
        public static final TokenType f401768d;

        /* renamed from: e, reason: collision with root package name */
        public static final TokenType f401769e;

        /* renamed from: f, reason: collision with root package name */
        public static final TokenType f401770f;

        /* renamed from: g, reason: collision with root package name */
        public static final TokenType f401771g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ TokenType[] f401772h;

        static {
            TokenType tokenType = new TokenType("Doctype", 0);
            f401766b = tokenType;
            TokenType tokenType2 = new TokenType("StartTag", 1);
            f401767c = tokenType2;
            TokenType tokenType3 = new TokenType("EndTag", 2);
            f401768d = tokenType3;
            TokenType tokenType4 = new TokenType("Comment", 3);
            f401769e = tokenType4;
            TokenType tokenType5 = new TokenType("Character", 4);
            f401770f = tokenType5;
            TokenType tokenType6 = new TokenType("EOF", 5);
            f401771g = tokenType6;
            f401772h = new TokenType[]{tokenType, tokenType2, tokenType3, tokenType4, tokenType5, tokenType6};
        }

        public TokenType() {
            throw null;
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) f401772h.clone();
        }
    }

    public static final class a extends b {
        @Override // io.noties.markwon.html.jsoup.parser.Token.b
        public final String toString() {
            return AK.c.s(new StringBuilder("<![CDATA["), this.f401773b, "]]>");
        }
    }

    public static class b extends Token {

        /* renamed from: b, reason: collision with root package name */
        public String f401773b;

        public b() {
            super(TokenType.f401770f);
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        public final Token a() {
            this.f401773b = null;
            return this;
        }

        public String toString() {
            return this.f401773b;
        }
    }

    public static final class c extends Token {

        /* renamed from: b, reason: collision with root package name */
        public final StringBuilder f401774b;

        public c() {
            super(TokenType.f401769e);
            this.f401774b = new StringBuilder();
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        public final Token a() {
            Token.b(this.f401774b);
            return this;
        }

        public final String toString() {
            return "<!--" + this.f401774b.toString() + "-->";
        }
    }

    public static final class d extends Token {

        /* renamed from: b, reason: collision with root package name */
        public final StringBuilder f401775b;

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f401776c;

        /* renamed from: d, reason: collision with root package name */
        public final StringBuilder f401777d;

        public d() {
            super(TokenType.f401766b);
            this.f401775b = new StringBuilder();
            this.f401776c = new StringBuilder();
            this.f401777d = new StringBuilder();
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        public final Token a() {
            Token.b(this.f401775b);
            Token.b(this.f401776c);
            Token.b(this.f401777d);
            return this;
        }
    }

    public static final class f extends h {
        public f() {
            super(TokenType.f401768d);
        }

        public final String toString() {
            return "</" + h() + ">";
        }
    }

    public static final class g extends h {
        public g() {
            super(TokenType.f401767c);
            this.f401786j = new io.noties.markwon.html.jsoup.nodes.b();
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token.h, io.noties.markwon.html.jsoup.parser.Token
        public final /* bridge */ /* synthetic */ Token a() {
            a();
            return this;
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token.h
        /* renamed from: j */
        public final h a() {
            super.a();
            this.f401786j = new io.noties.markwon.html.jsoup.nodes.b();
            return this;
        }

        public final String toString() {
            io.noties.markwon.html.jsoup.nodes.b bVar = this.f401786j;
            if (bVar == null || bVar.f401759b <= 0) {
                return "<" + h() + ">";
            }
            return "<" + h() + " " + this.f401786j.toString() + ">";
        }
    }

    public static abstract class h extends Token {

        /* renamed from: b, reason: collision with root package name */
        public String f401778b;

        /* renamed from: c, reason: collision with root package name */
        public String f401779c;

        /* renamed from: d, reason: collision with root package name */
        public String f401780d;

        /* renamed from: e, reason: collision with root package name */
        public final StringBuilder f401781e;

        /* renamed from: f, reason: collision with root package name */
        public String f401782f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f401783g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f401784h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f401785i;

        /* renamed from: j, reason: collision with root package name */
        public io.noties.markwon.html.jsoup.nodes.b f401786j;

        public h(@N TokenType tokenType) {
            super(tokenType);
            this.f401781e = new StringBuilder();
            this.f401783g = false;
            this.f401784h = false;
            this.f401785i = false;
        }

        public final void c(char c12) {
            String strValueOf = String.valueOf(c12);
            String str = this.f401780d;
            if (str != null) {
                strValueOf = str.concat(strValueOf);
            }
            this.f401780d = strValueOf;
        }

        public final void d(char c12) {
            this.f401784h = true;
            String str = this.f401782f;
            if (str != null) {
                this.f401781e.append(str);
                this.f401782f = null;
            }
            this.f401781e.append(c12);
        }

        public final void e(String str) {
            this.f401784h = true;
            String str2 = this.f401782f;
            if (str2 != null) {
                this.f401781e.append(str2);
                this.f401782f = null;
            }
            StringBuilder sb2 = this.f401781e;
            if (sb2.length() == 0) {
                this.f401782f = str;
            } else {
                sb2.append(str);
            }
        }

        public final void f(int[] iArr) {
            this.f401784h = true;
            String str = this.f401782f;
            if (str != null) {
                this.f401781e.append(str);
                this.f401782f = null;
            }
            for (int i12 : iArr) {
                this.f401781e.appendCodePoint(i12);
            }
        }

        public final void g(String str) {
            String str2 = this.f401778b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f401778b = str;
            this.f401779c = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
        }

        public final String h() {
            String str = this.f401778b;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Must be false");
            }
            return this.f401778b;
        }

        public final void i() {
            if (this.f401786j == null) {
                this.f401786j = new io.noties.markwon.html.jsoup.nodes.b();
            }
            String str = this.f401780d;
            StringBuilder sb2 = this.f401781e;
            if (str != null) {
                String strTrim = str.trim();
                this.f401780d = strTrim;
                if (strTrim.length() > 0) {
                    String string = this.f401784h ? sb2.length() > 0 ? sb2.toString() : this.f401782f : this.f401783g ? "" : null;
                    io.noties.markwon.html.jsoup.nodes.b bVar = this.f401786j;
                    String str2 = this.f401780d;
                    int iA2 = bVar.a(str2);
                    if (iA2 != -1) {
                        bVar.f401761d[iA2] = string;
                    } else {
                        int i12 = bVar.f401759b;
                        int i13 = i12 + 1;
                        if (i13 < i12) {
                            throw new IllegalArgumentException("Must be true");
                        }
                        String[] strArr = bVar.f401760c;
                        int length = strArr.length;
                        if (length < i13) {
                            int i14 = length >= 4 ? i12 * 2 : 4;
                            if (i13 <= i14) {
                                i13 = i14;
                            }
                            String[] strArr2 = new String[i13];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i13));
                            bVar.f401760c = strArr2;
                            String[] strArr3 = bVar.f401761d;
                            String[] strArr4 = new String[i13];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i13));
                            bVar.f401761d = strArr4;
                        }
                        String[] strArr5 = bVar.f401760c;
                        int i15 = bVar.f401759b;
                        strArr5[i15] = str2;
                        bVar.f401761d[i15] = string;
                        bVar.f401759b = i15 + 1;
                    }
                }
            }
            this.f401780d = null;
            this.f401783g = false;
            this.f401784h = false;
            Token.b(sb2);
            this.f401782f = null;
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public h a() {
            this.f401778b = null;
            this.f401779c = null;
            this.f401780d = null;
            Token.b(this.f401781e);
            this.f401782f = null;
            this.f401783g = false;
            this.f401784h = false;
            this.f401785i = false;
            this.f401786j = null;
            return this;
        }
    }

    public Token(@N TokenType tokenType) {
        this.f401765a = tokenType;
    }

    public static void b(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract Token a();

    public static final class e extends Token {
        public e() {
            super(TokenType.f401771g);
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        public final Token a() {
            return this;
        }
    }
}
