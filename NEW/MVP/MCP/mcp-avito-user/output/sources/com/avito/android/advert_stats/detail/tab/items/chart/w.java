package com.avito.android.advert_stats.detail.tab.items.chart;

import com.avito.android.advert_stats.item.BarState;
import eb.InterfaceC40078a;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatsPlotPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isIdle", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class w extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f86349l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super(1);
        this.f86349l = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Object next;
        boolean zBooleanValue = bool.booleanValue();
        x xVar = this.f86349l;
        if (zBooleanValue != xVar.f86354f) {
            xVar.f86354f = zBooleanValue;
            Iterator<T> it = xVar.f86353e.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                Iterator<T> it2 = ((StatsPeriodItem) it.next()).f86291c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((StatsBarItem) next).f86284e == BarState.f86679c) {
                        break;
                    }
                }
                if (((StatsBarItem) next) != null) {
                    z12 = true;
                }
            }
            if (z12) {
                xVar.f86351c.invoke(InterfaceC40078a.f.f395239a);
            }
        }
        return G0.f406611a;
    }
}
