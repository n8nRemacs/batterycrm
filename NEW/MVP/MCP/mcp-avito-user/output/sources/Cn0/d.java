package Cn0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReasonDetailsBlueprintsModule_ProvideListRecyclerAdapter$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C13330a f2676a;

    /* renamed from: b, reason: collision with root package name */
    public final u f2677b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f2678c;

    public d(C13330a c13330a, u uVar, Provider provider) {
        this.f2676a = c13330a;
        this.f2677b = uVar;
        this.f2678c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f2677b.get();
        com.avito.konveyor.a aVar2 = this.f2678c.get();
        this.f2676a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
