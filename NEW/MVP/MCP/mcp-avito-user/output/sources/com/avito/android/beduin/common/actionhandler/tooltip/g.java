package com.avito.android.beduin.common.actionhandler.tooltip;

import Ui.InterfaceC15523b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinTooltipObserverImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100464a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f100465b;

    public g(dagger.internal.f fVar, Provider provider) {
        this.f100464a = fVar;
        this.f100465b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC15523b) this.f100464a.get(), this.f100465b.get());
    }
}
