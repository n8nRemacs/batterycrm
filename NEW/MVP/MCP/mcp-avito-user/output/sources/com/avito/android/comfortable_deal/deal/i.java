package com.avito.android.comfortable_deal.deal;

import com.avito.android.comfortable_deal.deal.mvi.A;
import com.avito.android.comfortable_deal.deal.mvi.z;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final A f121087a;

    public i(A a12) {
        this.f121087a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((z) this.f121087a.get(), null, 2, null);
    }
}
