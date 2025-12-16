package com.avito.android.advert_core.price_list.v2;

import com.avito.android.remote.model.imv_services.ImvServices;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertPriceListV2Presenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f84153l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertPriceListV2Item f84154m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AdvertPriceListV2Item advertPriceListV2Item) {
        super(0);
        this.f84153l = gVar;
        this.f84154m = advertPriceListV2Item;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertPriceListV2Item advertPriceListV2Item = this.f84154m;
        String str = advertPriceListV2Item.f84136c;
        if (str == null) {
            str = "";
        }
        ImvServices imvServices = advertPriceListV2Item.f84140g;
        g gVar = this.f84153l;
        if (imvServices == null) {
            gVar.getClass();
        } else {
            gVar.f84155b.a(str, imvServices);
        }
        return G0.f406611a;
    }
}
