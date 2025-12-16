package com.avito.android.messenger.search.adapter.supportchannel;

import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SupportChannelItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f197064a;

    public d(u uVar) {
        this.f197064a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.a(w.a(this.f197064a)));
    }
}
