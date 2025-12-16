package com.avito.android.html_formatter.jsoup;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.html_formatter.FormatChange;
import hJ.m;
import hJ.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import org.jsoup.select.d;

/* compiled from: MutableJsoupHtmlNode.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/a0;", "Lcom/avito/android/html_formatter/jsoup/E;", "LhJ/s;", "LhJ/q;", "LhJ/m;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a0 extends E implements hJ.s, hJ.q, hJ.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f164204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f164205c;

    public a0(@Y61.k org.jsoup.nodes.k kVar) {
        super(kVar);
        this.f164204b = new Z(kVar);
        this.f164205c = new N(kVar);
    }

    @Override // hJ.s
    @Y61.l
    public final m.a a(int i12, int i13, @Y61.k List<hJ.l> list) {
        return this.f164204b.a(i12, i13, list);
    }

    @Override // hJ.p
    @Y61.l
    public final m.a b(int i12, int i13, @Y61.l p.b bVar) {
        return this.f164204b.f164202a.b(i12, i13, null);
    }

    @Override // hJ.q
    @Y61.l
    public final m.a f(int i12, int i13, @Y61.k FormatChange formatChange, @Y61.l InterfaceC28373a interfaceC28373a) {
        return this.f164205c.f(i12, i13, formatChange, interfaceC28373a);
    }

    @Override // hJ.m
    @Y61.l
    public final a0 h() {
        org.jsoup.nodes.k kVar = this.f164169a;
        org.jsoup.nodes.g gVar = kVar instanceof org.jsoup.nodes.g ? (org.jsoup.nodes.g) kVar : null;
        if (gVar == null) {
            return null;
        }
        org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g("p");
        gVar2.W(0, new org.jsoup.nodes.g("br"));
        gVar.W(0, gVar2);
        return new a0(gVar2);
    }

    @Override // hJ.r
    @Y61.l
    public final m.a j(int i12, @Y61.k String str) {
        return this.f164204b.f164203b.j(i12, str);
    }

    @Override // hJ.m
    public final int k() {
        org.jsoup.nodes.k kVar = this.f164169a;
        boolean z12 = kVar instanceof org.jsoup.nodes.g;
        org.jsoup.nodes.g gVar = z12 ? (org.jsoup.nodes.g) kVar : null;
        if (gVar != null) {
            org.jsoup.select.c cVarA = org.jsoup.select.a.a(gVar, new d.C44905a());
            ArrayList arrayList = new ArrayList();
            Iterator<org.jsoup.nodes.g> it = cVarA.iterator();
            while (it.hasNext()) {
                C42745f0.h(it.next().d0(), arrayList);
            }
            for (org.jsoup.nodes.n nVar : C42745f0.k(arrayList)) {
                if (nVar.M().length() == 0) {
                    nVar.D();
                }
            }
        }
        org.jsoup.nodes.g gVar2 = z12 ? (org.jsoup.nodes.g) kVar : null;
        int i12 = 0;
        if (gVar2 != null) {
            for (org.jsoup.nodes.g gVar3 : C42745f0.l(org.jsoup.select.a.a(gVar2, new d.C44905a()))) {
                List<org.jsoup.nodes.n> listD0 = gVar3.d0();
                if (listD0.size() > 1) {
                    for (org.jsoup.nodes.n nVar2 : C42745f0.l(listD0)) {
                        org.jsoup.nodes.k kVarB = nVar2.B();
                        org.jsoup.nodes.n nVar3 = kVarB instanceof org.jsoup.nodes.n ? (org.jsoup.nodes.n) kVarB : null;
                        if (nVar3 != null) {
                            nVar3.R(nVar3.M() + nVar2.M());
                            nVar2.D();
                        }
                    }
                }
                org.jsoup.nodes.k kVarB2 = gVar3.B();
                org.jsoup.nodes.g gVar4 = kVarB2 instanceof org.jsoup.nodes.g ? (org.jsoup.nodes.g) kVarB2 : null;
                org.jsoup.parser.h hVar = gVar3.f421086d;
                if (!hVar.f421237d && !C30810h.f(gVar3) && gVar4 != null && kotlin.jvm.internal.L.f(gVar4.f421086d.f421236c, hVar.f421236c)) {
                    gVar4.V(gVar4.f421088f.size(), gVar3.m());
                    gVar3.D();
                } else if (((org.jsoup.nodes.g) gVar3.f421096b) != null) {
                    if (gVar3.f0().length() == 0 && !C30810h.f(gVar3) && (!C30810h.g(gVar3) || C30810h.b(gVar3) == null)) {
                        gVar3.D();
                    }
                    if (C30810h.f(gVar3) && (C30810h.d(gVar3) instanceof org.jsoup.nodes.n) && C30810h.e(gVar3) == null) {
                        gVar3.D();
                        i12--;
                    }
                }
            }
        }
        return i12;
    }

    @Y61.k
    public final String toString() {
        org.jsoup.nodes.k kVar = this.f164169a;
        if (kVar instanceof org.jsoup.nodes.g) {
            return "ElementNode(" + kVar.w() + ')';
        }
        if (!(kVar instanceof org.jsoup.nodes.n)) {
            return "Node(NO_TEXT)";
        }
        return "TextNode(" + ((org.jsoup.nodes.n) kVar).Q() + ')';
    }
}
