package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;
import mj.InterfaceC44087a;

/* compiled from: BeduinConditionalActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28790z implements dagger.internal.h<C28788y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100523a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100524b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC44087a> f100525c;

    public C28790z(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider) {
        this.f100523a = fVar;
        this.f100524b = fVar2;
        this.f100525c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28788y(dagger.internal.g.b(this.f100523a), dagger.internal.g.b(this.f100524b), dagger.internal.g.b(this.f100525c));
    }
}
