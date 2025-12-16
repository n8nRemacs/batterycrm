package com.avito.android.authorization.reset_password;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import android.content.res.Resources;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: ResetPasswordPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final j f94210a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f94211b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f94212c;

    /* renamed from: d, reason: collision with root package name */
    public final C15204c f94213d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f94214e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f94215f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f94216g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f94217h;

    public v(j jVar, Provider provider, Provider provider2, C15204c c15204c, Provider provider3, dagger.internal.l lVar, Provider provider4, dagger.internal.l lVar2) {
        this.f94210a = jVar;
        this.f94211b = provider;
        this.f94212c = provider2;
        this.f94213d = c15204c;
        this.f94214e = provider3;
        this.f94215f = lVar;
        this.f94216g = provider4;
        this.f94217h = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s((c) this.f94210a.get(), this.f94211b.get(), this.f94212c.get(), (InterfaceC15202a) this.f94213d.get(), this.f94214e.get(), (Resources) this.f94215f.f393949a, this.f94216g.get(), (Kundle) this.f94217h.f393949a);
    }
}
