package com.avito.android.html_formatter.jsoup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import org.jsoup.nodes.Document;
import org.jsoup.select.d;

/* compiled from: JsoupHtmlCleaner.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/A;", "LhJ/e;", "<init>", "()V", "a", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A implements hJ.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final org.jsoup.safety.b f164165a;

    /* compiled from: JsoupHtmlCleaner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/A$a;", "", "<init>", "()V", "Lorg/jsoup/safety/b;", "whitelist", "Lorg/jsoup/safety/b;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        org.jsoup.safety.b bVar = new org.jsoup.safety.b();
        bVar.a("p", "ul", "ol", "li", "strong", "em", "br");
        f164165a = bVar;
    }

    @Inject
    public A() {
    }

    public static void b(org.jsoup.nodes.g gVar, List list) {
        org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) C42745f0.E(list);
        org.jsoup.nodes.k kVarA = kVar.A();
        org.jsoup.nodes.g gVar2 = kVarA instanceof org.jsoup.nodes.g ? (org.jsoup.nodes.g) kVarA : null;
        if (gVar2 != null) {
            gVar2.W(kVar.f421097c, gVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.jsoup.nodes.k kVar2 = (org.jsoup.nodes.k) it.next();
            kVar2.D();
            gVar.K(kVar2);
        }
    }

    @Override // hJ.e
    @Y61.k
    public final String a(@Y61.k String str) {
        org.jsoup.safety.b bVar = f164165a;
        org.jsoup.safety.a aVar = new org.jsoup.safety.a();
        org.jsoup.helper.d.d(bVar);
        aVar.f421349a = bVar;
        Document documentA = aVar.a(org.jsoup.parser.g.a(str));
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.f421045f = false;
        documentA.f421038j = outputSettings;
        C30810h.l(Document.g0(documentA), new b0(new C(this)));
        List<org.jsoup.nodes.k> listM = Document.g0(documentA).m();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ArrayList());
        int i12 = 0;
        for (org.jsoup.nodes.k kVar : listM) {
            if ((kVar instanceof org.jsoup.nodes.n) || ((kVar instanceof org.jsoup.nodes.g) && !((org.jsoup.nodes.g) kVar).f421086d.f421237d)) {
                ((List) arrayList.get(i12)).add(kVar);
            } else if (!((Collection) arrayList.get(i12)).isEmpty()) {
                i12++;
                arrayList.add(new ArrayList());
            }
        }
        if (((List) arrayList.get(i12)).isEmpty()) {
            arrayList.remove(i12);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(new org.jsoup.nodes.g("p"), (List) it.next());
        }
        org.jsoup.nodes.g gVarG0 = Document.g0(documentA);
        gVarG0.getClass();
        org.jsoup.select.c cVarA = org.jsoup.select.a.a(gVarG0, new d.C44905a());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new ArrayList());
        Iterator<org.jsoup.nodes.g> it2 = cVarA.iterator();
        int i13 = 0;
        while (it2.hasNext()) {
            org.jsoup.nodes.g next = it2.next();
            if (next instanceof org.jsoup.nodes.g) {
                org.jsoup.nodes.g gVar = next;
                if (kotlin.jvm.internal.L.f(gVar.f421086d.f421236c, "li") && (next.f421096b == null || (!kotlin.jvm.internal.L.f(((org.jsoup.nodes.g) gVar.f421096b).f421086d.f421236c, "ul") && !kotlin.jvm.internal.L.f(((org.jsoup.nodes.g) gVar.f421096b).f421086d.f421236c, "ol")))) {
                    ((List) arrayList2.get(i13)).add(next);
                }
            }
            if (!((Collection) arrayList2.get(i13)).isEmpty()) {
                i13++;
                arrayList2.add(new ArrayList());
            }
        }
        if (((List) arrayList2.get(i13)).isEmpty()) {
            arrayList2.remove(i13);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            b(new org.jsoup.nodes.g("ul"), (List) it3.next());
        }
        org.jsoup.helper.d.b("ul,ol");
        org.jsoup.select.d dVarH = org.jsoup.select.g.h("ul,ol");
        org.jsoup.helper.d.d(dVarH);
        Iterator<org.jsoup.nodes.g> it4 = org.jsoup.select.a.a(documentA, dVarH).iterator();
        while (it4.hasNext()) {
            List<org.jsoup.nodes.k> listM2 = it4.next().m();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new ArrayList());
            int i14 = 0;
            for (org.jsoup.nodes.k kVar2 : listM2) {
                if ((kVar2 instanceof org.jsoup.nodes.n) || ((kVar2 instanceof org.jsoup.nodes.g) && !((org.jsoup.nodes.g) kVar2).f421086d.f421237d)) {
                    ((List) arrayList3.get(i14)).add(kVar2);
                } else if (!((Collection) arrayList3.get(i14)).isEmpty()) {
                    i14++;
                    arrayList3.add(new ArrayList());
                }
            }
            if (((List) arrayList3.get(i14)).isEmpty()) {
                arrayList3.remove(i14);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b(new org.jsoup.nodes.g("li"), (List) it5.next());
            }
        }
        org.jsoup.helper.d.b("ul > p,ol > p");
        org.jsoup.select.d dVarH2 = org.jsoup.select.g.h("ul > p,ol > p");
        org.jsoup.helper.d.d(dVarH2);
        Iterator<org.jsoup.nodes.g> it6 = org.jsoup.select.a.a(documentA, dVarH2).iterator();
        while (it6.hasNext()) {
            org.jsoup.nodes.g next2 = it6.next();
            org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g("li");
            gVar2.V(0, next2.m());
            next2.G(gVar2);
        }
        C30810h.l(Document.g0(documentA), new C30806d(B.f164166l));
        org.jsoup.helper.d.b("ul:not(ul:has(*)),ol:not(ol:has(*))");
        org.jsoup.select.d dVarH3 = org.jsoup.select.g.h("ul:not(ul:has(*)),ol:not(ol:has(*))");
        org.jsoup.helper.d.d(dVarH3);
        Iterator<org.jsoup.nodes.g> it7 = org.jsoup.select.a.a(documentA, dVarH3).iterator();
        while (it7.hasNext()) {
            org.jsoup.nodes.g next3 = it7.next();
            org.jsoup.nodes.g gVar3 = new org.jsoup.nodes.g("p");
            gVar3.K(new org.jsoup.nodes.g("br"));
            G0 g02 = G0.f406611a;
            gVar3.V(0, next3.m());
            next3.G(gVar3);
        }
        return Document.g0(documentA).U();
    }
}
