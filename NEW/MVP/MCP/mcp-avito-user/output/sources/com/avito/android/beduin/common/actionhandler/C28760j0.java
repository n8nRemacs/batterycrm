package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import di.C39730b;
import javax.inject.Provider;

/* compiled from: BeduinOpenLinkActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.j0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28760j0 implements dagger.internal.h<C28758i0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f100261a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f100262b;

    /* renamed from: c, reason: collision with root package name */
    public final C39730b f100263c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f100264d;

    public C28760j0(Provider provider, dagger.internal.u uVar, C39730b c39730b, dagger.internal.l lVar) {
        this.f100261a = provider;
        this.f100262b = uVar;
        this.f100263c = c39730b;
        this.f100264d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28758i0(this.f100261a.get(), (InterfaceC15522a) this.f100262b.get(), (lj.c) this.f100263c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f100264d.f393949a);
    }
}
