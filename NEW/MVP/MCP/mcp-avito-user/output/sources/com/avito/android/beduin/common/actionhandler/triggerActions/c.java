package com.avito.android.beduin.common.actionhandler.triggerActions;

import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinTriggerActionsActionHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100471a;

    /* renamed from: b, reason: collision with root package name */
    public final f f100472b;

    public c(f fVar, Provider provider) {
        this.f100471a = provider;
        this.f100472b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f100471a.get(), g.b(this.f100472b));
    }
}
