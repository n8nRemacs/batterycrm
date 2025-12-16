package org.jsoup.parser;

import a71.C19693c;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Token;
import org.jsoup.select.Selector;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HtmlTreeBuilderState.java */
/* loaded from: classes7.dex */
abstract class c {

    /* renamed from: b, reason: collision with root package name */
    public static final k f421156b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f421157c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f421158d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f421159e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f421160f;

    /* renamed from: g, reason: collision with root package name */
    public static final u f421161g;

    /* renamed from: h, reason: collision with root package name */
    public static final v f421162h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f421163i;

    /* renamed from: j, reason: collision with root package name */
    public static final x f421164j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f421165k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f421166l;

    /* renamed from: m, reason: collision with root package name */
    public static final C12214c f421167m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f421168n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f421169o;

    /* renamed from: p, reason: collision with root package name */
    public static final f f421170p;

    /* renamed from: q, reason: collision with root package name */
    public static final g f421171q;

    /* renamed from: r, reason: collision with root package name */
    public static final h f421172r;

    /* renamed from: s, reason: collision with root package name */
    public static final i f421173s;

    /* renamed from: t, reason: collision with root package name */
    public static final j f421174t;

    /* renamed from: u, reason: collision with root package name */
    public static final l f421175u;

    /* renamed from: v, reason: collision with root package name */
    public static final m f421176v;

    /* renamed from: w, reason: collision with root package name */
    public static final n f421177w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f421178x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ c[] f421179y;

    /* compiled from: HtmlTreeBuilderState.java */
    public enum a extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (token.f421101a == Token.TokenType.f421106f) {
                Token.c cVar = (Token.c) token;
                if (cVar.f421109b.equals(c.f421178x)) {
                    bVar.l(this);
                    return false;
                }
                bVar.f421150r.add(cVar.f421109b);
                return true;
            }
            if (bVar.f421150r.size() > 0) {
                Iterator it = bVar.f421150r.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (C19693c.e(str)) {
                        Token.c cVar2 = new Token.c();
                        cVar2.f421109b = str;
                        bVar.v(cVar2);
                    } else {
                        bVar.l(this);
                        boolean zD2 = C19693c.d(bVar.a().f421086d.f421236c, y.f421183C);
                        c cVar3 = c.f421162h;
                        if (zD2) {
                            bVar.f421153u = true;
                            Token.c cVar4 = new Token.c();
                            cVar4.f421109b = str;
                            bVar.E(cVar4, cVar3);
                            bVar.f421153u = false;
                        } else {
                            Token.c cVar5 = new Token.c();
                            cVar5.f421109b = str;
                            bVar.E(cVar5, cVar3);
                        }
                    }
                }
                bVar.f421150r = new ArrayList();
            }
            bVar.f421143k = bVar.f421144l;
            return bVar.e(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum b extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (token.d()) {
                Token.g gVar = (Token.g) token;
                if (gVar.f421119c.equals("caption")) {
                    if (!bVar.t(gVar.f421119c)) {
                        bVar.l(this);
                        return false;
                    }
                    if (!bVar.a().f421086d.f421236c.equals("caption")) {
                        bVar.l(this);
                    }
                    bVar.D("caption");
                    bVar.j();
                    bVar.f421143k = c.f421164j;
                    return true;
                }
            }
            if ((token.e() && C19693c.d(((Token.h) token).f421119c, y.f421181A)) || (token.d() && ((Token.g) token).f421119c.equals("table"))) {
                bVar.l(this);
                if (bVar.f("caption")) {
                    return bVar.e(token);
                }
                return true;
            }
            if (token.d() && C19693c.d(((Token.g) token).f421119c, y.f421192L)) {
                bVar.l(this);
                return false;
            }
            bVar.f421344g = token;
            return c.f421162h.c(token, bVar);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* renamed from: org.jsoup.parser.c$c, reason: collision with other inner class name */
    public enum C12214c extends c {
        public static boolean d(Token token, org.jsoup.parser.b bVar) {
            if (bVar.f("colgroup")) {
                return bVar.e(token);
            }
            return true;
        }

        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (c.a(token)) {
                bVar.v((Token.c) token);
                return true;
            }
            int iOrdinal = token.f421101a.ordinal();
            if (iOrdinal == 0) {
                bVar.l(this);
            } else if (iOrdinal == 1) {
                Token.h hVar = (Token.h) token;
                String str = hVar.f421119c;
                str.getClass();
                if (!str.equals("col")) {
                    if (!str.equals("html")) {
                        return d(token, bVar);
                    }
                    bVar.f421344g = token;
                    return c.f421162h.c(token, bVar);
                }
                bVar.x(hVar);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        return d(token, bVar);
                    }
                    if (bVar.a().f421086d.f421236c.equals("html")) {
                        return true;
                    }
                    return d(token, bVar);
                }
                bVar.w((Token.d) token);
            } else {
                if (!((Token.g) token).f421119c.equals("colgroup")) {
                    return d(token, bVar);
                }
                if (bVar.a().f421086d.f421236c.equals("html")) {
                    bVar.l(this);
                    return false;
                }
                bVar.C();
                bVar.f421143k = c.f421164j;
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum d extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            int iOrdinal = token.f421101a.ordinal();
            x xVar = c.f421164j;
            if (iOrdinal == 1) {
                Token.h hVar = (Token.h) token;
                String str = hVar.f421119c;
                if (str.equals("template")) {
                    bVar.u(hVar);
                } else {
                    if (!str.equals("tr")) {
                        if (C19693c.d(str, y.f421216x)) {
                            bVar.l(this);
                            bVar.g("tr");
                            return bVar.e(hVar);
                        }
                        if (C19693c.d(str, y.f421184D)) {
                            return d(token, bVar);
                        }
                        bVar.f421344g = token;
                        return xVar.c(token, bVar);
                    }
                    bVar.k("tbody", "tfoot", "thead", "template");
                    bVar.u(hVar);
                    bVar.f421143k = c.f421169o;
                }
            } else {
                if (iOrdinal != 2) {
                    bVar.f421344g = token;
                    return xVar.c(token, bVar);
                }
                String str2 = ((Token.g) token).f421119c;
                if (!C19693c.d(str2, y.f421190J)) {
                    if (str2.equals("table")) {
                        return d(token, bVar);
                    }
                    if (C19693c.d(str2, y.f421185E)) {
                        bVar.l(this);
                        return false;
                    }
                    bVar.f421344g = token;
                    return xVar.c(token, bVar);
                }
                if (!bVar.t(str2)) {
                    bVar.l(this);
                    return false;
                }
                bVar.k("tbody", "tfoot", "thead", "template");
                bVar.C();
                bVar.f421143k = xVar;
            }
            return true;
        }

        public final boolean d(Token token, org.jsoup.parser.b bVar) {
            if (!bVar.t("tbody") && !bVar.t("thead") && !bVar.q("tfoot")) {
                bVar.l(this);
                return false;
            }
            bVar.k("tbody", "tfoot", "thead", "template");
            bVar.f(bVar.a().f421086d.f421236c);
            return bVar.e(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum e extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            boolean zE2 = token.e();
            x xVar = c.f421164j;
            if (zE2) {
                Token.h hVar = (Token.h) token;
                String str = hVar.f421119c;
                if (str.equals("template")) {
                    bVar.u(hVar);
                    return true;
                }
                if (C19693c.d(str, y.f421216x)) {
                    bVar.k("tr", "template");
                    bVar.u(hVar);
                    bVar.f421143k = c.f421170p;
                    bVar.f421149q.add(null);
                    return true;
                }
                if (!C19693c.d(str, y.f421186F)) {
                    bVar.f421344g = token;
                    return xVar.c(token, bVar);
                }
                if (bVar.f("tr")) {
                    return bVar.e(token);
                }
                return false;
            }
            if (!token.d()) {
                bVar.f421344g = token;
                return xVar.c(token, bVar);
            }
            String str2 = ((Token.g) token).f421119c;
            if (str2.equals("tr")) {
                if (!bVar.t(str2)) {
                    bVar.l(this);
                    return false;
                }
                bVar.k("tr", "template");
                bVar.C();
                bVar.f421143k = c.f421168n;
                return true;
            }
            if (str2.equals("table")) {
                if (bVar.f("tr")) {
                    return bVar.e(token);
                }
                return false;
            }
            if (C19693c.d(str2, y.f421213u)) {
                if (bVar.t(str2)) {
                    bVar.f("tr");
                    return bVar.e(token);
                }
                bVar.l(this);
                return false;
            }
            if (C19693c.d(str2, y.f421187G)) {
                bVar.l(this);
                return false;
            }
            bVar.f421344g = token;
            return xVar.c(token, bVar);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum f extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            boolean zD2 = token.d();
            v vVar = c.f421162h;
            if (!zD2) {
                if (!token.e() || !C19693c.d(((Token.h) token).f421119c, y.f421181A)) {
                    bVar.f421344g = token;
                    return vVar.c(token, bVar);
                }
                if (!bVar.t("td") && !bVar.t("th")) {
                    bVar.l(this);
                    return false;
                }
                if (bVar.t("td")) {
                    bVar.f("td");
                } else {
                    bVar.f("th");
                }
                return bVar.e(token);
            }
            String str = ((Token.g) token).f421119c;
            if (C19693c.d(str, y.f421216x)) {
                boolean zT2 = bVar.t(str);
                e eVar = c.f421169o;
                if (!zT2) {
                    bVar.l(this);
                    bVar.f421143k = eVar;
                    return false;
                }
                if (!bVar.a().f421086d.f421236c.equals(str)) {
                    bVar.l(this);
                }
                bVar.D(str);
                bVar.j();
                bVar.f421143k = eVar;
                return true;
            }
            if (C19693c.d(str, y.f421217y)) {
                bVar.l(this);
                return false;
            }
            if (!C19693c.d(str, y.f421218z)) {
                bVar.f421344g = token;
                return vVar.c(token, bVar);
            }
            if (!bVar.t(str)) {
                bVar.l(this);
                return false;
            }
            if (bVar.t("td")) {
                bVar.f("td");
            } else {
                bVar.f("th");
            }
            return bVar.e(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum g extends c {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
        @Override // org.jsoup.parser.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(org.jsoup.parser.Token r9, org.jsoup.parser.b r10) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.c.g.c(org.jsoup.parser.Token, org.jsoup.parser.b):boolean");
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum h extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            boolean zE2 = token.e();
            String[] strArr = y.f421189I;
            if (zE2 && C19693c.d(((Token.h) token).f421119c, strArr)) {
                bVar.l(this);
                bVar.f("select");
                return bVar.e(token);
            }
            if (token.d()) {
                Token.g gVar = (Token.g) token;
                if (C19693c.d(gVar.f421119c, strArr)) {
                    bVar.l(this);
                    if (!bVar.t(gVar.f421119c)) {
                        return false;
                    }
                    bVar.f("select");
                    return bVar.e(token);
                }
            }
            bVar.f421344g = token;
            return c.f421171q.c(token, bVar);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum i extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (c.a(token)) {
                bVar.v((Token.c) token);
                return true;
            }
            if (token.a()) {
                bVar.w((Token.d) token);
                return true;
            }
            if (token.b()) {
                bVar.l(this);
                return false;
            }
            boolean zE2 = token.e();
            v vVar = c.f421162h;
            if (zE2 && ((Token.h) token).f421119c.equals("html")) {
                bVar.f421344g = token;
                return vVar.c(token, bVar);
            }
            if (token.d() && ((Token.g) token).f421119c.equals("html")) {
                if (bVar.f421154v) {
                    bVar.l(this);
                    return false;
                }
                bVar.f421143k = c.f421176v;
                return true;
            }
            if (token.c()) {
                return true;
            }
            bVar.l(this);
            bVar.f421143k = vVar;
            return bVar.e(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum j extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            Token.h hVar;
            if (c.a(token)) {
                bVar.v((Token.c) token);
            } else if (token.a()) {
                bVar.w((Token.d) token);
            } else {
                if (token.b()) {
                    bVar.l(this);
                    return false;
                }
                if (token.e()) {
                    hVar = (Token.h) token;
                    String str = hVar.f421119c;
                    str.getClass();
                    switch (str) {
                        case "frameset":
                            bVar.u(hVar);
                            break;
                        case "html":
                            bVar.f421344g = hVar;
                            return c.f421162h.c(hVar, bVar);
                        case "frame":
                            bVar.x(hVar);
                            break;
                        case "noframes":
                            bVar.f421344g = hVar;
                            return c.f421159e.c(hVar, bVar);
                        default:
                            bVar.l(this);
                            return false;
                    }
                } else if (token.d() && ((Token.g) token).f421119c.equals("frameset")) {
                    if (bVar.a().f421086d.f421236c.equals("html")) {
                        bVar.l(this);
                        return false;
                    }
                    bVar.C();
                    if (!bVar.f421154v && !bVar.a().f421086d.f421236c.equals("frameset")) {
                        bVar.f421143k = c.f421175u;
                    }
                } else {
                    if (!token.c()) {
                        bVar.l(this);
                        return false;
                    }
                    if (!bVar.a().f421086d.f421236c.equals("html")) {
                        bVar.l(this);
                    }
                }
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum k extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (c.a(token)) {
                return true;
            }
            if (token.a()) {
                bVar.w((Token.d) token);
            } else {
                boolean zB2 = token.b();
                q qVar = c.f421157c;
                if (!zB2) {
                    bVar.f421143k = qVar;
                    return bVar.e(token);
                }
                Token.e eVar = (Token.e) token;
                org.jsoup.nodes.f fVar = new org.jsoup.nodes.f(bVar.f421345h.b(eVar.f421113b.toString()), eVar.f421115d.toString(), eVar.f421116e.toString());
                fVar.O(eVar.f421114c);
                bVar.f421341d.K(fVar);
                if (eVar.f421117f) {
                    bVar.f421341d.f421040l = Document.QuirksMode.f421052c;
                }
                bVar.f421143k = qVar;
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum l extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (c.a(token)) {
                bVar.v((Token.c) token);
                return true;
            }
            if (token.a()) {
                bVar.w((Token.d) token);
                return true;
            }
            if (token.b()) {
                bVar.l(this);
                return false;
            }
            if (token.e() && ((Token.h) token).f421119c.equals("html")) {
                bVar.f421344g = token;
                return c.f421162h.c(token, bVar);
            }
            if (token.d() && ((Token.g) token).f421119c.equals("html")) {
                bVar.f421143k = c.f421177w;
                return true;
            }
            if (token.e() && ((Token.h) token).f421119c.equals("noframes")) {
                bVar.f421344g = token;
                return c.f421159e.c(token, bVar);
            }
            if (token.c()) {
                return true;
            }
            bVar.l(this);
            return false;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum m extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (token.a()) {
                bVar.w((Token.d) token);
                return true;
            }
            boolean zB2 = token.b();
            v vVar = c.f421162h;
            if (zB2 || (token.e() && ((Token.h) token).f421119c.equals("html"))) {
                bVar.f421344g = token;
                return vVar.c(token, bVar);
            }
            if (!c.a(token)) {
                if (token.c()) {
                    return true;
                }
                bVar.l(this);
                bVar.f421143k = vVar;
                return bVar.e(token);
            }
            org.jsoup.nodes.g gVarD = bVar.D("html");
            bVar.v((Token.c) token);
            bVar.f421342e.add(gVarD);
            ArrayList<org.jsoup.nodes.g> arrayList = bVar.f421342e;
            gVarD.getClass();
            arrayList.add(Selector.a(gVarD));
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum n extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (token.a()) {
                bVar.w((Token.d) token);
                return true;
            }
            if (token.b() || c.a(token) || (token.e() && ((Token.h) token).f421119c.equals("html"))) {
                bVar.f421344g = token;
                return c.f421162h.c(token, bVar);
            }
            if (token.c()) {
                return true;
            }
            if (token.e() && ((Token.h) token).f421119c.equals("noframes")) {
                bVar.f421344g = token;
                return c.f421159e.c(token, bVar);
            }
            bVar.l(this);
            return false;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum o extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public static /* synthetic */ class p {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421180a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f421180a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421180a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421180a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421180a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421180a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421180a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum q extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (token.b()) {
                bVar.l(this);
                return false;
            }
            if (token.a()) {
                bVar.w((Token.d) token);
                return true;
            }
            if (c.a(token)) {
                bVar.v((Token.c) token);
                return true;
            }
            boolean zE2 = token.e();
            r rVar = c.f421158d;
            if (zE2) {
                Token.h hVar = (Token.h) token;
                if (hVar.f421119c.equals("html")) {
                    bVar.u(hVar);
                    bVar.f421143k = rVar;
                    return true;
                }
            }
            if (token.d() && C19693c.d(((Token.g) token).f421119c, y.f421197e)) {
                org.jsoup.nodes.g gVar = new org.jsoup.nodes.g(org.jsoup.parser.h.a("html", bVar.f421345h), null, null);
                bVar.A(gVar);
                bVar.f421342e.add(gVar);
                bVar.f421143k = rVar;
                return bVar.e(token);
            }
            if (token.d()) {
                bVar.l(this);
                return false;
            }
            org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g(org.jsoup.parser.h.a("html", bVar.f421345h), null, null);
            bVar.A(gVar2);
            bVar.f421342e.add(gVar2);
            bVar.f421143k = rVar;
            return bVar.e(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum r extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (c.a(token)) {
                bVar.v((Token.c) token);
                return true;
            }
            if (token.a()) {
                bVar.w((Token.d) token);
                return true;
            }
            if (token.b()) {
                bVar.l(this);
                return false;
            }
            if (token.e() && ((Token.h) token).f421119c.equals("html")) {
                return c.f421162h.c(token, bVar);
            }
            if (token.e()) {
                Token.h hVar = (Token.h) token;
                if (hVar.f421119c.equals("head")) {
                    bVar.f421146n = bVar.u(hVar);
                    bVar.f421143k = c.f421159e;
                    return true;
                }
            }
            if (token.d() && C19693c.d(((Token.g) token).f421119c, y.f421197e)) {
                bVar.g("head");
                return bVar.e(token);
            }
            if (token.d()) {
                bVar.l(this);
                return false;
            }
            bVar.g("head");
            return bVar.e(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum s extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (c.a(token)) {
                bVar.v((Token.c) token);
                return true;
            }
            int iOrdinal = token.f421101a.ordinal();
            if (iOrdinal == 0) {
                bVar.l(this);
                return false;
            }
            if (iOrdinal == 1) {
                Token.h hVar = (Token.h) token;
                String str = hVar.f421119c;
                if (str.equals("html")) {
                    return c.f421162h.c(token, bVar);
                }
                if (C19693c.d(str, y.f421193a)) {
                    org.jsoup.nodes.g gVarX = bVar.x(hVar);
                    if (str.equals("base") && gVarX.r("href") && !bVar.f421145m) {
                        String strA = gVarX.a("href");
                        if (strA.length() != 0) {
                            bVar.f421343f = strA;
                            bVar.f421145m = true;
                            Document document = bVar.f421341d;
                            document.getClass();
                            document.S(strA);
                        }
                    }
                } else if (str.equals(Constants.REFERRER_API_META)) {
                    bVar.x(hVar);
                } else {
                    boolean zEquals = str.equals("title");
                    w wVar = c.f421163i;
                    if (zEquals) {
                        bVar.f421340c.f421250c = org.jsoup.parser.k.f421296d;
                        bVar.f421144l = bVar.f421143k;
                        bVar.f421143k = wVar;
                        bVar.u(hVar);
                    } else if (C19693c.d(str, y.f421194b)) {
                        c.b(hVar, bVar);
                    } else if (str.equals("noscript")) {
                        bVar.u(hVar);
                        bVar.f421143k = c.f421160f;
                    } else {
                        if (!str.equals("script")) {
                            if (str.equals("head")) {
                                bVar.l(this);
                                return false;
                            }
                            bVar.f("head");
                            return bVar.e(token);
                        }
                        bVar.f421340c.f421250c = org.jsoup.parser.k.f421302g;
                        bVar.f421144l = bVar.f421143k;
                        bVar.f421143k = wVar;
                        bVar.u(hVar);
                    }
                }
            } else if (iOrdinal == 2) {
                String str2 = ((Token.g) token).f421119c;
                if (!str2.equals("head")) {
                    if (C19693c.d(str2, y.f421195c)) {
                        bVar.f("head");
                        return bVar.e(token);
                    }
                    bVar.l(this);
                    return false;
                }
                bVar.C();
                bVar.f421143k = c.f421161g;
            } else {
                if (iOrdinal != 3) {
                    bVar.f("head");
                    return bVar.e(token);
                }
                bVar.w((Token.d) token);
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum t extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (token.b()) {
                bVar.l(this);
            } else {
                if (token.e() && ((Token.h) token).f421119c.equals("html")) {
                    bVar.f421344g = token;
                    return c.f421162h.c(token, bVar);
                }
                boolean zD2 = token.d();
                s sVar = c.f421159e;
                if (!zD2 || !((Token.g) token).f421119c.equals("noscript")) {
                    if (c.a(token) || token.a() || (token.e() && C19693c.d(((Token.h) token).f421119c, y.f421198f))) {
                        bVar.f421344g = token;
                        return sVar.c(token, bVar);
                    }
                    if (token.d() && ((Token.g) token).f421119c.equals("br")) {
                        bVar.l(this);
                        Token.c cVar = new Token.c();
                        cVar.f421109b = token.toString();
                        bVar.v(cVar);
                        return true;
                    }
                    if ((token.e() && C19693c.d(((Token.h) token).f421119c, y.f421191K)) || token.d()) {
                        bVar.l(this);
                        return false;
                    }
                    bVar.l(this);
                    Token.c cVar2 = new Token.c();
                    cVar2.f421109b = token.toString();
                    bVar.v(cVar2);
                    return true;
                }
                bVar.C();
                bVar.f421143k = sVar;
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum u extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (c.a(token)) {
                bVar.v((Token.c) token);
            } else if (token.a()) {
                bVar.w((Token.d) token);
            } else if (token.b()) {
                bVar.l(this);
            } else if (token.e()) {
                Token.h hVar = (Token.h) token;
                String str = hVar.f421119c;
                boolean zEquals = str.equals("html");
                v vVar = c.f421162h;
                if (zEquals) {
                    bVar.f421344g = token;
                    return vVar.c(token, bVar);
                }
                if (str.equals("body")) {
                    bVar.u(hVar);
                    bVar.f421152t = false;
                    bVar.f421143k = vVar;
                } else if (str.equals("frameset")) {
                    bVar.u(hVar);
                    bVar.f421143k = c.f421174t;
                } else if (C19693c.d(str, y.f421199g)) {
                    bVar.l(this);
                    org.jsoup.nodes.g gVar = bVar.f421146n;
                    bVar.f421342e.add(gVar);
                    bVar.E(token, c.f421159e);
                    bVar.I(gVar);
                } else {
                    if (str.equals("head")) {
                        bVar.l(this);
                        return false;
                    }
                    bVar.g("body");
                    bVar.f421152t = true;
                    bVar.e(token);
                }
            } else {
                if (token.d() && !C19693c.d(((Token.g) token).f421119c, y.f421196d)) {
                    bVar.l(this);
                    return false;
                }
                bVar.g("body");
                bVar.f421152t = true;
                bVar.e(token);
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum v extends c {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0289 A[LOOP:3: B:164:0x0287->B:165:0x0289, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:168:0x02a3  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:618:0x01c2 A[SYNTHETIC] */
        @Override // org.jsoup.parser.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(org.jsoup.parser.Token r25, org.jsoup.parser.b r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 3178
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.c.v.c(org.jsoup.parser.Token, org.jsoup.parser.b):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean d(org.jsoup.parser.Token r6, org.jsoup.parser.b r7) {
            /*
                r5 = this;
                r6.getClass()
                org.jsoup.parser.Token$g r6 = (org.jsoup.parser.Token.g) r6
                java.lang.String r6 = r6.f421119c
                java.util.ArrayList<org.jsoup.nodes.g> r0 = r7.f421342e
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            Lf:
                if (r1 < 0) goto L4d
                java.lang.Object r3 = r0.get(r1)
                org.jsoup.nodes.g r3 = (org.jsoup.nodes.g) r3
                org.jsoup.parser.h r4 = r3.f421086d
                java.lang.String r4 = r4.f421236c
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L39
                r7.m(r6)
                org.jsoup.nodes.g r0 = r7.a()
                org.jsoup.parser.h r0 = r0.f421086d
                java.lang.String r0 = r0.f421236c
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L35
                r7.l(r5)
            L35:
                r7.D(r6)
                goto L4d
            L39:
                org.jsoup.parser.h r3 = r3.f421086d
                java.lang.String r3 = r3.f421236c
                java.lang.String[] r4 = org.jsoup.parser.b.f421139D
                boolean r3 = a71.C19693c.d(r3, r4)
                if (r3 == 0) goto L4a
                r7.l(r5)
                r6 = 0
                return r6
            L4a:
                int r1 = r1 + (-1)
                goto Lf
            L4d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.c.v.d(org.jsoup.parser.Token, org.jsoup.parser.b):boolean");
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum w extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (token.f421101a == Token.TokenType.f421106f) {
                bVar.v((Token.c) token);
                return true;
            }
            if (token.c()) {
                bVar.l(this);
                bVar.C();
                bVar.f421143k = bVar.f421144l;
                return bVar.e(token);
            }
            if (!token.d()) {
                return true;
            }
            bVar.C();
            bVar.f421143k = bVar.f421144l;
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public enum x extends c {
        @Override // org.jsoup.parser.c
        public final boolean c(Token token, org.jsoup.parser.b bVar) {
            if (token.f421101a == Token.TokenType.f421106f) {
                bVar.f421150r = new ArrayList();
                bVar.f421144l = bVar.f421143k;
                bVar.f421143k = c.f421165k;
                return bVar.e(token);
            }
            if (token.a()) {
                bVar.w((Token.d) token);
                return true;
            }
            if (token.b()) {
                bVar.l(this);
                return false;
            }
            if (!token.e()) {
                if (!token.d()) {
                    if (!token.c()) {
                        return d(token, bVar);
                    }
                    if (bVar.a().f421086d.f421236c.equals("html")) {
                        bVar.l(this);
                    }
                    return true;
                }
                String str = ((Token.g) token).f421119c;
                if (!str.equals("table")) {
                    if (!C19693c.d(str, y.f421182B)) {
                        return d(token, bVar);
                    }
                    bVar.l(this);
                    return false;
                }
                if (!bVar.t(str)) {
                    bVar.l(this);
                    return false;
                }
                bVar.D("table");
                bVar.J();
                return true;
            }
            Token.h hVar = (Token.h) token;
            String str2 = hVar.f421119c;
            if (str2.equals("caption")) {
                bVar.k("table");
                bVar.f421149q.add(null);
                bVar.u(hVar);
                bVar.f421143k = c.f421166l;
            } else if (str2.equals("colgroup")) {
                bVar.k("table");
                bVar.u(hVar);
                bVar.f421143k = c.f421167m;
            } else {
                if (str2.equals("col")) {
                    bVar.g("colgroup");
                    return bVar.e(token);
                }
                if (C19693c.d(str2, y.f421213u)) {
                    bVar.k("table");
                    bVar.u(hVar);
                    bVar.f421143k = c.f421168n;
                } else {
                    if (C19693c.d(str2, y.f421214v)) {
                        bVar.g("tbody");
                        return bVar.e(token);
                    }
                    if (str2.equals("table")) {
                        bVar.l(this);
                        if (bVar.f("table")) {
                            return bVar.e(token);
                        }
                    } else {
                        if (C19693c.d(str2, y.f421215w)) {
                            bVar.f421344g = token;
                            return c.f421159e.c(token, bVar);
                        }
                        if (str2.equals("input")) {
                            if (!hVar.f421126j.l("type").equalsIgnoreCase(HiddenParameter.TYPE)) {
                                return d(token, bVar);
                            }
                            bVar.x(hVar);
                        } else {
                            if (!str2.equals("form")) {
                                return d(token, bVar);
                            }
                            bVar.l(this);
                            if (bVar.f421147o != null) {
                                return false;
                            }
                            bVar.y(hVar, false);
                        }
                    }
                }
            }
            return true;
        }

        public final boolean d(Token token, org.jsoup.parser.b bVar) throws IOException {
            bVar.l(this);
            boolean zD2 = C19693c.d(bVar.a().f421086d.f421236c, y.f421183C);
            v vVar = c.f421162h;
            if (!zD2) {
                bVar.f421344g = token;
                return vVar.c(token, bVar);
            }
            bVar.f421153u = true;
            bVar.f421344g = token;
            boolean zC2 = vVar.c(token, bVar);
            bVar.f421153u = false;
            return zC2;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public static final class y {

        /* renamed from: a, reason: collision with root package name */
        public static final String[] f421193a = {"base", "basefont", "bgsound", "command", "link"};

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f421194b = {"noframes", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE};

        /* renamed from: c, reason: collision with root package name */
        public static final String[] f421195c = {"body", "br", "html"};

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f421196d = {"body", "html"};

        /* renamed from: e, reason: collision with root package name */
        public static final String[] f421197e = {"body", "br", "head", "html"};

        /* renamed from: f, reason: collision with root package name */
        public static final String[] f421198f = {"basefont", "bgsound", "link", Constants.REFERRER_API_META, "noframes", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE};

        /* renamed from: g, reason: collision with root package name */
        public static final String[] f421199g = {"base", "basefont", "bgsound", "command", "link", Constants.REFERRER_API_META, "noframes", "script", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title"};

        /* renamed from: h, reason: collision with root package name */
        public static final String[] f421200h = {AddressParameter.TYPE, "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", ChannelContext.MENU, "nav", "ol", "p", "section", "summary", "ul"};

        /* renamed from: i, reason: collision with root package name */
        public static final String[] f421201i = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* renamed from: j, reason: collision with root package name */
        public static final String[] f421202j = {AddressParameter.TYPE, "div", "p"};

        /* renamed from: k, reason: collision with root package name */
        public static final String[] f421203k = {"dd", "dt"};

        /* renamed from: l, reason: collision with root package name */
        public static final String[] f421204l = {"b", "big", "code", "em", "font", "i", "s", Constants.SMALL, "strike", "strong", "tt", "u"};

        /* renamed from: m, reason: collision with root package name */
        public static final String[] f421205m = {"applet", "marquee", "object"};

        /* renamed from: n, reason: collision with root package name */
        public static final String[] f421206n = {"area", "br", "embed", "img", "keygen", "wbr"};

        /* renamed from: o, reason: collision with root package name */
        public static final String[] f421207o = {"param", SearchParamsConverterKt.SOURCE, "track"};

        /* renamed from: p, reason: collision with root package name */
        public static final String[] f421208p = {"action", "name", "prompt"};

        /* renamed from: q, reason: collision with root package name */
        public static final String[] f421209q = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: r, reason: collision with root package name */
        public static final String[] f421210r = {AddressParameter.TYPE, "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", ChannelContext.MENU, "nav", "ol", "pre", "section", "summary", "ul"};

        /* renamed from: s, reason: collision with root package name */
        public static final String[] f421211s = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", Constants.SMALL, "strike", "strong", "tt", "u"};

        /* renamed from: t, reason: collision with root package name */
        public static final String[] f421212t = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: u, reason: collision with root package name */
        public static final String[] f421213u = {"tbody", "tfoot", "thead"};

        /* renamed from: v, reason: collision with root package name */
        public static final String[] f421214v = {"td", "th", "tr"};

        /* renamed from: w, reason: collision with root package name */
        public static final String[] f421215w = {"script", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE};

        /* renamed from: x, reason: collision with root package name */
        public static final String[] f421216x = {"td", "th"};

        /* renamed from: y, reason: collision with root package name */
        public static final String[] f421217y = {"body", "caption", "col", "colgroup", "html"};

        /* renamed from: z, reason: collision with root package name */
        public static final String[] f421218z = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: A, reason: collision with root package name */
        public static final String[] f421181A = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: B, reason: collision with root package name */
        public static final String[] f421182B = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: C, reason: collision with root package name */
        public static final String[] f421183C = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: D, reason: collision with root package name */
        public static final String[] f421184D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};

        /* renamed from: E, reason: collision with root package name */
        public static final String[] f421185E = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};

        /* renamed from: F, reason: collision with root package name */
        public static final String[] f421186F = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: G, reason: collision with root package name */
        public static final String[] f421187G = {"body", "caption", "col", "colgroup", "html", "td", "th"};

        /* renamed from: H, reason: collision with root package name */
        public static final String[] f421188H = {"input", "keygen", "textarea"};

        /* renamed from: I, reason: collision with root package name */
        public static final String[] f421189I = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: J, reason: collision with root package name */
        public static final String[] f421190J = {"tbody", "tfoot", "thead"};

        /* renamed from: K, reason: collision with root package name */
        public static final String[] f421191K = {"head", "noscript"};

        /* renamed from: L, reason: collision with root package name */
        public static final String[] f421192L = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    }

    static {
        k kVar = new k("Initial", 0, null);
        f421156b = kVar;
        q qVar = new q("BeforeHtml", 1, null);
        f421157c = qVar;
        r rVar = new r("BeforeHead", 2, null);
        f421158d = rVar;
        s sVar = new s("InHead", 3, null);
        f421159e = sVar;
        t tVar = new t("InHeadNoscript", 4, null);
        f421160f = tVar;
        u uVar = new u("AfterHead", 5, null);
        f421161g = uVar;
        v vVar = new v("InBody", 6, null);
        f421162h = vVar;
        w wVar = new w("Text", 7, null);
        f421163i = wVar;
        x xVar = new x("InTable", 8, null);
        f421164j = xVar;
        a aVar = new a("InTableText", 9, null);
        f421165k = aVar;
        b bVar = new b("InCaption", 10, null);
        f421166l = bVar;
        C12214c c12214c = new C12214c("InColumnGroup", 11, null);
        f421167m = c12214c;
        d dVar = new d("InTableBody", 12, null);
        f421168n = dVar;
        e eVar = new e("InRow", 13, null);
        f421169o = eVar;
        f fVar = new f("InCell", 14, null);
        f421170p = fVar;
        g gVar = new g("InSelect", 15, null);
        f421171q = gVar;
        h hVar = new h("InSelectInTable", 16, null);
        f421172r = hVar;
        i iVar = new i("AfterBody", 17, null);
        f421173s = iVar;
        j jVar = new j("InFrameset", 18, null);
        f421174t = jVar;
        l lVar = new l("AfterFrameset", 19, null);
        f421175u = lVar;
        m mVar = new m("AfterAfterBody", 20, null);
        f421176v = mVar;
        n nVar = new n("AfterAfterFrameset", 21, null);
        f421177w = nVar;
        f421179y = new c[]{kVar, qVar, rVar, sVar, tVar, uVar, vVar, wVar, xVar, aVar, bVar, c12214c, dVar, eVar, fVar, gVar, hVar, iVar, jVar, lVar, mVar, nVar, new o("ForeignContent", 22, null)};
        f421178x = String.valueOf((char) 0);
    }

    public c() {
        throw null;
    }

    public c(String str, int i12, k kVar) {
    }

    public static boolean a(Token token) {
        if (token.f421101a == Token.TokenType.f421106f) {
            return C19693c.e(((Token.c) token).f421109b);
        }
        return false;
    }

    public static void b(Token.h hVar, org.jsoup.parser.b bVar) {
        bVar.f421340c.f421250c = org.jsoup.parser.k.f421300f;
        bVar.f421144l = bVar.f421143k;
        bVar.f421143k = f421163i;
        bVar.u(hVar);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f421179y.clone();
    }

    public abstract boolean c(Token token, org.jsoup.parser.b bVar);
}
