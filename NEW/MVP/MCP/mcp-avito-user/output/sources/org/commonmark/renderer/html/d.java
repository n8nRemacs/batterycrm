package org.commonmark.renderer.html;

import Q61.A;
import Q61.AbstractC14867a;
import Q61.AbstractC14868b;
import Q61.B;
import Q61.C14869c;
import Q61.j;
import Q61.k;
import Q61.l;
import Q61.m;
import Q61.n;
import Q61.o;
import Q61.p;
import Q61.q;
import Q61.r;
import Q61.t;
import Q61.u;
import Q61.v;
import Q61.w;
import Q61.x;
import Q61.y;
import Q61.z;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.commonmark.renderer.html.h;

/* compiled from: CoreHtmlNodeRenderer.java */
/* loaded from: classes7.dex */
public class d extends AbstractC14867a implements T61.a {

    /* renamed from: a, reason: collision with root package name */
    public final e f420380a;

    /* renamed from: b, reason: collision with root package name */
    public final i f420381b;

    /* compiled from: CoreHtmlNodeRenderer.java */
    public static class b extends AbstractC14867a {

        /* renamed from: a, reason: collision with root package name */
        public final StringBuilder f420382a;

        public b() {
            this.f420382a = new StringBuilder();
        }

        @Override // Q61.AbstractC14867a, Q61.C
        public final void c(y yVar) {
            this.f420382a.append('\n');
        }

        @Override // Q61.AbstractC14867a, Q61.C
        public final void h(A a12) {
            this.f420382a.append(a12.f13480f);
        }

        @Override // Q61.AbstractC14867a, Q61.C
        public final void n(l lVar) {
            this.f420382a.append('\n');
        }
    }

    public d(e eVar) {
        this.f420380a = eVar;
        this.f420381b = ((h.c) eVar).f420387a;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void A(j jVar) {
        H(jVar, "em");
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void C(n nVar) {
        this.f420381b.getClass();
        ((h.c) this.f420380a).b();
        String str = nVar.f13489f;
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void D(C14869c c14869c) {
        this.f420381b.getClass();
        H(c14869c, "blockquote");
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void E(Q61.e eVar) {
        H(eVar, "code");
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a
    public final void F(v vVar) {
        v vVar2 = vVar.f13501b;
        while (vVar2 != null) {
            v vVar3 = vVar2.f13504e;
            ((h.c) this.f420380a).f420389c.a(vVar2);
            vVar2 = vVar3;
        }
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void G(B b12) {
        this.f420381b.getClass();
        H(b12, "hr");
        throw null;
    }

    public final Map<String, String> H(v vVar, String str) {
        return ((h.c) this.f420380a).a(vVar, str, Collections.emptyMap());
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void b(o oVar) {
        ((h.c) this.f420380a).b();
        String str = oVar.f13490f;
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void c(y yVar) {
        h.this.getClass();
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void e(p pVar) {
        String str = pVar.f13491f;
        e eVar = this.f420380a;
        h.this.getClass();
        b bVar = new b();
        bVar.e(pVar);
        String string = bVar.f420382a.toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("src", str);
        linkedHashMap.put("alt", string);
        String str2 = pVar.f13492g;
        if (str2 != null) {
            linkedHashMap.put("title", str2);
        }
        ((h.c) eVar).a(pVar, "img", linkedHashMap);
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void g(z zVar) {
        H(zVar, "strong");
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void h(A a12) {
        String str = a12.f13480f;
        this.f420381b.getClass();
        org.commonmark.internal.util.a.a(str);
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void j(r rVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = rVar.f13494f;
        e eVar = this.f420380a;
        h.this.getClass();
        linkedHashMap.put("href", str);
        String str2 = rVar.f13495g;
        if (str2 != null) {
            linkedHashMap.put("title", str2);
        }
        ((h.c) eVar).a(rVar, "a", linkedHashMap);
        this.f420381b.getClass();
        throw null;
    }

    @Override // T61.a
    public final void k(v vVar) {
        vVar.a(this);
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void l(u uVar) {
        H(uVar, "li");
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void m(Q61.d dVar) {
        H(dVar, "ul");
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void n(l lVar) {
        H(lVar, "br");
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void o(q qVar) {
        String str = qVar.f13493f;
        Collections.emptyMap();
        this.f420381b.getClass();
        H(qVar, "pre");
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void p(m mVar) {
        String str = "h" + mVar.f13488f;
        this.f420381b.getClass();
        H(mVar, str);
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void q(k kVar) {
        String str = kVar.f13487j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strSubstring = kVar.f13486i;
        if (strSubstring != null && !strSubstring.isEmpty()) {
            int iIndexOf = strSubstring.indexOf(" ");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            linkedHashMap.put("class", "language-" + strSubstring);
        }
        this.f420381b.getClass();
        H(kVar, "pre");
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void v(w wVar) {
        int i12 = wVar.f13505g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i12 != 1) {
            linkedHashMap.put("start", String.valueOf(i12));
        }
        ((h.c) this.f420380a).a(wVar, "ol", linkedHashMap);
        this.f420381b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void y(Q61.i iVar) {
        F(iVar);
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void z(x xVar) {
        AbstractC14868b abstractC14868b;
        AbstractC14868b abstractC14868b2 = (AbstractC14868b) xVar.f13500a;
        boolean z12 = (abstractC14868b2 == null || (abstractC14868b = (AbstractC14868b) abstractC14868b2.f13500a) == null || !(abstractC14868b instanceof t)) ? false : ((t) abstractC14868b).f13499f;
        i iVar = this.f420381b;
        if (!z12) {
            iVar.getClass();
            H(xVar, "p");
            throw null;
        }
        F(xVar);
        if (z12) {
            return;
        }
        iVar.getClass();
        throw null;
    }
}
