package com.avito.android.extended_profile_widgets.adapter.search.inline_filters;

import Aw0.InterfaceC13094a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.C36135w2;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.inline_filters.dialog.A;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.inline_filters.dialog.z;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;
import javax.inject.Provider;

/* compiled from: InlineFiltersItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f154643a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f154644b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f154645c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f154646d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.onboarding_manager.d f154647e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding_manager.f> f154648f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC30999b> f154649g;

    /* renamed from: h, reason: collision with root package name */
    public final A f154650h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.select.i> f154651i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.feature.item.b> f154652j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f154653k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f154654l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC13094a> f154655m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.l f154656n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<C36135w2> f154657o;

    public b(Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider2, com.avito.android.onboarding_manager.d dVar, Provider provider3, Provider provider4, A a12, Provider provider5, Provider provider6, dagger.internal.l lVar3, Provider provider7, Provider provider8, dagger.internal.l lVar4, Provider provider9) {
        this.f154643a = provider;
        this.f154644b = lVar;
        this.f154645c = lVar2;
        this.f154646d = provider2;
        this.f154647e = dVar;
        this.f154648f = provider3;
        this.f154649g = provider4;
        this.f154650h = a12;
        this.f154651i = provider5;
        this.f154652j = provider6;
        this.f154653k = lVar3;
        this.f154654l = provider7;
        this.f154655m = provider8;
        this.f154656n = lVar4;
        this.f154657o = provider9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f154643a.get(), (Fragment) this.f154644b.f393949a, (FragmentManager) this.f154645c.f393949a, this.f154646d.get(), (com.avito.android.onboarding_manager.a) this.f154647e.get(), this.f154648f.get(), this.f154649g.get(), (z) this.f154650h.get(), this.f154651i.get(), this.f154652j.get(), (Screen) this.f154653k.f393949a, this.f154654l.get(), this.f154655m.get(), (InterfaceC41342b) this.f154656n.f393949a, this.f154657o.get());
    }
}
