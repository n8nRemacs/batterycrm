package com.avito.android.html_formatter.jsoup;

import hJ.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: JsoupSupportsInsertHtmlNode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/Y;", "LhJ/r;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Y implements hJ.r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final org.jsoup.nodes.k f164201a;

    public Y(@Y61.k org.jsoup.nodes.k kVar) {
        this.f164201a = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hJ.r
    @Y61.l
    public final m.a j(int i12, @Y61.k String str) {
        m.a aVar;
        m.a aVar2;
        boolean zH2;
        org.jsoup.nodes.g gVar;
        org.jsoup.nodes.k kVar = this.f164201a;
        if (kVar instanceof org.jsoup.nodes.n) {
            org.jsoup.nodes.n nVar = (org.jsoup.nodes.n) kVar;
            if (kotlin.jvm.internal.L.f(str, "\n")) {
                org.jsoup.nodes.g gVarA = C30810h.a(nVar);
                if (gVarA == null) {
                    aVar2 = new m.a(null, 0, 1, null);
                } else {
                    nVar.e("label", "split");
                    org.jsoup.nodes.g gVarClone = gVarA.clone();
                    ((org.jsoup.nodes.g) gVarA.f421096b).W(gVarA.f421097c, gVarClone);
                    l0.h hVar = new l0.h();
                    C30810h.l(gVarClone, new C30807e(C30825x.f164237l, new C30826y(hVar, i12), C30827z.f164240l));
                    C30810h.l(gVarA, new C30807e(C30817o.f164228l, new C30818p(i12), C30819q.f164230l));
                    nVar.E();
                    org.jsoup.nodes.n nVar2 = (org.jsoup.nodes.n) hVar.f406842b;
                    if (nVar2 != null) {
                        nVar2.E();
                    }
                    String strF0 = gVarA.f0();
                    if (strF0 == null || strF0.length() != 0) {
                        gVar = null;
                    } else {
                        gVar = new org.jsoup.nodes.g("br");
                        nVar.G(gVar);
                    }
                    String strF02 = gVarClone.f0();
                    if (strF02 == null || strF02.length() != 0) {
                        aVar2 = new m.a(gVar != null ? new a0(gVar) : null, 0);
                    } else {
                        org.jsoup.nodes.n nVar3 = (org.jsoup.nodes.n) hVar.f406842b;
                        if (nVar3 != null) {
                            nVar3.G(new org.jsoup.nodes.g("br"));
                        }
                        aVar2 = new m.a(gVar != null ? new a0(gVar) : null, 1);
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (i12 != 0) {
                    sb2.append(nVar.M().substring(0, i12));
                }
                sb2.append(str);
                if (nVar.M().length() > i12) {
                    sb2.append(nVar.M().substring(i12, nVar.M().length()));
                }
                nVar.R(sb2.toString());
                aVar2 = new m.a(null, 0, 1, null);
            }
        } else {
            if (!(kVar instanceof org.jsoup.nodes.g)) {
                return null;
            }
            org.jsoup.nodes.g gVar2 = (org.jsoup.nodes.g) kVar;
            if (kotlin.jvm.internal.L.f(gVar2.f421086d.f421236c, "body")) {
                org.jsoup.nodes.g gVar3 = new org.jsoup.nodes.g("p");
                gVar3.W(0, new org.jsoup.nodes.n(str));
                gVar2.W(0, gVar3);
                aVar2 = new m.a(null, 0, 1, null);
            } else {
                if (gVar2.f421086d.f421237d) {
                    l0.h hVar2 = new l0.h();
                    gVar2.e0(new b0(new C30809g(hVar2)));
                    org.jsoup.nodes.k kVarB = (org.jsoup.nodes.n) hVar2.f406842b;
                    if (kVarB == null && (kVarB = C30810h.b(gVar2)) == null) {
                        org.jsoup.nodes.g gVar4 = (org.jsoup.nodes.g) gVar2.f421096b;
                        kVarB = new org.jsoup.nodes.n("");
                        gVar4.W(0, kVarB);
                    }
                    return new a0(kVarB).j(0, str);
                }
                if (C30810h.f(gVar2) && kotlin.jvm.internal.L.f(str, "\n")) {
                    if (C30810h.h(gVar2)) {
                        zH2 = false;
                    } else {
                        org.jsoup.nodes.k kVar2 = gVar2;
                        while (!C30810h.j(kVar2) && !C30810h.h(kVar2) && kVar2.B() == null && kVar2.u() == null) {
                            kVar2 = kVar2.f421096b;
                        }
                        zH2 = C30810h.h(kVar2);
                    }
                    if (zH2) {
                        org.jsoup.nodes.g gVarA2 = C30810h.a(gVar2);
                        if (gVarA2 == null) {
                            return null;
                        }
                        org.jsoup.nodes.g gVar5 = new org.jsoup.nodes.g("p");
                        gVar5.V(0, gVarA2.m());
                        if (C30810h.h(gVarA2)) {
                            gVarA2.M("label", "split");
                            org.jsoup.nodes.g gVar6 = (org.jsoup.nodes.g) gVarA2.f421096b;
                            org.jsoup.nodes.g gVar7 = (org.jsoup.nodes.g) gVar6.f421096b;
                            org.jsoup.nodes.g gVarClone2 = gVar6.clone();
                            gVar7.W(gVar6.f421097c, gVarClone2, gVar5);
                            l0.h hVar3 = new l0.h();
                            C30810h.l(gVarClone2, new C30807e(C30811i.f164222l, new C30812j(hVar3), C30813k.f164224l));
                            C30810h.l(gVar6, new C30807e(C30814l.f164225l, C30815m.f164226l, C30816n.f164227l));
                            org.jsoup.nodes.g gVar8 = (org.jsoup.nodes.g) hVar3.f406842b;
                            if (gVar8 != null) {
                                gVar8.D();
                            }
                            gVarA2.D();
                            if (gVar6.P() == 0) {
                                gVar6.D();
                            }
                            if (gVarClone2.P() == 0) {
                                gVarClone2.D();
                            }
                        }
                        aVar = new m.a(null, (-i12) - 1, 1, null);
                    }
                    return aVar;
                }
                if (!C30810h.f(gVar2) || !kotlin.jvm.internal.L.f(str, "\n")) {
                    if (!C30810h.f(gVar2)) {
                        return null;
                    }
                    org.jsoup.nodes.g gVar9 = (org.jsoup.nodes.g) gVar2.f421096b;
                    org.jsoup.nodes.n nVar4 = new org.jsoup.nodes.n(str);
                    gVar9.W(gVar2.f421097c, nVar4);
                    if (gVar2.u() == null) {
                        gVar2.D();
                        return new m.a(new a0(nVar4), -i12);
                    }
                    aVar = new m.a(null, -i12, 1, null);
                    return aVar;
                }
                org.jsoup.nodes.g gVarA3 = C30810h.a(gVar2);
                if (gVarA3 == null) {
                    aVar2 = new m.a(null, 0, 1, null);
                } else {
                    gVar2.M("label", "split");
                    org.jsoup.nodes.g gVarClone3 = gVarA3.clone();
                    ((org.jsoup.nodes.g) gVarA3.f421096b).W(gVarA3.f421097c, gVarClone3);
                    l0.h hVar4 = new l0.h();
                    C30810h.l(gVarClone3, new C30807e(r.f164231l, new C30820s(hVar4), C30821t.f164233l));
                    C30810h.l(gVarA3, new C30807e(C30822u.f164234l, C30823v.f164235l, C30824w.f164236l));
                    gVar2.b0();
                    org.jsoup.nodes.g gVar10 = (org.jsoup.nodes.g) hVar4.f406842b;
                    if (gVar10 != null) {
                        gVar10.b0();
                    }
                    aVar2 = new m.a(null, 1, 1, null);
                }
            }
        }
        return aVar2;
    }
}
