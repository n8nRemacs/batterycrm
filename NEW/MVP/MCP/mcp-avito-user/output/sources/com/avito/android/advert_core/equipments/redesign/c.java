package com.avito.android.advert_core.equipments.redesign;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.AdvertEquipments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w8.C49466a;

/* compiled from: RedesignedEquipmentsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f83535l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EquipmentsItem f83536m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f83537n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertEquipments f83538o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, EquipmentsItem equipmentsItem, f fVar, AdvertEquipments advertEquipments) {
        super(0);
        this.f83535l = dVar;
        this.f83536m = equipmentsItem;
        this.f83537n = fVar;
        this.f83538o = advertEquipments;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f83535l;
        InterfaceC28373a interfaceC28373a = dVar.f83542e;
        EquipmentsItem equipmentsItem = this.f83536m;
        interfaceC28373a.c(new C49466a(equipmentsItem.f83471f, equipmentsItem.f83470e));
        Context context = this.f83537n.getContext();
        AdvertEquipments advertEquipments = this.f83538o;
        dVar.f83541d.a(context, advertEquipments.getTitle(), advertEquipments.getSubTitle(), advertEquipments.getOptions(), null, null);
        return G0.f406611a;
    }
}
