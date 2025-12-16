package com.avito.android.advertising.adapter.items.avito.bdui;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;
import javax.inject.Provider;
import ob.InterfaceC44740d;

/* compiled from: AvitoNetworkBDUIBigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f87055a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f87056b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f87057c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f87058d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f87059e;

    /* renamed from: f, reason: collision with root package name */
    public final u f87060f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.a> f87061g;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f87055a = provider;
        this.f87056b = provider2;
        this.f87057c = lVar;
        this.f87058d = lVar2;
        this.f87059e = lVar3;
        this.f87060f = uVar;
        this.f87061g = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f87055a.get(), this.f87056b.get(), (Screen) this.f87057c.f393949a, (InterfaceC44740d) this.f87058d.f393949a, (Fragment) this.f87059e.f393949a, (InterfaceC41342b) this.f87060f.get(), this.f87061g.get());
    }
}
