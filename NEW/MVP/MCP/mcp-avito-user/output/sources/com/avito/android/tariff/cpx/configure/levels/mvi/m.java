package com.avito.android.tariff.cpx.configure.levels.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.configure.levels.mvi.entity.TariffCpxConfigureLevelsInternalAction;
import eC0.p;
import eC0.q;
import eC0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sB0.C48023a;
import uZ.C49004a;

/* compiled from: TariffCpxConfigureLevelsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "LsB0/e;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<TariffCpxConfigureLevelsInternalAction, sB0.e> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final sB0.e a(TariffCpxConfigureLevelsInternalAction tariffCpxConfigureLevelsInternalAction, sB0.e eVar) {
        TariffCpxConfigureLevelsInternalAction tariffCpxConfigureLevelsInternalAction2 = tariffCpxConfigureLevelsInternalAction;
        sB0.e eVar2 = eVar;
        int i12 = 10;
        if (!(tariffCpxConfigureLevelsInternalAction2 instanceof TariffCpxConfigureLevelsInternalAction.Content)) {
            if (tariffCpxConfigureLevelsInternalAction2 instanceof TariffCpxConfigureLevelsInternalAction.Error) {
                return sB0.e.a(eVar2, null, null, false, false, ((TariffCpxConfigureLevelsInternalAction.Error) tariffCpxConfigureLevelsInternalAction2).f296210b, false, null, 79);
            }
            if (tariffCpxConfigureLevelsInternalAction2 instanceof TariffCpxConfigureLevelsInternalAction.Loading.ScreenLoading) {
                return sB0.e.a(eVar2, null, null, false, false, null, true, null, 79);
            }
            if (!(tariffCpxConfigureLevelsInternalAction2 instanceof TariffCpxConfigureLevelsInternalAction.Loading.LevelButtonLoading)) {
                return tariffCpxConfigureLevelsInternalAction2 instanceof TariffCpxConfigureLevelsInternalAction.Loading.NextButtonLoading ? sB0.e.a(eVar2, null, null, ((TariffCpxConfigureLevelsInternalAction.Loading.NextButtonLoading) tariffCpxConfigureLevelsInternalAction2).f296217b, false, null, false, null, 123) : eVar2;
            }
            TariffCpxConfigureLevelsInternalAction.Loading.LevelButtonLoading levelButtonLoading = (TariffCpxConfigureLevelsInternalAction.Loading.LevelButtonLoading) tariffCpxConfigureLevelsInternalAction2;
            List<com.avito.conveyor_item.a> list = eVar2.f437524b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.conveyor_item.a dVar : list) {
                if (dVar instanceof com.avito.android.tariff.cpx.configure.levels.items.level_cards.d) {
                    com.avito.android.tariff.cpx.configure.levels.items.level_cards.d dVar2 = (com.avito.android.tariff.cpx.configure.levels.items.level_cards.d) dVar;
                    List<com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.d> list2 = dVar2.f296144c;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                    for (com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.d dVar3 : list2) {
                        if (dVar3.getId() == levelButtonLoading.f296216c) {
                            dVar3 = new com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.d(dVar3.f296160b, dVar3.f296161c, dVar3.f296162d, dVar3.f296163e, dVar3.f296164f, levelButtonLoading.f296215b);
                        }
                        arrayList2.add(dVar3);
                    }
                    dVar = new com.avito.android.tariff.cpx.configure.levels.items.level_cards.d(dVar2.f296143b, arrayList2);
                }
                arrayList.add(dVar);
            }
            return sB0.e.a(eVar2, arrayList, null, false, levelButtonLoading.f296215b, null, false, null, 118);
        }
        ArrayList arrayList3 = new ArrayList();
        r rVar = ((TariffCpxConfigureLevelsInternalAction.Content) tariffCpxConfigureLevelsInternalAction2).f296209b;
        arrayList3.add(new com.avito.android.tariff.cpx.configure.levels.items.header.a(rVar.getTitle(), rVar.getDescription()));
        List<q> listC = rVar.c();
        ArrayList arrayList4 = new ArrayList(C42745f0.q(listC, 10));
        Iterator<T> it = listC.iterator();
        int i13 = 0;
        while (true) {
            C48023a c48023a = null;
            com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.l lVar = null;
            if (!it.hasNext()) {
                arrayList3.add(new com.avito.android.tariff.cpx.configure.levels.items.level_cards.d("levels_item", arrayList4));
                ButtonAction button = rVar.getButton();
                uZ.d navBar = rVar.getNavBar();
                if (navBar != null) {
                    Float progress = navBar.getProgress();
                    C49004a button2 = navBar.getButton();
                    c48023a = new C48023a(progress, button2 != null ? new sB0.b(button2.getTitle(), button2.getDeeplink()) : null);
                }
                return sB0.e.a(eVar2, arrayList3, button, false, false, null, false, c48023a, 12);
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            q qVar = (q) next;
            String strG = AK.c.g(i13, "level_item");
            AttributedText title = qVar.getTitle();
            ButtonAction button3 = qVar.getButton();
            List<eC0.o> listA = qVar.a();
            ArrayList arrayList5 = new ArrayList(C42745f0.q(listA, i12));
            for (eC0.o oVar : listA) {
                arrayList5.add(new com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.a(oVar.getIcon(), oVar.getTitle()));
            }
            p otherAdvantages = qVar.getOtherAdvantages();
            if (otherAdvantages != null) {
                lVar = new com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.l(otherAdvantages.getIcon(), otherAdvantages.getTitle(), otherAdvantages.getDeeplink());
            }
            arrayList4.add(new com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.d(strG, title, button3, arrayList5, lVar, false, 32, null));
            i13 = i14;
            i12 = 10;
        }
    }
}
