package I50;

import J81.e;
import J81.f;
import J81.i;
import J81.o;
import J81.t;
import K50.d;
import K50.g;
import K50.h;
import Y61.k;
import Y61.l;
import com.avito.android.offlinization.C;
import com.avito.android.passport.network.model.BusinessVerificationDuplicateCreationResult;
import com.avito.android.passport.network.model.BusinessVerificationDuplicateSuccessResult;
import com.avito.android.passport.network.model.ProfileCreationDuplicationOptionsResponse;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.MessageBody;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PassportApi.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J@\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\bH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\b\b\u0001\u0010\u0017\u001a\u00020\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\b2\b\b\u0001\u0010 \u001a\u00020\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\"\u0010\u001bJ\"\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\bH§@¢\u0006\u0004\b&\u0010\u0012Jj\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\b2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b,\u0010-JL\u00103\u001a\b\u0012\u0004\u0012\u0002020\b2\b\b\u0001\u0010.\u001a\u00020\u00052\b\b\u0001\u0010/\u001a\u00020\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u00101\u001a\u00020\u0005H§@¢\u0006\u0004\b3\u00104J \u00106\u001a\b\u0012\u0004\u0012\u0002050\b2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0004\b6\u0010%J \u00108\u001a\b\u0012\u0004\u0012\u0002070\b2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b8\u0010\u000fJ\u0016\u0010:\u001a\b\u0012\u0004\u0012\u0002090\bH§@¢\u0006\u0004\b:\u0010\u0012¨\u0006;"}, d2 = {"LI50/a;", "", "", "verticalId", "specificId", "", "name", "constructorRequestId", "Lcom/avito/android/remote/model/TypedResult;", "LK50/e;", "m", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draftId", "Lkotlin/G0;", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LK50/h;", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/Avatar;", "f", "()Lio/reactivex/rxjava3/core/I;", "phone", "mergeKey", "LK50/l;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "LK50/d;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MessageBody.SystemMessageBody.Platform.FLOW, "LK50/g;", "l", "LK50/b;", "n", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "profileToConvertId", "userIdFrom", "bVrfVerticalId", "bVrfSpecificId", "LK50/f;", "i", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "components", "beduinAgent", "verificationFlow", "scenario", "Lcom/google/gson/k;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/passport/network/model/ProfileCreationDuplicationOptionsResponse;", "k", "Lcom/avito/android/passport/network/model/BusinessVerificationDuplicateCreationResult;", "c", "Lcom/avito/android/passport/network/model/BusinessVerificationDuplicateSuccessResult;", "e", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: PassportApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: I50.a$a, reason: collision with other inner class name */
    public static final class C0447a {
    }

    @o("1/profiles/remove_draft")
    @e
    @l
    Object a(@J81.c(ChannelContext.Item.USER_ID) int i12, @k Continuation<? super TypedResult<G0>> continuation);

    @o("1/accounts_merge/check_ownership/request_code")
    @e
    @l
    Object b(@J81.c("phone") @k String str, @i("X-MergeKey") @l String str2, @k Continuation<? super TypedResult<K50.l>> continuation);

    @o("1/create_profile/business_vrf_duplicate")
    @e
    @l
    Object c(@J81.c("userIdFrom") int i12, @k Continuation<? super TypedResult<BusinessVerificationDuplicateCreationResult>> continuation);

    @f("2/accounts_merge/restore_options_dialog")
    @l
    Object d(@i("Beduin-Components") @k String str, @i("Beduin-Agent") @k String str2, @i("X-MergeKey") @l String str3, @l @t("verificationFlow") String str4, @t("scenario") @k String str5, @k Continuation<? super TypedResult<com.google.gson.k>> continuation);

    @f("1/create_profile/duplication/success")
    @l
    Object e(@k Continuation<? super TypedResult<BusinessVerificationDuplicateSuccessResult>> continuation);

    @C(timeoutMs = 2000)
    @f("1/profile/avatar")
    @k
    I<Avatar> f();

    @f("1/create_profile/get_business_vrf_data")
    @l
    Object g(@k Continuation<? super TypedResult<K50.b>> continuation);

    @o("1/passport/enabled")
    @l
    Object h(@k Continuation<? super TypedResult<h>> continuation);

    @o("1/accounts_merge/finish")
    @e
    @l
    Object i(@J81.c("profileToConvert[id]") @l Integer num, @J81.c("profileToConvert[verticalId]") @l Integer num2, @J81.c("profileToConvert[specificId]") @l Integer num3, @J81.c("businessVrfDuplication[userIdFrom]") @l Integer num4, @J81.c("businessVrfDuplication[verticalId]") @l Integer num5, @J81.c("businessVrfDuplication[specificId]") @l Integer num6, @i("X-MergeKey") @l String str, @k Continuation<? super TypedResult<K50.f>> continuation);

    @o("1/accounts_merge/check_ownership/confirm")
    @e
    @l
    Object j(@J81.c("phone") @k String str, @J81.c("code") @k String str2, @i("X-MergeKey") @l String str3, @k Continuation<? super TypedResult<d>> continuation);

    @f("1/create_profile/duplication_options")
    @l
    Object k(@t("draftId") @k String str, @k Continuation<? super TypedResult<ProfileCreationDuplicationOptionsResponse>> continuation);

    @f("1/accounts_merge/profile_list")
    @l
    Object l(@t(MessageBody.SystemMessageBody.Platform.FLOW) @k String str, @i("X-MergeKey") @l String str2, @k Continuation<? super TypedResult<g>> continuation);

    @o("3/profiles/create_draft")
    @e
    @l
    Object m(@J81.c("verticalId") int i12, @J81.c("specificId") @l Integer num, @J81.c("name") @k String str, @i("x-constructor-requestid") @k String str2, @k Continuation<? super TypedResult<K50.e>> continuation);

    @f("1/accounts_merge/get_business_vrf_data")
    @l
    Object n(@i("X-MergeKey") @l String str, @k Continuation<? super TypedResult<K50.b>> continuation);
}
