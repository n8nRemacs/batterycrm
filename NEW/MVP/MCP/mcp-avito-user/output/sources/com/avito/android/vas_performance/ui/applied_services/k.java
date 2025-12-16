package com.avito.android.vas_performance.ui.applied_services;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.InterfaceC36049c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppliedServicesViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/k;", "Landroidx/lifecycle/P0$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f321433a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f321434b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36049c f321435c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f321436d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f321437e;

    @Inject
    public k(@Y61.k String str, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC36049c interfaceC36049c, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f321433a = str;
        this.f321434b = aVar;
        this.f321435c = interfaceC36049c;
        this.f321436d = interfaceC35745a5;
        this.f321437e = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(t.class)) {
            return new t(this.f321433a, this.f321434b, this.f321435c, this.f321436d, this.f321437e);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
