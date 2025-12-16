package com.avito.android.imv_goods_advert;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvGoodsAdvertSimilarPresenterResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_advert/r;", "Lcom/avito/android/imv_goods_advert/q;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f170578a;

    @Inject
    public r(@Y61.k Resources resources) {
        this.f170578a = resources;
    }

    @Override // com.avito.android.imv_goods_advert.q
    public final int a() {
        return this.f170578a.getInteger(R.integer.similar_adverts_columns);
    }
}
