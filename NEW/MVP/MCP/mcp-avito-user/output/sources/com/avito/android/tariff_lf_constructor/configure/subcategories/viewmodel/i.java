package com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.subcategories.di.b;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureSubCategoriesViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/subcategories/viewmodel/i;", "Landroidx/lifecycle/P0$c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f300490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f300491b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f300492c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d f300493d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.a f300494e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a f300495f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l f300496g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f300497h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f300498i;

    @Inject
    public i(@b.InterfaceC9187b @Y61.k String str, @Y61.k @b.d String str2, @b.a @Y61.k String str3, @Y61.k d dVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.a aVar, @Y61.k a aVar2, @Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l lVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f300490a = str;
        this.f300491b = str2;
        this.f300492c = str3;
        this.f300493d = dVar;
        this.f300494e = aVar;
        this.f300495f = aVar2;
        this.f300496g = lVar;
        this.f300497h = interfaceC35745a5;
        this.f300498i = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(r.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new r(this.f300490a, this.f300491b, this.f300492c, this.f300493d, this.f300494e, this.f300495f, this.f300496g, this.f300497h, this.f300498i);
    }
}
