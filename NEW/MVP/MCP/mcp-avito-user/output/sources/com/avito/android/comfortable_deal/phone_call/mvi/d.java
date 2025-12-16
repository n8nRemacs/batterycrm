package com.avito.android.comfortable_deal.phone_call.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneCallActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.l f122492a;

    public d(com.avito.android.comfortable_deal.repository.l lVar) {
        this.f122492a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.comfortable_deal.repository.a) this.f122492a.get());
    }
}
