package com.avito.android.tariff_lf.edit_info.viewmodel;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditInfoViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/viewmodel/l;", "Landroidx/lifecycle/P0$c;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f299102a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35211e f299103b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35207a f299104c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299105d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f299106e;

    @Inject
    public l(@Y61.k String str, @Y61.k InterfaceC35211e interfaceC35211e, @Y61.k InterfaceC35207a interfaceC35207a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f299102a = str;
        this.f299103b = interfaceC35211e;
        this.f299104c = interfaceC35207a;
        this.f299105d = interfaceC35745a5;
        this.f299106e = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(r.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new r(this.f299102a, this.f299103b, this.f299104c, this.f299105d, this.f299106e);
    }
}
