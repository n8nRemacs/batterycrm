package com.avito.android.tariff_lf_constructor.configure.locations.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.locations.di.b;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureLocationsViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/viewmodel/j;", "Landroidx/lifecycle/P0$c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f299962a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f299963b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f299964c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.a f299965d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f299966e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l f299967f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.e f299968g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299969h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f299970i;

    @Inject
    public j(@Y61.k @b.a String str, @b.c @Y61.k String str2, @Y61.k e eVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.a aVar, @Y61.k a aVar2, @Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l lVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.e eVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f299962a = str;
        this.f299963b = str2;
        this.f299964c = eVar;
        this.f299965d = aVar;
        this.f299966e = aVar2;
        this.f299967f = lVar;
        this.f299968g = eVar2;
        this.f299969h = interfaceC35745a5;
        this.f299970i = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(r.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new r(this.f299962a, this.f299963b, this.f299964c, this.f299965d, this.f299966e, this.f299967f, this.f299968g, this.f299969h, this.f299970i);
    }
}
