package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import javax.inject.Provider;
import lj.InterfaceC43780b;

/* compiled from: BeduinShowFiltersActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class o1 implements dagger.internal.h<n1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15522a> f100296a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC43780b> f100297b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f100298c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f100299d;

    public o1(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f100296a = provider;
        this.f100297b = provider2;
        this.f100298c = fVar;
        this.f100299d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n1(this.f100296a.get(), this.f100297b.get(), dagger.internal.g.b(this.f100298c), (com.avito.android.deeplink_handler.handler.composite.a) this.f100299d.f393949a);
    }
}
