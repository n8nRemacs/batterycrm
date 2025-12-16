package com.avito.android.vas_planning.balance_lack;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanBalanceLackViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/l;", "Landroidx/lifecycle/P0$c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322240a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final YL0.a f322241b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f322242c;

    @Inject
    public l(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k YL0.a aVar, @Y61.k R0 r02) {
        this.f322240a = interfaceC28373a;
        this.f322241b = aVar;
        this.f322242c = r02;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        return new j(this.f322240a, this.f322241b, this.f322242c);
    }
}
