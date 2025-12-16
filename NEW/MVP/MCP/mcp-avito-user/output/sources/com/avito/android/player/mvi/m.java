package com.avito.android.player.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlayerReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f220207a;

    /* renamed from: b, reason: collision with root package name */
    public final u f220208b;

    public m(u uVar, u uVar2) {
        this.f220207a = uVar;
        this.f220208b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((F80.a) this.f220207a.get(), (com.avito.android.connection_quality.connectivity.a) this.f220208b.get());
    }
}
