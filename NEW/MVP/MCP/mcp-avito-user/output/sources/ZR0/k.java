package Zr0;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishModule_ProvideSafeRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<C14700d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f20535a;

    /* renamed from: b, reason: collision with root package name */
    public final u f20536b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f20537c;

    public k(u uVar, Provider provider, Provider provider2) {
        this.f20535a = provider;
        this.f20536b = uVar;
        this.f20537c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f20535a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f20536b.get();
        C c12 = this.f20537c.get();
        int i12 = d.f20527a;
        return new C14700d(aVar, interfaceC14698b, c12);
    }
}
