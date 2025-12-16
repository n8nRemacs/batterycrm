package com.avito.android.beduin.common.actionhandler;

import di.C39730b;
import javax.inject.Provider;

/* compiled from: BeduinStoreParametersActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class s1 implements dagger.internal.h<r1> {

    /* renamed from: a, reason: collision with root package name */
    public final C39730b f100380a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.storage.d> f100381b;

    public s1(C39730b c39730b, Provider provider) {
        this.f100380a = c39730b;
        this.f100381b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r1((lj.c) this.f100380a.get(), this.f100381b.get());
    }
}
