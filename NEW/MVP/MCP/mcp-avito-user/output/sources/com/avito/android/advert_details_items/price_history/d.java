package com.avito.android.advert_details_items.price_history;

import androidx.core.os.C22777e;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: PriceHistoryPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f85394l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PriceHistoryItem f85395m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, PriceHistoryItem priceHistoryItem) {
        super(0);
        this.f85394l = fVar;
        this.f85395m = priceHistoryItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f85394l;
        PriceHistoryItem priceHistoryItem = this.f85395m;
        b.a.a(fVar.f85397b, priceHistoryItem.f85382h, null, C22777e.b(new Q("key.item_price_history_context", priceHistoryItem.f85381g), new Q("key.item_price_history_is_favorite", Boolean.valueOf(fVar.f85400e))), 2);
        return G0.f406611a;
    }
}
