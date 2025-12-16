package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;
import kotlin.InterfaceC49066a;

/* compiled from: BeduinSendActionsToFormActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class X0 implements dagger.internal.h<W0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100146a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49066a> f100147b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f100148c;

    public X0(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f100146a = provider;
        this.f100147b = provider2;
        this.f100148c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W0(this.f100146a.get(), this.f100147b.get(), dagger.internal.g.b(this.f100148c));
    }
}
