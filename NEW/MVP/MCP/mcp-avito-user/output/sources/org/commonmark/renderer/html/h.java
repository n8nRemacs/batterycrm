package org.commonmark.renderer.html;

import Q61.A;
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
import Q61.u;
import Q61.v;
import Q61.w;
import Q61.x;
import Q61.y;
import Q61.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: HtmlRenderer.java */
/* loaded from: classes7.dex */
public class h implements T61.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f420383a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f420384b;

    /* compiled from: HtmlRenderer.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f420385a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f420386b = new ArrayList();
    }

    /* compiled from: HtmlRenderer.java */
    public interface b extends M61.a {
    }

    /* compiled from: HtmlRenderer.java */
    public class c implements e, org.commonmark.renderer.html.b {

        /* renamed from: a, reason: collision with root package name */
        public final i f420387a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f420388b;

        /* renamed from: c, reason: collision with root package name */
        public final O61.a f420389c = new O61.a();

        public c(i iVar, g gVar) {
            this.f420387a = iVar;
            this.f420388b = new ArrayList(h.this.f420383a.size());
            Iterator it = h.this.f420383a.iterator();
            while (it.hasNext()) {
                this.f420388b.add(((org.commonmark.renderer.html.c) it.next()).create());
            }
            ArrayList arrayList = h.this.f420384b;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVarA = ((f) arrayList.get(size)).a(this);
                O61.a aVar = this.f420389c;
                aVar.getClass();
                dVarA.getClass();
                Iterator it2 = new HashSet(Arrays.asList(Q61.i.class, m.class, x.class, C14869c.class, Q61.d.class, k.class, n.class, B.class, q.class, r.class, u.class, w.class, p.class, j.class, z.class, A.class, Q61.e.class, o.class, y.class, l.class)).iterator();
                while (it2.hasNext()) {
                    aVar.f12009a.put((Class) it2.next(), dVarA);
                }
            }
        }

        public final LinkedHashMap a(v vVar, String str, Map map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Iterator it = this.f420388b.iterator();
            while (it.hasNext()) {
                ((org.commonmark.renderer.html.a) it.next()).a();
            }
            return linkedHashMap;
        }

        public final void b() {
            h.this.getClass();
        }
    }

    public h(a aVar, g gVar) {
        aVar.getClass();
        this.f420383a = new ArrayList(aVar.f420385a);
        ArrayList arrayList = aVar.f420386b;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        this.f420384b = arrayList2;
        arrayList2.addAll(arrayList);
        arrayList2.add(new g());
    }
}
