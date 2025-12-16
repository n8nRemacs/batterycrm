package com.avito.android.tariff.cpa.configure_info.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpaConfigureInfoFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/viewmodel/e;", "Landroidx/lifecycle/P0$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f294529a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f294530b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f294531c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f294532d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f294533e;

    @Inject
    public e(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k a aVar, @Y61.k g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k String str) {
        this.f294529a = gVar;
        this.f294530b = aVar;
        this.f294531c = interfaceC35745a5;
        this.f294532d = screenPerformanceTracker;
        this.f294533e = str;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(r.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        g gVar = this.f294529a;
        a aVar = this.f294530b;
        String str = this.f294533e;
        return new r(this.f294532d, aVar, gVar, this.f294531c, str);
    }
}
