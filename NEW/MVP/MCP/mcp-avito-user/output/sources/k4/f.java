package K4;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandingGalleryBlockModule_ProvideDestroyableViewHolderBuilderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f9250a;

    public f(Provider<com.avito.konveyor.a> provider) {
        this.f9250a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f9250a.get();
        d.f9248a.getClass();
        return new C14699c(aVar);
    }
}
