package com.avito.android.advertising.adapter.items.avito.bdui;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;
import javax.inject.Provider;
import ob.InterfaceC44740d;

/* compiled from: AvitoNetworkBDUIGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f87071a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87072b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f87073c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f87074d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f87075e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f87076f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f87077g;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6, Provider provider) {
        this.f87071a = provider;
        this.f87072b = lVar;
        this.f87073c = lVar2;
        this.f87074d = lVar3;
        this.f87075e = lVar4;
        this.f87076f = lVar5;
        this.f87077g = lVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f87071a.get(), (ScreenPerformanceTracker) this.f87072b.f393949a, (Screen) this.f87073c.f393949a, (InterfaceC44740d) this.f87074d.f393949a, (Fragment) this.f87075e.f393949a, (InterfaceC41342b) this.f87076f.f393949a, (com.avito.android.advertising.a) this.f87077g.f393949a);
    }
}
