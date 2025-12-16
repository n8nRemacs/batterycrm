package dA0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessBlueprintsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: dA0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39549b implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f393715a;

    public C39549b(u uVar) {
        this.f393715a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f393715a.get();
        C39548a.f393714a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
