package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessStatusResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/early_access/remote/model/EarlyAccessStatusResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/early_access/remote/model/EarlyAccessStatusResult$OrderStatus;", "orderStatus", "", "message", "<init>", "(Lcom/avito/android/early_access/remote/model/EarlyAccessStatusResult$OrderStatus;Ljava/lang/String;)V", "Lcom/avito/android/early_access/remote/model/EarlyAccessStatusResult$OrderStatus;", "getOrderStatus", "()Lcom/avito/android/early_access/remote/model/EarlyAccessStatusResult$OrderStatus;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "OrderStatus", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessStatusResult implements Parcelable {

    @k
    public static final Parcelable.Creator<EarlyAccessStatusResult> CREATOR = new a();

    @c("message")
    @l
    private final String message;

    @c("orderStatus")
    @l
    private final OrderStatus orderStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EarlyAccessStatusResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/early_access/remote/model/EarlyAccessStatusResult$OrderStatus;", "", "(Ljava/lang/String;I)V", "PAID", "WAIT", "FAILED", "CANCELED", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OrderStatus {

        @c(PaymentStateKt.PAYMENT_STATE_CANCELED)
        public static final OrderStatus CANCELED;

        @c(PaymentStateKt.PAYMENT_STATE_FAILED)
        public static final OrderStatus FAILED;

        @c("paid")
        public static final OrderStatus PAID;

        @c("wait")
        public static final OrderStatus WAIT;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ OrderStatus[] f145571b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f145572c;

        static {
            OrderStatus orderStatus = new OrderStatus("PAID", 0);
            PAID = orderStatus;
            OrderStatus orderStatus2 = new OrderStatus("WAIT", 1);
            WAIT = orderStatus2;
            OrderStatus orderStatus3 = new OrderStatus("FAILED", 2);
            FAILED = orderStatus3;
            OrderStatus orderStatus4 = new OrderStatus("CANCELED", 3);
            CANCELED = orderStatus4;
            OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, orderStatus3, orderStatus4};
            f145571b = orderStatusArr;
            f145572c = kotlin.enums.c.a(orderStatusArr);
        }

        private OrderStatus(String str, int i12) {
        }

        public static OrderStatus valueOf(String str) {
            return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
        }

        public static OrderStatus[] values() {
            return (OrderStatus[]) f145571b.clone();
        }
    }

    /* compiled from: EarlyAccessStatusResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessStatusResult> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessStatusResult createFromParcel(Parcel parcel) {
            return new EarlyAccessStatusResult(parcel.readInt() == 0 ? null : OrderStatus.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessStatusResult[] newArray(int i12) {
            return new EarlyAccessStatusResult[i12];
        }
    }

    public EarlyAccessStatusResult(@l OrderStatus orderStatus, @l String str) {
        this.orderStatus = orderStatus;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessStatusResult)) {
            return false;
        }
        EarlyAccessStatusResult earlyAccessStatusResult = (EarlyAccessStatusResult) obj;
        return this.orderStatus == earlyAccessStatusResult.orderStatus && L.f(this.message, earlyAccessStatusResult.message);
    }

    public final int hashCode() {
        OrderStatus orderStatus = this.orderStatus;
        int iHashCode = (orderStatus == null ? 0 : orderStatus.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessStatusResult(orderStatus=");
        sb2.append(this.orderStatus);
        sb2.append(", message=");
        return C22026a.c(sb2, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        OrderStatus orderStatus = this.orderStatus;
        if (orderStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(orderStatus.name());
        }
        parcel.writeString(this.message);
    }
}
