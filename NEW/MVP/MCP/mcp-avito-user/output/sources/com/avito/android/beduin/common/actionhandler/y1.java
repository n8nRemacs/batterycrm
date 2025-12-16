package com.avito.android.beduin.common.actionhandler;

/* compiled from: BeduinToggleFavoriteStatusActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class y1 implements dagger.internal.h<x1> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.favorite.m f100522a;

    public y1(com.avito.android.favorite.m mVar) {
        this.f100522a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x1((com.avito.android.favorite.h) this.f100522a.get());
    }
}
