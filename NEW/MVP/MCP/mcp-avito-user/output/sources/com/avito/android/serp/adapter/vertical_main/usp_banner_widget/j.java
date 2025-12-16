package com.avito.android.serp.adapter.vertical_main.usp_banner_widget;

import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UspBannersWidgetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f273357a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f273358b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f273359c;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f273357a = provider;
        this.f273358b = provider2;
        this.f273359c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f273357a.get(), this.f273358b.get(), (Kundle) this.f273359c.f393949a);
    }
}
