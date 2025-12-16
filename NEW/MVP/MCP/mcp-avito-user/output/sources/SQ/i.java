package Sq;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComparisonItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f15161a;

    /* renamed from: b, reason: collision with root package name */
    public final u f15162b;

    public i(u uVar, Provider provider) {
        this.f15161a = provider;
        this.f15162b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f15161a.get(), (InterfaceC15213a) this.f15162b.get());
    }
}
