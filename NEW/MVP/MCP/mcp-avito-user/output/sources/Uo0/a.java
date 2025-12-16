package UO0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.wallet.page.history.remote.dto.OperationType;
import com.avito.android.wallet.page.history.remote.dto.PaymentOrderStatus;
import com.avito.android.wallet.page.history.remote.dto.PaymentRefundStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OperationDetails.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"LUO0/a;", "", "", "id", "LUO0/b;", "target", "Lcom/avito/android/wallet/page/history/remote/dto/OperationType;", "operationType", DeliverySubsidiesSlotKt.AMOUNT, "paymentMethod", "date", "Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;", "status", "LUO0/c;", "receipt", "Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;", "refundStatus", "refundSubtitle", "<init>", "(Ljava/lang/String;LUO0/b;Lcom/avito/android/wallet/page/history/remote/dto/OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;LUO0/c;Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LUO0/b;", "j", "()LUO0/b;", "Lcom/avito/android/wallet/page/history/remote/dto/OperationType;", "d", "()Lcom/avito/android/wallet/page/history/remote/dto/OperationType;", "a", "e", "b", "Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;", "i", "()Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;", "LUO0/c;", "f", "()LUO0/c;", "Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;", "g", "()Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;", "h", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c(DeliverySubsidiesSlotKt.AMOUNT)
    @k
    private final String amount;

    @com.google.gson.annotations.c("date")
    @k
    private final String date;

    @com.google.gson.annotations.c("operationId")
    @k
    private final String id;

    @com.google.gson.annotations.c("operationType")
    @l
    private final OperationType operationType;

    @com.google.gson.annotations.c("paymentMethod")
    @k
    private final String paymentMethod;

    @com.google.gson.annotations.c("receipt")
    @l
    private final c receipt;

    @com.google.gson.annotations.c("refundStatus")
    @l
    private final PaymentRefundStatus refundStatus;

    @com.google.gson.annotations.c("refundSubtitle")
    @l
    private final String refundSubtitle;

    @com.google.gson.annotations.c("status")
    @k
    private final PaymentOrderStatus status;

    @com.google.gson.annotations.c("target")
    @k
    private final b target;

    public a(@k String str, @k b bVar, @l OperationType operationType, @k String str2, @k String str3, @k String str4, @k PaymentOrderStatus paymentOrderStatus, @l c cVar, @l PaymentRefundStatus paymentRefundStatus, @l String str5) {
        this.id = str;
        this.target = bVar;
        this.operationType = operationType;
        this.amount = str2;
        this.paymentMethod = str3;
        this.date = str4;
        this.status = paymentOrderStatus;
        this.receipt = cVar;
        this.refundStatus = paymentRefundStatus;
        this.refundSubtitle = str5;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final OperationType getOperationType() {
        return this.operationType;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.id, aVar.id) && L.f(this.target, aVar.target) && this.operationType == aVar.operationType && L.f(this.amount, aVar.amount) && L.f(this.paymentMethod, aVar.paymentMethod) && L.f(this.date, aVar.date) && this.status == aVar.status && L.f(this.receipt, aVar.receipt) && this.refundStatus == aVar.refundStatus && L.f(this.refundSubtitle, aVar.refundSubtitle);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final c getReceipt() {
        return this.receipt;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final PaymentRefundStatus getRefundStatus() {
        return this.refundStatus;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getRefundSubtitle() {
        return this.refundSubtitle;
    }

    public final int hashCode() {
        int iHashCode = (this.target.hashCode() + (this.id.hashCode() * 31)) * 31;
        OperationType operationType = this.operationType;
        int iHashCode2 = (this.status.hashCode() + H.d(H.d(H.d((iHashCode + (operationType == null ? 0 : operationType.hashCode())) * 31, 31, this.amount), 31, this.paymentMethod), 31, this.date)) * 31;
        c cVar = this.receipt;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        PaymentRefundStatus paymentRefundStatus = this.refundStatus;
        int iHashCode4 = (iHashCode3 + (paymentRefundStatus == null ? 0 : paymentRefundStatus.hashCode())) * 31;
        String str = this.refundSubtitle;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final PaymentOrderStatus getStatus() {
        return this.status;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final b getTarget() {
        return this.target;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperationDetails(id=");
        sb2.append(this.id);
        sb2.append(", target=");
        sb2.append(this.target);
        sb2.append(", operationType=");
        sb2.append(this.operationType);
        sb2.append(", amount=");
        sb2.append(this.amount);
        sb2.append(", paymentMethod=");
        sb2.append(this.paymentMethod);
        sb2.append(", date=");
        sb2.append(this.date);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", receipt=");
        sb2.append(this.receipt);
        sb2.append(", refundStatus=");
        sb2.append(this.refundStatus);
        sb2.append(", refundSubtitle=");
        return C22026a.c(sb2, this.refundSubtitle, ')');
    }
}
