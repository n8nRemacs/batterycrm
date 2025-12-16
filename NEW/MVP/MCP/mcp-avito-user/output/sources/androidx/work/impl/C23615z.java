package androidx.work.impl;

import androidx.work.impl.model.C23580w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StartStopToken.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/z;", "Landroidx/work/impl/y;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23615z implements InterfaceC23614y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f56087b = new LinkedHashMap();

    @Override // androidx.work.impl.InterfaceC23614y
    @Y61.l
    public final C23613x a(@Y61.k C23580w c23580w) {
        return (C23613x) this.f56087b.remove(c23580w);
    }

    @Override // androidx.work.impl.InterfaceC23614y
    public final boolean c(@Y61.k C23580w c23580w) {
        return this.f56087b.containsKey(c23580w);
    }

    @Override // androidx.work.impl.InterfaceC23614y
    @Y61.k
    public final C23613x d(@Y61.k C23580w c23580w) {
        LinkedHashMap linkedHashMap = this.f56087b;
        Object c23613x = linkedHashMap.get(c23580w);
        if (c23613x == null) {
            c23613x = new C23613x(c23580w);
            linkedHashMap.put(c23580w, c23613x);
        }
        return (C23613x) c23613x;
    }

    @Override // androidx.work.impl.InterfaceC23614y
    @Y61.k
    public final List<C23613x> remove(@Y61.k String str) {
        LinkedHashMap linkedHashMap = this.f56087b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (kotlin.jvm.internal.L.f(((C23580w) entry.getKey()).f55889a, str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((C23580w) it.next());
        }
        return C42745f0.M0(linkedHashMap2.values());
    }
}
