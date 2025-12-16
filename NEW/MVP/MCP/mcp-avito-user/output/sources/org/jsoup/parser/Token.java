package org.jsoup.parser;

import a71.C19692b;

/* loaded from: classes7.dex */
abstract class Token {

    /* renamed from: a, reason: collision with root package name */
    public TokenType f421101a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TokenType {

        /* renamed from: b, reason: collision with root package name */
        public static final TokenType f421102b;

        /* renamed from: c, reason: collision with root package name */
        public static final TokenType f421103c;

        /* renamed from: d, reason: collision with root package name */
        public static final TokenType f421104d;

        /* renamed from: e, reason: collision with root package name */
        public static final TokenType f421105e;

        /* renamed from: f, reason: collision with root package name */
        public static final TokenType f421106f;

        /* renamed from: g, reason: collision with root package name */
        public static final TokenType f421107g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ TokenType[] f421108h;

        static {
            TokenType tokenType = new TokenType("Doctype", 0);
            f421102b = tokenType;
            TokenType tokenType2 = new TokenType("StartTag", 1);
            f421103c = tokenType2;
            TokenType tokenType3 = new TokenType("EndTag", 2);
            f421104d = tokenType3;
            TokenType tokenType4 = new TokenType("Comment", 3);
            f421105e = tokenType4;
            TokenType tokenType5 = new TokenType("Character", 4);
            f421106f = tokenType5;
            TokenType tokenType6 = new TokenType("EOF", 5);
            f421107g = tokenType6;
            f421108h = new TokenType[]{tokenType, tokenType2, tokenType3, tokenType4, tokenType5, tokenType6};
        }

        public TokenType() {
            throw null;
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) f421108h.clone();
        }
    }

    public static final class b extends c {
        @Override // org.jsoup.parser.Token.c
        public final String toString() {
            return AK.c.s(new StringBuilder("<![CDATA["), this.f421109b, "]]>");
        }
    }

    public static class c extends Token {

        /* renamed from: b, reason: collision with root package name */
        public String f421109b;

        public c() {
            super();
            this.f421101a = TokenType.f421106f;
        }

        @Override // org.jsoup.parser.Token
        public final Token f() {
            this.f421109b = null;
            return this;
        }

        public String toString() {
            return this.f421109b;
        }
    }

    public static final class d extends Token {

        /* renamed from: b, reason: collision with root package name */
        public final StringBuilder f421110b;

        /* renamed from: c, reason: collision with root package name */
        public String f421111c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f421112d;

        public d() {
            super();
            this.f421110b = new StringBuilder();
            this.f421112d = false;
            this.f421101a = TokenType.f421105e;
        }

        @Override // org.jsoup.parser.Token
        public final Token f() {
            Token.g(this.f421110b);
            this.f421111c = null;
            this.f421112d = false;
            return this;
        }

        public final void h(char c12) {
            String str = this.f421111c;
            StringBuilder sb2 = this.f421110b;
            if (str != null) {
                sb2.append(str);
                this.f421111c = null;
            }
            sb2.append(c12);
        }

        public final void i(String str) {
            String str2 = this.f421111c;
            StringBuilder sb2 = this.f421110b;
            if (str2 != null) {
                sb2.append(str2);
                this.f421111c = null;
            }
            if (sb2.length() == 0) {
                this.f421111c = str;
            } else {
                sb2.append(str);
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<!--");
            String string = this.f421111c;
            if (string == null) {
                string = this.f421110b.toString();
            }
            return AK.c.s(sb2, string, "-->");
        }
    }

    public static final class e extends Token {

        /* renamed from: b, reason: collision with root package name */
        public final StringBuilder f421113b;

        /* renamed from: c, reason: collision with root package name */
        public String f421114c;

        /* renamed from: d, reason: collision with root package name */
        public final StringBuilder f421115d;

        /* renamed from: e, reason: collision with root package name */
        public final StringBuilder f421116e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f421117f;

        public e() {
            super();
            this.f421113b = new StringBuilder();
            this.f421114c = null;
            this.f421115d = new StringBuilder();
            this.f421116e = new StringBuilder();
            this.f421117f = false;
            this.f421101a = TokenType.f421102b;
        }

        @Override // org.jsoup.parser.Token
        public final Token f() {
            Token.g(this.f421113b);
            this.f421114c = null;
            Token.g(this.f421115d);
            Token.g(this.f421116e);
            this.f421117f = false;
            return this;
        }
    }

    public static final class g extends i {
        public g() {
            this.f421101a = TokenType.f421104d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("</");
            String str = this.f421118b;
            if (str == null) {
                str = "(unset)";
            }
            return AK.c.s(sb2, str, ">");
        }
    }

    public static final class h extends i {
        public h() {
            this.f421101a = TokenType.f421103c;
        }

        @Override // org.jsoup.parser.Token.i, org.jsoup.parser.Token
        public final /* bridge */ /* synthetic */ Token f() {
            f();
            return this;
        }

        @Override // org.jsoup.parser.Token.i
        /* renamed from: p */
        public final i f() {
            super.f();
            this.f421126j = null;
            return this;
        }

        public final String toString() {
            org.jsoup.nodes.b bVar = this.f421126j;
            if (bVar != null) {
                int i12 = 0;
                for (int i13 = 0; i13 < bVar.f421074b; i13++) {
                    if (!org.jsoup.nodes.b.w(bVar.f421075c[i13])) {
                        i12++;
                    }
                }
                if (i12 > 0) {
                    return "<" + m() + " " + this.f421126j.toString() + ">";
                }
            }
            return AK.c.s(new StringBuilder("<"), m(), ">");
        }
    }

    public static abstract class i extends Token {

        /* renamed from: b, reason: collision with root package name */
        public String f421118b;

        /* renamed from: c, reason: collision with root package name */
        public String f421119c;

        /* renamed from: d, reason: collision with root package name */
        public String f421120d;

        /* renamed from: e, reason: collision with root package name */
        public final StringBuilder f421121e;

        /* renamed from: f, reason: collision with root package name */
        public String f421122f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f421123g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f421124h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f421125i;

        /* renamed from: j, reason: collision with root package name */
        public org.jsoup.nodes.b f421126j;

        public i() {
            super();
            this.f421121e = new StringBuilder();
            this.f421123g = false;
            this.f421124h = false;
            this.f421125i = false;
        }

        public final void h(char c12) {
            String strValueOf = String.valueOf(c12);
            String str = this.f421120d;
            if (str != null) {
                strValueOf = str.concat(strValueOf);
            }
            this.f421120d = strValueOf;
        }

        public final void i(char c12) {
            this.f421124h = true;
            String str = this.f421122f;
            if (str != null) {
                this.f421121e.append(str);
                this.f421122f = null;
            }
            this.f421121e.append(c12);
        }

        public final void j(String str) {
            this.f421124h = true;
            String str2 = this.f421122f;
            if (str2 != null) {
                this.f421121e.append(str2);
                this.f421122f = null;
            }
            StringBuilder sb2 = this.f421121e;
            if (sb2.length() == 0) {
                this.f421122f = str;
            } else {
                sb2.append(str);
            }
        }

        public final void k(int[] iArr) {
            this.f421124h = true;
            String str = this.f421122f;
            if (str != null) {
                this.f421121e.append(str);
                this.f421122f = null;
            }
            for (int i12 : iArr) {
                this.f421121e.appendCodePoint(i12);
            }
        }

        public final void l(String str) {
            String str2 = this.f421118b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f421118b = str;
            this.f421119c = C19692b.a(str);
        }

        public final String m() {
            String str = this.f421118b;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Must be false");
            }
            return this.f421118b;
        }

        public final void n(String str) {
            this.f421118b = str;
            this.f421119c = C19692b.a(str);
        }

        public final void o() {
            if (this.f421126j == null) {
                this.f421126j = new org.jsoup.nodes.b();
            }
            String str = this.f421120d;
            StringBuilder sb2 = this.f421121e;
            if (str != null) {
                String strTrim = str.trim();
                this.f421120d = strTrim;
                if (strTrim.length() > 0) {
                    this.f421126j.a(this.f421120d, this.f421124h ? sb2.length() > 0 ? sb2.toString() : this.f421122f : this.f421123g ? "" : null);
                }
            }
            this.f421120d = null;
            this.f421123g = false;
            this.f421124h = false;
            Token.g(sb2);
            this.f421122f = null;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public i f() {
            this.f421118b = null;
            this.f421119c = null;
            this.f421120d = null;
            Token.g(this.f421121e);
            this.f421122f = null;
            this.f421123g = false;
            this.f421124h = false;
            this.f421125i = false;
            this.f421126j = null;
            return this;
        }
    }

    public static void g(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public final boolean a() {
        return this.f421101a == TokenType.f421105e;
    }

    public final boolean b() {
        return this.f421101a == TokenType.f421102b;
    }

    public final boolean c() {
        return this.f421101a == TokenType.f421107g;
    }

    public final boolean d() {
        return this.f421101a == TokenType.f421104d;
    }

    public final boolean e() {
        return this.f421101a == TokenType.f421103c;
    }

    public abstract Token f();

    public Token() {
    }

    public static final class f extends Token {
        public f() {
            super();
            this.f421101a = TokenType.f421107g;
        }

        @Override // org.jsoup.parser.Token
        public final Token f() {
            return this;
        }
    }
}
