package ej0;

import J81.f;
import J81.i;
import J81.k;
import J81.s;
import J81.t;
import Y61.l;
import com.avito.android.related_products.generated.api.favorites_complementary_on_app.FavoritesComplementaryOnAppResponse;
import com.avito.android.related_products.generated.api.favorites_complementary_on_app.UseCase;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RelatedProductsApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JP\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lej0/a;", "", "", "beduinComponents", "beduinAgent", "", "itemId", "context", "Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/UseCase;", "useCase", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/FavoritesComplementaryOnAppResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/UseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ej0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40118a {
    @f("1/favorites/{itemId}/complementary")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@i("Beduin-Components") @l String str, @i("Beduin-Agent") @l String str2, @s("itemId") long j12, @l @t("context") String str3, @l @t("use_case") UseCase useCase, @Y61.k Continuation<? super TypedResult<FavoritesComplementaryOnAppResponse>> continuation);
}
