package com.avito.android.notification;

import Ck0.InterfaceC13317a;
import com.avito.android.account.E;
import com.avito.android.permissions.G;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AskNotificationProblemsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f207436a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P30.a> f207437b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<I30.d> f207438c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC13317a> f207439d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<G> f207440e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f207441f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.timestamp_storage.domain.d> f207442g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.notifications_settings.use_case.f> f207443h;

    public g(Provider<C> provider, Provider<P30.a> provider2, Provider<I30.d> provider3, Provider<InterfaceC13317a> provider4, Provider<G> provider5, Provider<E> provider6, Provider<com.avito.android.timestamp_storage.domain.d> provider7, Provider<com.avito.android.notifications_settings.use_case.f> provider8) {
        this.f207436a = provider;
        this.f207437b = provider2;
        this.f207438c = provider3;
        this.f207439d = provider4;
        this.f207440e = provider5;
        this.f207441f = provider6;
        this.f207442g = provider7;
        this.f207443h = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f207436a.get(), this.f207437b.get(), this.f207438c.get(), this.f207439d.get(), this.f207440e.get(), this.f207441f.get(), this.f207442g.get(), this.f207443h.get());
    }
}
