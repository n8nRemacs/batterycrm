package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import javax.inject.Provider;

/* compiled from: BeduinDefaultActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class L implements dagger.internal.h<K> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15522a> f100099a;

    public L(Provider<InterfaceC15522a> provider) {
        this.f100099a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K(this.f100099a.get());
    }
}
