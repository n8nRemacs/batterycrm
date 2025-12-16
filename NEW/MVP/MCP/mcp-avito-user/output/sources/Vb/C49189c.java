package vB;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarouselItemModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* renamed from: vB.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49189c implements h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f440515a;

    public C49189c(u uVar) {
        this.f440515a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f440515a.get();
        C49188b.f440514a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
