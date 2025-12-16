package com.avito.android.advert_core.price_list.preview;

import com.avito.android.advert.item.W0;
import com.avito.android.remote.model.price_list.AdvertPriceListPreviewResponse;
import com.avito.android.remote.model.price_list.PriceList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertPriceListPreviewItemViewPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f84129l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertPriceListPreviewItem f84130m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertPriceListPreviewItem f84131n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AdvertPriceListPreviewItem advertPriceListPreviewItem, AdvertPriceListPreviewItem advertPriceListPreviewItem2) {
        super(0);
        this.f84129l = iVar;
        this.f84130m = advertPriceListPreviewItem;
        this.f84131n = advertPriceListPreviewItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        W0 w02;
        AdvertPriceListPreviewResponse.Event event = this.f84130m.f84116k;
        i iVar = this.f84129l;
        if (event != null) {
            iVar.f84132b.c(new P9.a(event.getId(), event.getVersion(), event.getUid(), event.getIid(), event.getMcid()));
        }
        PriceList priceList = this.f84131n.f84115j;
        if (priceList != null && (w02 = iVar.f84133c) != null) {
            w02.d(priceList);
        }
        return G0.f406611a;
    }
}
