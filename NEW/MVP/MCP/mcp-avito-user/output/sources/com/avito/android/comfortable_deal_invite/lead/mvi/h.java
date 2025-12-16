package com.avito.android.comfortable_deal_invite.lead.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComfortableDealInviteActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f123705a;

    public h(u uVar) {
        this.f123705a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.comfortable_deal_invite.lead.interactor.a) this.f123705a.get());
    }
}
