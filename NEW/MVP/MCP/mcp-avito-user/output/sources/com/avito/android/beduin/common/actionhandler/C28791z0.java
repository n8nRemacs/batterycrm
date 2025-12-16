package com.avito.android.beduin.common.actionhandler;

import Hr.InterfaceC14024a;
import di.C39730b;
import javax.inject.Provider;

/* compiled from: BeduinOpenUniversalPageV2ActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.z0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28791z0 implements dagger.internal.h<C28789y0> {

    /* renamed from: a, reason: collision with root package name */
    public final C39730b f100526a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f100527b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14024a> f100528c;

    public C28791z0(C39730b c39730b, dagger.internal.u uVar, Provider provider) {
        this.f100526a = c39730b;
        this.f100527b = uVar;
        this.f100528c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28789y0((lj.c) this.f100526a.get(), (C28743d0) this.f100527b.get(), this.f100528c.get());
    }
}
