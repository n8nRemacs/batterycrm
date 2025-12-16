package com.avito.android.beduin.common.actionhandler;

import java.util.Map;

/* compiled from: BeduinSingleExposeActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class q1 implements dagger.internal.h<p1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f100365a;

    public q1(dagger.internal.u uVar) {
        this.f100365a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p1((Map) this.f100365a.get());
    }
}
