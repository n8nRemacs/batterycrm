package Wb0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertItemModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* renamed from: Wb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15741c implements h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f17977a;

    public C15741c(u uVar) {
        this.f17977a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f17977a.get();
        C15740b.f17976a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
