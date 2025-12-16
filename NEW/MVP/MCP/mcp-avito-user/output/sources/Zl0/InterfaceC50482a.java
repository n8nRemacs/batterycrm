package zL0;

import BL0.d;
import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VasApi.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u000eJ%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u00022\u0014\b\u0001\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0001\u0010\f\u001a\u00020\u00022\u0014\b\u0001\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u00022\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\u001dJ@\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0001\u0010\f\u001a\u00020\u00022\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\u001fJ/\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010\tJ*\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010\u000eJ%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b'\u0010\u0016J \u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010\u0018J;\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0019H'¢\u0006\u0004\b*\u0010+J6\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0019H§@¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"LzL0/a;", "", "", "advertId", "checkoutContext", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "LDL0/b;", "i", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "LCL0/c;", "d", "itemId", "m", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/I;", "LHL0/b;", "e", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "a", "LBL0/d;", "k", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "slugs", "Lcom/avito/android/remote/model/DeepLinkResponse;", "c", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "p", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stickerIds", "f", "j", "LFL0/d;", "l", "o", "LGL0/c;", "h", "g", "Lkotlin/G0;", "n", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "q", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: zL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC50482a {
    @f("6/profile/item/{itemId}/vas/visual")
    @l
    Object a(@s("itemId") @k String str, @t("checkoutContext") @k String str2, @k Continuation<? super TypedResult<HL0.b>> continuation);

    @f("3/profile/item/{itemId}/vas/applied")
    @l
    Object b(@s("itemId") @k String str, @k Continuation<? super TypedResult<d>> continuation);

    @o("2/vas/context")
    @e
    @k
    z<TypedResult<DeepLinkResponse>> c(@J81.c("itemId") @k String itemId, @J81.d @k Map<String, String> slugs, @J81.c("checkoutContext") @k String checkoutContext);

    @f("2/profile/item/{itemId}/vas/competitive")
    @k
    z<TypedResult<CL0.c>> d(@s("itemId") @k String advertId, @t("checkoutContext") @k String checkoutContext);

    @f("6/profile/item/{itemId}/vas/visual")
    @k
    I<TypedResult<HL0.b>> e(@s("itemId") @k String advertId, @t("checkoutContext") @k String checkoutContext);

    @o("1/vas/stickers/context")
    @e
    @k
    z<TypedResult<DeepLinkResponse>> f(@J81.c("itemId") @k String itemId, @J81.d @k Map<String, String> stickerIds, @J81.c("checkoutContext") @k String checkoutContext);

    @f("1/profile/item/{itemId}/vas/stickers/edit")
    @l
    Object g(@s("itemId") @k String str, @k Continuation<? super TypedResult<GL0.c>> continuation);

    @f("1/profile/item/{itemId}/vas/stickers/edit")
    @k
    z<TypedResult<GL0.c>> h(@s("itemId") @k String advertId);

    @f("3/profile/item/{itemId}/vas/performance")
    @k
    z<TypedResult<DL0.b>> i(@s("itemId") @k String advertId, @t("checkoutContext") @k String checkoutContext);

    @o("1/vas/stickers/context")
    @e
    @l
    Object j(@J81.c("itemId") @k String str, @J81.d @k Map<String, String> map, @J81.c("checkoutContext") @k String str2, @k Continuation<? super TypedResult<DeepLinkResponse>> continuation);

    @f("3/profile/item/{itemId}/vas/applied")
    @k
    z<TypedResult<d>> k(@s("itemId") @k String advertId);

    @f("2/profile/item/{itemId}/vas/stickers/buy")
    @k
    z<TypedResult<FL0.d>> l(@s("itemId") @k String advertId, @t("checkoutContext") @k String checkoutContext);

    @f("2/profile/item/{itemId}/vas/competitive")
    @l
    Object m(@s("itemId") @k String str, @t("checkoutContext") @k String str2, @k Continuation<? super TypedResult<CL0.c>> continuation);

    @o("1/profile/item/{itemId}/vas/stickers/save")
    @e
    @k
    z<TypedResult<G0>> n(@s("itemId") @k String advertId, @J81.d @k Map<String, String> stickerIds);

    @f("2/profile/item/{itemId}/vas/stickers/buy")
    @l
    Object o(@s("itemId") @k String str, @t("checkoutContext") @k String str2, @k Continuation<? super TypedResult<FL0.d>> continuation);

    @o("2/vas/context")
    @e
    @l
    Object p(@J81.c("itemId") @k String str, @J81.d @k Map<String, String> map, @J81.c("checkoutContext") @k String str2, @k Continuation<? super TypedResult<DeepLinkResponse>> continuation);

    @o("1/profile/item/{itemId}/vas/stickers/save")
    @e
    @l
    Object q(@s("itemId") @k String str, @J81.d @k Map<String, String> map, @k Continuation<? super TypedResult<G0>> continuation);
}
