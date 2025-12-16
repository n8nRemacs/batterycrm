package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update;

import com.avito.android.InterfaceC32900o;
import com.avito.android.permissions.w;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import jg0.InterfaceC42375a;
import mM.InterfaceC43981a;
import pM.InterfaceC46977a;

/* compiled from: IacDeviceAvailabilityUpdaterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_incoming_call_ability.impl_module.api.a> f168368a;

    /* renamed from: b, reason: collision with root package name */
    public final m f168369b;

    /* renamed from: c, reason: collision with root package name */
    public final w f168370c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC42375a> f168371d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168372e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC32900o> f168373f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC46977a> f168374g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a> f168375h;

    /* renamed from: i, reason: collision with root package name */
    public final u f168376i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<Gson> f168377j;

    public h(Provider provider, m mVar, w wVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, u uVar, Provider provider7) {
        this.f168368a = provider;
        this.f168369b = mVar;
        this.f168370c = wVar;
        this.f168371d = provider2;
        this.f168372e = provider3;
        this.f168373f = provider4;
        this.f168374g = provider5;
        this.f168375h = provider6;
        this.f168376i = uVar;
        this.f168377j = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f168368a.get(), (k) this.f168369b.get(), (com.avito.android.permissions.u) this.f168370c.get(), this.f168371d.get(), this.f168372e.get(), this.f168373f.get(), this.f168374g.get(), this.f168375h.get(), (InterfaceC43981a) this.f168376i.get(), dagger.internal.g.b(this.f168377j));
    }
}
