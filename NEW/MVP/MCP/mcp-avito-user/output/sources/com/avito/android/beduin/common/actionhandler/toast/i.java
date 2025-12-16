package com.avito.android.beduin.common.actionhandler.toast;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinToastScreenConnector_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final g f100439a;

    public i(g gVar) {
        this.f100439a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((c) this.f100439a.get());
    }
}
