package f40;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import g40.C40529a;
import h40.C40769a;
import i40.C41222a;
import j40.C42191a;
import k40.C42502a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: OauthApi.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007Jd\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0010J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H§@¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lf40/a;", "", "", "clientId", "Lcom/avito/android/remote/model/TypedResult;", "Lg40/a;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "codeChallenge", "codeChallengeMethod", "redirectUri", "responseType", "scope", VoiceInfo.STATE, "Lh40/a;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Li40/a;", "b", "Lj40/a;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fio", "", "permissionType", "phone", "Lk40/a;", "a", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: f40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40231a {
    @o("1/user-consent/save")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("fio") @l String str, @J81.c("permissionType") @l Long l12, @J81.c("phone") @l String str2, @k Continuation<? super TypedResult<C42502a>> continuation);

    @o("1/oauth/info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("clientId") @k String str, @J81.c("codeChallenge") @l String str2, @J81.c("codeChallengeMethod") @l String str3, @J81.c("redirectUri") @l String str4, @J81.c("responseType") @k String str5, @J81.c("scope") @k String str6, @J81.c(VoiceInfo.STATE) @l String str7, @k Continuation<? super TypedResult<C41222a>> continuation);

    @o("1/oauth/code")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object c(@J81.c("clientId") @k String str, @J81.c("codeChallenge") @l String str2, @J81.c("codeChallengeMethod") @l String str3, @J81.c("redirectUri") @l String str4, @J81.c("responseType") @k String str5, @J81.c("scope") @k String str6, @J81.c(VoiceInfo.STATE) @l String str7, @k Continuation<? super TypedResult<C40769a>> continuation);

    @f("1/oauth/check")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@l @t("clientId") String str, @k Continuation<? super TypedResult<C40529a>> continuation);

    @f("1/user-consent/info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@k Continuation<? super TypedResult<C42191a>> continuation);
}
