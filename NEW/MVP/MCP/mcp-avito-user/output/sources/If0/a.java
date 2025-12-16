package IF0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import JF0.g;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TrxPromoGoodsApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0007J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"LIF0/a;", "", "", "trxPromoGoodsContext", "Lcom/avito/android/remote/model/TypedResult;", "LJF0/e;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commission", "date", "Lcom/avito/android/remote/model/DeepLinkResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJF0/b;", "e", "LJF0/g;", "b", "d", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes4.dex */
public interface a {
    @o("1/trx-promo/goods/configure/apply")
    @e
    @l
    Object a(@J81.c("commission") @k String str, @J81.c("date") @k String str2, @J81.c("context") @k String str3, @k Continuation<? super TypedResult<DeepLinkResponse>> continuation);

    @f("1/trx-promo/goods/configure/success")
    @l
    Object b(@t("context") @k String str, @k Continuation<? super TypedResult<g>> continuation);

    @f("3/trx-promo/goods/configure")
    @l
    Object c(@t("context") @k String str, @k Continuation<? super TypedResult<JF0.e>> continuation);

    @f("1/trx-promo/goods/configure/forbidden")
    @l
    Object d(@t("context") @k String str, @k Continuation<? super TypedResult<g>> continuation);

    @o("1/trx-promo/goods/configure/cancel")
    @e
    @l
    Object e(@J81.c("context") @k String str, @k Continuation<? super TypedResult<JF0.b>> continuation);
}
