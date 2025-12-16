package com.avito.android.advert.item.equipmentsTile;

import android.content.Context;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w8.C49466a;

/* compiled from: AdvertDetailsEquipmentsTilePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f75336l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsEquipmentsTileItem f75337m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f75338n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AdvertDetailsEquipmentsTileItem advertDetailsEquipmentsTileItem, m mVar) {
        super(0);
        this.f75336l = gVar;
        this.f75337m = advertDetailsEquipmentsTileItem;
        this.f75338n = mVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f75336l;
        InterfaceC28373a interfaceC28373a = gVar.f75339b;
        AdvertDetailsEquipmentsTileItem advertDetailsEquipmentsTileItem = this.f75337m;
        interfaceC28373a.c(new C49466a(advertDetailsEquipmentsTileItem.f75324k, advertDetailsEquipmentsTileItem.f75323j));
        Context context = this.f75338n.getContext();
        u3.l<SimpleTestGroupWithNone> lVar = gVar.f75343f;
        Boolean boolValueOf = Boolean.valueOf(lVar.f439745a.f439749b.b());
        gVar.f75341d.a(context, advertDetailsEquipmentsTileItem.f75317d, advertDetailsEquipmentsTileItem.f75318e, advertDetailsEquipmentsTileItem.f75320g, advertDetailsEquipmentsTileItem.f75321h, boolValueOf);
        if (advertDetailsEquipmentsTileItem.f75321h != null && lVar.f439745a.f439749b.a()) {
            lVar.b();
        }
        return G0.f406611a;
    }
}
