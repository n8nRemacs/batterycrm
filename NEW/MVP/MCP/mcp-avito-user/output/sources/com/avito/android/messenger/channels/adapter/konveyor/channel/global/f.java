package com.avito.android.messenger.channels.adapter.konveyor.channel.global;

import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChannelItemPresenterGlobal_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f186865a;

    public f(l lVar) {
        this.f186865a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.a(w.a(this.f186865a)));
    }
}
