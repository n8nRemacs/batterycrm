package com.avito.android.messenger.conversation.mvi.quick_replies.adapter;

import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: QuickReplyItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f194089a;

    public h(u uVar) {
        this.f194089a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.a(w.a(this.f194089a)));
    }
}
