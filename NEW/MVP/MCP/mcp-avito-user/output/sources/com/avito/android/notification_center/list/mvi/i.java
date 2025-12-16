package com.avito.android.notification_center.list.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.remote.notification.InterfaceC34350q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationCenterActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f207699a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.list.j> f207700b;

    /* renamed from: c, reason: collision with root package name */
    public final u f207701c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34350q> f207702d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.push.b> f207703e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.counter.b> f207704f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.counter.h> f207705g;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f207699a = provider;
        this.f207700b = provider2;
        this.f207701c = uVar;
        this.f207702d = provider3;
        this.f207703e = provider4;
        this.f207704f = provider5;
        this.f207705g = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f207699a.get(), this.f207700b.get(), (AbstractC33302a) this.f207701c.get(), this.f207702d.get(), this.f207703e.get(), this.f207704f.get(), this.f207705g.get());
    }
}
