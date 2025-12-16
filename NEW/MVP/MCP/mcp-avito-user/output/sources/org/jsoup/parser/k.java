package org.jsoup.parser;

import java.io.IOException;
import java.util.Locale;
import org.jsoup.parser.Token;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TokeniserState.java */
/* loaded from: classes7.dex */
abstract class k {

    /* renamed from: A, reason: collision with root package name */
    public static final C44896r f421265A;

    /* renamed from: B, reason: collision with root package name */
    public static final C44897s f421266B;

    /* renamed from: C, reason: collision with root package name */
    public static final C44898t f421267C;

    /* renamed from: D, reason: collision with root package name */
    public static final C44899u f421268D;

    /* renamed from: E, reason: collision with root package name */
    public static final C44901w f421269E;

    /* renamed from: F, reason: collision with root package name */
    public static final C44902x f421270F;

    /* renamed from: G, reason: collision with root package name */
    public static final C44903y f421271G;

    /* renamed from: H, reason: collision with root package name */
    public static final C44904z f421272H;

    /* renamed from: I, reason: collision with root package name */
    public static final A f421273I;

    /* renamed from: J, reason: collision with root package name */
    public static final B f421274J;

    /* renamed from: K, reason: collision with root package name */
    public static final C f421275K;

    /* renamed from: L, reason: collision with root package name */
    public static final D f421276L;

    /* renamed from: M, reason: collision with root package name */
    public static final E f421277M;

    /* renamed from: N, reason: collision with root package name */
    public static final F f421278N;

    /* renamed from: O, reason: collision with root package name */
    public static final H f421279O;

    /* renamed from: P, reason: collision with root package name */
    public static final I f421280P;

    /* renamed from: Q, reason: collision with root package name */
    public static final J f421281Q;

    /* renamed from: R, reason: collision with root package name */
    public static final K f421282R;

    /* renamed from: S, reason: collision with root package name */
    public static final L f421283S;

    /* renamed from: T, reason: collision with root package name */
    public static final M f421284T;

    /* renamed from: U, reason: collision with root package name */
    public static final N f421285U;

    /* renamed from: V, reason: collision with root package name */
    public static final O f421286V;

    /* renamed from: W, reason: collision with root package name */
    public static final P f421287W;

    /* renamed from: X, reason: collision with root package name */
    public static final Q f421288X;

    /* renamed from: Y, reason: collision with root package name */
    public static final S f421289Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final T f421290Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final U f421291a0;

    /* renamed from: b, reason: collision with root package name */
    public static final C12215k f421292b;

    /* renamed from: b0, reason: collision with root package name */
    public static final V f421293b0;

    /* renamed from: c, reason: collision with root package name */
    public static final C44900v f421294c;

    /* renamed from: c0, reason: collision with root package name */
    public static final W f421295c0;

    /* renamed from: d, reason: collision with root package name */
    public static final G f421296d;

    /* renamed from: d0, reason: collision with root package name */
    public static final X f421297d0;

    /* renamed from: e, reason: collision with root package name */
    public static final R f421298e;

    /* renamed from: e0, reason: collision with root package name */
    public static final Y f421299e0;

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f421300f;

    /* renamed from: f0, reason: collision with root package name */
    public static final Z f421301f0;

    /* renamed from: g, reason: collision with root package name */
    public static final l0 f421302g;

    /* renamed from: g0, reason: collision with root package name */
    public static final a0 f421303g0;

    /* renamed from: h, reason: collision with root package name */
    public static final m0 f421304h;

    /* renamed from: h0, reason: collision with root package name */
    public static final b0 f421305h0;

    /* renamed from: i, reason: collision with root package name */
    public static final n0 f421306i;

    /* renamed from: i0, reason: collision with root package name */
    public static final d0 f421307i0;

    /* renamed from: j, reason: collision with root package name */
    public static final o0 f421308j;

    /* renamed from: j0, reason: collision with root package name */
    public static final e0 f421309j0;

    /* renamed from: k, reason: collision with root package name */
    public static final C44880a f421310k;

    /* renamed from: k0, reason: collision with root package name */
    public static final f0 f421311k0;

    /* renamed from: l, reason: collision with root package name */
    public static final C44881b f421312l;

    /* renamed from: l0, reason: collision with root package name */
    public static final g0 f421313l0;

    /* renamed from: m, reason: collision with root package name */
    public static final C44882c f421314m;

    /* renamed from: m0, reason: collision with root package name */
    public static final h0 f421315m0;

    /* renamed from: n, reason: collision with root package name */
    public static final C44883d f421316n;

    /* renamed from: n0, reason: collision with root package name */
    public static final i0 f421317n0;

    /* renamed from: o, reason: collision with root package name */
    public static final C44884e f421318o;

    /* renamed from: o0, reason: collision with root package name */
    public static final j0 f421319o0;

    /* renamed from: p, reason: collision with root package name */
    public static final C44885f f421320p;

    /* renamed from: p0, reason: collision with root package name */
    public static final k0 f421321p0;

    /* renamed from: q, reason: collision with root package name */
    public static final C44886g f421322q;

    /* renamed from: q0, reason: collision with root package name */
    public static final char[] f421323q0;

    /* renamed from: r, reason: collision with root package name */
    public static final C44887h f421324r;

    /* renamed from: r0, reason: collision with root package name */
    public static final char[] f421325r0;

    /* renamed from: s, reason: collision with root package name */
    public static final C44888i f421326s;

    /* renamed from: s0, reason: collision with root package name */
    public static final char[] f421327s0;

    /* renamed from: t, reason: collision with root package name */
    public static final C44889j f421328t;

    /* renamed from: t0, reason: collision with root package name */
    public static final char[] f421329t0;

    /* renamed from: u, reason: collision with root package name */
    public static final C44890l f421330u;

    /* renamed from: u0, reason: collision with root package name */
    public static final String f421331u0;

    /* renamed from: v, reason: collision with root package name */
    public static final C44891m f421332v;

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ k[] f421333v0;

    /* renamed from: w, reason: collision with root package name */
    public static final C44892n f421334w;

    /* renamed from: x, reason: collision with root package name */
    public static final C44893o f421335x;

    /* renamed from: y, reason: collision with root package name */
    public static final C44894p f421336y;

    /* renamed from: z, reason: collision with root package name */
    public static final C44895q f421337z;

    /* compiled from: TokeniserState.java */
    public enum A extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            B b12 = k.f421274J;
            if (cD2 == 0) {
                aVar.t();
                jVar.m(this);
                jVar.f421256i.o();
                jVar.f421250c = b12;
                return;
            }
            if (cD2 != ' ') {
                if (cD2 != '\"' && cD2 != '\'') {
                    if (cD2 == '/') {
                        jVar.f421250c = k.f421281Q;
                        return;
                    }
                    C12215k c12215k = k.f421292b;
                    if (cD2 == 65535) {
                        jVar.l(this);
                        jVar.f421250c = c12215k;
                        return;
                    }
                    if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r') {
                        return;
                    }
                    switch (cD2) {
                        case '<':
                            aVar.t();
                            jVar.m(this);
                            break;
                        case '=':
                            break;
                        case '>':
                            break;
                        default:
                            jVar.f421256i.o();
                            aVar.t();
                            jVar.f421250c = b12;
                            return;
                    }
                    jVar.k();
                    jVar.f421250c = c12215k;
                    return;
                }
                jVar.m(this);
                jVar.f421256i.o();
                jVar.f421256i.h(cD2);
                jVar.f421250c = b12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum B extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            String strI = aVar.i(k.f421327s0);
            Token.i iVar = jVar.f421256i;
            String str = iVar.f421120d;
            if (str != null) {
                strI = str.concat(strI);
            }
            iVar.f421120d = strI;
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421256i.h((char) 65533);
                return;
            }
            if (cD2 != ' ') {
                if (cD2 != '\"' && cD2 != '\'') {
                    if (cD2 == '/') {
                        jVar.f421250c = k.f421281Q;
                        return;
                    }
                    C12215k c12215k = k.f421292b;
                    if (cD2 == 65535) {
                        jVar.l(this);
                        jVar.f421250c = c12215k;
                        return;
                    }
                    if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r') {
                        switch (cD2) {
                            case '<':
                                break;
                            case '=':
                                jVar.f421250c = k.f421276L;
                                break;
                            case '>':
                                jVar.k();
                                jVar.f421250c = c12215k;
                                break;
                            default:
                                jVar.f421256i.h(cD2);
                                break;
                        }
                        return;
                    }
                }
                jVar.m(this);
                jVar.f421256i.h(cD2);
                return;
            }
            jVar.f421250c = k.f421275K;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum C extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            B b12 = k.f421274J;
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421256i.h((char) 65533);
                jVar.f421250c = b12;
                return;
            }
            if (cD2 != ' ') {
                if (cD2 != '\"' && cD2 != '\'') {
                    if (cD2 == '/') {
                        jVar.f421250c = k.f421281Q;
                        return;
                    }
                    C12215k c12215k = k.f421292b;
                    if (cD2 == 65535) {
                        jVar.l(this);
                        jVar.f421250c = c12215k;
                        return;
                    }
                    if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r') {
                        return;
                    }
                    switch (cD2) {
                        case '<':
                            break;
                        case '=':
                            jVar.f421250c = k.f421276L;
                            break;
                        case '>':
                            jVar.k();
                            jVar.f421250c = c12215k;
                            break;
                        default:
                            jVar.f421256i.o();
                            aVar.t();
                            jVar.f421250c = b12;
                            break;
                    }
                    return;
                }
                jVar.m(this);
                jVar.f421256i.o();
                jVar.f421256i.h(cD2);
                jVar.f421250c = b12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum D extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            H h12 = k.f421279O;
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421256i.i((char) 65533);
                jVar.f421250c = h12;
                return;
            }
            if (cD2 != ' ') {
                if (cD2 == '\"') {
                    jVar.f421250c = k.f421277M;
                    return;
                }
                if (cD2 != '`') {
                    C12215k c12215k = k.f421292b;
                    if (cD2 == 65535) {
                        jVar.l(this);
                        jVar.k();
                        jVar.f421250c = c12215k;
                        return;
                    }
                    if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r') {
                        return;
                    }
                    if (cD2 == '&') {
                        aVar.t();
                        jVar.f421250c = h12;
                        return;
                    }
                    if (cD2 == '\'') {
                        jVar.f421250c = k.f421278N;
                        return;
                    }
                    switch (cD2) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            jVar.m(this);
                            jVar.k();
                            jVar.f421250c = c12215k;
                            break;
                        default:
                            aVar.t();
                            jVar.f421250c = h12;
                            break;
                    }
                    return;
                }
                jVar.m(this);
                jVar.f421256i.i(cD2);
                jVar.f421250c = h12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum E extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            String strI = aVar.i(k.f421325r0);
            if (strI.length() > 0) {
                jVar.f421256i.j(strI);
            } else {
                jVar.f421256i.f421123g = true;
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421256i.i((char) 65533);
                return;
            }
            if (cD2 == '\"') {
                jVar.f421250c = k.f421280P;
                return;
            }
            if (cD2 != '&') {
                if (cD2 != 65535) {
                    jVar.f421256i.i(cD2);
                    return;
                } else {
                    jVar.l(this);
                    jVar.f421250c = k.f421292b;
                    return;
                }
            }
            int[] iArrC = jVar.c('\"', true);
            if (iArrC != null) {
                jVar.f421256i.k(iArrC);
            } else {
                jVar.f421256i.i('&');
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum F extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            String strI = aVar.i(k.f421323q0);
            if (strI.length() > 0) {
                jVar.f421256i.j(strI);
            } else {
                jVar.f421256i.f421123g = true;
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421256i.i((char) 65533);
                return;
            }
            if (cD2 == 65535) {
                jVar.l(this);
                jVar.f421250c = k.f421292b;
                return;
            }
            if (cD2 != '&') {
                if (cD2 != '\'') {
                    jVar.f421256i.i(cD2);
                    return;
                } else {
                    jVar.f421250c = k.f421280P;
                    return;
                }
            }
            int[] iArrC = jVar.c('\'', true);
            if (iArrC != null) {
                jVar.f421256i.k(iArrC);
            } else {
                jVar.f421256i.i('&');
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum G extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cJ2 = aVar.j();
            if (cJ2 == 0) {
                jVar.m(this);
                aVar.a();
                jVar.f((char) 65533);
            } else {
                if (cJ2 == '&') {
                    jVar.a(k.f421298e);
                    return;
                }
                if (cJ2 == '<') {
                    jVar.a(k.f421312l);
                } else if (cJ2 != 65535) {
                    jVar.g(aVar.e());
                } else {
                    jVar.h(new Token.f());
                }
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum H extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            String strI = aVar.i(k.f421329t0);
            if (strI.length() > 0) {
                jVar.f421256i.j(strI);
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421256i.i((char) 65533);
                return;
            }
            if (cD2 != ' ') {
                if (cD2 != '\"' && cD2 != '`') {
                    C12215k c12215k = k.f421292b;
                    if (cD2 == 65535) {
                        jVar.l(this);
                        jVar.f421250c = c12215k;
                        return;
                    }
                    if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r') {
                        if (cD2 == '&') {
                            int[] iArrC = jVar.c('>', true);
                            if (iArrC != null) {
                                jVar.f421256i.k(iArrC);
                                return;
                            } else {
                                jVar.f421256i.i('&');
                                return;
                            }
                        }
                        if (cD2 != '\'') {
                            switch (cD2) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    jVar.k();
                                    jVar.f421250c = c12215k;
                                    break;
                                default:
                                    jVar.f421256i.i(cD2);
                                    break;
                            }
                            return;
                        }
                    }
                }
                jVar.m(this);
                jVar.f421256i.i(cD2);
                return;
            }
            jVar.f421250c = k.f421273I;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum I extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            A a12 = k.f421273I;
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                jVar.f421250c = a12;
                return;
            }
            if (cD2 == '/') {
                jVar.f421250c = k.f421281Q;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.k();
                jVar.f421250c = c12215k;
            } else if (cD2 == 65535) {
                jVar.l(this);
                jVar.f421250c = c12215k;
            } else {
                aVar.t();
                jVar.m(this);
                jVar.f421250c = a12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum J extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.f421256i.f421125i = true;
                jVar.k();
                jVar.f421250c = c12215k;
            } else if (cD2 == 65535) {
                jVar.l(this);
                jVar.f421250c = c12215k;
            } else {
                aVar.t();
                jVar.m(this);
                jVar.f421250c = k.f421273I;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum K extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            aVar.t();
            jVar.f421261n.i(aVar.g('>'));
            char cD2 = aVar.d();
            if (cD2 == '>' || cD2 == 65535) {
                jVar.i();
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum L extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (aVar.l("--")) {
                jVar.f421261n.f();
                jVar.f421250c = k.f421284T;
                return;
            }
            if (aVar.m("DOCTYPE")) {
                jVar.f421250c = k.f421290Z;
                return;
            }
            if (aVar.l("[CDATA[")) {
                jVar.e();
                jVar.f421250c = k.f421321p0;
                return;
            }
            jVar.m(this);
            Token.d dVar = jVar.f421261n;
            dVar.f();
            dVar.f421112d = true;
            jVar.a(k.f421282R);
        }
    }

    /* compiled from: TokeniserState.java */
    public enum M extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = k.f421286V;
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421261n.h((char) 65533);
                jVar.f421250c = o12;
                return;
            }
            if (cD2 == '-') {
                jVar.f421250c = k.f421285U;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.i();
                jVar.f421250c = c12215k;
            } else if (cD2 != 65535) {
                aVar.t();
                jVar.f421250c = o12;
            } else {
                jVar.l(this);
                jVar.i();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum N extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = k.f421286V;
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421261n.h((char) 65533);
                jVar.f421250c = o12;
                return;
            }
            if (cD2 == '-') {
                jVar.f421250c = k.f421285U;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.i();
                jVar.f421250c = c12215k;
            } else if (cD2 != 65535) {
                jVar.f421261n.h(cD2);
                jVar.f421250c = o12;
            } else {
                jVar.l(this);
                jVar.i();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum O extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cJ2 = aVar.j();
            if (cJ2 == 0) {
                jVar.m(this);
                aVar.a();
                jVar.f421261n.h((char) 65533);
            } else if (cJ2 == '-') {
                jVar.a(k.f421287W);
            } else {
                if (cJ2 != 65535) {
                    jVar.f421261n.i(aVar.h('-', 0));
                    return;
                }
                jVar.l(this);
                jVar.i();
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum P extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = k.f421286V;
            if (cD2 == 0) {
                jVar.m(this);
                Token.d dVar = jVar.f421261n;
                dVar.h('-');
                dVar.h((char) 65533);
                jVar.f421250c = o12;
                return;
            }
            if (cD2 == '-') {
                jVar.f421250c = k.f421288X;
                return;
            }
            if (cD2 == 65535) {
                jVar.l(this);
                jVar.i();
                jVar.f421250c = k.f421292b;
            } else {
                Token.d dVar2 = jVar.f421261n;
                dVar2.h('-');
                dVar2.h(cD2);
                jVar.f421250c = o12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum Q extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = k.f421286V;
            if (cD2 == 0) {
                jVar.m(this);
                Token.d dVar = jVar.f421261n;
                dVar.i("--");
                dVar.h((char) 65533);
                jVar.f421250c = o12;
                return;
            }
            if (cD2 == '!') {
                jVar.m(this);
                jVar.f421250c = k.f421289Y;
                return;
            }
            if (cD2 == '-') {
                jVar.m(this);
                jVar.f421261n.h('-');
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.i();
                jVar.f421250c = c12215k;
            } else if (cD2 == 65535) {
                jVar.l(this);
                jVar.i();
                jVar.f421250c = c12215k;
            } else {
                jVar.m(this);
                Token.d dVar2 = jVar.f421261n;
                dVar2.i("--");
                dVar2.h(cD2);
                jVar.f421250c = o12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum R extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            int[] iArrC = jVar.c(null, false);
            if (iArrC == null) {
                jVar.f('&');
            } else {
                jVar.g(new String(iArrC, 0, iArrC.length));
            }
            jVar.f421250c = k.f421296d;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum S extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = k.f421286V;
            if (cD2 == 0) {
                jVar.m(this);
                Token.d dVar = jVar.f421261n;
                dVar.i("--!");
                dVar.h((char) 65533);
                jVar.f421250c = o12;
                return;
            }
            if (cD2 == '-') {
                jVar.f421261n.i("--!");
                jVar.f421250c = k.f421287W;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.i();
                jVar.f421250c = c12215k;
            } else if (cD2 == 65535) {
                jVar.l(this);
                jVar.i();
                jVar.f421250c = c12215k;
            } else {
                Token.d dVar2 = jVar.f421261n;
                dVar2.i("--!");
                dVar2.h(cD2);
                jVar.f421250c = o12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum T extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            U u12 = k.f421291a0;
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                jVar.f421250c = u12;
                return;
            }
            if (cD2 != '>') {
                if (cD2 != 65535) {
                    jVar.m(this);
                    jVar.f421250c = u12;
                    return;
                }
                jVar.l(this);
            }
            jVar.m(this);
            jVar.f421260m.f();
            jVar.f421260m.f421117f = true;
            jVar.j();
            jVar.f421250c = k.f421292b;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum U extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            boolean zP2 = aVar.p();
            V v12 = k.f421293b0;
            if (zP2) {
                jVar.f421260m.f();
                jVar.f421250c = v12;
                return;
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421260m.f();
                jVar.f421260m.f421113b.append((char) 65533);
                jVar.f421250c = v12;
                return;
            }
            if (cD2 != ' ') {
                if (cD2 == 65535) {
                    jVar.l(this);
                    jVar.f421260m.f();
                    jVar.f421260m.f421117f = true;
                    jVar.j();
                    jVar.f421250c = k.f421292b;
                    return;
                }
                if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r') {
                    return;
                }
                jVar.f421260m.f();
                jVar.f421260m.f421113b.append(cD2);
                jVar.f421250c = v12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum V extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            if (aVar.p()) {
                jVar.f421260m.f421113b.append(aVar.f());
                return;
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421260m.f421113b.append((char) 65533);
                return;
            }
            if (cD2 != ' ') {
                C12215k c12215k = k.f421292b;
                if (cD2 == '>') {
                    jVar.j();
                    jVar.f421250c = c12215k;
                    return;
                }
                if (cD2 == 65535) {
                    jVar.l(this);
                    jVar.f421260m.f421117f = true;
                    jVar.j();
                    jVar.f421250c = c12215k;
                    return;
                }
                if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r') {
                    jVar.f421260m.f421113b.append(cD2);
                    return;
                }
            }
            jVar.f421250c = k.f421295c0;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum W extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            boolean zK2 = aVar.k();
            C12215k c12215k = k.f421292b;
            if (zK2) {
                jVar.l(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (aVar.o('\t', '\n', '\r', '\f', ' ')) {
                aVar.a();
                return;
            }
            if (aVar.n('>')) {
                jVar.j();
                jVar.a(c12215k);
                return;
            }
            if (aVar.m("PUBLIC")) {
                jVar.f421260m.f421114c = "PUBLIC";
                jVar.f421250c = k.f421297d0;
            } else if (aVar.m("SYSTEM")) {
                jVar.f421260m.f421114c = "SYSTEM";
                jVar.f421250c = k.f421309j0;
            } else {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.a(k.f421319o0);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum X extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                jVar.f421250c = k.f421299e0;
                return;
            }
            if (cD2 == '\"') {
                jVar.m(this);
                jVar.f421250c = k.f421301f0;
                return;
            }
            if (cD2 == '\'') {
                jVar.m(this);
                jVar.f421250c = k.f421303g0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (cD2 != 65535) {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.f421250c = k.f421319o0;
            } else {
                jVar.l(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum Y extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                return;
            }
            if (cD2 == '\"') {
                jVar.f421250c = k.f421301f0;
                return;
            }
            if (cD2 == '\'') {
                jVar.f421250c = k.f421303g0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (cD2 != 65535) {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.f421250c = k.f421319o0;
            } else {
                jVar.l(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum Z extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421260m.f421115d.append((char) 65533);
                return;
            }
            if (cD2 == '\"') {
                jVar.f421250c = k.f421305h0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (cD2 != 65535) {
                jVar.f421260m.f421115d.append(cD2);
                return;
            }
            jVar.l(this);
            jVar.f421260m.f421117f = true;
            jVar.j();
            jVar.f421250c = c12215k;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$a, reason: case insensitive filesystem */
    public enum C44880a extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char c12;
            aVar.b();
            int i12 = aVar.f421131e;
            int i13 = aVar.f421129c;
            char[] cArr = aVar.f421127a;
            int i14 = i12;
            while (i14 < i13 && (c12 = cArr[i14]) != 0 && c12 != ' ' && c12 != '/' && c12 != '<' && c12 != '>' && c12 != '\t' && c12 != '\n' && c12 != '\f' && c12 != '\r') {
                i14++;
            }
            aVar.f421131e = i14;
            jVar.f421256i.l(i14 > i12 ? a.c(aVar.f421127a, aVar.f421134h, i12, i14 - i12) : "");
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.f421256i.l(k.f421331u0);
                return;
            }
            if (cD2 != ' ') {
                if (cD2 == '/') {
                    jVar.f421250c = k.f421281Q;
                    return;
                }
                C12215k c12215k = k.f421292b;
                if (cD2 == '<') {
                    aVar.t();
                    jVar.m(this);
                } else if (cD2 != '>') {
                    if (cD2 == 65535) {
                        jVar.l(this);
                        jVar.f421250c = c12215k;
                        return;
                    } else if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r') {
                        Token.i iVar = jVar.f421256i;
                        iVar.getClass();
                        iVar.l(String.valueOf(cD2));
                        return;
                    }
                }
                jVar.k();
                jVar.f421250c = c12215k;
                return;
            }
            jVar.f421250c = k.f421273I;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum a0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421260m.f421115d.append((char) 65533);
                return;
            }
            if (cD2 == '\'') {
                jVar.f421250c = k.f421305h0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (cD2 != 65535) {
                jVar.f421260m.f421115d.append(cD2);
                return;
            }
            jVar.l(this);
            jVar.f421260m.f421117f = true;
            jVar.j();
            jVar.f421250c = c12215k;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$b, reason: case insensitive filesystem */
    public enum C44881b extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (aVar.n('/')) {
                jVar.e();
                jVar.a(k.f421314m);
                return;
            }
            if (aVar.p() && jVar.f421262o != null) {
                String str = "</" + jVar.f421262o;
                Locale locale = Locale.ENGLISH;
                String lowerCase = str.toLowerCase(locale);
                String upperCase = str.toUpperCase(locale);
                if (aVar.q(lowerCase) <= -1 && aVar.q(upperCase) <= -1) {
                    Token.i iVarD = jVar.d(false);
                    iVarD.n(jVar.f421262o);
                    jVar.f421256i = iVarD;
                    jVar.k();
                    aVar.t();
                    jVar.f421250c = k.f421292b;
                    return;
                }
            }
            jVar.g("<");
            jVar.f421250c = k.f421296d;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum b0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                jVar.f421250c = k.f421307i0;
                return;
            }
            if (cD2 == '\"') {
                jVar.m(this);
                jVar.f421250c = k.f421313l0;
                return;
            }
            if (cD2 == '\'') {
                jVar.m(this);
                jVar.f421250c = k.f421315m0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.j();
                jVar.f421250c = c12215k;
            } else if (cD2 != 65535) {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.f421250c = k.f421319o0;
            } else {
                jVar.l(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$c, reason: case insensitive filesystem */
    public enum C44882c extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            if (!aVar.p()) {
                jVar.g("</");
                jVar.f421250c = k.f421296d;
                return;
            }
            jVar.d(false);
            Token.i iVar = jVar.f421256i;
            char cJ2 = aVar.j();
            iVar.getClass();
            iVar.l(String.valueOf(cJ2));
            jVar.f421255h.append(aVar.j());
            jVar.a(k.f421316n);
        }
    }

    /* compiled from: TokeniserState.java */
    public enum c0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            k.a(jVar, aVar, this, k.f421318o);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$d, reason: case insensitive filesystem */
    public enum C44883d extends k {
        public static void e(j jVar, a aVar) {
            jVar.g("</" + jVar.f421255h.toString());
            aVar.t();
            jVar.f421250c = k.f421296d;
        }

        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            if (aVar.p()) {
                String strF = aVar.f();
                jVar.f421256i.l(strF);
                jVar.f421255h.append(strF);
                return;
            }
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                if (jVar.n()) {
                    jVar.f421250c = k.f421273I;
                    return;
                } else {
                    e(jVar, aVar);
                    return;
                }
            }
            if (cD2 == '/') {
                if (jVar.n()) {
                    jVar.f421250c = k.f421281Q;
                    return;
                } else {
                    e(jVar, aVar);
                    return;
                }
            }
            if (cD2 != '>') {
                e(jVar, aVar);
            } else if (!jVar.n()) {
                e(jVar, aVar);
            } else {
                jVar.k();
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum d0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                return;
            }
            if (cD2 == '\"') {
                jVar.m(this);
                jVar.f421250c = k.f421313l0;
                return;
            }
            if (cD2 == '\'') {
                jVar.m(this);
                jVar.f421250c = k.f421315m0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.j();
                jVar.f421250c = c12215k;
            } else if (cD2 != 65535) {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.f421250c = k.f421319o0;
            } else {
                jVar.l(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$e, reason: case insensitive filesystem */
    public enum C44884e extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (aVar.n('/')) {
                jVar.e();
                jVar.a(k.f421320p);
            } else {
                jVar.f('<');
                jVar.f421250c = k.f421300f;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum e0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                jVar.f421250c = k.f421311k0;
                return;
            }
            if (cD2 == '\"') {
                jVar.m(this);
                jVar.f421250c = k.f421313l0;
                return;
            }
            if (cD2 == '\'') {
                jVar.m(this);
                jVar.f421250c = k.f421315m0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (cD2 != 65535) {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
            } else {
                jVar.l(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$f, reason: case insensitive filesystem */
    public enum C44885f extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (aVar.p()) {
                jVar.d(false);
                jVar.f421250c = k.f421322q;
            } else {
                jVar.g("</");
                jVar.f421250c = k.f421300f;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum f0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                return;
            }
            if (cD2 == '\"') {
                jVar.f421250c = k.f421313l0;
                return;
            }
            if (cD2 == '\'') {
                jVar.f421250c = k.f421315m0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (cD2 != 65535) {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.f421250c = k.f421319o0;
            } else {
                jVar.l(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$g, reason: case insensitive filesystem */
    public enum C44886g extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            k.b(jVar, aVar, k.f421300f);
        }
    }

    /* compiled from: TokeniserState.java */
    public enum g0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421260m.f421116e.append((char) 65533);
                return;
            }
            if (cD2 == '\"') {
                jVar.f421250c = k.f421317n0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (cD2 != 65535) {
                jVar.f421260m.f421116e.append(cD2);
                return;
            }
            jVar.l(this);
            jVar.f421260m.f421117f = true;
            jVar.j();
            jVar.f421250c = c12215k;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$h, reason: case insensitive filesystem */
    public enum C44887h extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '!') {
                jVar.g("<!");
                jVar.f421250c = k.f421330u;
                return;
            }
            if (cD2 == '/') {
                jVar.e();
                jVar.f421250c = k.f421326s;
            } else if (cD2 != 65535) {
                jVar.g("<");
                aVar.t();
                jVar.f421250c = k.f421302g;
            } else {
                jVar.g("<");
                jVar.l(this);
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum h0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f421260m.f421116e.append((char) 65533);
                return;
            }
            if (cD2 == '\'') {
                jVar.f421250c = k.f421317n0;
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.m(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
                return;
            }
            if (cD2 != 65535) {
                jVar.f421260m.f421116e.append(cD2);
                return;
            }
            jVar.l(this);
            jVar.f421260m.f421117f = true;
            jVar.j();
            jVar.f421250c = c12215k;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$i, reason: case insensitive filesystem */
    public enum C44888i extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (aVar.p()) {
                jVar.d(false);
                jVar.f421250c = k.f421328t;
            } else {
                jVar.g("</");
                jVar.f421250c = k.f421302g;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum i0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                return;
            }
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.j();
                jVar.f421250c = c12215k;
            } else if (cD2 != 65535) {
                jVar.m(this);
                jVar.f421250c = k.f421319o0;
            } else {
                jVar.l(this);
                jVar.f421260m.f421117f = true;
                jVar.j();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$j, reason: case insensitive filesystem */
    public enum C44889j extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            k.b(jVar, aVar, k.f421302g);
        }
    }

    /* compiled from: TokeniserState.java */
    public enum j0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            C12215k c12215k = k.f421292b;
            if (cD2 == '>') {
                jVar.j();
                jVar.f421250c = c12215k;
            } else {
                if (cD2 != 65535) {
                    return;
                }
                jVar.j();
                jVar.f421250c = c12215k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$k, reason: collision with other inner class name */
    public enum C12215k extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cJ2 = aVar.j();
            if (cJ2 == 0) {
                jVar.m(this);
                jVar.f(aVar.d());
            } else {
                if (cJ2 == '&') {
                    jVar.a(k.f421294c);
                    return;
                }
                if (cJ2 == '<') {
                    jVar.a(k.f421306i);
                } else if (cJ2 != 65535) {
                    jVar.g(aVar.e());
                } else {
                    jVar.h(new Token.f());
                }
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum k0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            String strC;
            int iQ2 = aVar.q("]]>");
            if (iQ2 != -1) {
                strC = a.c(aVar.f421127a, aVar.f421134h, aVar.f421131e, iQ2);
                aVar.f421131e += iQ2;
            } else {
                int i12 = aVar.f421129c;
                int i13 = aVar.f421131e;
                if (i12 - i13 < 3) {
                    aVar.b();
                    char[] cArr = aVar.f421127a;
                    String[] strArr = aVar.f421134h;
                    int i14 = aVar.f421131e;
                    strC = a.c(cArr, strArr, i14, aVar.f421129c - i14);
                    aVar.f421131e = aVar.f421129c;
                } else {
                    int i15 = i12 - 2;
                    strC = a.c(aVar.f421127a, aVar.f421134h, i13, i15 - i13);
                    aVar.f421131e = i15;
                }
            }
            jVar.f421255h.append(strC);
            if (aVar.l("]]>") || aVar.k()) {
                String string = jVar.f421255h.toString();
                Token.b bVar = new Token.b();
                bVar.f421109b = string;
                jVar.h(bVar);
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$l, reason: case insensitive filesystem */
    public enum C44890l extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (!aVar.n('-')) {
                jVar.f421250c = k.f421302g;
            } else {
                jVar.f('-');
                jVar.a(k.f421332v);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum l0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            k.a(jVar, aVar, this, k.f421324r);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$m, reason: case insensitive filesystem */
    public enum C44891m extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (!aVar.n('-')) {
                jVar.f421250c = k.f421302g;
            } else {
                jVar.f('-');
                jVar.a(k.f421336y);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum m0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cJ2 = aVar.j();
            if (cJ2 == 0) {
                jVar.m(this);
                aVar.a();
                jVar.f((char) 65533);
            } else if (cJ2 != 65535) {
                jVar.g(aVar.g((char) 0));
            } else {
                jVar.h(new Token.f());
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$n, reason: case insensitive filesystem */
    public enum C44892n extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            if (aVar.k()) {
                jVar.l(this);
                jVar.f421250c = k.f421292b;
                return;
            }
            char cJ2 = aVar.j();
            if (cJ2 == 0) {
                jVar.m(this);
                aVar.a();
                jVar.f((char) 65533);
            } else if (cJ2 == '-') {
                jVar.f('-');
                jVar.a(k.f421335x);
            } else if (cJ2 != '<') {
                jVar.g(aVar.h('-', '<', 0));
            } else {
                jVar.a(k.f421337z);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum n0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cJ2 = aVar.j();
            if (cJ2 == '!') {
                jVar.a(k.f421283S);
                return;
            }
            if (cJ2 == '/') {
                jVar.a(k.f421308j);
                return;
            }
            if (cJ2 == '?') {
                Token.d dVar = jVar.f421261n;
                dVar.f();
                dVar.f421112d = true;
                jVar.a(k.f421282R);
                return;
            }
            if (aVar.p()) {
                jVar.d(true);
                jVar.f421250c = k.f421310k;
            } else {
                jVar.m(this);
                jVar.f('<');
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$o, reason: case insensitive filesystem */
    public enum C44893o extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            if (aVar.k()) {
                jVar.l(this);
                jVar.f421250c = k.f421292b;
                return;
            }
            char cD2 = aVar.d();
            C44892n c44892n = k.f421334w;
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f((char) 65533);
                jVar.f421250c = c44892n;
            } else if (cD2 == '-') {
                jVar.f(cD2);
                jVar.f421250c = k.f421336y;
            } else if (cD2 == '<') {
                jVar.f421250c = k.f421337z;
            } else {
                jVar.f(cD2);
                jVar.f421250c = c44892n;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum o0 extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            boolean zK2 = aVar.k();
            C12215k c12215k = k.f421292b;
            if (zK2) {
                jVar.l(this);
                jVar.g("</");
                jVar.f421250c = c12215k;
            } else if (aVar.p()) {
                jVar.d(false);
                jVar.f421250c = k.f421310k;
            } else {
                if (aVar.n('>')) {
                    jVar.m(this);
                    jVar.a(c12215k);
                    return;
                }
                jVar.m(this);
                Token.d dVar = jVar.f421261n;
                dVar.f();
                dVar.f421112d = true;
                jVar.a(k.f421282R);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$p, reason: case insensitive filesystem */
    public enum C44894p extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            if (aVar.k()) {
                jVar.l(this);
                jVar.f421250c = k.f421292b;
                return;
            }
            char cD2 = aVar.d();
            C44892n c44892n = k.f421334w;
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f((char) 65533);
                jVar.f421250c = c44892n;
            } else {
                if (cD2 == '-') {
                    jVar.f(cD2);
                    return;
                }
                if (cD2 == '<') {
                    jVar.f421250c = k.f421337z;
                } else if (cD2 != '>') {
                    jVar.f(cD2);
                    jVar.f421250c = c44892n;
                } else {
                    jVar.f(cD2);
                    jVar.f421250c = k.f421302g;
                }
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$q, reason: case insensitive filesystem */
    public enum C44895q extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (aVar.p()) {
                jVar.e();
                jVar.f421255h.append(aVar.j());
                jVar.g("<" + aVar.j());
                jVar.a(k.f421267C);
                return;
            }
            if (aVar.n('/')) {
                jVar.e();
                jVar.a(k.f421265A);
            } else {
                jVar.f('<');
                jVar.f421250c = k.f421334w;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$r, reason: case insensitive filesystem */
    public enum C44896r extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            if (!aVar.p()) {
                jVar.g("</");
                jVar.f421250c = k.f421334w;
                return;
            }
            jVar.d(false);
            Token.i iVar = jVar.f421256i;
            char cJ2 = aVar.j();
            iVar.getClass();
            iVar.l(String.valueOf(cJ2));
            jVar.f421255h.append(aVar.j());
            jVar.a(k.f421266B);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$s, reason: case insensitive filesystem */
    public enum C44897s extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            k.b(jVar, aVar, k.f421334w);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$t, reason: case insensitive filesystem */
    public enum C44898t extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            k.c(jVar, aVar, k.f421268D, k.f421334w);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$u, reason: case insensitive filesystem */
    public enum C44899u extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cJ2 = aVar.j();
            if (cJ2 == 0) {
                jVar.m(this);
                aVar.a();
                jVar.f((char) 65533);
            } else if (cJ2 == '-') {
                jVar.f(cJ2);
                jVar.a(k.f421269E);
            } else if (cJ2 == '<') {
                jVar.f(cJ2);
                jVar.a(k.f421271G);
            } else if (cJ2 != 65535) {
                jVar.g(aVar.h('-', '<', 0));
            } else {
                jVar.l(this);
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$v, reason: case insensitive filesystem */
    public enum C44900v extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            int[] iArrC = jVar.c(null, false);
            if (iArrC == null) {
                jVar.f('&');
            } else {
                jVar.g(new String(iArrC, 0, iArrC.length));
            }
            jVar.f421250c = k.f421292b;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$w, reason: case insensitive filesystem */
    public enum C44901w extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            C44899u c44899u = k.f421268D;
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f((char) 65533);
                jVar.f421250c = c44899u;
            } else if (cD2 == '-') {
                jVar.f(cD2);
                jVar.f421250c = k.f421270F;
            } else if (cD2 == '<') {
                jVar.f(cD2);
                jVar.f421250c = k.f421271G;
            } else if (cD2 != 65535) {
                jVar.f(cD2);
                jVar.f421250c = c44899u;
            } else {
                jVar.l(this);
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$x, reason: case insensitive filesystem */
    public enum C44902x extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            C44899u c44899u = k.f421268D;
            if (cD2 == 0) {
                jVar.m(this);
                jVar.f((char) 65533);
                jVar.f421250c = c44899u;
                return;
            }
            if (cD2 == '-') {
                jVar.f(cD2);
                return;
            }
            if (cD2 == '<') {
                jVar.f(cD2);
                jVar.f421250c = k.f421271G;
            } else if (cD2 == '>') {
                jVar.f(cD2);
                jVar.f421250c = k.f421302g;
            } else if (cD2 != 65535) {
                jVar.f(cD2);
                jVar.f421250c = c44899u;
            } else {
                jVar.l(this);
                jVar.f421250c = k.f421292b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$y, reason: case insensitive filesystem */
    public enum C44903y extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) {
            if (!aVar.n('/')) {
                jVar.f421250c = k.f421268D;
                return;
            }
            jVar.f('/');
            jVar.e();
            jVar.a(k.f421272H);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.k$z, reason: case insensitive filesystem */
    public enum C44904z extends k {
        @Override // org.jsoup.parser.k
        public final void d(j jVar, a aVar) throws IOException {
            k.c(jVar, aVar, k.f421334w, k.f421268D);
        }
    }

    static {
        C12215k c12215k = new C12215k("Data", 0, null);
        f421292b = c12215k;
        C44900v c44900v = new C44900v("CharacterReferenceInData", 1, null);
        f421294c = c44900v;
        G g12 = new G("Rcdata", 2, null);
        f421296d = g12;
        R r12 = new R("CharacterReferenceInRcdata", 3, null);
        f421298e = r12;
        c0 c0Var = new c0("Rawtext", 4, null);
        f421300f = c0Var;
        l0 l0Var = new l0("ScriptData", 5, null);
        f421302g = l0Var;
        m0 m0Var = new m0("PLAINTEXT", 6, null);
        f421304h = m0Var;
        n0 n0Var = new n0("TagOpen", 7, null);
        f421306i = n0Var;
        o0 o0Var = new o0("EndTagOpen", 8, null);
        f421308j = o0Var;
        C44880a c44880a = new C44880a("TagName", 9, null);
        f421310k = c44880a;
        C44881b c44881b = new C44881b("RcdataLessthanSign", 10, null);
        f421312l = c44881b;
        C44882c c44882c = new C44882c("RCDATAEndTagOpen", 11, null);
        f421314m = c44882c;
        C44883d c44883d = new C44883d("RCDATAEndTagName", 12, null);
        f421316n = c44883d;
        C44884e c44884e = new C44884e("RawtextLessthanSign", 13, null);
        f421318o = c44884e;
        C44885f c44885f = new C44885f("RawtextEndTagOpen", 14, null);
        f421320p = c44885f;
        C44886g c44886g = new C44886g("RawtextEndTagName", 15, null);
        f421322q = c44886g;
        C44887h c44887h = new C44887h("ScriptDataLessthanSign", 16, null);
        f421324r = c44887h;
        C44888i c44888i = new C44888i("ScriptDataEndTagOpen", 17, null);
        f421326s = c44888i;
        C44889j c44889j = new C44889j("ScriptDataEndTagName", 18, null);
        f421328t = c44889j;
        C44890l c44890l = new C44890l("ScriptDataEscapeStart", 19, null);
        f421330u = c44890l;
        C44891m c44891m = new C44891m("ScriptDataEscapeStartDash", 20, null);
        f421332v = c44891m;
        C44892n c44892n = new C44892n("ScriptDataEscaped", 21, null);
        f421334w = c44892n;
        C44893o c44893o = new C44893o("ScriptDataEscapedDash", 22, null);
        f421335x = c44893o;
        C44894p c44894p = new C44894p("ScriptDataEscapedDashDash", 23, null);
        f421336y = c44894p;
        C44895q c44895q = new C44895q("ScriptDataEscapedLessthanSign", 24, null);
        f421337z = c44895q;
        C44896r c44896r = new C44896r("ScriptDataEscapedEndTagOpen", 25, null);
        f421265A = c44896r;
        C44897s c44897s = new C44897s("ScriptDataEscapedEndTagName", 26, null);
        f421266B = c44897s;
        C44898t c44898t = new C44898t("ScriptDataDoubleEscapeStart", 27, null);
        f421267C = c44898t;
        C44899u c44899u = new C44899u("ScriptDataDoubleEscaped", 28, null);
        f421268D = c44899u;
        C44901w c44901w = new C44901w("ScriptDataDoubleEscapedDash", 29, null);
        f421269E = c44901w;
        C44902x c44902x = new C44902x("ScriptDataDoubleEscapedDashDash", 30, null);
        f421270F = c44902x;
        C44903y c44903y = new C44903y("ScriptDataDoubleEscapedLessthanSign", 31, null);
        f421271G = c44903y;
        C44904z c44904z = new C44904z("ScriptDataDoubleEscapeEnd", 32, null);
        f421272H = c44904z;
        A a12 = new A("BeforeAttributeName", 33, null);
        f421273I = a12;
        B b12 = new B("AttributeName", 34, null);
        f421274J = b12;
        C c12 = new C("AfterAttributeName", 35, null);
        f421275K = c12;
        D d12 = new D("BeforeAttributeValue", 36, null);
        f421276L = d12;
        E e12 = new E("AttributeValue_doubleQuoted", 37, null);
        f421277M = e12;
        F f12 = new F("AttributeValue_singleQuoted", 38, null);
        f421278N = f12;
        H h12 = new H("AttributeValue_unquoted", 39, null);
        f421279O = h12;
        I i12 = new I("AfterAttributeValue_quoted", 40, null);
        f421280P = i12;
        J j12 = new J("SelfClosingStartTag", 41, null);
        f421281Q = j12;
        K k12 = new K("BogusComment", 42, null);
        f421282R = k12;
        L l12 = new L("MarkupDeclarationOpen", 43, null);
        f421283S = l12;
        M m12 = new M("CommentStart", 44, null);
        f421284T = m12;
        N n12 = new N("CommentStartDash", 45, null);
        f421285U = n12;
        O o12 = new O("Comment", 46, null);
        f421286V = o12;
        P p12 = new P("CommentEndDash", 47, null);
        f421287W = p12;
        Q q12 = new Q("CommentEnd", 48, null);
        f421288X = q12;
        S s5 = new S("CommentEndBang", 49, null);
        f421289Y = s5;
        T t12 = new T("Doctype", 50, null);
        f421290Z = t12;
        U u12 = new U("BeforeDoctypeName", 51, null);
        f421291a0 = u12;
        V v12 = new V("DoctypeName", 52, null);
        f421293b0 = v12;
        W w12 = new W("AfterDoctypeName", 53, null);
        f421295c0 = w12;
        X x12 = new X("AfterDoctypePublicKeyword", 54, null);
        f421297d0 = x12;
        Y y12 = new Y("BeforeDoctypePublicIdentifier", 55, null);
        f421299e0 = y12;
        Z z12 = new Z("DoctypePublicIdentifier_doubleQuoted", 56, null);
        f421301f0 = z12;
        a0 a0Var = new a0("DoctypePublicIdentifier_singleQuoted", 57, null);
        f421303g0 = a0Var;
        b0 b0Var = new b0("AfterDoctypePublicIdentifier", 58, null);
        f421305h0 = b0Var;
        d0 d0Var = new d0("BetweenDoctypePublicAndSystemIdentifiers", 59, null);
        f421307i0 = d0Var;
        e0 e0Var = new e0("AfterDoctypeSystemKeyword", 60, null);
        f421309j0 = e0Var;
        f0 f0Var = new f0("BeforeDoctypeSystemIdentifier", 61, null);
        f421311k0 = f0Var;
        g0 g0Var = new g0("DoctypeSystemIdentifier_doubleQuoted", 62, null);
        f421313l0 = g0Var;
        h0 h0Var = new h0("DoctypeSystemIdentifier_singleQuoted", 63, null);
        f421315m0 = h0Var;
        i0 i0Var = new i0("AfterDoctypeSystemIdentifier", 64, null);
        f421317n0 = i0Var;
        j0 j0Var = new j0("BogusDoctype", 65, null);
        f421319o0 = j0Var;
        k0 k0Var = new k0("CdataSection", 66, null);
        f421321p0 = k0Var;
        f421333v0 = new k[]{c12215k, c44900v, g12, r12, c0Var, l0Var, m0Var, n0Var, o0Var, c44880a, c44881b, c44882c, c44883d, c44884e, c44885f, c44886g, c44887h, c44888i, c44889j, c44890l, c44891m, c44892n, c44893o, c44894p, c44895q, c44896r, c44897s, c44898t, c44899u, c44901w, c44902x, c44903y, c44904z, a12, b12, c12, d12, e12, f12, h12, i12, j12, k12, l12, m12, n12, o12, p12, q12, s5, t12, u12, v12, w12, x12, y12, z12, a0Var, b0Var, d0Var, e0Var, f0Var, g0Var, h0Var, i0Var, j0Var, k0Var};
        f421323q0 = new char[]{0, '&', '\''};
        f421325r0 = new char[]{0, '\"', '&'};
        f421327s0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        f421329t0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        f421331u0 = String.valueOf((char) 65533);
    }

    public k() {
        throw null;
    }

    public k(String str, int i12, C12215k c12215k) {
    }

    public static void a(j jVar, a aVar, k kVar, k kVar2) throws IOException {
        char cJ2 = aVar.j();
        if (cJ2 == 0) {
            jVar.m(kVar);
            aVar.a();
            jVar.f((char) 65533);
            return;
        }
        if (cJ2 == '<') {
            jVar.a(kVar2);
            return;
        }
        if (cJ2 == 65535) {
            jVar.h(new Token.f());
            return;
        }
        int i12 = aVar.f421131e;
        int i13 = aVar.f421129c;
        char[] cArr = aVar.f421127a;
        int i14 = i12;
        while (i14 < i13) {
            char c12 = cArr[i14];
            if (c12 == 0 || c12 == '<') {
                break;
            } else {
                i14++;
            }
        }
        aVar.f421131e = i14;
        jVar.g(i14 > i12 ? a.c(aVar.f421127a, aVar.f421134h, i12, i14 - i12) : "");
    }

    public static void b(j jVar, a aVar, k kVar) throws IOException {
        if (aVar.p()) {
            String strF = aVar.f();
            jVar.f421256i.l(strF);
            jVar.f421255h.append(strF);
            return;
        }
        boolean zN2 = jVar.n();
        StringBuilder sb2 = jVar.f421255h;
        if (zN2 && !aVar.k()) {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                jVar.f421250c = f421273I;
                return;
            }
            if (cD2 == '/') {
                jVar.f421250c = f421281Q;
                return;
            } else {
                if (cD2 == '>') {
                    jVar.k();
                    jVar.f421250c = f421292b;
                    return;
                }
                sb2.append(cD2);
            }
        }
        jVar.g("</" + sb2.toString());
        jVar.f421250c = kVar;
    }

    public static void c(j jVar, a aVar, k kVar, k kVar2) throws IOException {
        if (aVar.p()) {
            String strF = aVar.f();
            jVar.f421255h.append(strF);
            jVar.g(strF);
            return;
        }
        char cD2 = aVar.d();
        if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r' && cD2 != ' ' && cD2 != '/' && cD2 != '>') {
            aVar.t();
            jVar.f421250c = kVar2;
        } else {
            if (jVar.f421255h.toString().equals("script")) {
                jVar.f421250c = kVar;
            } else {
                jVar.f421250c = kVar2;
            }
            jVar.f(cD2);
        }
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f421333v0.clone();
    }

    public abstract void d(j jVar, a aVar);
}
