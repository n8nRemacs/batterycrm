package fa;

import J81.o;
import J81.s;
import J81.t;
import J81.u;
import J81.y;
import Y61.k;
import Y61.l;
import com.avito.android.offlinization.C;
import com.avito.android.offlinization.m;
import com.avito.android.progress_info_toast_bar.ProgressBarResponse;
import com.avito.android.remote.messenger.UserOnlineStatus;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.BeduinItems;
import com.avito.android.remote.model.CreditInfo;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UpdateAdvertNoteResponse;
import com.avito.android.remote.model.advert_badge_bar.BadgeDetailsResponse;
import com.avito.android.remote.model.advert_details.commercials.AdvertCommercialsResponse;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.section.SectionResponse;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsApi.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0089\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0014\b\u0003\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\bJA\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011H'¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\bJ/\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010$J1\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b&\u0010$J9\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\b\b\u0001\u0010'\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\rH'¢\u0006\u0004\b+\u0010,J)\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010$J%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u0005012\b\b\u0001\u00100\u001a\u00020\u0002H'¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"Lfa/a;", "", "", "itemId", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/CreditInfo;", "g", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "components", "beduinAgent", "context", "requestId", "", "addressId", "fromPage", "userAddressId", "", "extraParams", "Lcom/avito/android/remote/model/AdvertDetails;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "userHashId", "Lcom/avito/android/remote/messenger/UserOnlineStatus;", "b", "advertId", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "locationParams", "Lcom/avito/android/remote/model/section/SectionResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/advert_details/commercials/AdvertCommercialsResponse;", "d", "content", "Lkotlin/G0;", "h", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/UpdateAdvertNoteResponse;", "e", "objectId", "objectEntity", "badgeId", "Lcom/avito/android/remote/model/advert_badge_bar/BadgeDetailsResponse;", "j", "(Ljava/lang/String;Ljava/lang/String;I)Lio/reactivex/rxjava3/core/z;", ChannelContext.Item.USER_ID, "Lcom/avito/android/progress_info_toast_bar/ProgressBarResponse;", "a", ContextActionHandler.Link.URL, "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/BeduinItems;", "i", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC40383a {

    /* compiled from: AdvertDetailsApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fa.a$a, reason: collision with other inner class name */
    public static final class C11160a {
    }

    @J81.f("1/transport/contacts/deal/progress")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @k
    z<ProgressBarResponse> a(@t("itemId") @k String itemId, @t(ChannelContext.Item.USER_ID) @k String userId);

    @J81.f("2/user/{userHashId}/get-status")
    @k
    z<TypedResult<UserOnlineStatus>> b(@s("userHashId") @k String userHashId);

    @J81.f("2/items/{advertId}/complementary")
    @k
    z<SectionResponse> c(@s("advertId") @k String advertId, @l @t(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME) String from, @u @k Map<String, String> locationParams);

    @J81.f("2/items/{advertId}/banners")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @k
    z<TypedResult<AdvertCommercialsResponse>> d(@s("advertId") @k String advertId);

    @o("1/notes/update")
    @J81.e
    @k
    z<TypedResult<UpdateAdvertNoteResponse>> e(@J81.c("itemId") @k String advertId, @J81.c("content") @l String content);

    @C(timeoutMs = 1750)
    @J81.f("19/items/{itemId}")
    @J81.k({"X-Geo-required: true"})
    @k
    z<AdvertDetails> f(@J81.i("Beduin-Components") @l String components, @J81.i("Beduin-Agent") @l String beduinAgent, @s("itemId") @k String itemId, @l @t("context") String context, @l @t("requestId") String requestId, @l @m @t("addressId") Integer addressId, @l @t("fromPage") String fromPage, @l @t("userAddressId") Integer userAddressId, @u @k Map<String, String> extraParams);

    @J81.f("2/items/{itemId}/credit_info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @k
    z<TypedResult<CreditInfo>> g(@s("itemId") @k String itemId);

    @o("1/notes/create")
    @J81.e
    @k
    z<TypedResult<G0>> h(@J81.c("itemId") @k String advertId, @J81.c("content") @k String content);

    @J81.f
    @k
    I<TypedResult<BeduinItems>> i(@y @k String url);

    @J81.f("1/badges/content")
    @k
    z<TypedResult<BadgeDetailsResponse>> j(@t("objectId") @k String objectId, @t("objectEntity") @k String objectEntity, @t("badgeId") int badgeId);
}
