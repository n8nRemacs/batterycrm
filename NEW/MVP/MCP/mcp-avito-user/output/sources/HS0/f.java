package hs0;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterModule_ProvideDestroyableViewHolderBuilder$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f397432a;

    public f(Provider<com.avito.konveyor.a> provider) {
        this.f397432a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f397432a.get();
        C40977a c40977a = C40977a.f397427a;
        return new C14699c(aVar);
    }
}
