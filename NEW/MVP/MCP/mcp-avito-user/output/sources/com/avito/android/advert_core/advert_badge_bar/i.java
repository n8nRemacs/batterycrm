package com.avito.android.advert_core.advert_badge_bar;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertBadgeBarPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f82729a;

    public i(u uVar) {
        this.f82729a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((InterfaceC28373a) this.f82729a.get());
    }
}
