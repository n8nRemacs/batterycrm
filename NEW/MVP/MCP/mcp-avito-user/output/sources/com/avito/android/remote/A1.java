package com.avito.android.remote;

import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.SelfEmployedPhoneValidationResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.VerificationFinishResult;
import com.avito.android.remote.model.VerificationOptionsListResult;
import com.avito.android.remote.model.VerificationPlatformRedirectResult;
import com.avito.android.remote.model.VerificationStatusListResult;
import com.avito.android.remote.model.VerificationTinkoffFinishResult;
import com.avito.android.remote.model.common.VerificationRedirectResult;
import com.avito.android.remote.model.inn.VerificationConfirmRequisitesResult;
import com.avito.android.remote.model.inn.VerificationFetchInvoiceResult;
import com.avito.android.remote.model.inn.VerificationFormBuilderResult;
import com.avito.android.remote.model.inn.VerificationInnValidationResult;
import com.avito.android.remote.model.inn.VerificationInputBillAmountResult;
import com.avito.android.remote.model.inn.VerificationInputInnResult;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.search.InlineFilterValue;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VerificationApi.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b\u0016\u0010\u0011J1\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0018\u0010\u0014JG\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\rH'¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b\u001e\u0010\u0011J,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b \u0010\u0011JB\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\rH§@¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\rH§@¢\u0006\u0004\b#\u0010\"J,\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b%\u0010\u0011JB\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\rH§@¢\u0006\u0004\b&\u0010\"J,\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b(\u0010\u0011J-\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b+\u0010,J1\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b.\u0010\u0014J1\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b0\u0010\u0014J1\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b1\u0010\u0014J1\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b2\u0010\u0014J1\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b3\u0010\u0014J1\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b4\u0010\u0014J,\u00105\u001a\b\u0012\u0004\u0012\u00020/0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b5\u0010\u0011J1\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00040\t2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b7\u0010\u0014¨\u00068"}, d2 = {"Lcom/avito/android/remote/A1;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/VerificationOptionsListResult;", "j", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phone", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "", "queryMap", "Lcom/avito/android/remote/model/VerificationStatusListResult;", "m", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/VerificationPlatformRedirectResult;", "u", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/VerificationFinishResult;", "q", "Lcom/avito/android/remote/model/inn/VerificationInputInnResult;", "c", LocalPublishState.FIELDS, "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "w", "(Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/inn/VerificationConfirmRequisitesResult;", "h", "Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult;", "t", "s", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lcom/avito/android/remote/model/inn/VerificationInputBillAmountResult;", "o", "e", "Lcom/avito/android/remote/model/inn/VerificationFetchInvoiceResult;", "g", MessageBody.SystemMessageBody.Platform.FLOW, "type", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/VerificationTinkoffFinishResult;", "f", "Lcom/avito/android/remote/model/common/VerificationRedirectResult;", "l", "v", "k", "r", "p", "i", "Lkotlin/G0;", "n", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface A1 {
    @J81.o("1/verificationView/events/verificationStarted")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<String> a(@J81.c(MessageBody.SystemMessageBody.Platform.FLOW) @Y61.l String flow, @J81.c("type") @Y61.l String type);

    @J81.o("1/self-employed/bind-by-phone")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<SelfEmployedPhoneValidationResult>> b(@J81.t("phone") @Y61.k String phone);

    @J81.o("1/verificationView/inn/inputInn")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationInputInnResult>> c(@J81.d @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/inn/setRequisites")
    @J81.e
    @X41.o
    @Y61.l
    Object d(@J81.d @Y61.k Map<String, String> map, @J81.d @Y61.k Map<String, Object> map2, @Y61.k Continuation<TypedResult<VerificationInnValidationResult>> continuation);

    @J81.o("1/verificationView/inn/createInvoice")
    @J81.e
    @X41.o
    @Y61.l
    Object e(@J81.d @Y61.k Map<String, String> map, @J81.d @Y61.k Map<String, Object> map2, @Y61.k Continuation<TypedResult<VerificationInnValidationResult>> continuation);

    @J81.o("1/verificationView/tinkoffFinish")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationTinkoffFinishResult>> f(@J81.d(encoded = true) @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/inn/fetchInvoice")
    @J81.e
    @Y61.l
    Object g(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<VerificationFetchInvoiceResult>> continuation);

    @J81.o("1/verificationView/inn/confirmRequisites")
    @J81.e
    @Y61.l
    Object h(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<VerificationConfirmRequisitesResult>> continuation);

    @J81.o("1/verificationView/vtbFinish")
    @J81.e
    @Y61.l
    Object i(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<VerificationRedirectResult>> continuation);

    @J81.o("3/profile/verifyIdentity/optionsList")
    @J81.e
    @Y61.l
    Object j(@J81.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME) @Y61.k String str, @Y61.k Continuation<? super TypedResult<VerificationOptionsListResult>> continuation);

    @J81.o("1/verificationView/sberFinish")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationRedirectResult>> k(@J81.d @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/remove")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationRedirectResult>> l(@J81.d @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/statusList")
    @J81.e
    @Y61.l
    Object m(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<VerificationStatusListResult>> continuation);

    @J81.o("1/verificationView/cancel")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<kotlin.G0>> n(@J81.d @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/inn/inputBillAmount")
    @J81.e
    @Y61.l
    Object o(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<VerificationInputBillAmountResult>> continuation);

    @J81.o("1/verificationView/alfaFinish")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationRedirectResult>> p(@J81.d @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/finish")
    @J81.e
    @Y61.l
    Object q(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<VerificationFinishResult>> continuation);

    @J81.o("1/verificationView/esiaFinish")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationRedirectResult>> r(@J81.d @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/formBuilderValidate")
    @J81.e
    @X41.o
    @Y61.l
    Object s(@J81.d @Y61.k Map<String, String> map, @J81.d @Y61.k Map<String, Object> map2, @Y61.k Continuation<TypedResult<VerificationInnValidationResult>> continuation);

    @J81.o("1/verificationView/formBuilder")
    @J81.e
    @Y61.l
    Object t(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<VerificationFormBuilderResult>> continuation);

    @J81.o("1/verificationView/redirect")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationPlatformRedirectResult>> u(@J81.d @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/restore")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationRedirectResult>> v(@J81.d @Y61.k Map<String, String> queryMap);

    @J81.o("1/verificationView/inn/validateInn")
    @J81.e
    @X41.o
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<VerificationInnValidationResult>> w(@J81.d @Y61.k Map<String, String> queryMap, @J81.d @Y61.k Map<String, Object> fields);
}
