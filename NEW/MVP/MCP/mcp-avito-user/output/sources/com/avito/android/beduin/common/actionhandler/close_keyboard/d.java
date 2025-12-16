package com.avito.android.beduin.common.actionhandler.close_keyboard;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinCloseKeyboardScreenConnector_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f100197a;

    public d(Provider<a> provider) {
        this.f100197a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f100197a.get());
    }
}
