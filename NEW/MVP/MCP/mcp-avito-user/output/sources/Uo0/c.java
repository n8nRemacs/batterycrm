package UO0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.wallet.page.history.details.remote.dto.ReceiptStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Receipt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LUO0/c;", "", "Lcom/avito/android/wallet/page/history/details/remote/dto/ReceiptStatus;", "status", "", "receiptUrl", "<init>", "(Lcom/avito/android/wallet/page/history/details/remote/dto/ReceiptStatus;Ljava/lang/String;)V", "Lcom/avito/android/wallet/page/history/details/remote/dto/ReceiptStatus;", "b", "()Lcom/avito/android/wallet/page/history/details/remote/dto/ReceiptStatus;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("receiptUrl")
    @l
    private final String receiptUrl;

    @com.google.gson.annotations.c("status")
    @k
    private final ReceiptStatus status;

    public c(@k ReceiptStatus receiptStatus, @l String str) {
        this.status = receiptStatus;
        this.receiptUrl = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ReceiptStatus getStatus() {
        return this.status;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.status == cVar.status && L.f(this.receiptUrl, cVar.receiptUrl);
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.receiptUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Receipt(status=");
        sb2.append(this.status);
        sb2.append(", receiptUrl=");
        return C22026a.c(sb2, this.receiptUrl, ')');
    }
}
