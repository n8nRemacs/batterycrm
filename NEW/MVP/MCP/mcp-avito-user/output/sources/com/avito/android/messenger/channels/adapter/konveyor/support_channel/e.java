package com.avito.android.messenger.channels.adapter.konveyor.support_channel;

import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SupportChannelItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f187049a;

    public e(l lVar) {
        this.f187049a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.a(w.a(this.f187049a)));
    }
}
