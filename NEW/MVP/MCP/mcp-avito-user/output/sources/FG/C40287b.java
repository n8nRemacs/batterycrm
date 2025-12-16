package fG;

import Y61.k;
import Y61.l;
import com.avito.android.gig.payment_list.generated.api.get_gig_worker_payments.GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetGigWorkerPaymentsResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LfG/b;", "", "", "Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem;", "payments", "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fG.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40287b {

    @com.google.gson.annotations.c("payments")
    @k
    private final List<GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem> payments;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C40287b(@k List<GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem> list, @l String str) {
        this.payments = list;
        this.title = str;
    }

    @k
    public final List<GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem> a() {
        return this.payments;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
