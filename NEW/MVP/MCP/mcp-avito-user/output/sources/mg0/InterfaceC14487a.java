package Mg0;

import J81.e;
import J81.f;
import J81.h;
import J81.o;
import J81.q;
import J81.s;
import J81.t;
import J81.u;
import J81.y;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.RatingsImageUploadResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.RequestReviewResult;
import com.avito.android.remote.model.publish.RatingPublishResult;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.remote.model.rating_details_mvi.ReviewActionsResult;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import com.avito.android.remote.model.review_reply.AddReviewReplyResult;
import com.avito.android.remote.model.review_reply.DeleteBuyerReviewResult;
import com.avito.android.remote.model.review_reply.DeleteModelReviewResult;
import com.avito.android.remote.model.review_reply.DeleteReviewReplyResult;
import com.avito.android.remote.model.user_contacts.UserContactsResult;
import com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: RatingApi.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JP\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000f\u0010\u0010Jp\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0011\u001a\u00020\b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00152\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0015H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u001b\u001a\u00020\bH§@¢\u0006\u0004\b\u001f\u0010\u001eJL\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010 \u001a\u00020\u00022\u0014\b\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00152\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0015H§@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u001b\u001a\u00020\bH§@¢\u0006\u0004\b#\u0010\u001eJ \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010\u0007J\u001a\u0010'\u001a\u00020&2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b'\u0010\u0007J\u001a\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010\u0007J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00040*2\b\b\u0001\u0010\u0011\u001a\u00020\bH'¢\u0006\u0004\b,\u0010-J\"\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b0\u0010\u001eJ \u00101\u001a\b\u0012\u0004\u0012\u00020/0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\bH§@¢\u0006\u0004\b1\u0010\u001eJ*\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020\bH§@¢\u0006\u0004\b3\u00104JB\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\b2\n\b\u0001\u00105\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b7\u00108J \u0010:\u001a\b\u0012\u0004\u0012\u00020$0\u00042\b\b\u0001\u00109\u001a\u00020\u0002H§@¢\u0006\u0004\b:\u0010\u0007J%\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00040*2\b\b\u0001\u0010;\u001a\u00020\bH'¢\u0006\u0004\b<\u0010-J%\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00040*2\b\b\u0001\u0010.\u001a\u00020\bH'¢\u0006\u0004\b>\u0010-J\"\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00042\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\bA\u0010\u001eJ/\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00040E2\b\b\u0001\u0010C\u001a\u00020B2\b\b\u0001\u0010D\u001a\u00020\bH'¢\u0006\u0004\bG\u0010H¨\u0006I"}, d2 = {"LMg0/a;", "", "", "reviewId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult;", "i", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "urlPath", "", "typeId", "appealType", "text", "Lcom/avito/android/remote/model/review_action_network_request/ReviewActionNetworkRequestResult;", "t", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userKey", "contextId", "srcRole", "fromItem", "", "searchParameters", "requiredFilters", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsResult;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextPage", "Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryEntry;", "h", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "itemId", "j", "(JLjava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "Lcom/avito/android/remote/model/review_reply/DeleteReviewReplyResult;", "c", "Lcom/avito/android/remote/model/review_reply/DeleteModelReviewResult;", "b", "Lcom/avito/android/remote/model/review_reply/DeleteBuyerReviewResult;", "e", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/publish/RatingPublishResult;", "s", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "context", "Lcom/avito/android/remote/model/user_contacts/UserContactsResult;", "o", "m", "Lkotlin/G0;", "g", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "images", "Lcom/avito/android/remote/model/review_reply/AddReviewReplyResult;", "p", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "answerId", "l", "token", "a", "Lcom/avito/android/remote/model/messenger/RequestReviewResult;", "d", "page", "Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult;", "f", "Lokhttp3/MultipartBody$Part;", "file", "imageType", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/RatingsImageUploadResult;", "n", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Mg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14487a {
    @o("1/profile/ratings/revert")
    @e
    @k
    z<TypedResult<G0>> a(@J81.c("token") @k String token);

    @e
    @InterfaceC42830m
    @l
    @h(hasBody = true, method = "POST", path = "1/rating/model/delete")
    Object b(@J81.c("reviewId") long j12, @k Continuation<? super DeleteModelReviewResult> continuation);

    @e
    @l
    @h(hasBody = true, method = "DELETE", path = "1/profile/reviews/delete")
    Object c(@J81.c("reviewId") long j12, @k Continuation<? super TypedResult<DeleteReviewReplyResult>> continuation);

    @o("2/rating/messenger/request/send")
    @e
    @k
    z<TypedResult<RequestReviewResult>> d(@J81.c("context") @k String context);

    @e
    @InterfaceC42830m
    @l
    @h(hasBody = true, method = "POST", path = "1/rating/buyer/delete")
    Object e(@J81.c("reviewId") long j12, @k Continuation<? super DeleteBuyerReviewResult> continuation);

    @f("1/profile/reviews/cxresearch")
    @l
    Object f(@l @t("page") String str, @k Continuation<? super TypedResult<RatingUxFeedbackResult>> continuation);

    @o("1/rating/contacts/remove")
    @e
    @l
    Object g(@J81.c("hashUserId") @k String str, @J81.c("itemId") @k String str2, @k Continuation<? super TypedResult<G0>> continuation);

    @f
    @l
    Object h(@y @k String str, @k Continuation<? super TypedResult<PhotoGalleryEntry>> continuation);

    @f("1/profile/reviews/{reviewId}/actions")
    @l
    Object i(@s("reviewId") long j12, @k Continuation<? super TypedResult<ReviewActionsResult>> continuation);

    @f("4/reviews/users/item/{itemId}/reviews")
    @l
    Object j(@s("itemId") long j12, @u @k Map<String, String> map, @u @k Map<String, String> map2, @k Continuation<? super TypedResult<RatingDetailsResult>> continuation);

    @f("8/user/{userKey}/ratings")
    @l
    Object k(@s("userKey") @k String str, @l @t("context") String str2, @l @t("srcRole") String str3, @l @t("fromItem") Long l12, @u @k Map<String, String> map, @u @k Map<String, String> map2, @k Continuation<? super TypedResult<RatingDetailsResult>> continuation);

    @o("1/profile/reviews/answer/delete")
    @e
    @l
    Object l(@J81.c("answerId") long j12, @k Continuation<? super TypedResult<DeleteReviewReplyResult>> continuation);

    @f
    @l
    Object m(@y @k String str, @k Continuation<? super TypedResult<UserContactsResult>> continuation);

    @o("1/rating/image")
    @J81.l
    @k
    I<TypedResult<RatingsImageUploadResult>> n(@q @k MultipartBody.Part file, @t("imageType") @k String imageType);

    @f("1/rating/contacts/list")
    @l
    Object o(@l @t("context") String str, @k Continuation<? super TypedResult<UserContactsResult>> continuation);

    @o("1/profile/reviews/answer/add")
    @e
    @l
    Object p(@J81.c("reviewId") long j12, @J81.c("text") @k String str, @J81.c("images") @l String str2, @J81.c("context") @l String str3, @k Continuation<? super TypedResult<AddReviewReplyResult>> continuation);

    @f
    @l
    Object q(@y @k String str, @k Continuation<? super TypedResult<RatingDetailsResult>> continuation);

    @f
    @l
    Object r(@y @k String str, @k Continuation<? super TypedResult<RatingDetailsResult>> continuation);

    @o("4/rating/add/form")
    @e
    @k
    z<TypedResult<RatingPublishResult>> s(@J81.c("userKey") @k String userKey);

    @o
    @e
    @l
    Object t(@y @k String str, @J81.c("reviewId") @l Integer num, @J81.c("typeId") @l Integer num2, @J81.c("appealType") @l Integer num3, @J81.c("text") @l String str2, @k Continuation<? super TypedResult<ReviewActionNetworkRequestResult>> continuation);
}
