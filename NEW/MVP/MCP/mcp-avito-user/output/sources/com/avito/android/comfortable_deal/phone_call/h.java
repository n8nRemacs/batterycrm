package com.avito.android.comfortable_deal.phone_call;

import com.avito.android.comfortable_deal.phone_call.mvi.i;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneCallViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final i f122476a;

    public h(i iVar) {
        this.f122476a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.comfortable_deal.phone_call.mvi.h) this.f122476a.get(), null, 2, null);
    }
}
