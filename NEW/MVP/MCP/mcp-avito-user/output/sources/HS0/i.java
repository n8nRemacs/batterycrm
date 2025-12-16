package hs0;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerticalFilterModule_ProvideSearchAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f397438a;

    public i(dagger.internal.u uVar) {
        this.f397438a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f397438a.get();
        C40977a c40977a = C40977a.f397427a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
