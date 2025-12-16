package Zr0;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishModule_ProvideDestroyableViewHolderBuilder$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f20529a;

    public f(Provider<com.avito.konveyor.a> provider) {
        this.f20529a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f20529a.get();
        int i12 = d.f20527a;
        return new C14699c(aVar);
    }
}
