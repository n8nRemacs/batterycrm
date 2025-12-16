package com.avito.android.advert.item.parking;

import Y41.l;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsParkingAddressPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<com.avito.android.lib.design.chips.h, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f78161l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f78162m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsParkingAddressItem f78163n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, g gVar, AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem) {
        super(1);
        this.f78161l = dVar;
        this.f78162m = gVar;
        this.f78163n = advertDetailsParkingAddressItem;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar) {
        AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem = this.f78163n;
        List<MultiAddressesItem> list = advertDetailsParkingAddressItem.f78135e;
        String string = hVar.getF199741b().toString();
        String textButtonShowMap = advertDetailsParkingAddressItem.f78136f.getTextButtonShowMap();
        this.f78161l.k(this.f78162m, list, string, textButtonShowMap, this.f78163n);
        return G0.f406611a;
    }
}
