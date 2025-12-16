package com.avito.android.publish.details;

import com.avito.android.publish.analytics.InterfaceC33535v;
import javax.inject.Provider;

/* compiled from: PublishDetailsSlotManager_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.v1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33797v1 implements dagger.internal.h<C33794u1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.y> f235075a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f235076b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f235077c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f235078d;

    public C33797v1(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider, Provider provider2) {
        this.f235075a = provider;
        this.f235076b = uVar;
        this.f235077c = uVar2;
        this.f235078d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33794u1(this.f235075a.get(), (InterfaceC33800w1) this.f235076b.get(), (InterfaceC33535v) this.f235077c.get(), dagger.internal.g.b(this.f235078d));
    }
}
