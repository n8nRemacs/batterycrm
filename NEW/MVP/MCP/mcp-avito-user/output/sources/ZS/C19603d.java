package Zs;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmApplicationsListModule_ProvideRecyclerAdapterFactory.java */
@e
@y
@x
/* renamed from: Zs.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C19603d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f20545a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f20546b;

    public C19603d(u uVar, Provider provider) {
        this.f20545a = uVar;
        this.f20546b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f20545a.get();
        com.avito.konveyor.a aVar2 = this.f20546b.get();
        C19600a.f20539a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
