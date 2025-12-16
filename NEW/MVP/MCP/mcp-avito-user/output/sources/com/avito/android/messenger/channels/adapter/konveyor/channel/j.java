package com.avito.android.messenger.channels.adapter.konveyor.channel;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChannelItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f186876a;

    /* renamed from: b, reason: collision with root package name */
    public final u f186877b;

    public j(dagger.internal.l lVar, u uVar) {
        this.f186876a = lVar;
        this.f186877b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f186876a), (com.avito.android.messenger.channels.adapter.konveyor.common.swipable.b) this.f186877b.get());
    }
}
