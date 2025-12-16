package com.avito.android.beduin.common.actionhandler;

import di.C39730b;

/* compiled from: BeduinOpenUniversalPageActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.x0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28787x0 implements dagger.internal.h<C28785w0> {

    /* renamed from: a, reason: collision with root package name */
    public final C39730b f100513a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f100514b;

    public C28787x0(C39730b c39730b, dagger.internal.u uVar) {
        this.f100513a = c39730b;
        this.f100514b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28785w0((lj.c) this.f100513a.get(), (C28743d0) this.f100514b.get());
    }
}
