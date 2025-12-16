package com.avito.android.remote;

import com.avito.android.remote.model.ActualizePhonesScenarioResult;
import com.avito.android.remote.model.AuthSocialsStatusResult;
import com.avito.android.remote.model.AuthSuggestsResult;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.ParsingPermissionResult;
import com.avito.android.remote.model.SocialAuthResult;
import com.avito.android.remote.model.SocialProceedResult;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.password.PasswordChangeResult;
import com.avito.android.remote.model.recover_by_phone.RecoverByEmailResult;
import com.avito.android.remote.model.recover_by_phone.ResetPasswordResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AuthApi.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jq\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J¯\u0001\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\f2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u007f\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\f2\b\b\u0001\u0010\u001d\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010 J1\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0#2\u0014\b\u0001\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020!H'¢\u0006\u0004\b%\u0010&JG\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\r0\f2\b\b\u0001\u0010'\u001a\u00020\u00022\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b+\u0010,J5\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b.\u0010/J^\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u00100\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b2\u00103JE\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\r0#2\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u0002052\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b7\u00108JE\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\r0#2\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u0002052\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b9\u00108J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\r0#2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b;\u0010<J9\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\r0\f2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020\u00022\b\b\u0001\u0010=\u001a\u00020\u0002H'¢\u0006\u0004\b?\u0010@J9\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\bB\u0010@JY\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\r0#2\b\b\u0001\u0010=\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\bD\u0010EJ9\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\r0#2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\bF\u0010GJ \u0010J\u001a\b\u0012\u0004\u0012\u00020I0\r2\b\b\u0003\u0010H\u001a\u00020\u0007H§@¢\u0006\u0004\bJ\u0010KJ\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\rH§@¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/avito/android/remote/d;", "", "", "login", "password", "token", "provider", "", "isSandbox", "suggestKey", "src", "trackerUID", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/LoginResult;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "networkType", "accessToken", "pushToken", "email", "socialId", "code", VoiceInfo.STATE, "error", "errorMessage", "Lcom/avito/android/remote/model/SocialAuthResult;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "authCode", ChannelContext.UserToUser.TYPE, "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "", "hashUserIds", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/AuthSuggestsResult;", "i", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "newPassword", "phash", "context", "Lcom/avito/android/remote/model/password/PasswordChangeResult;", "g", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/SuccessResult;", "l", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/z;", "hash", "name", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phone", "", "Lcom/avito/android/remote/model/ParsingPermissionResult;", "h", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lio/reactivex/rxjava3/core/I;", "o", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByEmailResult;", "k", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "type", "Lcom/avito/android/remote/model/recover_by_phone/ResetPasswordResult;", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "codeSrc", "b", "Lcom/avito/android/remote/model/SocialProceedResult;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "onlyRemainingPhones", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/AuthSocialsStatusResult;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.d, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34258d {

    /* compiled from: AuthApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.d$a */
    public static final class a {
    }

    @J81.f("1/actualizePhone/status")
    @Y61.l
    Object a(@J81.t("onlyRemainingPhones") boolean z12, @Y61.k Continuation<? super TypedResult<ActualizePhonesScenarioResult>> continuation);

    @J81.o("2/tfa/auth")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<LoginResult>> b(@J81.c("code") @Y61.k String code, @J81.c(MessageBody.SystemMessageBody.Platform.FLOW) @Y61.k String codeSrc, @J81.c("fid") @Y61.k String trackerUID);

    @J81.o("2/social/proceed")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<SocialProceedResult>> c(@J81.c("provider") @Y61.k String provider, @J81.c("suggestKey") @Y61.k String suggestKey, @J81.c("fid") @Y61.k String trackerUID);

    @J81.o("11/auth")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<LoginResult>> d(@J81.c("login") @Y61.k String login, @J81.c("password") @Y61.k String password, @J81.c("token") @Y61.k String token, @J81.c("provider") @Y61.l String provider, @J81.c("isSandbox") boolean isSandbox, @J81.c("suggestKey") @Y61.l String suggestKey, @J81.c("src") @Y61.l String src, @J81.c("fid") @Y61.k String trackerUID);

    @J81.f("1/social/available")
    @Y61.l
    Object e(@Y61.k Continuation<? super TypedResult<AuthSocialsStatusResult>> continuation);

    @J81.o("2/register/complete")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.l
    Object f(@J81.c("hash") @Y61.k String str, @J81.c("name") @Y61.k String str2, @J81.c("password") @Y61.k String str3, @J81.c("token") @Y61.k String str4, @J81.c("provider") @Y61.l String str5, @J81.c("isSandbox") boolean z12, @J81.c("fid") @Y61.k String str6, @Y61.k Continuation<? super TypedResult<LoginResult>> continuation);

    @J81.o("1/profile/password/upgrade")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<PasswordChangeResult>> g(@J81.c("password") @Y61.k String newPassword, @J81.c("token") @Y61.l String phash, @J81.c("isSandbox") boolean isSandbox, @J81.c("context") @Y61.l String context);

    @J81.o("1/register/parsing-permission")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<ParsingPermissionResult>> h(@J81.c("name") @Y61.l String name, @J81.c("phone") @Y61.k String phone, @J81.c(VoiceInfo.STATE) int state, @J81.c("fid") @Y61.k String trackerUID);

    @J81.f("1/auth/suggest")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<AuthSuggestsResult>> i(@J81.u @Y61.k Map<String, String> hashUserIds);

    @J81.o("1/auth/social/register/proceed")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<SocialProceedResult>> j(@J81.c("type") @Y61.k String type, @J81.c("token") @Y61.k String pushToken, @J81.c("provider") @Y61.l String provider, @J81.c("isSandbox") boolean isSandbox, @J81.c("suggestKey") @Y61.k String suggestKey, @J81.c("fid") @Y61.k String trackerUID);

    @J81.o("2/recover/by_email")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<RecoverByEmailResult>> k(@J81.c("email") @Y61.k String email);

    @J81.o("2/profile/logout")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<SuccessResult> l(@J81.c("token") @Y61.k String token, @J81.c("provider") @Y61.l String provider, @J81.c("isSandbox") boolean isSandbox);

    @J81.o("5/auth/social/apple")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<SocialAuthResult>> m(@J81.c("code") @Y61.k String authCode, @J81.c("token") @Y61.k String pushToken, @J81.c("provider") @Y61.l String provider, @J81.c(ChannelContext.UserToUser.TYPE) @Y61.l String user, @J81.c(VoiceInfo.STATE) @Y61.l String state, @J81.c("socialUserId") @Y61.l String socialId, @J81.c("isSandbox") boolean isSandbox, @J81.c("suggestKey") @Y61.l String suggestKey, @J81.c("fid") @Y61.k String trackerUID);

    @J81.o("1/recover/reset_password")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<ResetPasswordResult>> n(@J81.c("password") @Y61.k String password, @J81.c("hash") @Y61.k String hash, @J81.c("type") @Y61.k String type);

    @J81.o("1/social/parsing-permission")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<ParsingPermissionResult>> o(@J81.c("name") @Y61.l String name, @J81.c("phone") @Y61.k String phone, @J81.c(VoiceInfo.STATE) int state, @J81.c("fid") @Y61.k String trackerUID);

    @J81.o("5/auth/social/{networkType}")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<SocialAuthResult>> p(@J81.s("networkType") @Y61.k String networkType, @J81.c("accessToken") @Y61.l String accessToken, @J81.c("token") @Y61.k String pushToken, @J81.c("provider") @Y61.l String provider, @J81.c("email") @Y61.l String email, @J81.c("socialUserId") @Y61.l String socialId, @J81.c("isSandbox") boolean isSandbox, @J81.c("suggestKey") @Y61.l String suggestKey, @J81.c("fid") @Y61.k String trackerUID, @J81.c("code") @Y61.l String code, @J81.c(VoiceInfo.STATE) @Y61.l String state, @J81.c("error") @Y61.l String error, @J81.c("errorMessage") @Y61.l String errorMessage);
}
