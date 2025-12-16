package Rq0;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.t;
import J81.u;
import J81.y;
import Sq0.g;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SellerPromotionsApi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JJ\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJT\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\u0011\u0010\u0012JV\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LRq0/a;", "", "", ContextActionHandler.Link.URL, SearchParamsConverterKt.SELLER_ID, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "", "extraParams", "Lcom/avito/android/remote/model/TypedResult;", "LSq0/f;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "offset", "", "limit", "LSq0/g;", "c", "(Ljava/lang/String;Ljava/lang/String;JILjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changedItems", "LSq0/e;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSq0/d;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Rq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15072a {
    @f
    @l
    Object a(@y @k String str, @t(SearchParamsConverterKt.SELLER_ID) @k String str2, @t(BeduinPromoBlockModel.SERIALIZED_NAME_THEME) @k String str3, @u @k Map<String, String> map, @k Continuation<? super TypedResult<Sq0.f>> continuation);

    @o
    @e
    @l
    Object b(@y @k String str, @J81.c(SearchParamsConverterKt.SELLER_ID) @k String str2, @d @k Map<String, String> map, @d @k Map<String, String> map2, @k Continuation<? super TypedResult<Sq0.e>> continuation);

    @f
    @l
    Object c(@y @k String str, @t(SearchParamsConverterKt.SELLER_ID) @k String str2, @t("offset") long j12, @t("limit") int i12, @u @k Map<String, String> map, @k Continuation<? super TypedResult<g>> continuation);

    @f
    @l
    Object d(@y @k String str, @t(SearchParamsConverterKt.SELLER_ID) @k String str2, @u @k Map<String, String> map, @k Continuation<? super TypedResult<Sq0.d>> continuation);
}
