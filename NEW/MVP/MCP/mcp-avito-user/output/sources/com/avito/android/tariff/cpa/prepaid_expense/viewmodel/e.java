package com.avito.android.tariff.cpa.prepaid_expense.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublicationAdvanceFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/viewmodel/e;", "Landroidx/lifecycle/P0$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f295075a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f295076b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35206a f295077c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f295078d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f295079e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g f295080f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final v50.g f295081g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f295082h;

    @Inject
    public e(@Y61.k String str, @Y61.k j jVar, @Y61.k InterfaceC35206a interfaceC35206a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k g gVar, @Y61.k v50.g gVar2, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f295075a = str;
        this.f295076b = jVar;
        this.f295077c = interfaceC35206a;
        this.f295078d = interfaceC35745a5;
        this.f295079e = screenPerformanceTracker;
        this.f295080f = gVar;
        this.f295081g = gVar2;
        this.f295082h = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(q.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new q(this.f295075a, this.f295076b, this.f295077c, this.f295078d, this.f295079e, this.f295080f, this.f295081g, this.f295082h);
    }
}
