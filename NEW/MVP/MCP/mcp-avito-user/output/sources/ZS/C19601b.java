package Zs;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmApplicationsListModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* renamed from: Zs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C19601b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f20540a;

    public C19601b(u uVar) {
        this.f20540a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f20540a.get();
        C19600a.f20539a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
