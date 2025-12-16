package com.avito.android.tariff_lf.package_info.viewmodel;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffPackageInfoViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/viewmodel/m;", "Landroidx/lifecycle/P0$c;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f299288a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f299289b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f299290c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f299291d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299292e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f299293f;

    @Inject
    public m(@com.avito.android.tariff_lf.package_info.di.a @Y61.k String str, @Y61.k String str2, @Y61.k a aVar, @Y61.k e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f299288a = str;
        this.f299289b = str2;
        this.f299290c = aVar;
        this.f299291d = eVar;
        this.f299292e = interfaceC35745a5;
        this.f299293f = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(v.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new v(this.f299289b, this.f299288a, this.f299290c, this.f299291d, this.f299292e, this.f299293f);
    }
}
