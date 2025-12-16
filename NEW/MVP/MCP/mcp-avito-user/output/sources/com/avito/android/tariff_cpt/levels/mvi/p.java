package com.avito.android.tariff_cpt.levels.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction;
import iC0.C41267a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import xC0.C49816b;
import xC0.C49817c;

/* compiled from: TariffCptLevelsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "LFC0/c;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements u<TariffCptLevelsInternalAction, FC0.c> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final FC0.c a(TariffCptLevelsInternalAction tariffCptLevelsInternalAction, FC0.c cVar) {
        Object next;
        Object next2;
        List list;
        Object next3;
        Iterator it;
        boolean z12;
        Object next4;
        TariffCptLevelsInternalAction tariffCptLevelsInternalAction2 = tariffCptLevelsInternalAction;
        FC0.c cVar2 = cVar;
        if (tariffCptLevelsInternalAction2 instanceof TariffCptLevelsInternalAction.Loading) {
            return FC0.c.a(cVar2, null, null, null, null, null, null, null, true, false, 319);
        }
        if (!(tariffCptLevelsInternalAction2 instanceof TariffCptLevelsInternalAction.Content)) {
            if (tariffCptLevelsInternalAction2 instanceof TariffCptLevelsInternalAction.Error) {
                return FC0.c.a(cVar2, null, null, null, null, null, null, ((TariffCptLevelsInternalAction.Error) tariffCptLevelsInternalAction2).f298641b, false, false, 319);
            }
            if (!(tariffCptLevelsInternalAction2 instanceof TariffCptLevelsInternalAction.LevelSelect)) {
                return tariffCptLevelsInternalAction2 instanceof TariffCptLevelsInternalAction.ProgressChanged ? FC0.c.a(cVar2, null, null, null, null, null, null, null, false, ((TariffCptLevelsInternalAction.ProgressChanged) tariffCptLevelsInternalAction2).f298645b, 255) : cVar2;
            }
            EC0.a aVar = (EC0.a) ((TariffCptLevelsInternalAction.LevelSelect) tariffCptLevelsInternalAction2).f298644b;
            List<com.avito.conveyor_item.a> list2 = cVar2.f4633g.get(Integer.valueOf(aVar.f3877c));
            if (list2 == null) {
                list2 = C42784z0.f406748b;
            }
            return FC0.c.a(cVar2, null, null, null, aVar, list2, null, null, false, false, 487);
        }
        xC0.f fVar = ((TariffCptLevelsInternalAction.Content) tariffCptLevelsInternalAction2).f298640b;
        List<xC0.e> listC = fVar.c();
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        for (xC0.e eVar : listC) {
            arrayList.add(new EC0.a(eVar.getName(), (int) eVar.getId(), new C41267a(eVar.getButton().getTitle(), eVar.getButton().getUri(), eVar.getButton().getStyle(), eVar.getButton().getIsEnabled()), eVar.getExtraInfo()));
        }
        boolean z13 = true;
        List list3 = arrayList.size() > 1 ? arrayList : C42784z0.f406748b;
        Iterator<T> it2 = fVar.c().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((xC0.e) next).getIsSelected()) {
                break;
            }
        }
        xC0.e eVar2 = (xC0.e) next;
        int id2 = eVar2 != null ? (int) eVar2.getId() : 1;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            if (((EC0.a) next2).f3877c == id2) {
                break;
            }
        }
        EC0.a aVar2 = (EC0.a) next2;
        List<C49817c> listB = fVar.b();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(Integer.valueOf(((EC0.a) it4.next()).f3877c));
        }
        ArrayList arrayList3 = new ArrayList();
        for (C49817c c49817c : listB) {
            AttributedText name = c49817c.getName();
            if (name != null) {
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    List<C49816b> listA = c49817c.a();
                    if ((listA instanceof Collection) && listA.isEmpty()) {
                        z12 = z13;
                        it = it5;
                    } else {
                        Iterator<T> it6 = listA.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                it = it5;
                                z12 = z13;
                                break;
                            }
                            Iterator<T> it7 = ((C49816b) it6.next()).c().iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    it = it5;
                                    next4 = null;
                                    break;
                                }
                                next4 = it7.next();
                                it = it5;
                                if (((int) ((xC0.d) next4).getId()) == iIntValue) {
                                    break;
                                }
                                it5 = it;
                            }
                            xC0.d dVar = (xC0.d) next4;
                            if (!(dVar != null ? L.f(dVar.getIsHidden(), Boolean.TRUE) : false)) {
                                z12 = false;
                                break;
                            }
                            it5 = it;
                        }
                    }
                    if (!z12) {
                        arrayList3.add(new com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.a(iIntValue, name));
                    }
                    it5 = it;
                }
            }
            for (C49816b c49816b : c49817c.a()) {
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    int iIntValue2 = ((Number) it8.next()).intValue();
                    Iterator<T> it9 = c49816b.c().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            list = list3;
                            next3 = null;
                            break;
                        }
                        next3 = it9.next();
                        list = list3;
                        if (((int) ((xC0.d) next3).getId()) == iIntValue2) {
                            break;
                        }
                        list3 = list;
                    }
                    xC0.d dVar2 = (xC0.d) next3;
                    if (!(dVar2 != null ? L.f(dVar2.getIsHidden(), Boolean.TRUE) : false)) {
                        String name2 = c49816b.getName();
                        DeepLink uri = dVar2 != null ? dVar2.getUri() : null;
                        boolean z14 = dVar2 != null && dVar2.getIsEnabled();
                        AttributedText description = dVar2 != null ? dVar2.getDescription() : null;
                        iC0.f fVar2 = new iC0.f(c49816b.getIcon().getValue(), c49816b.getIcon().getValueDark());
                        xC0.h disabledIcon = c49816b.getDisabledIcon();
                        arrayList3.add(new com.avito.android.tariff_cpt.levels.ui.items.business_tool.a(iIntValue2, name2, fVar2, disabledIcon != null ? new iC0.f(disabledIcon.getValue(), disabledIcon.getValueDark()) : null, uri, z14, description));
                    }
                    list3 = list;
                    z13 = true;
                }
            }
        }
        List list4 = list3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it10 = arrayList3.iterator();
        while (it10.hasNext()) {
            Object next5 = it10.next();
            Integer numValueOf = Integer.valueOf(((HC0.a) next5).getF298668b());
            Object arrayList4 = linkedHashMap.get(numValueOf);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList4);
            }
            ((List) arrayList4).add(next5);
        }
        String title = fVar.getTitle();
        AttributedText description2 = fVar.getDescription();
        List list5 = (List) linkedHashMap.get(Integer.valueOf(id2));
        if (list5 == null) {
            list5 = C42784z0.f406748b;
        }
        return FC0.c.a(cVar2, title, description2, list4, aVar2, list5, linkedHashMap, null, false, false, 256);
    }
}
