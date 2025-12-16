package com.avito.android.beduin.common.actionhandler.option_selector;

import Ui.InterfaceC15522a;
import dagger.internal.x;
import dagger.internal.y;
import di.C39730b;
import javax.inject.Provider;

/* compiled from: OpenOptionSelectorActionHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15522a> f100320a;

    /* renamed from: b, reason: collision with root package name */
    public final C39730b f100321b;

    /* renamed from: c, reason: collision with root package name */
    public final o f100322c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f100323d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100324e;

    public j(Provider provider, C39730b c39730b, o oVar, dagger.internal.f fVar, Provider provider2) {
        this.f100320a = provider;
        this.f100321b = c39730b;
        this.f100322c = oVar;
        this.f100323d = fVar;
        this.f100324e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC15522a interfaceC15522a = this.f100320a.get();
        lj.c cVar = (lj.c) this.f100321b.get();
        this.f100322c.getClass();
        return new i(interfaceC15522a, cVar, new m(), dagger.internal.g.b(this.f100323d), this.f100324e.get());
    }
}
