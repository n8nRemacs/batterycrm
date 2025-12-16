package E6;

import J81.d;
import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CartItemApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J]\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LE6/a;", "", "", "itemId", "", "quantity", "sellerHashId", "", "isFirstAddToCart", "", "extraParameters", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/safedeal/a;", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes10.dex */
public interface a {
    @o("1/cart/item/update")
    @e
    @k
    I<TypedResult<com.avito.android.remote.safedeal.a>> a(@J81.c("itemId") @k String itemId, @J81.c("quantity") int quantity, @J81.c(SearchParamsConverterKt.SELLER_ID) @l String sellerHashId, @J81.c("isFirstAddToCart") @l Boolean isFirstAddToCart, @d @k Map<String, String> extraParameters);
}
