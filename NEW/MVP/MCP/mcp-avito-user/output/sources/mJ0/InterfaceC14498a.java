package Mj0;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.captcha.generated.api.get_v_3__api.GetV3ApiResponse;
import com.avito.android.remote.captcha.generated.api.verify_v_3__api.VerifyV3ApiResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CaptchaApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007Jj\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LMj0/a;", "", "", "refreshAvitoCaptcha", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse;", "a", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "captcha", "captchaId", "captchaOutput", "genTime", "hCaptchaResponse", "lotNumber", "passToken", "Lcom/avito/android/remote/captcha/generated/api/verify_v_3__api/VerifyV3ApiResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Mj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC14498a {
    @o("3/firewallCaptcha/get")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("refreshAvitoCaptcha") @l Boolean bool, @k Continuation<? super TypedResult<GetV3ApiResponse>> continuation);

    @o("3/firewallCaptcha/verify")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("captcha") @l String str, @J81.c("captcha_id") @l String str2, @J81.c("captcha_output") @l String str3, @J81.c("gen_time") @l String str4, @J81.c("hCaptchaResponse") @l String str5, @J81.c("lot_number") @l String str6, @J81.c("pass_token") @l String str7, @k Continuation<? super TypedResult<VerifyV3ApiResponse>> continuation);
}
