package lI0;

import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import J81.u;
import J81.y;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.CloseReasonsResponse;
import com.avito.android.remote.model.ReservationMessageResult;
import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.adverts.RestoreAdvertResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.profile.ItemActivateResponse;
import com.avito.android.remote.model.search.InlineFilterValue;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserAdvertApi.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\bJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\bJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\fJ\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u0018J%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t0\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\fJ1\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001f\u0010\bJU\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00022\u0014\b\u0001\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020 2\b\b\u0003\u0010#\u001a\u00020\"2\b\b\u0003\u0010$\u001a\u00020\u00022\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b&\u0010'J/\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010\bJ/\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020\"H'¢\u0006\u0004\b+\u0010,J/\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\t0\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010\bJ \u00102\u001a\b\u0012\u0004\u0012\u0002010\t2\b\b\u0001\u00100\u001a\u00020\u0002H§@¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"LlI0/a;", "", "", "advertId", "status", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/profile/ItemActivateResponse;", "o", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "i", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/ReservationMessageResult;", "c", "reason", "Lcom/avito/android/remote/model/SuccessResult;", "g", "m", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/adverts/RestoreAdvertResult;", "f", "Lio/reactivex/rxjava3/core/z;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "itemId", "Lcom/avito/android/remote/model/CloseReasonsResponse;", "b", "draftId", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails;", "j", "d", "", "extraParameters", "", "includeRefs", "action", MessageBody.SystemMessageBody.Platform.FLOW, "l", "(Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "newPrice", "e", "enabled", "n", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/I;", "cadastralNumber", "Lkotlin/G0;", "k", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$DeliverySettings;", "h", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: lI0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43640a {

    /* compiled from: UserAdvertApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lI0.a$a, reason: collision with other inner class name */
    public static final class C11781a {
    }

    @o("2/profile/item/{id}/delete")
    @k
    z<SuccessResult> a(@s("id") @k String advertId);

    @f("4/reasons/close/item/{itemId}")
    @k
    z<CloseReasonsResponse> b(@s("itemId") @k String itemId);

    @o("1/item/{id}/reservation")
    @e
    @k
    I<TypedResult<ReservationMessageResult>> c(@s("id") @k String advertId, @J81.c("status") @k String status);

    @o("1/item/draft/delete")
    @e
    @k
    I<TypedResult<Object>> d(@J81.c("id") @k String draftId, @J81.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME) @l String reason);

    @o("1/item/edit/setPrice")
    @e
    @k
    I<TypedResult<SimpleMessageResult>> e(@J81.c("itemId") @k String advertId, @J81.c("newPrice") @k String newPrice);

    @o("1/profile/item/{id}/restore")
    @k
    I<TypedResult<RestoreAdvertResult>> f(@s("id") @k String advertId);

    @o("2/profile/item/{id}/stop")
    @e
    @k
    I<SuccessResult> g(@s("id") @k String advertId, @J81.c("reason") @k String reason);

    @f
    @l
    Object h(@y @k String str, @k Continuation<? super TypedResult<MyAdvertDetails.DeliverySettings>> continuation);

    @o("1/profile/item/{id}/allow")
    @k
    I<TypedResult<SimpleMessageResult>> i(@s("id") @k String advertId);

    @f("1/item/draft/getCard")
    @k
    I<TypedResult<MyAdvertDetails>> j(@t("id") @k String draftId);

    @o("1/verification/realty-ownership/init")
    @e
    @k
    I<TypedResult<G0>> k(@J81.c("itemID") @k String itemId, @J81.c("cadnum") @k String cadastralNumber);

    @f("25/profile/item/{itemId}")
    @k
    I<MyAdvertDetails> l(@s("itemId") @k String itemId, @u @k Map<String, String> extraParameters, @t("includeRefs") boolean includeRefs, @t("action") @k String action, @l @t(MessageBody.SystemMessageBody.Platform.FLOW) String flow);

    @o("2/profile/item/{id}/stop")
    @e
    @l
    Object m(@s("id") @k String str, @J81.c("reason") @k String str2, @k Continuation<? super TypedResult<SuccessResult>> continuation);

    @o("1/autoPublish/set")
    @e
    @k
    I<TypedResult<SimpleMessageResult>> n(@J81.c("itemId") @k String itemId, @J81.c("enabled") boolean enabled);

    @o("5/profile/item/{id}/activate")
    @k
    I<ItemActivateResponse> o(@s("id") @k String advertId, @l @t("skipCpt") String status);
}
