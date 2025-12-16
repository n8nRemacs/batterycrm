package zF0;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.travel_seller_banners.generated.api.api_1_str_seller_banners_get.Page;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TravelSellerBannersApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LzF0/a;", "", "Lcom/avito/android/travel_seller_banners/generated/api/api_1_str_seller_banners_get/Page;", "page", "Lcom/avito/android/remote/model/TypedResult;", "LAF0/a;", "a", "(Lcom/avito/android/travel_seller_banners/generated/api/api_1_str_seller_banners_get/Page;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_travel-seller-banners_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: zF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50455a {
    @f("1/str/seller/banners")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("page") @k Page page, @k Continuation<? super TypedResult<AF0.a>> continuation);
}
