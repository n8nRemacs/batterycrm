package com.avito.android.tariff_lf_constructor.configure.category.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.category.di.b;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureCategoryViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/viewmodel/j;", "Landroidx/lifecycle/P0$c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f299416a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f299417b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f299418c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f299419d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.a f299420e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299421f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f299422g;

    @Inject
    public j(@b.a @Y61.k String str, @b.c @Y61.k String str2, @Y61.k a aVar, @Y61.k e eVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f299416a = str;
        this.f299417b = str2;
        this.f299418c = aVar;
        this.f299419d = eVar;
        this.f299420e = aVar2;
        this.f299421f = interfaceC35745a5;
        this.f299422g = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(v.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new v(this.f299416a, this.f299417b, this.f299418c, this.f299419d, this.f299420e, this.f299421f, this.f299422g);
    }
}
