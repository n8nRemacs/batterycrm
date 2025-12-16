package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import di.C39730b;
import gF.InterfaceC40577a;
import javax.inject.Provider;

/* compiled from: BeduinOpenGalleryActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.h0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28755h0 implements dagger.internal.h<C28749f0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40577a> f100247a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC15522a> f100248b;

    /* renamed from: c, reason: collision with root package name */
    public final C39730b f100249c;

    public C28755h0(Provider provider, Provider provider2, C39730b c39730b) {
        this.f100247a = provider;
        this.f100248b = provider2;
        this.f100249c = c39730b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28749f0(this.f100247a.get(), this.f100248b.get(), (lj.c) this.f100249c.get());
    }
}
