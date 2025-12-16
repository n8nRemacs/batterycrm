package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: NotificationBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class S implements dagger.internal.h<NotificationBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165240a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165241b;

    public S(dagger.internal.u uVar, Provider provider) {
        this.f165240a = uVar;
        this.f165241b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new NotificationBootstrap((com.avito.android.iac_dialer.impl_module.notifications.new_impl.e) this.f165240a.get(), this.f165241b.get());
    }
}
