package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: MemberScopeImpl.kt */
@s0
/* loaded from: classes8.dex */
public abstract class k implements j {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        Collection<InterfaceC42882k> collectionE = e(d.f409666o, kotlin.reflect.jvm.internal.impl.utils.e.f410353a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof a0) {
                linkedHashSet.add(((a0) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        Collection<InterfaceC42882k> collectionE = e(d.f409667p, kotlin.reflect.jvm.internal.impl.utils.e.f410353a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof a0) {
                linkedHashSet.add(((a0) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Collection<? extends a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public Collection<InterfaceC42882k> e(@Y61.k d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return null;
    }
}
