package com.avito.android.advert.item.equipmentsTile;

import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.OptionsTile;
import com.avito.android.util.L0;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsEquipmentsTilePresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/equipmentsTile/g;", "Lcom/avito/android/advert/item/equipmentsTile/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f75339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L0 f75340c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.equipments.redesign.bottom_sheet.a f75341d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final j f75342e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f75343f;

    @Inject
    public g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k L0 l02, @Y61.k com.avito.android.advert_core.equipments.redesign.bottom_sheet.a aVar, @Y61.k j jVar, @oD.h @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f75339b = interfaceC28373a;
        this.f75340c = l02;
        this.f75341d = aVar;
        this.f75342e = jVar;
        this.f75343f = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        AdvertDetailsEquipmentsTileItem advertDetailsEquipmentsTileItem = (AdvertDetailsEquipmentsTileItem) aVar;
        f fVar = new f(this, advertDetailsEquipmentsTileItem, mVar);
        mVar.setTitle(advertDetailsEquipmentsTileItem.f75317d);
        mVar.m9(advertDetailsEquipmentsTileItem.f75318e);
        int iC2 = this.f75340c.c();
        int iA2 = (this.f75342e.a() * 2) + (y6.b(86) * 4);
        List<OptionsTile> listSubList = advertDetailsEquipmentsTileItem.f75319f;
        if (iC2 < iA2) {
            if (listSubList.size() > 6) {
                listSubList = listSubList.subList(0, 6);
            }
            mVar.gI(3, fVar, listSubList);
        } else {
            if (listSubList.size() > 8) {
                listSubList = listSubList.subList(0, 8);
            }
            mVar.gI(4, fVar, listSubList);
        }
        mVar.un(advertDetailsEquipmentsTileItem.f75322i, fVar);
    }
}
