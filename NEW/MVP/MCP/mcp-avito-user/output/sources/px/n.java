package PX;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f13124a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f13125b;

    public n(u uVar, Provider provider) {
        this.f13124a = uVar;
        this.f13125b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f13124a.get();
        com.avito.konveyor.a aVar2 = this.f13125b.get();
        i.f13113a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
