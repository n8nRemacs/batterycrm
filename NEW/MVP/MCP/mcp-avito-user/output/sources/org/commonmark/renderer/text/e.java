package org.commonmark.renderer.text;

import Q61.A;
import Q61.B;
import Q61.C14869c;
import Q61.i;
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
import Q61.w;
import Q61.x;
import Q61.y;
import Q61.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: TextContentRenderer.java */
/* loaded from: classes7.dex */
public class e implements T61.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f420395a;

    /* compiled from: TextContentRenderer.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f420396a = new ArrayList();
    }

    /* compiled from: TextContentRenderer.java */
    public class b implements org.commonmark.renderer.text.b {

        /* renamed from: a, reason: collision with root package name */
        public final f f420397a;

        /* renamed from: b, reason: collision with root package name */
        public final O61.a f420398b = new O61.a();

        public b(f fVar, d dVar) {
            this.f420397a = fVar;
            for (int size = e.this.f420395a.size() - 1; size >= 0; size--) {
                org.commonmark.renderer.text.a aVarA = ((org.commonmark.renderer.text.c) e.this.f420395a.get(size)).a(this);
                O61.a aVar = this.f420398b;
                aVar.getClass();
                aVarA.getClass();
                Iterator it = new HashSet(Arrays.asList(i.class, m.class, x.class, C14869c.class, Q61.d.class, k.class, n.class, B.class, q.class, r.class, u.class, w.class, p.class, j.class, z.class, A.class, Q61.e.class, o.class, y.class, l.class)).iterator();
                while (it.hasNext()) {
                    aVar.f12009a.put((Class) it.next(), aVarA);
                }
            }
        }

        public final void a() {
            e.this.getClass();
        }
    }

    /* compiled from: TextContentRenderer.java */
    public interface c extends M61.a {
    }

    public e(a aVar, d dVar) {
        aVar.getClass();
        ArrayList arrayList = aVar.f420396a;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        this.f420395a = arrayList2;
        arrayList2.addAll(arrayList);
        arrayList2.add(new d());
    }
}
