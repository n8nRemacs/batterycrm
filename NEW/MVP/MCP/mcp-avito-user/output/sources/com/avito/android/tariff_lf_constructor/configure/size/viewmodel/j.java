package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.size.di.b;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureSizeViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/viewmodel/j;", "Landroidx/lifecycle/P0$c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f300382a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f300383b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35224a f300384c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35228e f300385d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.a f300386e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f300387f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f300388g;

    @Inject
    public j(@b.a @Y61.k String str, @Y61.k @b.c String str2, @Y61.k InterfaceC35224a interfaceC35224a, @Y61.k InterfaceC35228e interfaceC35228e, @Y61.k com.avito.android.tariff_lf_constructor.configure.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f300382a = str;
        this.f300383b = str2;
        this.f300384c = interfaceC35224a;
        this.f300385d = interfaceC35228e;
        this.f300386e = aVar;
        this.f300387f = interfaceC35745a5;
        this.f300388g = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(E.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new E(this.f300382a, this.f300383b, this.f300384c, this.f300385d, this.f300386e, this.f300387f, this.f300388g);
    }
}
