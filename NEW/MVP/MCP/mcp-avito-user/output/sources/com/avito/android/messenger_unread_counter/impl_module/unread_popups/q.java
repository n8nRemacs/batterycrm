package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import android.app.Application;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UnreadPopupsFirstFragmentListenerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f197803a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f197804b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f197805c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f197806d;

    public q(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f197803a = provider;
        this.f197804b = provider2;
        this.f197805c = lVar;
        this.f197806d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f197803a.get(), this.f197804b.get(), (Application) this.f197805c.f393949a, this.f197806d.get());
    }
}
