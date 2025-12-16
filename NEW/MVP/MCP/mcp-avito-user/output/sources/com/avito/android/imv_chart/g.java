package com.avito.android.imv_chart;

import j.InterfaceC42161q;
import kotlin.Metadata;

/* compiled from: ImvCarsChartItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_chart/g;", "LTV0/d;", "Lcom/avito/android/imv_chart/h;", "Lcom/avito/android/imv_chart/ImvCarsChartItem;", "_avito_imv-chart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class g implements TV0.d<h, ImvCarsChartItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f170266b;

    public g(@InterfaceC42161q @Y61.l Integer num) {
        this.f170266b = num;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        hVar.rQ(this.f170266b);
        hVar.Vu(((ImvCarsChartItem) aVar).f170253c);
    }
}
