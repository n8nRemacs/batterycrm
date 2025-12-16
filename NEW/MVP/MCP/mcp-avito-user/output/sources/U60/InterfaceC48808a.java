package u60;

import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.remote.model.payment.form.PaymentGenericFormResult;
import com.avito.android.remote.model.payment.generic.PaymentGenericResult;
import com.avito.android.remote.model.payment.service.PaymentSessionResult;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.remote.model.payment.status.form.PaymentStatusFormResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PaymentApi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ_\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H'¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H'¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b0\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lu60/a;", "", "", "paymentSessionId", "methodSignature", "", "params", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/payment/generic/PaymentGenericResult;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "orderItems", "context", "nativeMethods", "promoCode", "Lcom/avito/android/remote/model/payment/service/PaymentSessionResult;", "g", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "c", "(Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", DeliverySubsidiesSlotKt.AMOUNT, "f", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;", "e", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "orderId", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;", "d", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: u60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC48808a {

    /* compiled from: PaymentApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u60.a$a, reason: collision with other inner class name */
    public static final class C12702a {
    }

    @f("1/payment/order/{orderId}/status")
    @k
    z<TypedResult<PaymentStatusResult>> a(@s("orderId") @k String orderId);

    @o("2/payment/generic")
    @e
    @k
    z<TypedResult<PaymentGenericResult>> b(@J81.c("paymentSessionId") @k String paymentSessionId, @J81.c("methodSignature") @k String methodSignature, @J81.d @k Map<String, String> params);

    @o("4/payment/session/wallet")
    @e
    @k
    z<TypedResult<PaymentSessionResult>> c(@J81.d @k Map<String, String> params, @J81.d @k Map<String, String> nativeMethods);

    @f("1/payment/order/{orderId}/status/form")
    @k
    z<TypedResult<PaymentStatusFormResult>> d(@s("orderId") @k String orderId);

    @f("2/payment/generic/form")
    @k
    z<TypedResult<PaymentGenericFormResult>> e(@t("paymentSessionId") @k String paymentSessionId, @t("methodSignature") @k String methodSignature);

    @o("1/payment/session/cpa")
    @e
    @k
    z<TypedResult<PaymentSessionResult>> f(@J81.c(DeliverySubsidiesSlotKt.AMOUNT) @l String amount, @J81.d @k Map<String, String> nativeMethods);

    @o("5/payment/session/service")
    @e
    @k
    z<TypedResult<PaymentSessionResult>> g(@J81.d @k Map<String, String> orderItems, @J81.c("context") @l String context, @J81.d @k Map<String, String> nativeMethods, @J81.c("promoCode") @l String promoCode);
}
