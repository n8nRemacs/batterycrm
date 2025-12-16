package com.avito.android.social_management;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import java.util.List;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: SocialManagementPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class K implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35044k> f284445a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<List<com.avito.android.social.D>> f284446b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<List<com.avito.android.social.D>> f284447c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.c> f284448d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<SocialItem>> f284449e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<com.avito.android.social_management.adapter.notification.j>> f284450f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC50647a> f284451g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f284452h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<M> f284453i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f284454j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f284455k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.social.M> f284456l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f284457m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.l f284458n;

    public K(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, dagger.internal.l lVar) {
        this.f284445a = provider;
        this.f284446b = provider2;
        this.f284447c = provider3;
        this.f284448d = provider4;
        this.f284449e = provider5;
        this.f284450f = provider6;
        this.f284451g = provider7;
        this.f284452h = provider8;
        this.f284453i = provider9;
        this.f284454j = provider10;
        this.f284455k = provider11;
        this.f284456l = provider12;
        this.f284457m = provider13;
        this.f284458n = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f284445a.get(), this.f284446b.get(), this.f284447c.get(), this.f284448d.get(), this.f284449e.get(), this.f284450f.get(), this.f284451g.get(), this.f284452h.get(), this.f284453i.get(), this.f284454j.get(), this.f284455k.get(), this.f284456l.get(), this.f284457m.get(), (Kundle) this.f284458n.f393949a);
    }
}
