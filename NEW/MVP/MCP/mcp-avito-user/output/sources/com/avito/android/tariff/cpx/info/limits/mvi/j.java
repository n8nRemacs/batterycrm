package com.avito.android.tariff.cpx.info.limits.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.info.limits.mvi.entity.TariffCpxInfoLimitsInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import vB0.c;

/* compiled from: TariffCpxInfoLimitsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "LvB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<TariffCpxInfoLimitsInternalAction, vB0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final vB0.c a(TariffCpxInfoLimitsInternalAction tariffCpxInfoLimitsInternalAction, vB0.c cVar) {
        int i12;
        TariffCpxInfoLimitsInternalAction tariffCpxInfoLimitsInternalAction2 = tariffCpxInfoLimitsInternalAction;
        vB0.c cVar2 = cVar;
        if (!(tariffCpxInfoLimitsInternalAction2 instanceof TariffCpxInfoLimitsInternalAction.Content)) {
            return tariffCpxInfoLimitsInternalAction2 instanceof TariffCpxInfoLimitsInternalAction.Loading ? vB0.c.a(cVar2, true, null, 0, 28) : tariffCpxInfoLimitsInternalAction2 instanceof TariffCpxInfoLimitsInternalAction.Error ? vB0.c.a(cVar2, false, ((TariffCpxInfoLimitsInternalAction.Error) tariffCpxInfoLimitsInternalAction2).f296616b, 0, 28) : tariffCpxInfoLimitsInternalAction2 instanceof TariffCpxInfoLimitsInternalAction.SelectTab ? vB0.c.a(cVar2, false, null, ((TariffCpxInfoLimitsInternalAction.SelectTab) tariffCpxInfoLimitsInternalAction2).f296618b, 23) : cVar2;
        }
        TB0.a aVar = ((TariffCpxInfoLimitsInternalAction.Content) tariffCpxInfoLimitsInternalAction2).f296615b;
        AttributedText title = aVar.getTitle();
        List<TB0.c> listA = aVar.a();
        int i13 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (TB0.c cVar3 : listA) {
            String tabName = cVar3.getTabName();
            List<TB0.b> listA2 = cVar3.a();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listA2, i13));
            for (TB0.b bVar : listA2) {
                String title2 = bVar.getTitle();
                String counter = bVar.getCounter();
                String subtitle = bVar.getSubtitle();
                List<TB0.d> listB = bVar.b();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(listB, i13));
                for (TB0.d dVar : listB) {
                    arrayList3.add(new c.b.a.C12750a(dVar.getLeftText(), dVar.getRightText(), dVar.getNeedSpacing()));
                }
                arrayList2.add(new c.b.a(title2, counter, subtitle, arrayList3));
                i13 = 10;
            }
            arrayList.add(new c.b(tabName, arrayList2));
            i13 = 10;
        }
        Iterator<TB0.c> it = aVar.a().iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().getIsSelected()) {
                i12 = i14;
                break;
            }
            i14++;
        }
        return new vB0.c(false, null, title, i12, arrayList);
    }
}
