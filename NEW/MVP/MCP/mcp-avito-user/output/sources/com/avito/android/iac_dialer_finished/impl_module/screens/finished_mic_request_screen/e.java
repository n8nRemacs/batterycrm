package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen;

import android.content.res.Resources;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedMicRequestScreenPermissionsRequesterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f166750a;

    /* renamed from: b, reason: collision with root package name */
    public final l f166751b;

    public e(l lVar, Provider provider) {
        this.f166750a = provider;
        this.f166751b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f166750a.get(), (Resources) this.f166751b.f393949a);
    }
}
