package com.avito.android.remote;

import com.avito.android.remote.model.ConsultationPhoneConfirmationResult;
import com.avito.android.remote.model.ConsultationPhoneConfirmationStatus;
import com.avito.android.remote.model.PhoneConfirmationStatus;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.TfaSealedCodeResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.automated_recovery.RecoverThirdFactorConfirmResult;
import com.avito.android.remote.model.recover_by_phone.ConfirmPasswordRecoveryByPhoneResult;
import com.avito.android.remote.model.recover_by_phone.RecoverByPhoneResult;
import com.avito.android.remote.model.registration.ConfirmCodeResult;
import com.avito.android.remote.model.registration.RequestCodeResult;
import com.avito.android.remote.model.registration.VerifyCodeResult;
import com.avito.android.remote.model.social_reg.SocialRegRequestCodeResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CodeConfirmationApi.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0011J9\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\fJ%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u000f2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u001d2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010 J*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\bJ=\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\r2\b\b\u0003\u0010#\u001a\u00020\rH'¢\u0006\u0004\b%\u0010&J3\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001d2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\r2\b\b\u0003\u0010#\u001a\u00020\rH'¢\u0006\u0004\b(\u0010)J%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u001d2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b+\u0010,J/\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00050\u001d2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b.\u0010 J \u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b0\u00101J%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00050\u000f2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b3\u0010\u001cJ \u00106\u001a\b\u0012\u0004\u0012\u0002050\u00052\b\b\u0001\u00104\u001a\u00020\u0002H§@¢\u0006\u0004\b6\u00101¨\u00067"}, d2 = {"Lcom/avito/android/remote/r;", "", "", "login", "src", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/RequestCodeResult;", "f", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "retry", "Lio/reactivex/rxjava3/core/I;", "c", "(Ljava/lang/String;ZLjava/lang/String;)Lio/reactivex/rxjava3/core/I;", "a", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "Lcom/avito/android/remote/model/registration/ConfirmCodeResult;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "q", "phone", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "h", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "p", "isCompany", "needsAuthentication", "Lcom/avito/android/remote/model/SuccessResult;", "i", "(Ljava/lang/String;Ljava/lang/String;ZZ)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/PhoneConfirmationStatus;", "d", "(Ljava/lang/String;ZZ)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/ConsultationPhoneConfirmationStatus;", "l", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult;", "j", "Lcom/avito/android/remote/model/TfaSealedCodeResult;", "n", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/social_reg/SocialRegRequestCodeResult;", "g", "emailId", "Lcom/avito/android/remote/model/automated_recovery/RecoverThirdFactorConfirmResult;", "m", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface r {

    /* compiled from: CodeConfirmationApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.o("1/register/code/request")
    @J81.e
    @Y61.l
    Object a(@J81.c("login") @Y61.k String str, @J81.c("retry") boolean z12, @J81.c("src") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<RequestCodeResult>> continuation);

    @J81.o("1/recover/by_phone/confirm")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<ConfirmPasswordRecoveryByPhoneResult>> b(@J81.c("phone") @Y61.k String phone, @J81.c("code") @Y61.k String code);

    @J81.o("1/code/request")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<RequestCodeResult>> c(@J81.c("login") @Y61.k String login, @J81.c("retry") boolean retry, @J81.c("src") @Y61.k String src);

    @J81.o("2/phones/link")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<PhoneConfirmationStatus> d(@J81.c("phone") @Y61.k String phone, @J81.c("isCompany") boolean isCompany, @J81.c("needsAuthentication") boolean needsAuthentication);

    @J81.o("1/code/confirm")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<ConfirmCodeResult>> e(@J81.c("login") @Y61.k String login, @J81.c("code") @Y61.k String code, @J81.c("src") @Y61.k String src);

    @J81.o("1/verifyPhone/requestCode")
    @J81.e
    @Y61.l
    Object f(@J81.c("login") @Y61.k String str, @J81.c("src") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<RequestCodeResult>> continuation);

    @J81.o("1/social/code/request")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<SocialRegRequestCodeResult>> g(@J81.c("login") @Y61.k String phone);

    @J81.o("1/recover/by_phone")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<RecoverByPhoneResult>> h(@J81.c("phone") @Y61.k String phone);

    @J81.o("2/phones/link/check")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<SuccessResult> i(@J81.c("phone") @Y61.k String phone, @J81.c("code") @Y61.k String code, @J81.c("isCompany") boolean isCompany, @J81.c("needsAuthentication") boolean needsAuthentication);

    @J81.o("1/developments-advice/confirmPhone")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<ConsultationPhoneConfirmationResult>> j(@J81.c("phone") @Y61.k String phone, @J81.c("code") @Y61.k String code);

    @J81.o("2/code/request")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<RequestCodeResult>> k(@J81.c("login") @Y61.k String login, @J81.c("retry") boolean retry, @J81.c("src") @Y61.k String src);

    @J81.o("1/developments-advice/getConfirmCode")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<ConsultationPhoneConfirmationStatus>> l(@J81.c("phone") @Y61.k String phone);

    @J81.o("1/recover/3fa/confirm")
    @J81.e
    @Y61.l
    Object m(@J81.c("id") @Y61.k String str, @Y61.k Continuation<? super TypedResult<RecoverThirdFactorConfirmResult>> continuation);

    @J81.o("1/tfa/request")
    @J81.e
    @Y61.l
    Object n(@J81.c("phone") @Y61.k String str, @Y61.k Continuation<? super TypedResult<TfaSealedCodeResult>> continuation);

    @J81.o("1/verifyPhone/confirmCode")
    @J81.e
    @Y61.l
    Object o(@J81.c("login") @Y61.k String str, @J81.c("code") @Y61.k String str2, @J81.c("src") @Y61.k String str3, @Y61.k Continuation<? super TypedResult<VerifyCodeResult>> continuation);

    @J81.o("2/recover/by_phone/confirm")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.l
    Object p(@J81.c("phone") @Y61.k String str, @J81.c("code") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<ConfirmPasswordRecoveryByPhoneResult>> continuation);

    @J81.o("1/register/code/confirm")
    @J81.e
    @Y61.l
    Object q(@J81.c("login") @Y61.k String str, @J81.c("code") @Y61.k String str2, @J81.c("src") @Y61.k String str3, @Y61.k Continuation<? super TypedResult<ConfirmCodeResult>> continuation);
}
