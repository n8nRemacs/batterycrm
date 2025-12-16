package jc0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectionsItemModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* renamed from: jc0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42356b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f405738a;

    public C42356b(u uVar) {
        this.f405738a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f405738a.get();
        int i12 = C42355a.f405737a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
