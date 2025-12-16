package com.avito.android.beduin.common.actionhandler.apply_haptic;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinApplyHapticScreenConnector_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f100177a;

    public d(Provider<a> provider) {
        this.f100177a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f100177a.get());
    }
}
