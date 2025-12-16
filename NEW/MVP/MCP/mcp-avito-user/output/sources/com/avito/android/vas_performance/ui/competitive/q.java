package com.avito.android.vas_performance.ui.competitive;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.InterfaceC36051e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompetitiveVasViewModelFactory.kt */
@B
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/competitive/q;", "Landroidx/lifecycle/P0$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f321511a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f321512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36051e f321513c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f321514d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f321515e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f321516f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f321517g;

    @Inject
    public q(@com.avito.android.vas_performance.di.competitive.a @Y61.k String str, @Y61.k @com.avito.android.vas_performance.di.competitive.b String str2, @Y61.k InterfaceC36051e interfaceC36051e, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f321511a = str;
        this.f321512b = str2;
        this.f321513c = interfaceC36051e;
        this.f321514d = aVar;
        this.f321515e = interfaceC35745a5;
        this.f321516f = screenPerformanceTracker;
        this.f321517g = interfaceC28373a;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(p.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new p(this.f321511a, this.f321512b, this.f321513c, this.f321514d, this.f321515e, this.f321516f, this.f321517g);
    }
}
