package org.jsoup.select;

import org.jsoup.nodes.k;

/* compiled from: Collector.java */
/* loaded from: classes7.dex */
public class a {

    /* compiled from: Collector.java */
    public static class b implements NodeFilter {

        /* renamed from: a, reason: collision with root package name */
        public final org.jsoup.nodes.g f421365a;

        /* renamed from: b, reason: collision with root package name */
        public org.jsoup.nodes.g f421366b = null;

        /* renamed from: c, reason: collision with root package name */
        public final d f421367c;

        public b(org.jsoup.nodes.g gVar, d dVar) {
            this.f421365a = gVar;
            this.f421367c = dVar;
        }
    }

    public static c a(org.jsoup.nodes.g gVar, d dVar) {
        c cVar = new c();
        e.a(gVar, new C12218a(gVar, cVar, dVar));
        return cVar;
    }

    /* compiled from: Collector.java */
    /* renamed from: org.jsoup.select.a$a, reason: collision with other inner class name */
    public static class C12218a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final org.jsoup.nodes.g f421362a;

        /* renamed from: b, reason: collision with root package name */
        public final c f421363b;

        /* renamed from: c, reason: collision with root package name */
        public final d f421364c;

        public C12218a(org.jsoup.nodes.g gVar, c cVar, d dVar) {
            this.f421362a = gVar;
            this.f421363b = cVar;
            this.f421364c = dVar;
        }

        @Override // org.jsoup.select.f
        public final void b(k kVar, int i12) {
            if (kVar instanceof org.jsoup.nodes.g) {
                org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) kVar;
                if (this.f421364c.a(this.f421362a, gVar)) {
                    this.f421363b.add(gVar);
                }
            }
        }

        @Override // org.jsoup.select.f
        public final void a(k kVar, int i12) {
        }
    }
}
