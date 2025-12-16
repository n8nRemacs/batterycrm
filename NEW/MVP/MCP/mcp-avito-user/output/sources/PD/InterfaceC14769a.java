package Pd;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.auction.remote.model.AuctionCheckResponse;
import com.avito.android.auction.remote.model.AuctionOfferResponse;
import com.avito.android.auction.remote.model.AuctionOfferV2Response;
import com.avito.android.auction.remote.model.AuctionSendingResult;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AuctionApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0011J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LPd/a;", "", "", "draftId", "serializedAttributes", "serializedSlots", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/auction/remote/model/AuctionSendingResult;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "itemId", "Lcom/avito/android/auction/remote/model/AuctionCheckResponse;", "c", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/auction/remote/model/AuctionOfferResponse;", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/auction/remote/model/AuctionOfferV2Response;", "b", "utmSource", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Pd.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14769a {
    @o("1/car/quickdeal/addByItem")
    @e
    @l
    Object a(@J81.c("itemId") @k String str, @J81.c("utmSource") @l String str2, @k Continuation<? super TypedResult<AuctionSendingResult>> continuation);

    @f("2/car/quickdeal/item-edit")
    @l
    Object b(@t("itemId") @k String str, @k Continuation<? super TypedResult<AuctionOfferV2Response>> continuation);

    @o("1/car/quickdeal/isAuctionAvailableForItem")
    @e
    @k
    I<AuctionCheckResponse> c(@J81.c("itemId") @k String itemId);

    @o("1/car/quickdeal/add")
    @e
    @k
    I<TypedResult<AuctionSendingResult>> d(@J81.c("draftID") @k String draftId, @J81.c(Navigation.ATTRIBUTES) @k String serializedAttributes, @J81.c("slots") @k String serializedSlots);

    @f("1/car/quickdeal/item-edit")
    @l
    Object e(@t("itemId") @k String str, @k Continuation<? super TypedResult<AuctionOfferResponse>> continuation);
}
