package com.avito.android.imv_goods_advert;

import android.content.Context;
import android.content.Intent;
import com.avito.android.imv_goods_advert.ImvGoodsAdvertActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvGoodsAdvertIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_advert/k;", "Lcom/avito/android/imv_goods_advert/j;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f170534a;

    @Inject
    public k(@Y61.k Context context) {
        this.f170534a = context;
    }

    @Override // com.avito.android.imv_goods_advert.j
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k String str2) {
        ImvGoodsAdvertActivity.a aVar = ImvGoodsAdvertActivity.f170273n;
        ImvGoodsAdvertParams imvGoodsAdvertParams = new ImvGoodsAdvertParams(str, str2);
        aVar.getClass();
        return new Intent(this.f170534a, (Class<?>) ImvGoodsAdvertActivity.class).putExtra("open_params", imvGoodsAdvertParams);
    }
}
