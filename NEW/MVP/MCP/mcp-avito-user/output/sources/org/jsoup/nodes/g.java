package org.jsoup.nodes;

import a71.C19693c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.k;

/* compiled from: Element.java */
/* loaded from: classes7.dex */
public class g extends k {

    /* renamed from: h, reason: collision with root package name */
    public static final List<k> f421084h = Collections.emptyList();

    /* renamed from: i, reason: collision with root package name */
    public static final String f421085i;

    /* renamed from: d, reason: collision with root package name */
    public final org.jsoup.parser.h f421086d;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference<List<g>> f421087e;

    /* renamed from: f, reason: collision with root package name */
    public List<k> f421088f;

    /* renamed from: g, reason: collision with root package name */
    public org.jsoup.nodes.b f421089g;

    /* compiled from: Element.java */
    public class a implements org.jsoup.select.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f421090a;

        public a(StringBuilder sb2) {
            this.f421090a = sb2;
        }

        @Override // org.jsoup.select.f
        public final void a(k kVar, int i12) {
            if ((kVar instanceof g) && ((g) kVar).f421086d.f421237d && (kVar.u() instanceof n)) {
                StringBuilder sb2 = this.f421090a;
                if (n.P(sb2)) {
                    return;
                }
                sb2.append(' ');
            }
        }

        @Override // org.jsoup.select.f
        public final void b(k kVar, int i12) {
            boolean z12 = kVar instanceof n;
            StringBuilder sb2 = this.f421090a;
            if (z12) {
                n nVar = (n) kVar;
                List<k> list = g.f421084h;
                String strJ = nVar.J();
                if (g.Z(nVar.f421096b) || (nVar instanceof org.jsoup.nodes.c)) {
                    sb2.append(strJ);
                    return;
                } else {
                    C19693c.a(strJ, sb2, n.P(sb2));
                    return;
                }
            }
            if (kVar instanceof g) {
                g gVar = (g) kVar;
                if (sb2.length() > 0) {
                    org.jsoup.parser.h hVar = gVar.f421086d;
                    if ((hVar.f421237d || hVar.f421235b.equals("br")) && !n.P(sb2)) {
                        sb2.append(' ');
                    }
                }
            }
        }
    }

    /* compiled from: Element.java */
    public static final class c extends org.jsoup.helper.a<k> {

        /* renamed from: b, reason: collision with root package name */
        public final g f421092b;

        public c(g gVar, int i12) {
            super(i12);
            this.f421092b = gVar;
        }

        @Override // org.jsoup.helper.a
        public final void e() {
            this.f421092b.f421087e = null;
        }
    }

    static {
        Pattern.compile("\\s+");
        f421085i = "/baseUri";
    }

    public g(org.jsoup.parser.h hVar, String str, org.jsoup.nodes.b bVar) {
        org.jsoup.helper.d.d(hVar);
        this.f421088f = f421084h;
        this.f421089g = bVar;
        this.f421086d = hVar;
        if (str != null) {
            S(str);
        }
    }

    public static void J(g gVar, org.jsoup.select.c cVar) {
        g gVar2 = (g) gVar.f421096b;
        if (gVar2 == null || gVar2.f421086d.f421235b.equals("#root")) {
            return;
        }
        cVar.add(gVar2);
        J(gVar2, cVar);
    }

    public static boolean Z(k kVar) {
        if (kVar instanceof g) {
            g gVar = (g) kVar;
            int i12 = 0;
            while (!gVar.f421086d.f421241h) {
                gVar = (g) gVar.f421096b;
                i12++;
                if (i12 >= 6 || gVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // org.jsoup.nodes.k
    public final k A() {
        return (g) this.f421096b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.jsoup.nodes.k] */
    @Override // org.jsoup.nodes.k
    public final k H() {
        g gVar = this;
        while (true) {
            ?? r12 = gVar.f421096b;
            if (r12 == 0) {
                return gVar;
            }
            gVar = r12;
        }
    }

    @Override // org.jsoup.nodes.k
    public final void I(org.jsoup.select.f fVar) {
        org.jsoup.select.e.a(this, fVar);
    }

    public final void K(k kVar) {
        org.jsoup.helper.d.d(kVar);
        k kVar2 = kVar.f421096b;
        if (kVar2 != null) {
            kVar2.F(kVar);
        }
        kVar.f421096b = this;
        q();
        this.f421088f.add(kVar);
        kVar.f421097c = this.f421088f.size() - 1;
    }

    public final g L(String str) {
        g gVar = new g(org.jsoup.parser.h.a(str, l.a(this).f421227c), j(), null);
        K(gVar);
        return gVar;
    }

    public final void M(String str, String str2) {
        super.e(str, str2);
    }

    public final List<g> N() {
        List<g> list;
        WeakReference<List<g>> weakReference = this.f421087e;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f421088f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            k kVar = this.f421088f.get(i12);
            if (kVar instanceof g) {
                arrayList.add((g) kVar);
            }
        }
        this.f421087e = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final org.jsoup.select.c O() {
        return new org.jsoup.select.c(N());
    }

    public final int P() {
        return N().size();
    }

    @Override // org.jsoup.nodes.k
    /* renamed from: Q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g n() {
        return (g) super.n();
    }

    public final String R() {
        StringBuilder sbB = C19693c.b();
        for (k kVar : this.f421088f) {
            if (kVar instanceof e) {
                sbB.append(((e) kVar).J());
            } else if (kVar instanceof d) {
                sbB.append(((d) kVar).J());
            } else if (kVar instanceof g) {
                sbB.append(((g) kVar).R());
            } else if (kVar instanceof org.jsoup.nodes.c) {
                sbB.append(((org.jsoup.nodes.c) kVar).J());
            }
        }
        return C19693c.h(sbB);
    }

    public final void S(String str) {
        i().y(f421085i, str);
    }

    public final int T() {
        g gVar = (g) this.f421096b;
        if (gVar == null) {
            return 0;
        }
        List<g> listN = gVar.N();
        int size = listN.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (listN.get(i12) == this) {
                return i12;
            }
        }
        return 0;
    }

    public final String U() {
        StringBuilder sbB = C19693c.b();
        int size = this.f421088f.size();
        for (int i12 = 0; i12 < size; i12++) {
            k kVar = this.f421088f.get(i12);
            Document documentZ = kVar.z();
            if (documentZ == null) {
                documentZ = new Document("");
            }
            Document.OutputSettings outputSettings = documentZ.f421038j;
            k.a aVar = new k.a();
            aVar.f421098a = sbB;
            aVar.f421099b = outputSettings;
            outputSettings.e();
            org.jsoup.select.e.a(kVar, aVar);
        }
        String strH = C19693c.h(sbB);
        Document documentZ2 = z();
        if (documentZ2 == null) {
            documentZ2 = new Document("");
        }
        return documentZ2.f421038j.f421045f ? strH.trim() : strH;
    }

    public final void V(int i12, Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Children collection to be inserted must not be null.");
        }
        int size = this.f421088f.size();
        if (i12 < 0) {
            i12 += size + 1;
        }
        if (!(i12 >= 0 && i12 <= size)) {
            throw new IllegalArgumentException("Insert position out of bounds.");
        }
        b(i12, (k[]) new ArrayList(collection).toArray(new k[0]));
    }

    public final void W(int i12, k... kVarArr) {
        int size = this.f421088f.size();
        if (i12 < 0) {
            i12 += size + 1;
        }
        if (!(i12 >= 0 && i12 <= size)) {
            throw new IllegalArgumentException("Insert position out of bounds.");
        }
        b(i12, kVarArr);
    }

    public final String X() {
        StringBuilder sbB = C19693c.b();
        for (k kVar : this.f421088f) {
            if (kVar instanceof n) {
                n nVar = (n) kVar;
                String strJ = nVar.J();
                if (Z(nVar.f421096b) || (nVar instanceof org.jsoup.nodes.c)) {
                    sbB.append(strJ);
                } else {
                    C19693c.a(strJ, sbB, n.P(sbB));
                }
            } else if ((kVar instanceof g) && ((g) kVar).f421086d.f421235b.equals("br") && !n.P(sbB)) {
                sbB.append(" ");
            }
        }
        return C19693c.h(sbB).trim();
    }

    public final org.jsoup.select.c Y() {
        org.jsoup.select.c cVar = new org.jsoup.select.c();
        J(this, cVar);
        return cVar;
    }

    public final g a0() {
        k kVar = this.f421096b;
        if (kVar == null) {
            return null;
        }
        List<g> listN = ((g) kVar).N();
        int size = listN.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                break;
            }
            if (listN.get(i13) == this) {
                i12 = i13;
                break;
            }
            i13++;
        }
        if (i12 > 0) {
            return listN.get(i12 - 1);
        }
        return null;
    }

    public final void b0() {
        super.E();
    }

    public final String c0() {
        StringBuilder sbB = C19693c.b();
        org.jsoup.select.e.a(this, new a(sbB));
        return C19693c.h(sbB).trim();
    }

    public final List<n> d0() {
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.f421088f) {
            if (kVar instanceof n) {
                arrayList.add((n) kVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // org.jsoup.nodes.k
    public final void e(String str, String str2) {
        super.e("label", "split");
    }

    public final void e0(org.jsoup.select.f fVar) {
        super.I(fVar);
    }

    public final String f0() {
        StringBuilder sbB = C19693c.b();
        org.jsoup.select.e.a(this, new b(sbB));
        return C19693c.h(sbB);
    }

    @Override // org.jsoup.nodes.k
    public final org.jsoup.nodes.b i() {
        if (!s()) {
            this.f421089g = new org.jsoup.nodes.b();
        }
        return this.f421089g;
    }

    @Override // org.jsoup.nodes.k
    public final String j() {
        for (g gVar = this; gVar != null; gVar = (g) gVar.f421096b) {
            if (gVar.s()) {
                org.jsoup.nodes.b bVar = gVar.f421089g;
                String str = f421085i;
                if (bVar.t(str) != -1) {
                    return gVar.f421089g.l(str);
                }
            }
        }
        return "";
    }

    @Override // org.jsoup.nodes.k
    public final int l() {
        return this.f421088f.size();
    }

    @Override // org.jsoup.nodes.k
    public final k o(k kVar) {
        g gVar = (g) super.o(kVar);
        org.jsoup.nodes.b bVar = this.f421089g;
        gVar.f421089g = bVar != null ? bVar.clone() : null;
        c cVar = new c(gVar, this.f421088f.size());
        gVar.f421088f = cVar;
        cVar.addAll(this.f421088f);
        gVar.S(j());
        return gVar;
    }

    @Override // org.jsoup.nodes.k
    public final k p() {
        this.f421088f.clear();
        return this;
    }

    @Override // org.jsoup.nodes.k
    public final List<k> q() {
        if (this.f421088f == f421084h) {
            this.f421088f = new c(this, 4);
        }
        return this.f421088f;
    }

    @Override // org.jsoup.nodes.k
    public final boolean s() {
        return this.f421089g != null;
    }

    @Override // org.jsoup.nodes.k
    public String v() {
        return this.f421086d.f421235b;
    }

    @Override // org.jsoup.nodes.k
    public void x(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) throws IOException {
        boolean z12;
        g gVar;
        boolean z13 = outputSettings.f421045f;
        org.jsoup.parser.h hVar = this.f421086d;
        if (z13 && ((hVar.f421238e || ((gVar = (g) this.f421096b) != null && gVar.f421086d.f421238e)) && ((hVar.f421237d || hVar.f421239f || !((g) this.f421096b).f421086d.f421237d || B() == null) && (sb2 == null || sb2.length() > 0)))) {
            k.t(sb2, i12, outputSettings);
        }
        sb2.append('<').append(hVar.f421235b);
        org.jsoup.nodes.b bVar = this.f421089g;
        if (bVar != null) {
            bVar.s(sb2, outputSettings);
        }
        if (!this.f421088f.isEmpty() || (!(z12 = hVar.f421239f) && !hVar.f421240g)) {
            sb2.append('>');
        } else if (outputSettings.f421047h == Document.OutputSettings.Syntax.f421048b && z12) {
            sb2.append('>');
        } else {
            sb2.append(" />");
        }
    }

    @Override // org.jsoup.nodes.k
    public void y(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) throws IOException {
        boolean zIsEmpty = this.f421088f.isEmpty();
        org.jsoup.parser.h hVar = this.f421086d;
        if (zIsEmpty && (hVar.f421239f || hVar.f421240g)) {
            return;
        }
        if (outputSettings.f421045f && !this.f421088f.isEmpty() && hVar.f421238e) {
            k.t(sb2, i12, outputSettings);
        }
        sb2.append("</").append(hVar.f421235b).append('>');
    }

    public g(String str) {
        this(org.jsoup.parser.h.a(str, org.jsoup.parser.f.f421222d), "", null);
    }

    /* compiled from: Element.java */
    public class b implements org.jsoup.select.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f421091a;

        public b(StringBuilder sb2) {
            this.f421091a = sb2;
        }

        @Override // org.jsoup.select.f
        public final void b(k kVar, int i12) {
            if (kVar instanceof n) {
                this.f421091a.append(((n) kVar).J());
            }
        }

        @Override // org.jsoup.select.f
        public final void a(k kVar, int i12) {
        }
    }
}
