package com.avito.android.remote;

import com.avito.android.remote.model.AuthResult;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.CreateExtendedProfileResult;
import com.avito.android.remote.model.LandlinePhoneVerificationStatusResult;
import com.avito.android.remote.model.PhonePretendResult;
import com.avito.android.remote.model.PhoneValidationResult;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.ProfileConstructionResponse;
import com.avito.android.remote.model.ProfileShort;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.Social;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.ThirdPartyApi;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.password.PasswordChangeResult;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import com.avito.android.remote.model.profile_removal.ProfileRemoveResult;
import com.avito.android.remote.model.profile_support.ProfileRemoveSupport;
import com.avito.android.remote.model.user_profile.IncomeProfileSettingsResponse;
import com.avito.android.remote.model.user_profile.PhonesList;
import com.avito.android.remote.model.user_profile.UserProfileResult;
import com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse;
import com.avito.android.remote.model.user_profile.items.WalletItem;
import com.huawei.hms.api.FailedBinderCallBack;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: ProfileApi.kt */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\fH§@¢\u0006\u0004\b\u0015\u0010\u0013J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJS\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\f0\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u001c\u001a\u00020\u00162\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b!\u0010\"J,\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\f2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\b\u0003\u0010%\u001a\u00020\nH§@¢\u0006\u0004\b'\u0010\u000fJ\u0010\u0010(\u001a\u00020&H§@¢\u0006\u0004\b(\u0010\u0013J\u001a\u0010+\u001a\u00020&2\b\b\u0001\u0010*\u001a\u00020)H§@¢\u0006\u0004\b+\u0010,Js\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00022\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u00162\b\b\u0001\u0010.\u001a\u00020\u00162\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u00101\u001a\u0004\u0018\u00010\n2\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b6\u00107J-\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00022\u0016\b\u0001\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001608H'¢\u0006\u0004\b;\u0010<J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\fH§@¢\u0006\u0004\b>\u0010\u0013J9\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\f0\u00062\b\b\u0001\u0010?\u001a\u00020\u00162\b\b\u0001\u0010@\u001a\u00020\u00162\b\b\u0001\u0010A\u001a\u00020\nH'¢\u0006\u0004\bC\u0010DJ%\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\f0\u00062\b\b\u0001\u0010/\u001a\u00020\u0016H'¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\f0\u00062\b\b\u0001\u0010/\u001a\u00020\u0016H'¢\u0006\u0004\bH\u0010FJ%\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\f0\u00062\b\b\u0001\u0010J\u001a\u00020IH'¢\u0006\u0004\bL\u0010MJ%\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\f0\u00062\b\b\u0001\u0010/\u001a\u00020\u0016H'¢\u0006\u0004\bN\u0010FJ/\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\f0\u00062\b\b\u0001\u0010/\u001a\u00020\u00162\b\b\u0003\u0010O\u001a\u00020\u0016H'¢\u0006\u0004\bP\u0010QJ=\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\f0\u00022\b\b\u0001\u0010R\u001a\u00020\u00162\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\bV\u0010WJ%\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\f0\u00022\b\b\u0001\u0010R\u001a\u00020\u0016H'¢\u0006\u0004\bX\u0010YJ\u001b\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\f0\u0002H'¢\u0006\u0004\bZ\u0010\u0005J\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\fH§@¢\u0006\u0004\b\\\u0010\u0013J \u0010^\u001a\b\u0012\u0004\u0012\u00020B0\f2\b\b\u0001\u0010]\u001a\u00020\nH§@¢\u0006\u0004\b^\u0010\u000fJ)\u0010`\u001a\b\u0012\u0004\u0012\u00020:0\u00022\b\b\u0001\u0010/\u001a\u00020\u00162\b\b\u0001\u0010_\u001a\u00020\nH'¢\u0006\u0004\b`\u0010aJ/\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0\f0\u00062\b\b\u0001\u0010/\u001a\u00020\u00162\b\b\u0001\u0010_\u001a\u00020\nH'¢\u0006\u0004\bc\u0010dJ.\u0010h\u001a\u00020\u00162\b\b\u0001\u0010e\u001a\u00020\u00162\b\b\u0001\u0010f\u001a\u00020\u00162\b\b\u0003\u0010g\u001a\u00020\u0016H§@¢\u0006\u0004\bh\u0010iJ8\u0010n\u001a\b\u0012\u0004\u0012\u00020m0\f2\b\b\u0001\u0010j\u001a\u00020\u00162\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010l\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\bn\u0010iJN\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\f2\b\b\u0001\u0010o\u001a\u00020I2\n\b\u0001\u0010p\u001a\u0004\u0018\u00010I2\b\b\u0001\u00100\u001a\u00020\u00162\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\br\u0010sJ\"\u0010t\u001a\b\u0012\u0004\u0012\u00020B0\f2\n\b\u0001\u0010p\u001a\u0004\u0018\u00010IH§@¢\u0006\u0004\bt\u0010uJ\u0016\u0010v\u001a\b\u0012\u0004\u0012\u00020=0\fH§@¢\u0006\u0004\bv\u0010\u0013J*\u0010y\u001a\b\u0012\u0004\u0012\u00020B0\f2\b\b\u0001\u0010w\u001a\u00020\u00162\b\b\u0001\u0010x\u001a\u00020IH§@¢\u0006\u0004\by\u0010zJ \u0010}\u001a\b\u0012\u0004\u0012\u00020|0\f2\b\b\u0001\u0010{\u001a\u00020\u0016H§@¢\u0006\u0004\b}\u0010\u001aJ\"\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\f2\b\b\u0001\u0010~\u001a\u00020\u0016H§@¢\u0006\u0005\b\u0080\u0001\u0010\u001a¨\u0006\u0081\u0001"}, d2 = {"Lcom/avito/android/remote/z0;", "", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/Profile;", "a", "()Lio/reactivex/rxjava3/core/z;", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/ProfileShort;", "o", "()Lio/reactivex/rxjava3/core/I;", "", "supportsNewToggles", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/user_profile/UserProfileResult;", "s", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lcom/avito/android/remote/model/profile_removal/ProfileRemovalScreen;", "G", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/profile_support/ProfileRemoveSupport;", "I", "", "password", "Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult;", "J", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oldPassword", "newPassword", "phash", "sessionHashId", SearchParamsConverterKt.SOURCE, "Lcom/avito/android/remote/model/password/PasswordChangeResult;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "F", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPublic", "Lcom/avito/android/remote/model/Avatar;", "e", "b", "Lokhttp3/MultipartBody$Part;", "file", "l", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "session", "email", "phone", "name", "subscribe", SearchParamsConverterKt.LOCATION_ID, SearchParamsConverterKt.METRO_ID, SearchParamsConverterKt.DISTRICT_ID, "Lcom/avito/android/remote/model/AuthResult;", "D", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "", "profile", "Lcom/avito/android/remote/model/SuccessResult;", "m", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/user_profile/PhonesList;", "w", "currentPhone", "targetPhone", "deleteCurrentPhone", "Lkotlin/G0;", "g", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/I;", "z", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/PhoneValidationResult;", "h", "", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult;", "A", "(I)Lio/reactivex/rxjava3/core/I;", "i", "items", "t", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "type", "token", "code", "Lcom/avito/android/remote/model/Social;", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "d", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "r", "Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse;", "f", "value", "p", "isCompany", "B", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/PhonePretendResult;", "x", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/I;", "id", "position", "page", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scenario", "verificationToken", "mergeKey", "Lcom/avito/android/remote/model/ProfileConstructionResponse;", "H", "verticalId", "specificId", "Lcom/avito/android/remote/model/CreateExtendedProfileResult;", "v", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "C", "geoSessionId", "suggestAddressId", "k", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/user_profile/items/WalletItem;", "u", "sessionId", "Lcom/avito/android/remote/model/user_profile/items/AvitoFinanceResponse;", "j", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.z0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34401z0 {

    /* compiled from: ProfileApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.z0$a */
    public static final class a {
    }

    @J81.o("1/phones/verification/status")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<LandlinePhoneVerificationStatusResult>> A(@J81.c("callID") int callId);

    @J81.o("2/phones/link/pretend")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<SuccessResult> B(@J81.c("phone") @Y61.k String phone, @J81.c("isCompany") boolean isCompany);

    @J81.f("3/phones")
    @Y61.l
    Object C(@Y61.k Continuation<? super TypedResult<PhonesList>> continuation);

    @J81.o("2/register/social")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<AuthResult> D(@J81.c("session") @Y61.l String session, @J81.c("email") @Y61.k String email, @J81.c("phone") @Y61.l String phone, @J81.c("name") @Y61.l String name, @J81.c("subscribe") @Y61.l Boolean subscribe, @J81.c(SearchParamsConverterKt.LOCATION_ID) @Y61.l String locationId, @J81.c(SearchParamsConverterKt.METRO_ID) @Y61.l String metroId, @J81.c(SearchParamsConverterKt.DISTRICT_ID) @Y61.l String districtId);

    @com.avito.android.offlinization.C(timeoutMs = 2750)
    @J81.f("16/profile/info")
    @Y61.l
    Object E(@J81.t("supportsNewToggles") boolean z12, @Y61.k Continuation<? super TypedResult<UserProfileResult>> continuation);

    @J81.o("1/profile/password/set")
    @J81.e
    @Y61.l
    Object F(@J81.c("password") @Y61.k String str, @J81.c("token") @Y61.l String str2, @Y61.k Continuation<? super TypedResult<PasswordChangeResult>> continuation);

    @J81.o("1/profiles/remove/check")
    @Y61.l
    Object G(@Y61.k Continuation<? super TypedResult<ProfileRemovalScreen>> continuation);

    @J81.f("2/extended-profile/constructor/profiles-data")
    @Y61.l
    Object H(@J81.t("scenario") @Y61.k String str, @Y61.l @J81.t("verificationToken") String str2, @J81.i("X-MergeKey") @Y61.l String str3, @Y61.k Continuation<? super TypedResult<ProfileConstructionResponse>> continuation);

    @J81.o("1/profiles/remove/support")
    @Y61.l
    Object I(@Y61.k Continuation<? super TypedResult<ProfileRemoveSupport>> continuation);

    @J81.o("1/profiles/remove/confirm")
    @J81.e
    @Y61.l
    Object J(@J81.c("password") @Y61.l String str, @Y61.k Continuation<? super TypedResult<ProfileRemoveResult>> continuation);

    @J81.f("4/profile")
    @Y61.k
    io.reactivex.rxjava3.core.z<Profile> a();

    @J81.b("1/profile/avatar")
    @Y61.l
    @ThirdPartyApi
    Object b(@Y61.k Continuation<? super Avatar> continuation);

    @J81.o("1/internalBannerRotation/close")
    @J81.e
    @Y61.l
    @ThirdPartyApi
    Object c(@J81.c("id") @Y61.k String str, @J81.c("position") @Y61.k String str2, @J81.c("page") @Y61.k String str3, @Y61.k Continuation<? super String> continuation);

    @J81.b("3/profile/social/{socialNetworkType}")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<Social>> d(@J81.s("socialNetworkType") @Y61.k String type);

    @com.avito.android.offlinization.C(timeoutMs = 2000)
    @J81.f("1/profile/avatar")
    @Y61.l
    @ThirdPartyApi
    Object e(@J81.t("isPublic") boolean z12, @Y61.k Continuation<? super Avatar> continuation);

    @J81.f("2/profile/income/settings")
    @Y61.l
    Object f(@Y61.k Continuation<? super TypedResult<IncomeProfileSettingsResponse>> continuation);

    @J81.o("1/managePhone/replace")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<kotlin.G0>> g(@J81.c("currentPhone") @Y61.k String currentPhone, @J81.c("targetPhone") @Y61.k String targetPhone, @J81.c("shouldDeleteAfterReplace") boolean deleteCurrentPhone);

    @J81.o("2/phones/verification/validate")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PhoneValidationResult>> h(@J81.c("phone") @Y61.k String phone);

    @J81.o("1/phones/verification/requestCallback")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<kotlin.G0>> i(@J81.c("phone") @Y61.k String phone);

    @J81.f("1/profile/finance")
    @Y61.l
    Object j(@J81.t("sessionId") @Y61.k String str, @Y61.k Continuation<? super TypedResult<AvitoFinanceResponse>> continuation);

    @J81.o("1/addresses/hide-suggested")
    @J81.e
    @Y61.l
    Object k(@J81.c("geoSessionId") @Y61.k String str, @J81.c("suggestedAddressId") int i12, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.o("1/profile/avatar")
    @J81.l
    @Y61.l
    @ThirdPartyApi
    Object l(@J81.q @Y61.k MultipartBody.Part part, @Y61.k Continuation<? super Avatar> continuation);

    @J81.n("3/profile")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<SuccessResult> m(@J81.d @Y61.k Map<String, String> profile);

    @J81.o("1/vertical-profile/specific/edit")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @Y61.l
    Object n(@J81.c("specificId") @Y61.l Integer num, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.f("1/profile/short")
    @Y61.k
    io.reactivex.rxjava3.core.I<ProfileShort> o();

    @J81.o("1/income/toggleUserDefault")
    @Y61.l
    Object p(@J81.t("enabled") boolean z12, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.o("1/profile/password/change")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PasswordChangeResult>> q(@J81.c("oldpass") @Y61.k String oldPassword, @J81.c("password") @Y61.k String newPassword, @J81.c("token") @Y61.l String phash, @J81.c("sessionHashId") @Y61.l String sessionHashId, @J81.c(SearchParamsConverterKt.SOURCE) @Y61.l String source);

    @J81.f("3/profile/social")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<Social>> r();

    @J81.f("15/profile/info")
    @Y61.l
    Object s(@J81.t("supportsNewToggles") boolean z12, @Y61.k Continuation<? super TypedResult<UserProfileResult>> continuation);

    @J81.o("1/phones/apply")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<kotlin.G0>> t(@J81.c("phone") @Y61.k String phone, @J81.c("items") @Y61.k String items);

    @J81.f
    @Y61.l
    Object u(@J81.y @Y61.k String str, @Y61.k Continuation<? super TypedResult<WalletItem>> continuation);

    @J81.o("1/vertical-profile/create")
    @J81.e
    @Y61.l
    Object v(@J81.c("verticalId") int i12, @J81.c("specificId") @Y61.l Integer num, @J81.c("name") @Y61.k String str, @J81.c("verificationToken") @Y61.l String str2, @J81.c("scenario") @Y61.l String str3, @Y61.k Continuation<? super TypedResult<CreateExtendedProfileResult>> continuation);

    @J81.f("3/phones")
    @Y61.l
    Object w(@Y61.k Continuation<? super TypedResult<PhonesList>> continuation);

    @J81.o("1/verifyPhoneForItemAdd/status")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PhonePretendResult>> x(@J81.c("phone") @Y61.k String phone, @J81.c("isCompany") boolean isCompany);

    @J81.o("3/profile/social/{socialNetworkType}")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<Social>> y(@J81.s("socialNetworkType") @Y61.k String type, @J81.c("accessToken") @Y61.l String token, @J81.c("code") @Y61.l String code);

    @J81.o("1/managePhone/delete")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<kotlin.G0>> z(@J81.c("phone") @Y61.k String phone);
}
