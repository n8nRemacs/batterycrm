package org.commonmark.internal;

import Q61.AbstractC14868b;
import Q61.B;
import Q61.C14869c;
import Q61.v;
import Q61.x;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.commonmark.internal.c;
import org.commonmark.internal.i;
import org.commonmark.internal.j;
import org.commonmark.internal.k;
import org.commonmark.internal.l;
import org.commonmark.internal.p;
import org.commonmark.internal.t;

/* compiled from: DocumentParser.java */
/* loaded from: classes7.dex */
public class h implements R61.h {

    /* renamed from: p, reason: collision with root package name */
    public static final LinkedHashSet f420278p = new LinkedHashSet(Arrays.asList(C14869c.class, Q61.m.class, Q61.k.class, Q61.n.class, B.class, Q61.t.class, Q61.q.class));

    /* renamed from: q, reason: collision with root package name */
    public static final Map<Class<? extends AbstractC14868b>, R61.e> f420279q;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f420280a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f420283d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f420287h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f420288i;

    /* renamed from: j, reason: collision with root package name */
    public final org.commonmark.parser.c f420289j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f420290k;

    /* renamed from: l, reason: collision with root package name */
    public final g f420291l;

    /* renamed from: b, reason: collision with root package name */
    public int f420281b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f420282c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f420284e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f420285f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f420286g = 0;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f420292m = new LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f420293n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f420294o = new LinkedHashSet();

    /* compiled from: DocumentParser.java */
    public static class a implements R61.g {

        /* renamed from: a, reason: collision with root package name */
        public final R61.d f420295a;

        public a(R61.d dVar) {
            this.f420295a = dVar;
        }

        public final StringBuilder a() {
            R61.d dVar = this.f420295a;
            if (!(dVar instanceof r)) {
                return null;
            }
            StringBuilder sb2 = ((r) dVar).f420361b.f420334b;
            if (sb2.length() == 0) {
                return null;
            }
            return sb2;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(C14869c.class, new c.a());
        map.put(Q61.m.class, new j.a());
        map.put(Q61.k.class, new i.a());
        map.put(Q61.n.class, new k.b());
        map.put(B.class, new t.a());
        map.put(Q61.t.class, new p.a());
        map.put(Q61.q.class, new l.a());
        f420279q = Collections.unmodifiableMap(map);
    }

    public h(ArrayList arrayList, org.commonmark.parser.c cVar, ArrayList arrayList2) {
        this.f420288i = arrayList;
        this.f420289j = cVar;
        this.f420290k = arrayList2;
        g gVar = new g();
        this.f420291l = gVar;
        this.f420293n.add(gVar);
        this.f420294o.add(gVar);
    }

    public final void a(R61.d dVar) {
        while (!h().e(dVar.c())) {
            e(h());
        }
        h().c().b(dVar.c());
        this.f420293n.add(dVar);
        this.f420294o.add(dVar);
    }

    public final void b(r rVar) {
        o oVar = rVar.f420361b;
        oVar.a();
        Iterator it = oVar.f420335c.iterator();
        while (it.hasNext()) {
            Q61.s sVar = (Q61.s) it.next();
            x xVar = rVar.f420360a;
            xVar.getClass();
            sVar.f();
            v vVar = xVar.f13503d;
            sVar.f13503d = vVar;
            if (vVar != null) {
                vVar.f13504e = sVar;
            }
            sVar.f13504e = xVar;
            xVar.f13503d = sVar;
            v vVar2 = xVar.f13500a;
            sVar.f13500a = vVar2;
            if (sVar.f13503d == null) {
                vVar2.f13501b = sVar;
            }
            LinkedHashMap linkedHashMap = this.f420292m;
            String str = sVar.f13496f;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, sVar);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceSubSequence;
        if (this.f420283d) {
            int i12 = this.f420281b + 1;
            CharSequence charSequence = this.f420280a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i12, charSequence.length());
            int i13 = 4 - (this.f420282c % 4);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence2.length() + i13);
            for (int i14 = 0; i14 < i13; i14++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f420280a;
            charSequenceSubSequence = charSequence2.subSequence(this.f420281b, charSequence2.length());
        }
        h().d(charSequenceSubSequence);
    }

    public final void d() {
        if (this.f420280a.charAt(this.f420281b) != '\t') {
            this.f420281b++;
            this.f420282c++;
        } else {
            this.f420281b++;
            int i12 = this.f420282c;
            this.f420282c = (4 - (i12 % 4)) + i12;
        }
    }

    public final void e(R61.d dVar) {
        if (h() == dVar) {
            C22026a.e(1, this.f420293n);
        }
        if (dVar instanceof r) {
            b((r) dVar);
        }
        dVar.h();
    }

    public final void f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e((R61.d) arrayList.get(size));
        }
    }

    public final void g() {
        int i12 = this.f420281b;
        int i13 = this.f420282c;
        this.f420287h = true;
        int length = this.f420280a.length();
        while (true) {
            if (i12 >= length) {
                break;
            }
            char cCharAt = this.f420280a.charAt(i12);
            if (cCharAt == '\t') {
                i12++;
                i13 += 4 - (i13 % 4);
            } else if (cCharAt != ' ') {
                this.f420287h = false;
                break;
            } else {
                i12++;
                i13++;
            }
        }
        this.f420284e = i12;
        this.f420285f = i13;
        this.f420286g = i13 - this.f420282c;
    }

    public final R61.d h() {
        return (R61.d) androidx.appcompat.app.r.j(1, this.f420293n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        k(r10.f420284e);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.h.i(java.lang.String):void");
    }

    public final void j(int i12) {
        int i13;
        int i14 = this.f420285f;
        if (i12 >= i14) {
            this.f420281b = this.f420284e;
            this.f420282c = i14;
        }
        int length = this.f420280a.length();
        while (true) {
            i13 = this.f420282c;
            if (i13 >= i12 || this.f420281b == length) {
                break;
            } else {
                d();
            }
        }
        if (i13 <= i12) {
            this.f420283d = false;
            return;
        }
        this.f420281b--;
        this.f420282c = i12;
        this.f420283d = true;
    }

    public final void k(int i12) {
        int i13 = this.f420284e;
        if (i12 >= i13) {
            this.f420281b = i13;
            this.f420282c = this.f420285f;
        }
        int length = this.f420280a.length();
        while (true) {
            int i14 = this.f420281b;
            if (i14 >= i12 || i14 == length) {
                break;
            } else {
                d();
            }
        }
        this.f420283d = false;
    }
}
