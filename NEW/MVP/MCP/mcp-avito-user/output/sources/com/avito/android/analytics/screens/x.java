package com.avito.android.analytics.screens;

import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.w;
import javax.inject.Provider;

/* compiled from: ScreenTransferRecovery_Impl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class x implements dagger.internal.h<w.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f91012a;

    public x(Provider<InterfaceC28481c> provider) {
        this.f91012a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w.a(this.f91012a.get());
    }
}
