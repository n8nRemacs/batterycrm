package org.jsoup.safety;

import java.util.Iterator;
import org.jsoup.helper.d;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.e;
import org.jsoup.nodes.g;
import org.jsoup.nodes.k;
import org.jsoup.nodes.n;
import org.jsoup.parser.h;
import org.jsoup.safety.b;
import org.jsoup.select.f;

/* compiled from: Cleaner.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public org.jsoup.safety.b f421349a;

    /* compiled from: Cleaner.java */
    public final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public g f421350a;

        public b(g gVar, g gVar2, C12216a c12216a) {
            this.f421350a = gVar2;
        }

        @Override // org.jsoup.select.f
        public final void a(k kVar, int i12) {
            if (kVar instanceof g) {
                if (a.this.f421349a.f421352a.contains(new b.d(kVar.v()))) {
                    this.f421350a = (g) this.f421350a.f421096b;
                }
            }
        }

        @Override // org.jsoup.select.f
        public final void b(k kVar, int i12) {
            boolean z12 = kVar instanceof g;
            a aVar = a.this;
            if (!z12) {
                if (kVar instanceof n) {
                    this.f421350a.K(new n(((n) kVar).M()));
                    return;
                } else {
                    if (kVar instanceof e) {
                        if (aVar.f421349a.f421352a.contains(new b.d(kVar.f421096b.v()))) {
                            this.f421350a.K(new e(((e) kVar).L()));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            g gVar = (g) kVar;
            if (!aVar.f421349a.f421352a.contains(new b.d(gVar.f421086d.f421236c))) {
                return;
            }
            String str = gVar.f421086d.f421235b;
            org.jsoup.nodes.b bVar = new org.jsoup.nodes.b();
            g gVar2 = new g(h.a(str, org.jsoup.parser.f.f421222d), gVar.j(), bVar);
            Iterator<org.jsoup.nodes.a> it = gVar.i().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                org.jsoup.safety.b bVar2 = aVar.f421349a;
                if (!zHasNext) {
                    bVar.b(bVar2.b(str));
                    this.f421350a.K(gVar2);
                    this.f421350a = gVar2;
                    return;
                } else {
                    org.jsoup.nodes.a next = it.next();
                    if (bVar2.c(str, gVar, next)) {
                        bVar.C(next);
                    }
                }
            }
        }
    }

    /* compiled from: Cleaner.java */
    public static class c {
    }

    public final Document a(Document document) {
        d.d(document);
        Document document2 = new Document(document.j());
        document2.f421039k = document2.f421039k;
        g gVarL = document2.L("html");
        gVarL.L("head");
        gVarL.L("body");
        if (Document.g0(document) != null) {
            g gVarG0 = Document.g0(document);
            org.jsoup.select.e.a(gVarG0, new b(gVarG0, Document.g0(document2), null));
        }
        return document2;
    }
}
