package com.avito.android.beduin.common.actionhandler;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: BeduinLogFirebaseEventActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class Z implements dagger.internal.h<Y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f100153a;

    public Z(Provider<InterfaceC28373a> provider) {
        this.f100153a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y(this.f100153a.get());
    }
}
