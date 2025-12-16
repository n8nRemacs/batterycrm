package com.avito.beduin.v2.engine.core.manager;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.M;
import com.avito.beduin.v2.engine.core.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DependenciesManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/manager/e;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f336664a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Set<? extends N.a> f336665b;

    public e(@k M m12) {
        this.f336664a = m12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.avito.beduin.v2.engine.core.M, java.lang.Object] */
    public final void a(@l Set<? extends N> set) {
        Set<? extends N.a> setP0;
        Set<? extends N.a> set2 = this.f336665b;
        if (set != null) {
            Set<? extends N> set3 = set;
            ArrayList arrayList = new ArrayList(C42745f0.q(set3, 10));
            Iterator<T> it = set3.iterator();
            while (it.hasNext()) {
                arrayList.add(((N) it.next()).f(this.f336664a, false));
            }
            setP0 = C42745f0.P0(arrayList);
        } else {
            setP0 = null;
        }
        if (set2 != null) {
            for (N.a aVar : set2) {
                if (setP0 == null || !setP0.contains(aVar)) {
                    aVar.dispose();
                }
            }
        }
        this.f336665b = setP0;
    }

    public final void b() {
        Set<? extends N.a> set = this.f336665b;
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ((N.a) it.next()).dispose();
            }
        }
        this.f336665b = null;
    }
}
