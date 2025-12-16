package com.avito.android.loyalty.ui.badge_details_v3;

import bX.InterfaceC25576a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BadgeDetailsV3InteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25576a> f183295a;

    public h(Provider<InterfaceC25576a> provider) {
        this.f183295a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f183295a.get());
    }
}
