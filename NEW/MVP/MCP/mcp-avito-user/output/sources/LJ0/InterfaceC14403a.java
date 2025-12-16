package Lj0;

import J81.e;
import J81.k;
import J81.o;
import Pj0.C14794a;
import Y61.l;
import com.avito.android.remote.captcha.model.VerifyCaptchaResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CaptchaApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0007J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LLj0/a;", "", "", "hCaptchaResponse", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/captcha/model/VerifyCaptchaResponse;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "lotNumber", "captchaOutput", "passToken", "genTime", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "captcha", "d", "", "refreshAvitoCaptcha", "LPj0/a;", "c", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Lj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC14403a {
    @o("1/firewallCaptcha/verify")
    @e
    @k({"X-Firewall-Result: action=verify;client_id=i:a3b1241d:s"})
    @l
    Object a(@J81.c("captcha_id") @Y61.k String str, @J81.c("lot_number") @Y61.k String str2, @J81.c("captcha_output") @Y61.k String str3, @J81.c("pass_token") @Y61.k String str4, @J81.c("gen_time") @Y61.k String str5, @Y61.k Continuation<? super TypedResult<VerifyCaptchaResponse>> continuation);

    @o("1/firewallCaptcha/verify")
    @e
    @k({"X-Firewall-Result: action=verify;client_id=i:a3b1241d:s"})
    @l
    Object b(@J81.c("hCaptchaResponse") @Y61.k String str, @Y61.k Continuation<? super TypedResult<VerifyCaptchaResponse>> continuation);

    @o("1/firewallCaptcha/get")
    @e
    @l
    Object c(@J81.c("refreshAvitoCaptcha") @l Boolean bool, @Y61.k Continuation<? super TypedResult<C14794a>> continuation);

    @o("1/firewallCaptcha/verify")
    @e
    @k({"X-Firewall-Result: action=verify;client_id=i:a3b1241d:s"})
    @l
    Object d(@J81.c("captcha") @Y61.k String str, @Y61.k Continuation<? super TypedResult<VerifyCaptchaResponse>> continuation);
}
