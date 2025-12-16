package Qo0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbcAutoDispatchesListAdapterModule_ProvideChannelsListAdapterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Qo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14918c implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C14917b f14012a;

    /* renamed from: b, reason: collision with root package name */
    public final u f14013b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f14014c;

    public C14918c(C14917b c14917b, u uVar, Provider provider) {
        this.f14012a = c14917b;
        this.f14013b = uVar;
        this.f14014c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f14013b.get();
        com.avito.konveyor.a aVar2 = this.f14014c.get();
        this.f14012a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
