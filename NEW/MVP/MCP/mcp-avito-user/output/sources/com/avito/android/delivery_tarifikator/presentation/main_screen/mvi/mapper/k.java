package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper;

import Ov.n;
import Ov.p;
import Uv.InterfaceC15572a;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.c;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TarifikatorMainContentMapper.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/k;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/i;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* loaded from: classes12.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15572a f135690a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f135691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f135692c;

    @Inject
    public k(@Y61.k InterfaceC15572a interfaceC15572a, @Y61.k e eVar, @Y61.k Context context) {
        this.f135690a = interfaceC15572a;
        this.f135691b = eVar;
        this.f135692c = context;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.i
    @Y61.k
    public final ArrayList a(@Y61.k List list, boolean z12) {
        int i12;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            if ((aVar instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d) && L.f(((com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d) aVar).f135409b, "master-setting")) {
                break;
            }
            i14++;
        }
        Object objK = C42745f0.K(i14, list);
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d dVar = objK instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d ? (com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d) objK : null;
        if (dVar != null) {
            arrayList.set(i14, com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d.a(dVar, z12));
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((com.avito.conveyor_item.a) it2.next()) instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d) {
                i12 = i13;
                break;
            }
            i13++;
        }
        Object objK2 = C42745f0.K(i12, list);
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d dVar2 = objK2 instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d ? (com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d) objK2 : null;
        if (dVar2 != null) {
            List<com.avito.conveyor_item.a> list2 = dVar2.f135365c;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (com.avito.conveyor_item.a cVar : list2) {
                if (cVar instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c) {
                    com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c cVar2 = (com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c) cVar;
                    cVar = new com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c(cVar2.f135467b, cVar2.f135468c, cVar2.f135469d, cVar2.f135470e, cVar2.f135471f, z12);
                }
                arrayList2.add(cVar);
            }
            arrayList.set(i12, new com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d(dVar2.f135364b, arrayList2, dVar2.f135366d, dVar2.f135367e, dVar2.f135368f, dVar2.f135369g, z12));
        }
        return arrayList;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.i
    @Y61.k
    public final kotlin.collections.builders.b b(@Y61.k p pVar, @Y61.k n nVar) {
        kotlin.collections.builders.b bVarT = C42745f0.t();
        AttributedText attributedText = pVar.f12704a;
        if (attributedText != null) {
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.d("MainHeader", new c.a(attributedText)));
        }
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d dVarA = this.f135691b.a(pVar);
        if (dVarA != null) {
            bVarT.add(dVarA);
        }
        bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.d("MasterSettingTitle", new c.b(com.avito.android.printable_text.a.a(R.string.master_setting_title))));
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d dVarC = this.f135690a.c(nVar);
        int i12 = 2;
        if (dVarC != null) {
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(4, null, 2, null));
            bVarT.add(dVarC);
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(4, null, 2, null));
        }
        bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.d("RegionsInfoTitle", new c.b(com.avito.android.printable_text.a.a(R.string.regions_info_title))));
        bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(14, null, 2, null));
        List<Ov.f> list = nVar.f12700b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Ov.f fVar : list) {
            String strO = C42745f0.O(C42745f0.E0(fVar.f12683b, i12), ", ", null, null, j.f135689l, 30);
            ArrayList arrayList2 = fVar.f12683b;
            int size = arrayList2.size() - i12;
            Context context = this.f135692c;
            if (size != 0) {
                strO = context.getString(R.string.region_info_locations_hint_long, strO, Integer.valueOf(size));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                Ov.g gVar = nVar.f12701c.get(Long.valueOf(((Ov.d) obj).f12680a));
                if (gVar != null && Ov.m.a(gVar.f12685b)) {
                    arrayList3.add(obj);
                }
            }
            int size2 = arrayList3.size();
            String string = size2 == 0 ? context.getString(R.string.region_info_delivery_disabled) : size2 == arrayList2.size() ? context.getString(R.string.region_info_delivery_enabled_all) : context.getResources().getQuantityString(R.plurals.region_info_delivery_enabled, size2, Integer.valueOf(size2));
            String str = fVar.f12682a;
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo.c(str, str, strO, string));
            arrayList.add(Boolean.TRUE);
            i12 = 2;
        }
        AttributedText attributedText2 = pVar.f12705b;
        if (attributedText2 != null) {
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.d("MainFooter", new c.a(attributedText2)));
        }
        bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(14, null, 2, null));
        return C42745f0.p(bVarT);
    }
}
