package com.avito.android.advert_stats.detail.tab.items.chart;

import eb.InterfaceC40078a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatsPlotPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class v extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<StatsPeriodItem> f86347l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f86348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(List<StatsPeriodItem> list, x xVar) {
        super(1);
        this.f86347l = list;
        this.f86348m = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue >= 0 && iIntValue < this.f86347l.size()) {
            x xVar = this.f86348m;
            xVar.f86351c.invoke(new InterfaceC40078a.h(iIntValue));
        }
        return G0.f406611a;
    }
}
