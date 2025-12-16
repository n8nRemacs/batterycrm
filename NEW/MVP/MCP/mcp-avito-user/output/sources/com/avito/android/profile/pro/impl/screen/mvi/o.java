package com.avito.android.profile.pro.impl.screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileProReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final v90.g f223727a;

    public o(v90.g gVar) {
        this.f223727a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((v90.e) this.f223727a.get());
    }
}
