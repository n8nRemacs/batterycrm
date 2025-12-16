package com.avito.android.imv_goods_advert.mvi;

import com.avito.android.imv_goods_advert.ImvGoodsAdvertParams;
import com.avito.android.imv_goods_advert.mvi.entity.ImvGoodsAdvertInternalAction;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImvGoodsAdvertBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.arch.mvi.b<ImvGoodsAdvertInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f170547a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImvGoodsAdvertParams f170548b;

    @Inject
    public e(@Y61.k Gson gson, @Y61.k ImvGoodsAdvertParams imvGoodsAdvertParams) {
        this.f170547a = gson;
        this.f170548b = imvGoodsAdvertParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ImvGoodsAdvertInternalAction> a() {
        c.f170542c.getClass();
        return new C43152f0(C43175k.G(new a(this.f170547a, this.f170548b, null)), new b(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
