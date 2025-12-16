package bs0;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellersCarouselWidgetModule_ProvidesViewHolderBuilderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f57504a;

    public h(Provider<com.avito.konveyor.a> provider) {
        this.f57504a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f57504a.get();
        d.f57497a.getClass();
        return new C14699c(aVar);
    }
}
