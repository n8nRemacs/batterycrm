package com.avito.android.publish.price_list.domain.use_case;

import com.avito.android.Q1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ue0.InterfaceC49043a;

/* compiled from: SplUpdateContentUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Boolean> f238606a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.domain.c> f238607b;

    /* renamed from: c, reason: collision with root package name */
    public final u f238608c;

    /* renamed from: d, reason: collision with root package name */
    public final j f238609d;

    /* renamed from: e, reason: collision with root package name */
    public final h f238610e;

    /* renamed from: f, reason: collision with root package name */
    public final n f238611f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Q1> f238612g;

    public p(Provider provider, Provider provider2, u uVar, j jVar, h hVar, n nVar, Provider provider3) {
        this.f238606a = provider;
        this.f238607b = provider2;
        this.f238608c = uVar;
        this.f238609d = jVar;
        this.f238610e = hVar;
        this.f238611f = nVar;
        this.f238612g = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = this.f238606a.get().booleanValue();
        com.avito.android.publish.price_list.domain.c cVar = this.f238607b.get();
        InterfaceC49043a interfaceC49043a = (InterfaceC49043a) this.f238608c.get();
        this.f238609d.getClass();
        return new o(zBooleanValue, cVar, interfaceC49043a, new i(), (g) this.f238610e.get(), (m) this.f238611f.get(), this.f238612g.get());
    }
}
