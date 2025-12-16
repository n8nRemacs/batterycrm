package com.avito.beduin.v2.engine.core.manager;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.M;
import com.avito.beduin.v2.engine.core.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ReadersManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/manager/f;", "Lcom/avito/beduin/v2/engine/core/manager/i;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f336666a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f336667b = new g();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f336668c = new g();

    public f(@k N n12) {
        this.f336666a = n12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.beduin.v2.engine.core.N, java.lang.Object] */
    @Override // com.avito.beduin.v2.engine.core.manager.i
    @k
    public final N.a a(@k M m12, boolean z12) {
        g gVar = z12 ? this.f336668c : this.f336667b;
        gVar.getClass();
        List list = (List) gVar.f336669a.get(Integer.valueOf(m12.hashCode()));
        N.a cVar = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                N.a aVar = (N.a) next;
                if (!aVar.getF336603c() && L.f(aVar.getF336602b(), m12)) {
                    cVar = next;
                    break;
                }
            }
            cVar = cVar;
        }
        if (cVar == null) {
            cVar = new N.c(this.f336666a, m12);
            int iHashCode = m12.hashCode();
            LinkedHashMap linkedHashMap = gVar.f336669a;
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(cVar);
        }
        return cVar;
    }

    @Override // com.avito.beduin.v2.engine.core.manager.i
    public final void b() {
        g gVar = this.f336667b;
        ArrayList arrayListA = gVar.a();
        gVar.f336669a.clear();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((N.a) it.next()).a();
        }
        g gVar2 = this.f336668c;
        ArrayList arrayListA2 = gVar2.a();
        gVar2.f336669a.clear();
        Iterator it2 = arrayListA2.iterator();
        while (it2.hasNext()) {
            ((N.a) it2.next()).a();
        }
    }

    @Override // com.avito.beduin.v2.engine.core.manager.i
    public final void c(@k M m12) {
        this.f336667b.b(m12);
        this.f336668c.b(m12);
    }

    @Override // com.avito.beduin.v2.engine.core.manager.i
    public final void d(@k l<? super M, G0> lVar) {
        for (N.a aVar : this.f336667b.a()) {
            if (!aVar.getF336603c()) {
                aVar.getF336602b().e(lVar);
            }
        }
        for (N.a aVar2 : this.f336668c.a()) {
            if (!aVar2.getF336603c()) {
                lVar.invoke(aVar2.getF336602b());
            }
        }
    }
}
