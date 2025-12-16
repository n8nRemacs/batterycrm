package com.avito.android.beduin.common.actionhandler;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: BeduinLogAdjustEventActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f100134a;

    public U(Provider<InterfaceC28373a> provider) {
        this.f100134a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new T(this.f100134a.get());
    }
}
