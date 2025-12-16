package com.avito.android.home;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: PhoneCallLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f162531a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f162532b;

    public y(C30102l3 c30102l3, dagger.internal.f fVar) {
        this.f162531a = c30102l3;
        this.f162532b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((Context) this.f162531a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f162532b.get());
    }
}
