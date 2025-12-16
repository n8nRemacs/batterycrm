package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: AbstractScopeAdapter.kt */
/* loaded from: classes8.dex */
public abstract class a implements j {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        return i().a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return i().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return i().c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return i().d(fVar, interfaceC41228b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public Collection<InterfaceC42882k> e(@Y61.k d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return i().e(dVar, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        return i().f(fVar, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return i().g(fVar, interfaceC41228b);
    }

    @Y61.k
    public final j h() {
        return i() instanceof a ? ((a) i()).h() : i();
    }

    @Y61.k
    public abstract j i();
}
