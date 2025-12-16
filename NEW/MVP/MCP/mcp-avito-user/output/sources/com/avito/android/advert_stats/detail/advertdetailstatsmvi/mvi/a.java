package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi;

import ab.InterfaceC19855a;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIState;
import com.avito.android.advert_stats.detail.tab.OneStatsTabItem;
import com.avito.android.advert_stats.p;
import com.avito.android.arch.mvi.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertDetailStatsMVIActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lab/a;", "Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIInternalAction;", "Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIState;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC19855a, AdvertDetailStatsMVIInternalAction, AdvertDetailStatsMVIState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f86089a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f86090b;

    @Inject
    public a(@Y61.k String str, @Y61.k p pVar) {
        this.f86089a = str;
        this.f86090b = pVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AdvertDetailStatsMVIInternalAction> b(InterfaceC19855a interfaceC19855a, AdvertDetailStatsMVIState advertDetailStatsMVIState) {
        C43210w c43210w;
        InterfaceC19855a interfaceC19855a2 = interfaceC19855a;
        AdvertDetailStatsMVIState advertDetailStatsMVIState2 = advertDetailStatsMVIState;
        if (interfaceC19855a2 instanceof InterfaceC19855a.b) {
            return new C43210w(new AdvertDetailStatsMVIInternalAction.OnSelectTab(((InterfaceC19855a.b) interfaceC19855a2).f20999a));
        }
        if (interfaceC19855a2 instanceof InterfaceC19855a.e) {
            ArrayList arrayList = new ArrayList();
            List<OneStatsTabItem> list = advertDetailStatsMVIState2.f86117g;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OneStatsTabItem) it.next()).f86191h);
                }
            }
            InterfaceC19855a.e eVar = (InterfaceC19855a.e) interfaceC19855a2;
            return new C43210w(new AdvertDetailStatsMVIInternalAction.SetSelectedPeriod(eVar.f21002a, eVar.f21003b, arrayList));
        }
        if (interfaceC19855a2.equals(InterfaceC19855a.f.f21004a)) {
            return this.f86090b.a(this.f86089a);
        }
        if (interfaceC19855a2 instanceof InterfaceC19855a.C1497a) {
            return new C43210w(new AdvertDetailStatsMVIInternalAction.HandleDeeplink(((InterfaceC19855a.C1497a) interfaceC19855a2).f20998a));
        }
        if (interfaceC19855a2.equals(InterfaceC19855a.c.f21000a)) {
            c43210w = new C43210w(new AdvertDetailStatsMVIInternalAction.OpenAdvertDetails());
        } else {
            if (!interfaceC19855a2.equals(InterfaceC19855a.d.f21001a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new AdvertDetailStatsMVIInternalAction.ShowUxFeedback());
        }
        return c43210w;
    }
}
