package com.avito.android.advert_core.equipments.redesign;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.AdvertEquipments;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import x9.InterfaceC49794a;

/* compiled from: RedesignedEquipmentsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/d;", "LTV0/d;", "Lcom/avito/android/advert_core/equipments/redesign/f;", "Lcom/avito/android/advert_core/equipments/redesign/EquipmentsItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, EquipmentsItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49794a f83539b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f83540c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.equipments.redesign.bottom_sheet.a f83541d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f83542e;

    @Inject
    public d(@Y61.k InterfaceC49794a interfaceC49794a, @Y61.k l lVar, @Y61.k com.avito.android.advert_core.equipments.redesign.bottom_sheet.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f83539b = interfaceC49794a;
        this.f83540c = lVar;
        this.f83541d = aVar;
        this.f83542e = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        EquipmentsItem equipmentsItem = (EquipmentsItem) aVar;
        AdvertEquipments advertEquipments = equipmentsItem.f83469d;
        fVar.b(advertEquipments.getTitle());
        fVar.m9(advertEquipments.getSubTitle());
        List<AdvertEquipments.EquipmentOption> options = advertEquipments.getOptions();
        l lVar = this.f83540c;
        Boolean bool = equipmentsItem.f83472g;
        fVar.mZ(lVar.a(options, bool));
        if (advertEquipments.getOptions().size() > 3) {
            fVar.Rb(this.f83539b.getF442270e(), new c(this, equipmentsItem, fVar, advertEquipments));
        } else {
            fVar.as();
        }
        if (L.f(bool, Boolean.TRUE)) {
            fVar.y1();
        }
    }
}
