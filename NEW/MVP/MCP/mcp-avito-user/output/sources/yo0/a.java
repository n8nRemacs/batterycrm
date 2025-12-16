package YO0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.wallet.page.history.remote.dto.PaymentOrderStatus;
import com.avito.android.wallet.page.history.remote.dto.PaymentRefundStatus;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryListElement.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LYO0/a;", "", "a", "b", "LYO0/a$a;", "LYO0/a$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: PaymentHistoryListElement.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LYO0/a$a;", "LYO0/a;", "", "title", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: YO0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1378a implements a {

        @c("title")
        @k
        private final String title;

        public C1378a(@k String str) {
            this.title = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1378a) && L.f(this.title, ((C1378a) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Header(title="), this.title, ')');
        }
    }

    /* compiled from: PaymentHistoryListElement.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"LYO0/a$b;", "LYO0/a;", "", "operationId", "title", DeliverySubsidiesSlotKt.AMOUNT, "description", "date", "Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;", "status", "Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;", "refundStatus", "refundSubtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "h", "a", "c", "b", "Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;", "g", "()Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;", "Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;", "e", "()Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;", "f", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        @c(DeliverySubsidiesSlotKt.AMOUNT)
        @k
        private final String amount;

        @c("date")
        @k
        private final String date;

        @c("description")
        @l
        private final String description;

        @c("operationId")
        @k
        private final String operationId;

        @c("refundStatus")
        @l
        private final PaymentRefundStatus refundStatus;

        @c("refundSubtitle")
        @l
        private final String refundSubtitle;

        @c("status")
        @k
        private final PaymentOrderStatus status;

        @c("title")
        @k
        private final String title;

        public b(@k String str, @k String str2, @k String str3, @l String str4, @k String str5, @k PaymentOrderStatus paymentOrderStatus, @l PaymentRefundStatus paymentRefundStatus, @l String str6) {
            this.operationId = str;
            this.title = str2;
            this.amount = str3;
            this.description = str4;
            this.date = str5;
            this.status = paymentOrderStatus;
            this.refundStatus = paymentRefundStatus;
            this.refundSubtitle = str6;
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

        @l
        /* renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getOperationId() {
            return this.operationId;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final PaymentRefundStatus getRefundStatus() {
            return this.refundStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.operationId, bVar.operationId) && L.f(this.title, bVar.title) && L.f(this.amount, bVar.amount) && L.f(this.description, bVar.description) && L.f(this.date, bVar.date) && this.status == bVar.status && this.refundStatus == bVar.refundStatus && L.f(this.refundSubtitle, bVar.refundSubtitle);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final String getRefundSubtitle() {
            return this.refundSubtitle;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final PaymentOrderStatus getStatus() {
            return this.status;
        }

        @k
        /* renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.operationId.hashCode() * 31, 31, this.title), 31, this.amount);
            String str = this.description;
            int iHashCode = (this.status.hashCode() + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.date)) * 31;
            PaymentRefundStatus paymentRefundStatus = this.refundStatus;
            int iHashCode2 = (iHashCode + (paymentRefundStatus == null ? 0 : paymentRefundStatus.hashCode())) * 31;
            String str2 = this.refundSubtitle;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Operation(operationId=");
            sb2.append(this.operationId);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", amount=");
            sb2.append(this.amount);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", date=");
            sb2.append(this.date);
            sb2.append(", status=");
            sb2.append(this.status);
            sb2.append(", refundStatus=");
            sb2.append(this.refundStatus);
            sb2.append(", refundSubtitle=");
            return C22026a.c(sb2, this.refundSubtitle, ')');
        }
    }
}
