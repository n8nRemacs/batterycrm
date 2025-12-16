package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import javax.inject.Provider;

/* compiled from: BeduinShowAlertHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class l1 implements dagger.internal.h<k1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15522a> f100277a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100278b;

    public l1(dagger.internal.f fVar, Provider provider) {
        this.f100277a = provider;
        this.f100278b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k1(this.f100277a.get(), dagger.internal.g.a(dagger.internal.w.a(this.f100278b)));
    }
}
