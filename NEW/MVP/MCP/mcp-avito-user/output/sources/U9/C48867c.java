package u9;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDiscountDetailsModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* renamed from: u9.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48867c implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f439819a;

    public C48867c(Provider<com.avito.konveyor.a> provider) {
        this.f439819a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f439819a.get();
        int i12 = C48865a.f439816a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
