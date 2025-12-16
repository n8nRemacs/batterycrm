package com.avito.android.authorization.select_profile;

import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectProfilePresenterImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class u implements dagger.internal.h<SelectProfilePresenterImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f94444a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f94445b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f94446c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f94447d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f94448e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f94449f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f94450g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<SelectProfileField>> f94451h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f94452i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f94453j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f94454k;

    public u(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f94444a = provider;
        this.f94445b = provider2;
        this.f94446c = provider3;
        this.f94447d = lVar;
        this.f94448e = provider4;
        this.f94449f = provider5;
        this.f94450g = provider6;
        this.f94451h = provider7;
        this.f94452i = provider8;
        this.f94453j = provider9;
        this.f94454k = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new SelectProfilePresenterImpl(this.f94444a.get(), this.f94445b.get(), this.f94446c.get(), (Resources) this.f94447d.f393949a, this.f94448e.get(), this.f94449f.get(), this.f94450g.get(), this.f94451h.get(), this.f94452i.get(), this.f94453j.get(), (Kundle) this.f94454k.f393949a);
    }
}
