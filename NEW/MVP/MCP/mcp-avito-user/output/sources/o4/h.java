package O4;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandingAdvantagesBlockModule_ProvideSafeRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<C14700d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f11955a;

    /* renamed from: b, reason: collision with root package name */
    public final u f11956b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f11957c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f11955a = provider;
        this.f11956b = uVar;
        this.f11957c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = this.f11955a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f11956b.get();
        C c12 = this.f11957c.get();
        d.f11951a.getClass();
        return new C14700d(hVar, interfaceC14698b, c12);
    }
}
