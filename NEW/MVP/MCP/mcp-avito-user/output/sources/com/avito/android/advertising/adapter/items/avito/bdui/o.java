package com.avito.android.advertising.adapter.items.avito.bdui;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;
import javax.inject.Provider;
import ob.InterfaceC44740d;

/* compiled from: AvitoNetworkBDUIRichBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f87098a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87099b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f87100c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f87101d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f87102e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f87103f;

    public o(Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5) {
        this.f87098a = provider;
        this.f87099b = lVar;
        this.f87100c = lVar2;
        this.f87101d = lVar3;
        this.f87102e = lVar4;
        this.f87103f = lVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f87098a.get(), (ScreenPerformanceTracker) this.f87099b.f393949a, (Screen) this.f87100c.f393949a, (Fragment) this.f87101d.f393949a, (InterfaceC44740d) this.f87102e.f393949a, (InterfaceC41342b) this.f87103f.f393949a);
    }
}
