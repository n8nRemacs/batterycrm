package K4;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandingGalleryBlockModule_ProvideSafeRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<C14700d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f9252a;

    /* renamed from: b, reason: collision with root package name */
    public final u f9253b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f9254c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f9252a = provider;
        this.f9253b = uVar;
        this.f9254c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = this.f9252a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f9253b.get();
        C c12 = this.f9254c.get();
        d.f9248a.getClass();
        return new C14700d(hVar, interfaceC14698b, c12);
    }
}
