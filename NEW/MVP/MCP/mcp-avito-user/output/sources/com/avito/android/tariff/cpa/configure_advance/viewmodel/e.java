package com.avito.android.tariff.cpa.configure_advance.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfigureAdvanceFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/viewmodel/e;", "Landroidx/lifecycle/P0$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f294379a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f294380b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35205a f294381c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f294382d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f294383e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g f294384f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f294385g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final v50.g f294386h;

    @Inject
    public e(@Y61.k String str, @Y61.k j jVar, @Y61.k InterfaceC35205a interfaceC35205a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k v50.g gVar2) {
        this.f294379a = str;
        this.f294380b = jVar;
        this.f294381c = interfaceC35205a;
        this.f294382d = interfaceC35745a5;
        this.f294383e = screenPerformanceTracker;
        this.f294384f = gVar;
        this.f294385g = aVar;
        this.f294386h = gVar2;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(q.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new q(this.f294379a, this.f294380b, this.f294381c, this.f294382d, this.f294383e, this.f294384f, this.f294385g, this.f294386h);
    }
}
