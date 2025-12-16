package bs0;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellersCarouselWidgetModule_ProvidesSellerCarouselRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<C14700d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f57501a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f57502b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f57503c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f57501a = uVar;
        this.f57502b = provider;
        this.f57503c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f57501a.get();
        com.avito.konveyor.adapter.h hVar = this.f57502b.get();
        C c12 = this.f57503c.get();
        d.f57497a.getClass();
        return new C14700d(hVar, interfaceC14698b, c12);
    }
}
