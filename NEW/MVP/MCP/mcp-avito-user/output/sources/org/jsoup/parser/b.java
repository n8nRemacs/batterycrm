package org.jsoup.parser;

import a71.C19693c;
import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.io.StringReader;
import java.util.ArrayList;
import org.jsoup.nodes.n;
import org.jsoup.parser.Token;

/* compiled from: HtmlTreeBuilder.java */
/* loaded from: classes7.dex */
public class b extends l {

    /* renamed from: k, reason: collision with root package name */
    public c f421143k;

    /* renamed from: l, reason: collision with root package name */
    public c f421144l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f421145m;

    /* renamed from: n, reason: collision with root package name */
    public org.jsoup.nodes.g f421146n;

    /* renamed from: o, reason: collision with root package name */
    public org.jsoup.nodes.i f421147o;

    /* renamed from: p, reason: collision with root package name */
    public org.jsoup.nodes.g f421148p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<org.jsoup.nodes.g> f421149q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f421150r;

    /* renamed from: s, reason: collision with root package name */
    public Token.g f421151s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f421152t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f421153u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f421154v;

    /* renamed from: w, reason: collision with root package name */
    public final String[] f421155w = {null};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f421140x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f421141y = {"ol", "ul"};

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f421142z = {"button"};

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f421136A = {"html", "table"};

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f421137B = {"optgroup", "option"};

    /* renamed from: C, reason: collision with root package name */
    public static final String[] f421138C = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f421139D = {AddressParameter.TYPE, "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", ChannelContext.MENU, Constants.REFERRER_API_META, "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    public static boolean B(ArrayList arrayList, org.jsoup.nodes.g gVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((org.jsoup.nodes.g) arrayList.get(size)) == gVar) {
                return true;
            }
        }
        return false;
    }

    public final void A(org.jsoup.nodes.k kVar) {
        org.jsoup.nodes.i iVar;
        if (this.f421342e.isEmpty()) {
            this.f421341d.K(kVar);
        } else if (this.f421153u) {
            z(kVar);
        } else {
            a().K(kVar);
        }
        if (kVar instanceof org.jsoup.nodes.g) {
            org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) kVar;
            if (!gVar.f421086d.f421242i || (iVar = this.f421147o) == null) {
                return;
            }
            iVar.f421093j.add(gVar);
        }
    }

    public final void C() {
        this.f421342e.remove(this.f421342e.size() - 1);
    }

    public final org.jsoup.nodes.g D(String str) {
        for (int size = this.f421342e.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.g gVar = this.f421342e.get(size);
            this.f421342e.remove(size);
            if (gVar.f421086d.f421236c.equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    public final boolean E(Token token, c cVar) {
        this.f421344g = token;
        return cVar.c(token, this);
    }

    public final void F(org.jsoup.nodes.g gVar) {
        int size = this.f421149q.size() - 1;
        int i12 = 0;
        while (true) {
            if (size >= 0) {
                org.jsoup.nodes.g gVar2 = this.f421149q.get(size);
                if (gVar2 == null) {
                    break;
                }
                if (gVar.f421086d.f421236c.equals(gVar2.f421086d.f421236c) && gVar.i().equals(gVar2.i())) {
                    i12++;
                }
                if (i12 == 3) {
                    this.f421149q.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.f421149q.add(gVar);
    }

    public final void G() {
        boolean z12 = true;
        org.jsoup.nodes.g gVar = this.f421149q.size() > 0 ? (org.jsoup.nodes.g) r.j(1, this.f421149q) : null;
        if (gVar == null || B(this.f421342e, gVar)) {
            return;
        }
        int size = this.f421149q.size() - 1;
        int i12 = size;
        while (i12 != 0) {
            i12--;
            gVar = this.f421149q.get(i12);
            if (gVar == null || B(this.f421342e, gVar)) {
                z12 = false;
                break;
            }
        }
        while (true) {
            if (!z12) {
                i12++;
                gVar = this.f421149q.get(i12);
            }
            org.jsoup.helper.d.d(gVar);
            org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g(h.a(gVar.f421086d.f421236c, this.f421345h), null, null);
            A(gVar2);
            this.f421342e.add(gVar2);
            gVar2.i().b(gVar.i());
            this.f421149q.set(i12, gVar2);
            if (i12 == size) {
                return;
            } else {
                z12 = false;
            }
        }
    }

    public final void H(org.jsoup.nodes.g gVar) {
        for (int size = this.f421149q.size() - 1; size >= 0; size--) {
            if (this.f421149q.get(size) == gVar) {
                this.f421149q.remove(size);
                return;
            }
        }
    }

    public final void I(org.jsoup.nodes.g gVar) {
        for (int size = this.f421342e.size() - 1; size >= 0; size--) {
            if (this.f421342e.get(size) == gVar) {
                this.f421342e.remove(size);
                return;
            }
        }
    }

    public final void J() {
        boolean z12 = false;
        for (int size = this.f421342e.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.g gVar = this.f421342e.get(size);
            if (size == 0) {
                gVar = this.f421148p;
                z12 = true;
            }
            String str = gVar.f421086d.f421236c;
            if ("select".equals(str)) {
                this.f421143k = c.f421171q;
                return;
            }
            if ("td".equals(str) || ("th".equals(str) && !z12)) {
                this.f421143k = c.f421170p;
                return;
            }
            if ("tr".equals(str)) {
                this.f421143k = c.f421169o;
                return;
            }
            if ("tbody".equals(str) || "thead".equals(str) || "tfoot".equals(str)) {
                this.f421143k = c.f421168n;
                return;
            }
            if ("caption".equals(str)) {
                this.f421143k = c.f421166l;
                return;
            }
            if ("colgroup".equals(str)) {
                this.f421143k = c.f421167m;
                return;
            }
            if ("table".equals(str)) {
                this.f421143k = c.f421164j;
                return;
            }
            if ("head".equals(str)) {
                this.f421143k = c.f421162h;
                return;
            }
            if ("body".equals(str)) {
                this.f421143k = c.f421162h;
                return;
            }
            if ("frameset".equals(str)) {
                this.f421143k = c.f421174t;
                return;
            } else if ("html".equals(str)) {
                this.f421143k = c.f421158d;
                return;
            } else {
                if (z12) {
                    this.f421143k = c.f421162h;
                    return;
                }
            }
        }
    }

    @Override // org.jsoup.parser.l
    public final f b() {
        return f.f421221c;
    }

    @Override // org.jsoup.parser.l
    public final void c(StringReader stringReader, String str, g gVar) {
        super.c(stringReader, str, gVar);
        this.f421143k = c.f421156b;
        this.f421144l = null;
        this.f421145m = false;
        this.f421146n = null;
        this.f421147o = null;
        this.f421148p = null;
        this.f421149q = new ArrayList<>();
        this.f421150r = new ArrayList();
        this.f421151s = new Token.g();
        this.f421152t = true;
        this.f421153u = false;
        this.f421154v = false;
    }

    @Override // org.jsoup.parser.l
    public final boolean e(Token token) {
        this.f421344g = token;
        return this.f421143k.c(token, this);
    }

    public final org.jsoup.nodes.g i(org.jsoup.nodes.g gVar) {
        for (int size = this.f421342e.size() - 1; size >= 0; size--) {
            if (this.f421342e.get(size) == gVar) {
                return this.f421342e.get(size - 1);
            }
        }
        return null;
    }

    public final void j() {
        while (!this.f421149q.isEmpty()) {
            int size = this.f421149q.size();
            if ((size > 0 ? this.f421149q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void k(String... strArr) {
        for (int size = this.f421342e.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.g gVar = this.f421342e.get(size);
            if (C19693c.c(gVar.f421086d.f421236c, strArr) || gVar.f421086d.f421236c.equals("html")) {
                return;
            }
            this.f421342e.remove(size);
        }
    }

    public final void l(c cVar) {
        if (this.f421338a.f421226b.e()) {
            this.f421338a.f421226b.add(new d(this.f421339b.r(), "Unexpected token [%s] when in state [%s]", this.f421344g.getClass().getSimpleName(), cVar));
        }
    }

    public final void m(String str) {
        while (str != null && !a().f421086d.f421236c.equals(str) && C19693c.d(a().f421086d.f421236c, f421138C)) {
            C();
        }
    }

    public final org.jsoup.nodes.g n(String str) {
        for (int size = this.f421149q.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.g gVar = this.f421149q.get(size);
            if (gVar == null) {
                return null;
            }
            if (gVar.f421086d.f421236c.equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    public final org.jsoup.nodes.g o(String str) {
        for (int size = this.f421342e.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.g gVar = this.f421342e.get(size);
            if (gVar.f421086d.f421236c.equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    public final boolean p(String str) {
        String[] strArr = f421142z;
        String[] strArr2 = f421140x;
        String[] strArr3 = this.f421155w;
        strArr3[0] = str;
        return s(strArr3, strArr2, strArr);
    }

    public final boolean q(String str) {
        String[] strArr = f421140x;
        String[] strArr2 = this.f421155w;
        strArr2[0] = str;
        return s(strArr2, strArr, null);
    }

    public final boolean r(String str) {
        for (int size = this.f421342e.size() - 1; size >= 0; size--) {
            String str2 = this.f421342e.get(size).f421086d.f421236c;
            if (str2.equals(str)) {
                return true;
            }
            if (!C19693c.d(str2, f421137B)) {
                return false;
            }
        }
        throw new IllegalArgumentException("Should not be reachable");
    }

    public final boolean s(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f421342e.size();
        int i12 = size - 1;
        int i13 = i12 > 100 ? size - 101 : 0;
        while (i12 >= i13) {
            String str = this.f421342e.get(i12).f421086d.f421236c;
            if (C19693c.d(str, strArr)) {
                return true;
            }
            if (C19693c.d(str, strArr2)) {
                return false;
            }
            if (strArr3 != null && C19693c.d(str, strArr3)) {
                return false;
            }
            i12--;
        }
        return false;
    }

    public final boolean t(String str) {
        String[] strArr = f421136A;
        String[] strArr2 = this.f421155w;
        strArr2[0] = str;
        return s(strArr2, strArr, null);
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.f421344g + ", state=" + this.f421143k + ", currentElement=" + a() + '}';
    }

    public final org.jsoup.nodes.g u(Token.h hVar) {
        org.jsoup.nodes.b bVar = hVar.f421126j;
        if (bVar != null && bVar.f421074b != 0 && bVar.j(this.f421345h) > 0) {
            e eVar = this.f421338a.f421226b;
            if (eVar.e()) {
                eVar.add(new d(this.f421339b.r(), "Duplicate attribute"));
            }
        }
        if (!hVar.f421125i) {
            h hVarA = h.a(hVar.m(), this.f421345h);
            f fVar = this.f421345h;
            org.jsoup.nodes.b bVar2 = hVar.f421126j;
            fVar.a(bVar2);
            org.jsoup.nodes.g gVar = new org.jsoup.nodes.g(hVarA, null, bVar2);
            A(gVar);
            this.f421342e.add(gVar);
            return gVar;
        }
        org.jsoup.nodes.g gVarX = x(hVar);
        this.f421342e.add(gVarX);
        j jVar = this.f421340c;
        jVar.f421250c = k.f421292b;
        Token.g gVar2 = this.f421151s;
        gVar2.f();
        gVar2.n(gVarX.f421086d.f421235b);
        jVar.h(gVar2);
        return gVarX;
    }

    public final void v(Token.c cVar) {
        org.jsoup.nodes.g gVarA = a();
        if (gVarA == null) {
            gVarA = this.f421341d;
        }
        String str = gVarA.f421086d.f421236c;
        String str2 = cVar.f421109b;
        gVarA.K(cVar instanceof Token.b ? new org.jsoup.nodes.c(str2) : (str.equals("script") || str.equals(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)) ? new org.jsoup.nodes.e(str2) : new n(str2));
    }

    public final void w(Token.d dVar) {
        String string = dVar.f421111c;
        if (string == null) {
            string = dVar.f421110b.toString();
        }
        A(new org.jsoup.nodes.d(string));
    }

    public final org.jsoup.nodes.g x(Token.h hVar) {
        h hVarA = h.a(hVar.m(), this.f421345h);
        f fVar = this.f421345h;
        org.jsoup.nodes.b bVar = hVar.f421126j;
        fVar.a(bVar);
        org.jsoup.nodes.g gVar = new org.jsoup.nodes.g(hVarA, null, bVar);
        A(gVar);
        if (hVar.f421125i) {
            if (!h.f421228k.containsKey(hVarA.f421235b)) {
                hVarA.f421240g = true;
            } else if (!hVarA.f421239f) {
                j jVar = this.f421340c;
                e eVar = jVar.f421249b;
                if (eVar.e()) {
                    eVar.add(new d(jVar.f421248a.r(), "Tag cannot be self closing; not a void tag"));
                }
            }
        }
        return gVar;
    }

    public final void y(Token.h hVar, boolean z12) {
        h hVarA = h.a(hVar.m(), this.f421345h);
        f fVar = this.f421345h;
        org.jsoup.nodes.b bVar = hVar.f421126j;
        fVar.a(bVar);
        org.jsoup.nodes.i iVar = new org.jsoup.nodes.i(hVarA, bVar);
        this.f421147o = iVar;
        A(iVar);
        if (z12) {
            this.f421342e.add(iVar);
        }
    }

    public final void z(org.jsoup.nodes.k kVar) {
        org.jsoup.nodes.g gVarI;
        org.jsoup.nodes.g gVarO = o("table");
        boolean z12 = false;
        if (gVarO != null) {
            gVarI = (org.jsoup.nodes.g) gVarO.f421096b;
            if (gVarI != null) {
                z12 = true;
            } else {
                gVarI = i(gVarO);
            }
        } else {
            gVarI = this.f421342e.get(0);
        }
        if (!z12) {
            gVarI.K(kVar);
            return;
        }
        org.jsoup.helper.d.d(gVarO);
        org.jsoup.helper.d.d(gVarO.f421096b);
        gVarO.f421096b.b(gVarO.f421097c, kVar);
    }
}
