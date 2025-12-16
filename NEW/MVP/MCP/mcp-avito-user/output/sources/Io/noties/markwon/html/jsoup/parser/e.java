package io.noties.markwon.html.jsoup.parser;

import io.noties.markwon.html.jsoup.parser.Token;
import java.io.IOException;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TokeniserState.java */
/* loaded from: classes8.dex */
abstract class e {

    /* renamed from: A, reason: collision with root package name */
    public static final C41760s f401816A;

    /* renamed from: B, reason: collision with root package name */
    public static final C41761t f401817B;

    /* renamed from: C, reason: collision with root package name */
    public static final C41762u f401818C;

    /* renamed from: D, reason: collision with root package name */
    public static final C41764w f401819D;

    /* renamed from: E, reason: collision with root package name */
    public static final C41765x f401820E;

    /* renamed from: F, reason: collision with root package name */
    public static final C41766y f401821F;

    /* renamed from: G, reason: collision with root package name */
    public static final C41767z f401822G;

    /* renamed from: H, reason: collision with root package name */
    public static final A f401823H;

    /* renamed from: I, reason: collision with root package name */
    public static final B f401824I;

    /* renamed from: J, reason: collision with root package name */
    public static final C f401825J;

    /* renamed from: K, reason: collision with root package name */
    public static final D f401826K;

    /* renamed from: L, reason: collision with root package name */
    public static final E f401827L;

    /* renamed from: M, reason: collision with root package name */
    public static final F f401828M;

    /* renamed from: N, reason: collision with root package name */
    public static final H f401829N;

    /* renamed from: O, reason: collision with root package name */
    public static final I f401830O;

    /* renamed from: P, reason: collision with root package name */
    public static final J f401831P;

    /* renamed from: Q, reason: collision with root package name */
    public static final K f401832Q;

    /* renamed from: R, reason: collision with root package name */
    public static final L f401833R;

    /* renamed from: S, reason: collision with root package name */
    public static final M f401834S;

    /* renamed from: T, reason: collision with root package name */
    public static final N f401835T;

    /* renamed from: U, reason: collision with root package name */
    public static final O f401836U;

    /* renamed from: V, reason: collision with root package name */
    public static final P f401837V;

    /* renamed from: W, reason: collision with root package name */
    public static final Q f401838W;

    /* renamed from: X, reason: collision with root package name */
    public static final S f401839X;

    /* renamed from: Y, reason: collision with root package name */
    public static final T f401840Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final U f401841Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final V f401842a0;

    /* renamed from: b, reason: collision with root package name */
    public static final C41752k f401843b;

    /* renamed from: b0, reason: collision with root package name */
    public static final W f401844b0;

    /* renamed from: c, reason: collision with root package name */
    public static final C41763v f401845c;

    /* renamed from: c0, reason: collision with root package name */
    public static final X f401846c0;

    /* renamed from: d, reason: collision with root package name */
    public static final G f401847d;

    /* renamed from: d0, reason: collision with root package name */
    public static final Y f401848d0;

    /* renamed from: e, reason: collision with root package name */
    public static final R f401849e;

    /* renamed from: e0, reason: collision with root package name */
    public static final Z f401850e0;

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f401851f;

    /* renamed from: f0, reason: collision with root package name */
    public static final a0 f401852f0;

    /* renamed from: g, reason: collision with root package name */
    public static final l0 f401853g;

    /* renamed from: g0, reason: collision with root package name */
    public static final b0 f401854g0;

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f401855h;

    /* renamed from: h0, reason: collision with root package name */
    public static final d0 f401856h0;

    /* renamed from: i, reason: collision with root package name */
    public static final o0 f401857i;

    /* renamed from: i0, reason: collision with root package name */
    public static final e0 f401858i0;

    /* renamed from: j, reason: collision with root package name */
    public static final C41743a f401859j;

    /* renamed from: j0, reason: collision with root package name */
    public static final f0 f401860j0;

    /* renamed from: k, reason: collision with root package name */
    public static final C41744b f401861k;

    /* renamed from: k0, reason: collision with root package name */
    public static final g0 f401862k0;

    /* renamed from: l, reason: collision with root package name */
    public static final C41745c f401863l;

    /* renamed from: l0, reason: collision with root package name */
    public static final h0 f401864l0;

    /* renamed from: m, reason: collision with root package name */
    public static final C41746d f401865m;

    /* renamed from: m0, reason: collision with root package name */
    public static final i0 f401866m0;

    /* renamed from: n, reason: collision with root package name */
    public static final C11434e f401867n;

    /* renamed from: n0, reason: collision with root package name */
    public static final j0 f401868n0;

    /* renamed from: o, reason: collision with root package name */
    public static final C41747f f401869o;

    /* renamed from: o0, reason: collision with root package name */
    public static final k0 f401870o0;

    /* renamed from: p, reason: collision with root package name */
    public static final C41748g f401871p;

    /* renamed from: p0, reason: collision with root package name */
    public static final char[] f401872p0;

    /* renamed from: q, reason: collision with root package name */
    public static final C41749h f401873q;

    /* renamed from: q0, reason: collision with root package name */
    public static final char[] f401874q0;

    /* renamed from: r, reason: collision with root package name */
    public static final C41750i f401875r;

    /* renamed from: r0, reason: collision with root package name */
    public static final char[] f401876r0;

    /* renamed from: s, reason: collision with root package name */
    public static final C41751j f401877s;

    /* renamed from: s0, reason: collision with root package name */
    public static final char[] f401878s0;

    /* renamed from: t, reason: collision with root package name */
    public static final C41753l f401879t;

    /* renamed from: t0, reason: collision with root package name */
    public static final String f401880t0;

    /* renamed from: u, reason: collision with root package name */
    public static final C41754m f401881u;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ e[] f401882u0;

    /* renamed from: v, reason: collision with root package name */
    public static final C41755n f401883v;

    /* renamed from: w, reason: collision with root package name */
    public static final C41756o f401884w;

    /* renamed from: x, reason: collision with root package name */
    public static final C41757p f401885x;

    /* renamed from: y, reason: collision with root package name */
    public static final C41758q f401886y;

    /* renamed from: z, reason: collision with root package name */
    public static final C41759r f401887z;

    /* compiled from: TokeniserState.java */
    public enum A extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            B b12 = e.f401824I;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401807i.i();
                aVar.q();
                dVar.f401801c = b12;
                return;
            }
            if (cD2 != ' ') {
                if (cD2 != '\"' && cD2 != '\'') {
                    if (cD2 == '/') {
                        dVar.f401801c = e.f401831P;
                        return;
                    }
                    C41752k c41752k = e.f401843b;
                    if (cD2 == 65535) {
                        dVar.l(this);
                        dVar.f401801c = c41752k;
                        return;
                    }
                    if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r') {
                        return;
                    }
                    switch (cD2) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            dVar.k();
                            dVar.f401801c = c41752k;
                            break;
                        default:
                            dVar.f401807i.i();
                            aVar.q();
                            dVar.f401801c = b12;
                            break;
                    }
                    return;
                }
                dVar.m(this);
                dVar.f401807i.i();
                dVar.f401807i.c(cD2);
                dVar.f401801c = b12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum B extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            String strH = aVar.h(e.f401876r0);
            Token.h hVar = dVar.f401807i;
            String str = hVar.f401780d;
            if (str != null) {
                strH = str.concat(strH);
            }
            hVar.f401780d = strH;
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401807i.c((char) 65533);
                return;
            }
            if (cD2 != ' ') {
                if (cD2 != '\"' && cD2 != '\'') {
                    if (cD2 == '/') {
                        dVar.f401801c = e.f401831P;
                        return;
                    }
                    C41752k c41752k = e.f401843b;
                    if (cD2 == 65535) {
                        dVar.l(this);
                        dVar.f401801c = c41752k;
                        return;
                    }
                    if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r') {
                        switch (cD2) {
                            case '<':
                                break;
                            case '=':
                                dVar.f401801c = e.f401826K;
                                break;
                            case '>':
                                dVar.k();
                                dVar.f401801c = c41752k;
                                break;
                            default:
                                dVar.f401807i.c(cD2);
                                break;
                        }
                        return;
                    }
                }
                dVar.m(this);
                dVar.f401807i.c(cD2);
                return;
            }
            dVar.f401801c = e.f401825J;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum C extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            B b12 = e.f401824I;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401807i.c((char) 65533);
                dVar.f401801c = b12;
                return;
            }
            if (cD2 != ' ') {
                if (cD2 != '\"' && cD2 != '\'') {
                    if (cD2 == '/') {
                        dVar.f401801c = e.f401831P;
                        return;
                    }
                    C41752k c41752k = e.f401843b;
                    if (cD2 == 65535) {
                        dVar.l(this);
                        dVar.f401801c = c41752k;
                        return;
                    }
                    if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r') {
                        return;
                    }
                    switch (cD2) {
                        case '<':
                            break;
                        case '=':
                            dVar.f401801c = e.f401826K;
                            break;
                        case '>':
                            dVar.k();
                            dVar.f401801c = c41752k;
                            break;
                        default:
                            dVar.f401807i.i();
                            aVar.q();
                            dVar.f401801c = b12;
                            break;
                    }
                    return;
                }
                dVar.m(this);
                dVar.f401807i.i();
                dVar.f401807i.c(cD2);
                dVar.f401801c = b12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum D extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            H h12 = e.f401829N;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401807i.d((char) 65533);
                dVar.f401801c = h12;
                return;
            }
            if (cD2 != ' ') {
                if (cD2 == '\"') {
                    dVar.f401801c = e.f401827L;
                    return;
                }
                if (cD2 != '`') {
                    C41752k c41752k = e.f401843b;
                    if (cD2 == 65535) {
                        dVar.l(this);
                        dVar.k();
                        dVar.f401801c = c41752k;
                        return;
                    }
                    if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r') {
                        return;
                    }
                    if (cD2 == '&') {
                        aVar.q();
                        dVar.f401801c = h12;
                        return;
                    }
                    if (cD2 == '\'') {
                        dVar.f401801c = e.f401828M;
                        return;
                    }
                    switch (cD2) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            dVar.m(this);
                            dVar.k();
                            dVar.f401801c = c41752k;
                            break;
                        default:
                            aVar.q();
                            dVar.f401801c = h12;
                            break;
                    }
                    return;
                }
                dVar.m(this);
                dVar.f401807i.d(cD2);
                dVar.f401801c = h12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum E extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            String strG = aVar.g(e.f401874q0);
            if (strG.length() > 0) {
                dVar.f401807i.e(strG);
            } else {
                dVar.f401807i.f401783g = true;
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401807i.d((char) 65533);
                return;
            }
            if (cD2 == '\"') {
                dVar.f401801c = e.f401830O;
                return;
            }
            if (cD2 != '&') {
                if (cD2 != 65535) {
                    dVar.f401807i.d(cD2);
                    return;
                } else {
                    dVar.l(this);
                    dVar.f401801c = e.f401843b;
                    return;
                }
            }
            int[] iArrC = dVar.c('\"', true);
            if (iArrC != null) {
                dVar.f401807i.f(iArrC);
            } else {
                dVar.f401807i.d('&');
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum F extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            String strG = aVar.g(e.f401872p0);
            if (strG.length() > 0) {
                dVar.f401807i.e(strG);
            } else {
                dVar.f401807i.f401783g = true;
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401807i.d((char) 65533);
                return;
            }
            if (cD2 == 65535) {
                dVar.l(this);
                dVar.f401801c = e.f401843b;
                return;
            }
            if (cD2 != '&') {
                if (cD2 != '\'') {
                    dVar.f401807i.d(cD2);
                    return;
                } else {
                    dVar.f401801c = e.f401830O;
                    return;
                }
            }
            int[] iArrC = dVar.c('\'', true);
            if (iArrC != null) {
                dVar.f401807i.f(iArrC);
            } else {
                dVar.f401807i.d('&');
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum G extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cI2 = aVar.i();
            if (cI2 == 0) {
                dVar.m(this);
                aVar.a();
                dVar.f((char) 65533);
            } else {
                if (cI2 == '&') {
                    dVar.a(e.f401849e);
                    return;
                }
                if (cI2 == '<') {
                    dVar.a(e.f401861k);
                } else if (cI2 != 65535) {
                    dVar.h(aVar.g('&', '<', 0));
                } else {
                    dVar.g(new Token.e());
                }
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum H extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            String strH = aVar.h(e.f401878s0);
            if (strH.length() > 0) {
                dVar.f401807i.e(strH);
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401807i.d((char) 65533);
                return;
            }
            if (cD2 != ' ') {
                if (cD2 != '\"' && cD2 != '`') {
                    C41752k c41752k = e.f401843b;
                    if (cD2 == 65535) {
                        dVar.l(this);
                        dVar.f401801c = c41752k;
                        return;
                    }
                    if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r') {
                        if (cD2 == '&') {
                            int[] iArrC = dVar.c('>', true);
                            if (iArrC != null) {
                                dVar.f401807i.f(iArrC);
                                return;
                            } else {
                                dVar.f401807i.d('&');
                                return;
                            }
                        }
                        if (cD2 != '\'') {
                            switch (cD2) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    dVar.k();
                                    dVar.f401801c = c41752k;
                                    break;
                                default:
                                    dVar.f401807i.d(cD2);
                                    break;
                            }
                            return;
                        }
                    }
                }
                dVar.m(this);
                dVar.f401807i.d(cD2);
                return;
            }
            dVar.f401801c = e.f401823H;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum I extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            A a12 = e.f401823H;
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                dVar.f401801c = a12;
                return;
            }
            if (cD2 == '/') {
                dVar.f401801c = e.f401831P;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.k();
                dVar.f401801c = c41752k;
            } else if (cD2 == 65535) {
                dVar.l(this);
                dVar.f401801c = c41752k;
            } else {
                dVar.m(this);
                aVar.q();
                dVar.f401801c = a12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum J extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.f401807i.f401785i = true;
                dVar.k();
                dVar.f401801c = c41752k;
            } else if (cD2 == 65535) {
                dVar.l(this);
                dVar.f401801c = c41752k;
            } else {
                dVar.m(this);
                aVar.q();
                dVar.f401801c = e.f401823H;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum K extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            aVar.q();
            Token.c cVar = new Token.c();
            cVar.f401774b.append(aVar.f('>'));
            dVar.g(cVar);
            dVar.a(e.f401843b);
        }
    }

    /* compiled from: TokeniserState.java */
    public enum L extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (aVar.k("--")) {
                dVar.f401812n.a();
                dVar.f401801c = e.f401834S;
            } else if (aVar.l("DOCTYPE")) {
                dVar.f401801c = e.f401840Y;
            } else if (aVar.k("[CDATA[")) {
                dVar.e();
                dVar.f401801c = e.f401870o0;
            } else {
                dVar.m(this);
                dVar.a(e.f401832Q);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum M extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = e.f401836U;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401812n.f401774b.append((char) 65533);
                dVar.f401801c = o12;
                return;
            }
            if (cD2 == '-') {
                dVar.f401801c = e.f401835T;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.i();
                dVar.f401801c = c41752k;
            } else if (cD2 != 65535) {
                dVar.f401812n.f401774b.append(cD2);
                dVar.f401801c = o12;
            } else {
                dVar.l(this);
                dVar.i();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum N extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = e.f401836U;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401812n.f401774b.append((char) 65533);
                dVar.f401801c = o12;
                return;
            }
            if (cD2 == '-') {
                dVar.f401801c = e.f401835T;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.i();
                dVar.f401801c = c41752k;
            } else if (cD2 != 65535) {
                dVar.f401812n.f401774b.append(cD2);
                dVar.f401801c = o12;
            } else {
                dVar.l(this);
                dVar.i();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum O extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cI2 = aVar.i();
            if (cI2 == 0) {
                dVar.m(this);
                aVar.a();
                dVar.f401812n.f401774b.append((char) 65533);
            } else if (cI2 == '-') {
                dVar.a(e.f401837V);
            } else {
                if (cI2 != 65535) {
                    dVar.f401812n.f401774b.append(aVar.g('-', 0));
                    return;
                }
                dVar.l(this);
                dVar.i();
                dVar.f401801c = e.f401843b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum P extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = e.f401836U;
            if (cD2 == 0) {
                dVar.m(this);
                StringBuilder sb2 = dVar.f401812n.f401774b;
                sb2.append('-');
                sb2.append((char) 65533);
                dVar.f401801c = o12;
                return;
            }
            if (cD2 == '-') {
                dVar.f401801c = e.f401838W;
                return;
            }
            if (cD2 == 65535) {
                dVar.l(this);
                dVar.i();
                dVar.f401801c = e.f401843b;
            } else {
                StringBuilder sb3 = dVar.f401812n.f401774b;
                sb3.append('-');
                sb3.append(cD2);
                dVar.f401801c = o12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum Q extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = e.f401836U;
            if (cD2 == 0) {
                dVar.m(this);
                StringBuilder sb2 = dVar.f401812n.f401774b;
                sb2.append("--");
                sb2.append((char) 65533);
                dVar.f401801c = o12;
                return;
            }
            if (cD2 == '!') {
                dVar.m(this);
                dVar.f401801c = e.f401839X;
                return;
            }
            if (cD2 == '-') {
                dVar.m(this);
                dVar.f401812n.f401774b.append('-');
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.i();
                dVar.f401801c = c41752k;
            } else if (cD2 == 65535) {
                dVar.l(this);
                dVar.i();
                dVar.f401801c = c41752k;
            } else {
                dVar.m(this);
                StringBuilder sb3 = dVar.f401812n.f401774b;
                sb3.append("--");
                sb3.append(cD2);
                dVar.f401801c = o12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum R extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            int[] iArrC = dVar.c(null, false);
            if (iArrC == null) {
                dVar.f('&');
            } else {
                dVar.h(new String(iArrC, 0, iArrC.length));
            }
            dVar.f401801c = e.f401847d;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum S extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            O o12 = e.f401836U;
            if (cD2 == 0) {
                dVar.m(this);
                StringBuilder sb2 = dVar.f401812n.f401774b;
                sb2.append("--!");
                sb2.append((char) 65533);
                dVar.f401801c = o12;
                return;
            }
            if (cD2 == '-') {
                dVar.f401812n.f401774b.append("--!");
                dVar.f401801c = e.f401837V;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.i();
                dVar.f401801c = c41752k;
            } else if (cD2 == 65535) {
                dVar.l(this);
                dVar.i();
                dVar.f401801c = c41752k;
            } else {
                StringBuilder sb3 = dVar.f401812n.f401774b;
                sb3.append("--!");
                sb3.append(cD2);
                dVar.f401801c = o12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum T extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            U u12 = e.f401841Z;
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                dVar.f401801c = u12;
                return;
            }
            if (cD2 != '>') {
                if (cD2 != 65535) {
                    dVar.m(this);
                    dVar.f401801c = u12;
                    return;
                }
                dVar.l(this);
            }
            dVar.m(this);
            dVar.f401811m.a();
            dVar.f401811m.getClass();
            dVar.j();
            dVar.f401801c = e.f401843b;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum U extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            boolean zO2 = aVar.o();
            V v12 = e.f401842a0;
            if (zO2) {
                dVar.f401811m.a();
                dVar.f401801c = v12;
                return;
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401811m.a();
                dVar.f401811m.f401775b.append((char) 65533);
                dVar.f401801c = v12;
                return;
            }
            if (cD2 != ' ') {
                if (cD2 == 65535) {
                    dVar.l(this);
                    dVar.f401811m.a();
                    dVar.f401811m.getClass();
                    dVar.j();
                    dVar.f401801c = e.f401843b;
                    return;
                }
                if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r') {
                    return;
                }
                dVar.f401811m.a();
                dVar.f401811m.f401775b.append(cD2);
                dVar.f401801c = v12;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum V extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            if (aVar.o()) {
                dVar.f401811m.f401775b.append(aVar.e());
                return;
            }
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401811m.f401775b.append((char) 65533);
                return;
            }
            if (cD2 != ' ') {
                C41752k c41752k = e.f401843b;
                if (cD2 == '>') {
                    dVar.j();
                    dVar.f401801c = c41752k;
                    return;
                }
                if (cD2 == 65535) {
                    dVar.l(this);
                    dVar.f401811m.getClass();
                    dVar.j();
                    dVar.f401801c = c41752k;
                    return;
                }
                if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r') {
                    dVar.f401811m.f401775b.append(cD2);
                    return;
                }
            }
            dVar.f401801c = e.f401844b0;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum W extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            boolean zJ2 = aVar.j();
            C41752k c41752k = e.f401843b;
            if (zJ2) {
                dVar.l(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
                aVar.a();
                return;
            }
            if (aVar.m('>')) {
                dVar.j();
                dVar.a(c41752k);
                return;
            }
            if (aVar.l("PUBLIC")) {
                dVar.f401811m.getClass();
                dVar.f401801c = e.f401846c0;
            } else if (aVar.l("SYSTEM")) {
                dVar.f401811m.getClass();
                dVar.f401801c = e.f401858i0;
            } else {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.a(e.f401868n0);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum X extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                dVar.f401801c = e.f401848d0;
                return;
            }
            if (cD2 == '\"') {
                dVar.m(this);
                dVar.f401801c = e.f401850e0;
                return;
            }
            if (cD2 == '\'') {
                dVar.m(this);
                dVar.f401801c = e.f401852f0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (cD2 != 65535) {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.f401801c = e.f401868n0;
            } else {
                dVar.l(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum Y extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                return;
            }
            if (cD2 == '\"') {
                dVar.f401801c = e.f401850e0;
                return;
            }
            if (cD2 == '\'') {
                dVar.f401801c = e.f401852f0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (cD2 != 65535) {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.f401801c = e.f401868n0;
            } else {
                dVar.l(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum Z extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401811m.f401776c.append((char) 65533);
                return;
            }
            if (cD2 == '\"') {
                dVar.f401801c = e.f401854g0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (cD2 != 65535) {
                dVar.f401811m.f401776c.append(cD2);
                return;
            }
            dVar.l(this);
            dVar.f401811m.getClass();
            dVar.j();
            dVar.f401801c = c41752k;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$a, reason: case insensitive filesystem */
    public enum C41743a extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            int i12;
            char[] cArr;
            char c12;
            aVar.b();
            int i13 = aVar.f401791e;
            int i14 = aVar.f401789c;
            while (true) {
                i12 = aVar.f401791e;
                cArr = aVar.f401787a;
                if (i12 >= i14 || (c12 = cArr[i12]) == '\t' || c12 == '\n' || c12 == '\r' || c12 == '\f' || c12 == ' ' || c12 == '/' || c12 == '>' || c12 == 0) {
                    break;
                } else {
                    aVar.f401791e = i12 + 1;
                }
            }
            dVar.f401807i.g(i12 > i13 ? a.c(cArr, aVar.f401794h, i13, i12 - i13) : "");
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.f401807i.g(e.f401880t0);
                return;
            }
            if (cD2 != ' ') {
                if (cD2 == '/') {
                    dVar.f401801c = e.f401831P;
                    return;
                }
                C41752k c41752k = e.f401843b;
                if (cD2 == '>') {
                    dVar.k();
                    dVar.f401801c = c41752k;
                    return;
                }
                if (cD2 == 65535) {
                    dVar.l(this);
                    dVar.f401801c = c41752k;
                    return;
                } else if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r') {
                    Token.h hVar = dVar.f401807i;
                    hVar.getClass();
                    hVar.g(String.valueOf(cD2));
                    return;
                }
            }
            dVar.f401801c = e.f401823H;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum a0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401811m.f401776c.append((char) 65533);
                return;
            }
            if (cD2 == '\'') {
                dVar.f401801c = e.f401854g0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (cD2 != 65535) {
                dVar.f401811m.f401776c.append(cD2);
                return;
            }
            dVar.l(this);
            dVar.f401811m.getClass();
            dVar.j();
            dVar.f401801c = c41752k;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$b, reason: case insensitive filesystem */
    public enum C41744b extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (aVar.m('/')) {
                dVar.e();
                dVar.a(e.f401863l);
                return;
            }
            if (aVar.o() && dVar.f401813o != null) {
                String str = "</" + dVar.f401813o;
                Locale locale = Locale.ENGLISH;
                String lowerCase = str.toLowerCase(locale);
                String upperCase = str.toUpperCase(locale);
                if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                    Token.h hVarD = dVar.d(false);
                    String str2 = dVar.f401813o;
                    hVarD.f401778b = str2;
                    hVarD.f401779c = str2 != null ? str2.toLowerCase(locale) : "";
                    dVar.f401807i = hVarD;
                    dVar.k();
                    aVar.q();
                    dVar.f401801c = e.f401843b;
                    return;
                }
            }
            dVar.h("<");
            dVar.f401801c = e.f401847d;
        }
    }

    /* compiled from: TokeniserState.java */
    public enum b0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                dVar.f401801c = e.f401856h0;
                return;
            }
            if (cD2 == '\"') {
                dVar.m(this);
                dVar.f401801c = e.f401862k0;
                return;
            }
            if (cD2 == '\'') {
                dVar.m(this);
                dVar.f401801c = e.f401864l0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.j();
                dVar.f401801c = c41752k;
            } else if (cD2 != 65535) {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.f401801c = e.f401868n0;
            } else {
                dVar.l(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$c, reason: case insensitive filesystem */
    public enum C41745c extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            if (!aVar.o()) {
                dVar.h("</");
                dVar.f401801c = e.f401847d;
                return;
            }
            dVar.d(false);
            Token.h hVar = dVar.f401807i;
            char cI2 = aVar.i();
            hVar.getClass();
            hVar.g(String.valueOf(cI2));
            dVar.f401806h.append(aVar.i());
            dVar.a(e.f401865m);
        }
    }

    /* compiled from: TokeniserState.java */
    public enum c0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            e.a(dVar, aVar, this, e.f401867n);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$d, reason: case insensitive filesystem */
    public enum C41746d extends e {
        public static void e(d dVar, a aVar) {
            dVar.h("</" + dVar.f401806h.toString());
            aVar.q();
            dVar.f401801c = e.f401847d;
        }

        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            if (aVar.o()) {
                String strE = aVar.e();
                dVar.f401807i.g(strE);
                dVar.f401806h.append(strE);
                return;
            }
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                if (dVar.n()) {
                    dVar.f401801c = e.f401823H;
                    return;
                } else {
                    e(dVar, aVar);
                    return;
                }
            }
            if (cD2 == '/') {
                if (dVar.n()) {
                    dVar.f401801c = e.f401831P;
                    return;
                } else {
                    e(dVar, aVar);
                    return;
                }
            }
            if (cD2 != '>') {
                e(dVar, aVar);
            } else if (!dVar.n()) {
                e(dVar, aVar);
            } else {
                dVar.k();
                dVar.f401801c = e.f401843b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum d0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                return;
            }
            if (cD2 == '\"') {
                dVar.m(this);
                dVar.f401801c = e.f401862k0;
                return;
            }
            if (cD2 == '\'') {
                dVar.m(this);
                dVar.f401801c = e.f401864l0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.j();
                dVar.f401801c = c41752k;
            } else if (cD2 != 65535) {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.f401801c = e.f401868n0;
            } else {
                dVar.l(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$e, reason: collision with other inner class name */
    public enum C11434e extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (aVar.m('/')) {
                dVar.e();
                dVar.a(e.f401869o);
            } else {
                dVar.f('<');
                dVar.f401801c = e.f401851f;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum e0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                dVar.f401801c = e.f401860j0;
                return;
            }
            if (cD2 == '\"') {
                dVar.m(this);
                dVar.f401801c = e.f401862k0;
                return;
            }
            if (cD2 == '\'') {
                dVar.m(this);
                dVar.f401801c = e.f401864l0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (cD2 != 65535) {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
            } else {
                dVar.l(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$f, reason: case insensitive filesystem */
    public enum C41747f extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (aVar.o()) {
                dVar.d(false);
                dVar.f401801c = e.f401871p;
            } else {
                dVar.h("</");
                dVar.f401801c = e.f401851f;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum f0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                return;
            }
            if (cD2 == '\"') {
                dVar.f401801c = e.f401862k0;
                return;
            }
            if (cD2 == '\'') {
                dVar.f401801c = e.f401864l0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (cD2 != 65535) {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.f401801c = e.f401868n0;
            } else {
                dVar.l(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$g, reason: case insensitive filesystem */
    public enum C41748g extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            e.b(dVar, aVar, e.f401851f);
        }
    }

    /* compiled from: TokeniserState.java */
    public enum g0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401811m.f401777d.append((char) 65533);
                return;
            }
            if (cD2 == '\"') {
                dVar.f401801c = e.f401866m0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (cD2 != 65535) {
                dVar.f401811m.f401777d.append(cD2);
                return;
            }
            dVar.l(this);
            dVar.f401811m.getClass();
            dVar.j();
            dVar.f401801c = c41752k;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$h, reason: case insensitive filesystem */
    public enum C41749h extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '!') {
                dVar.h("<!");
                dVar.f401801c = e.f401879t;
            } else if (cD2 == '/') {
                dVar.e();
                dVar.f401801c = e.f401875r;
            } else {
                dVar.h("<");
                aVar.q();
                dVar.f401801c = e.f401853g;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum h0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f401811m.f401777d.append((char) 65533);
                return;
            }
            if (cD2 == '\'') {
                dVar.f401801c = e.f401866m0;
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.m(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
                return;
            }
            if (cD2 != 65535) {
                dVar.f401811m.f401777d.append(cD2);
                return;
            }
            dVar.l(this);
            dVar.f401811m.getClass();
            dVar.j();
            dVar.f401801c = c41752k;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$i, reason: case insensitive filesystem */
    public enum C41750i extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (aVar.o()) {
                dVar.d(false);
                dVar.f401801c = e.f401877s;
            } else {
                dVar.h("</");
                dVar.f401801c = e.f401853g;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum i0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                return;
            }
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.j();
                dVar.f401801c = c41752k;
            } else if (cD2 != 65535) {
                dVar.m(this);
                dVar.f401801c = e.f401868n0;
            } else {
                dVar.l(this);
                dVar.f401811m.getClass();
                dVar.j();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$j, reason: case insensitive filesystem */
    public enum C41751j extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            e.b(dVar, aVar, e.f401853g);
        }
    }

    /* compiled from: TokeniserState.java */
    public enum j0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            C41752k c41752k = e.f401843b;
            if (cD2 == '>') {
                dVar.j();
                dVar.f401801c = c41752k;
            } else {
                if (cD2 != 65535) {
                    return;
                }
                dVar.j();
                dVar.f401801c = c41752k;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$k, reason: case insensitive filesystem */
    public enum C41752k extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            int i12;
            char[] cArr;
            char c12;
            char cI2 = aVar.i();
            if (cI2 == 0) {
                dVar.m(this);
                dVar.f(aVar.d());
                return;
            }
            if (cI2 == '&') {
                dVar.a(e.f401845c);
                return;
            }
            if (cI2 == '<') {
                dVar.a(e.f401855h);
                return;
            }
            if (cI2 == 65535) {
                dVar.g(new Token.e());
                return;
            }
            aVar.b();
            int i13 = aVar.f401791e;
            int i14 = aVar.f401789c;
            while (true) {
                i12 = aVar.f401791e;
                cArr = aVar.f401787a;
                if (i12 >= i14 || (c12 = cArr[i12]) == '&' || c12 == '<' || c12 == 0) {
                    break;
                } else {
                    aVar.f401791e = i12 + 1;
                }
            }
            dVar.h(i12 > i13 ? a.c(cArr, aVar.f401794h, i13, i12 - i13) : "");
        }
    }

    /* compiled from: TokeniserState.java */
    public enum k0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            String strC;
            int iP2 = aVar.p("]]>");
            String[] strArr = aVar.f401794h;
            char[] cArr = aVar.f401787a;
            if (iP2 != -1) {
                strC = a.c(cArr, strArr, aVar.f401791e, iP2);
                aVar.f401791e += iP2;
            } else {
                aVar.b();
                int i12 = aVar.f401791e;
                strC = a.c(cArr, strArr, i12, aVar.f401789c - i12);
                aVar.f401791e = aVar.f401789c;
            }
            dVar.f401806h.append(strC);
            if (aVar.k("]]>") || aVar.j()) {
                String string = dVar.f401806h.toString();
                Token.a aVar2 = new Token.a();
                aVar2.f401773b = string;
                dVar.g(aVar2);
                dVar.f401801c = e.f401843b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$l, reason: case insensitive filesystem */
    public enum C41753l extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (!aVar.m('-')) {
                dVar.f401801c = e.f401853g;
            } else {
                dVar.f('-');
                dVar.a(e.f401881u);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum l0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            e.a(dVar, aVar, this, e.f401873q);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$m, reason: case insensitive filesystem */
    public enum C41754m extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (!aVar.m('-')) {
                dVar.f401801c = e.f401853g;
            } else {
                dVar.f('-');
                dVar.a(e.f401885x);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum m0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cI2 = aVar.i();
            if (cI2 == 0) {
                dVar.m(this);
                aVar.a();
                dVar.f((char) 65533);
            } else if (cI2 != 65535) {
                dVar.h(aVar.f((char) 0));
            } else {
                dVar.g(new Token.e());
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$n, reason: case insensitive filesystem */
    public enum C41755n extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            if (aVar.j()) {
                dVar.l(this);
                dVar.f401801c = e.f401843b;
                return;
            }
            char cI2 = aVar.i();
            if (cI2 == 0) {
                dVar.m(this);
                aVar.a();
                dVar.f((char) 65533);
            } else if (cI2 == '-') {
                dVar.f('-');
                dVar.a(e.f401884w);
            } else if (cI2 != '<') {
                dVar.h(aVar.g('-', '<', 0));
            } else {
                dVar.a(e.f401886y);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum n0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cI2 = aVar.i();
            if (cI2 == '!') {
                dVar.a(e.f401833R);
                return;
            }
            if (cI2 == '/') {
                dVar.a(e.f401857i);
                return;
            }
            if (cI2 == '?') {
                dVar.a(e.f401832Q);
                return;
            }
            if (aVar.o()) {
                dVar.d(true);
                dVar.f401801c = e.f401859j;
            } else {
                dVar.m(this);
                dVar.f('<');
                dVar.f401801c = e.f401843b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$o, reason: case insensitive filesystem */
    public enum C41756o extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            if (aVar.j()) {
                dVar.l(this);
                dVar.f401801c = e.f401843b;
                return;
            }
            char cD2 = aVar.d();
            C41755n c41755n = e.f401883v;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f((char) 65533);
                dVar.f401801c = c41755n;
            } else if (cD2 == '-') {
                dVar.f(cD2);
                dVar.f401801c = e.f401885x;
            } else if (cD2 == '<') {
                dVar.f401801c = e.f401886y;
            } else {
                dVar.f(cD2);
                dVar.f401801c = c41755n;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    public enum o0 extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            boolean zJ2 = aVar.j();
            C41752k c41752k = e.f401843b;
            if (zJ2) {
                dVar.l(this);
                dVar.h("</");
                dVar.f401801c = c41752k;
            } else if (aVar.o()) {
                dVar.d(false);
                dVar.f401801c = e.f401859j;
            } else if (aVar.m('>')) {
                dVar.m(this);
                dVar.a(c41752k);
            } else {
                dVar.m(this);
                dVar.a(e.f401832Q);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$p, reason: case insensitive filesystem */
    public enum C41757p extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            if (aVar.j()) {
                dVar.l(this);
                dVar.f401801c = e.f401843b;
                return;
            }
            char cD2 = aVar.d();
            C41755n c41755n = e.f401883v;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f((char) 65533);
                dVar.f401801c = c41755n;
            } else {
                if (cD2 == '-') {
                    dVar.f(cD2);
                    return;
                }
                if (cD2 == '<') {
                    dVar.f401801c = e.f401886y;
                } else if (cD2 != '>') {
                    dVar.f(cD2);
                    dVar.f401801c = c41755n;
                } else {
                    dVar.f(cD2);
                    dVar.f401801c = e.f401853g;
                }
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$q, reason: case insensitive filesystem */
    public enum C41758q extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (aVar.o()) {
                dVar.e();
                dVar.f401806h.append(aVar.i());
                dVar.h("<" + aVar.i());
                dVar.a(e.f401817B);
                return;
            }
            if (aVar.m('/')) {
                dVar.e();
                dVar.a(e.f401887z);
            } else {
                dVar.f('<');
                dVar.f401801c = e.f401883v;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$r, reason: case insensitive filesystem */
    public enum C41759r extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            if (!aVar.o()) {
                dVar.h("</");
                dVar.f401801c = e.f401883v;
                return;
            }
            dVar.d(false);
            Token.h hVar = dVar.f401807i;
            char cI2 = aVar.i();
            hVar.getClass();
            hVar.g(String.valueOf(cI2));
            dVar.f401806h.append(aVar.i());
            dVar.a(e.f401816A);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$s, reason: case insensitive filesystem */
    public enum C41760s extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            e.b(dVar, aVar, e.f401883v);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$t, reason: case insensitive filesystem */
    public enum C41761t extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            e.c(dVar, aVar, e.f401818C, e.f401883v);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$u, reason: case insensitive filesystem */
    public enum C41762u extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cI2 = aVar.i();
            if (cI2 == 0) {
                dVar.m(this);
                aVar.a();
                dVar.f((char) 65533);
            } else if (cI2 == '-') {
                dVar.f(cI2);
                dVar.a(e.f401819D);
            } else if (cI2 == '<') {
                dVar.f(cI2);
                dVar.a(e.f401821F);
            } else if (cI2 != 65535) {
                dVar.h(aVar.g('-', '<', 0));
            } else {
                dVar.l(this);
                dVar.f401801c = e.f401843b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$v, reason: case insensitive filesystem */
    public enum C41763v extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            int[] iArrC = dVar.c(null, false);
            if (iArrC == null) {
                dVar.f('&');
            } else {
                dVar.h(new String(iArrC, 0, iArrC.length));
            }
            dVar.f401801c = e.f401843b;
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$w, reason: case insensitive filesystem */
    public enum C41764w extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            C41762u c41762u = e.f401818C;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f((char) 65533);
                dVar.f401801c = c41762u;
            } else if (cD2 == '-') {
                dVar.f(cD2);
                dVar.f401801c = e.f401820E;
            } else if (cD2 == '<') {
                dVar.f(cD2);
                dVar.f401801c = e.f401821F;
            } else if (cD2 != 65535) {
                dVar.f(cD2);
                dVar.f401801c = c41762u;
            } else {
                dVar.l(this);
                dVar.f401801c = e.f401843b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$x, reason: case insensitive filesystem */
    public enum C41765x extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            char cD2 = aVar.d();
            C41762u c41762u = e.f401818C;
            if (cD2 == 0) {
                dVar.m(this);
                dVar.f((char) 65533);
                dVar.f401801c = c41762u;
                return;
            }
            if (cD2 == '-') {
                dVar.f(cD2);
                return;
            }
            if (cD2 == '<') {
                dVar.f(cD2);
                dVar.f401801c = e.f401821F;
            } else if (cD2 == '>') {
                dVar.f(cD2);
                dVar.f401801c = e.f401853g;
            } else if (cD2 != 65535) {
                dVar.f(cD2);
                dVar.f401801c = c41762u;
            } else {
                dVar.l(this);
                dVar.f401801c = e.f401843b;
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$y, reason: case insensitive filesystem */
    public enum C41766y extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) {
            if (!aVar.m('/')) {
                dVar.f401801c = e.f401818C;
                return;
            }
            dVar.f('/');
            dVar.e();
            dVar.a(e.f401822G);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: io.noties.markwon.html.jsoup.parser.e$z, reason: case insensitive filesystem */
    public enum C41767z extends e {
        @Override // io.noties.markwon.html.jsoup.parser.e
        public final void d(d dVar, a aVar) throws IOException {
            e.c(dVar, aVar, e.f401883v, e.f401818C);
        }
    }

    static {
        C41752k c41752k = new C41752k("Data", 0, null);
        f401843b = c41752k;
        C41763v c41763v = new C41763v("CharacterReferenceInData", 1, null);
        f401845c = c41763v;
        G g12 = new G("Rcdata", 2, null);
        f401847d = g12;
        R r12 = new R("CharacterReferenceInRcdata", 3, null);
        f401849e = r12;
        c0 c0Var = new c0("Rawtext", 4, null);
        f401851f = c0Var;
        l0 l0Var = new l0("ScriptData", 5, null);
        f401853g = l0Var;
        m0 m0Var = new m0("PLAINTEXT", 6, null);
        n0 n0Var = new n0("TagOpen", 7, null);
        f401855h = n0Var;
        o0 o0Var = new o0("EndTagOpen", 8, null);
        f401857i = o0Var;
        C41743a c41743a = new C41743a("TagName", 9, null);
        f401859j = c41743a;
        C41744b c41744b = new C41744b("RcdataLessthanSign", 10, null);
        f401861k = c41744b;
        C41745c c41745c = new C41745c("RCDATAEndTagOpen", 11, null);
        f401863l = c41745c;
        C41746d c41746d = new C41746d("RCDATAEndTagName", 12, null);
        f401865m = c41746d;
        C11434e c11434e = new C11434e("RawtextLessthanSign", 13, null);
        f401867n = c11434e;
        C41747f c41747f = new C41747f("RawtextEndTagOpen", 14, null);
        f401869o = c41747f;
        C41748g c41748g = new C41748g("RawtextEndTagName", 15, null);
        f401871p = c41748g;
        C41749h c41749h = new C41749h("ScriptDataLessthanSign", 16, null);
        f401873q = c41749h;
        C41750i c41750i = new C41750i("ScriptDataEndTagOpen", 17, null);
        f401875r = c41750i;
        C41751j c41751j = new C41751j("ScriptDataEndTagName", 18, null);
        f401877s = c41751j;
        C41753l c41753l = new C41753l("ScriptDataEscapeStart", 19, null);
        f401879t = c41753l;
        C41754m c41754m = new C41754m("ScriptDataEscapeStartDash", 20, null);
        f401881u = c41754m;
        C41755n c41755n = new C41755n("ScriptDataEscaped", 21, null);
        f401883v = c41755n;
        C41756o c41756o = new C41756o("ScriptDataEscapedDash", 22, null);
        f401884w = c41756o;
        C41757p c41757p = new C41757p("ScriptDataEscapedDashDash", 23, null);
        f401885x = c41757p;
        C41758q c41758q = new C41758q("ScriptDataEscapedLessthanSign", 24, null);
        f401886y = c41758q;
        C41759r c41759r = new C41759r("ScriptDataEscapedEndTagOpen", 25, null);
        f401887z = c41759r;
        C41760s c41760s = new C41760s("ScriptDataEscapedEndTagName", 26, null);
        f401816A = c41760s;
        C41761t c41761t = new C41761t("ScriptDataDoubleEscapeStart", 27, null);
        f401817B = c41761t;
        C41762u c41762u = new C41762u("ScriptDataDoubleEscaped", 28, null);
        f401818C = c41762u;
        C41764w c41764w = new C41764w("ScriptDataDoubleEscapedDash", 29, null);
        f401819D = c41764w;
        C41765x c41765x = new C41765x("ScriptDataDoubleEscapedDashDash", 30, null);
        f401820E = c41765x;
        C41766y c41766y = new C41766y("ScriptDataDoubleEscapedLessthanSign", 31, null);
        f401821F = c41766y;
        C41767z c41767z = new C41767z("ScriptDataDoubleEscapeEnd", 32, null);
        f401822G = c41767z;
        A a12 = new A("BeforeAttributeName", 33, null);
        f401823H = a12;
        B b12 = new B("AttributeName", 34, null);
        f401824I = b12;
        C c12 = new C("AfterAttributeName", 35, null);
        f401825J = c12;
        D d12 = new D("BeforeAttributeValue", 36, null);
        f401826K = d12;
        E e12 = new E("AttributeValue_doubleQuoted", 37, null);
        f401827L = e12;
        F f12 = new F("AttributeValue_singleQuoted", 38, null);
        f401828M = f12;
        H h12 = new H("AttributeValue_unquoted", 39, null);
        f401829N = h12;
        I i12 = new I("AfterAttributeValue_quoted", 40, null);
        f401830O = i12;
        J j12 = new J("SelfClosingStartTag", 41, null);
        f401831P = j12;
        K k12 = new K("BogusComment", 42, null);
        f401832Q = k12;
        L l12 = new L("MarkupDeclarationOpen", 43, null);
        f401833R = l12;
        M m12 = new M("CommentStart", 44, null);
        f401834S = m12;
        N n12 = new N("CommentStartDash", 45, null);
        f401835T = n12;
        O o12 = new O("Comment", 46, null);
        f401836U = o12;
        P p12 = new P("CommentEndDash", 47, null);
        f401837V = p12;
        Q q12 = new Q("CommentEnd", 48, null);
        f401838W = q12;
        S s5 = new S("CommentEndBang", 49, null);
        f401839X = s5;
        T t12 = new T("Doctype", 50, null);
        f401840Y = t12;
        U u12 = new U("BeforeDoctypeName", 51, null);
        f401841Z = u12;
        V v12 = new V("DoctypeName", 52, null);
        f401842a0 = v12;
        W w12 = new W("AfterDoctypeName", 53, null);
        f401844b0 = w12;
        X x12 = new X("AfterDoctypePublicKeyword", 54, null);
        f401846c0 = x12;
        Y y12 = new Y("BeforeDoctypePublicIdentifier", 55, null);
        f401848d0 = y12;
        Z z12 = new Z("DoctypePublicIdentifier_doubleQuoted", 56, null);
        f401850e0 = z12;
        a0 a0Var = new a0("DoctypePublicIdentifier_singleQuoted", 57, null);
        f401852f0 = a0Var;
        b0 b0Var = new b0("AfterDoctypePublicIdentifier", 58, null);
        f401854g0 = b0Var;
        d0 d0Var = new d0("BetweenDoctypePublicAndSystemIdentifiers", 59, null);
        f401856h0 = d0Var;
        e0 e0Var = new e0("AfterDoctypeSystemKeyword", 60, null);
        f401858i0 = e0Var;
        f0 f0Var = new f0("BeforeDoctypeSystemIdentifier", 61, null);
        f401860j0 = f0Var;
        g0 g0Var = new g0("DoctypeSystemIdentifier_doubleQuoted", 62, null);
        f401862k0 = g0Var;
        h0 h0Var = new h0("DoctypeSystemIdentifier_singleQuoted", 63, null);
        f401864l0 = h0Var;
        i0 i0Var = new i0("AfterDoctypeSystemIdentifier", 64, null);
        f401866m0 = i0Var;
        j0 j0Var = new j0("BogusDoctype", 65, null);
        f401868n0 = j0Var;
        k0 k0Var = new k0("CdataSection", 66, null);
        f401870o0 = k0Var;
        f401882u0 = new e[]{c41752k, c41763v, g12, r12, c0Var, l0Var, m0Var, n0Var, o0Var, c41743a, c41744b, c41745c, c41746d, c11434e, c41747f, c41748g, c41749h, c41750i, c41751j, c41753l, c41754m, c41755n, c41756o, c41757p, c41758q, c41759r, c41760s, c41761t, c41762u, c41764w, c41765x, c41766y, c41767z, a12, b12, c12, d12, e12, f12, h12, i12, j12, k12, l12, m12, n12, o12, p12, q12, s5, t12, u12, v12, w12, x12, y12, z12, a0Var, b0Var, d0Var, e0Var, f0Var, g0Var, h0Var, i0Var, j0Var, k0Var};
        f401872p0 = new char[]{0, '&', '\''};
        f401874q0 = new char[]{0, '\"', '&'};
        f401876r0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        f401878s0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        f401880t0 = String.valueOf((char) 65533);
    }

    public e() {
        throw null;
    }

    public e(String str, int i12, C41752k c41752k) {
    }

    public static void a(d dVar, a aVar, e eVar, e eVar2) throws IOException {
        char cI2 = aVar.i();
        if (cI2 == 0) {
            dVar.m(eVar);
            aVar.a();
            dVar.f((char) 65533);
        } else if (cI2 == '<') {
            dVar.a(eVar2);
        } else if (cI2 != 65535) {
            dVar.h(aVar.g('<', 0));
        } else {
            dVar.g(new Token.e());
        }
    }

    public static void b(d dVar, a aVar, e eVar) throws IOException {
        if (aVar.o()) {
            String strE = aVar.e();
            dVar.f401807i.g(strE);
            dVar.f401806h.append(strE);
            return;
        }
        boolean zN2 = dVar.n();
        StringBuilder sb2 = dVar.f401806h;
        if (zN2 && !aVar.j()) {
            char cD2 = aVar.d();
            if (cD2 == '\t' || cD2 == '\n' || cD2 == '\f' || cD2 == '\r' || cD2 == ' ') {
                dVar.f401801c = f401823H;
                return;
            }
            if (cD2 == '/') {
                dVar.f401801c = f401831P;
                return;
            } else {
                if (cD2 == '>') {
                    dVar.k();
                    dVar.f401801c = f401843b;
                    return;
                }
                sb2.append(cD2);
            }
        }
        dVar.h("</" + sb2.toString());
        dVar.f401801c = eVar;
    }

    public static void c(d dVar, a aVar, e eVar, e eVar2) throws IOException {
        if (aVar.o()) {
            String strE = aVar.e();
            dVar.f401806h.append(strE);
            dVar.h(strE);
            return;
        }
        char cD2 = aVar.d();
        if (cD2 != '\t' && cD2 != '\n' && cD2 != '\f' && cD2 != '\r' && cD2 != ' ' && cD2 != '/' && cD2 != '>') {
            aVar.q();
            dVar.f401801c = eVar2;
        } else {
            if (dVar.f401806h.toString().equals("script")) {
                dVar.f401801c = eVar;
            } else {
                dVar.f401801c = eVar2;
            }
            dVar.f(cD2);
        }
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f401882u0.clone();
    }

    public abstract void d(d dVar, a aVar);
}
