package com.avito.android.wallet.page.history.remote.dto;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentOrderStatus.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/wallet/page/history/remote/dto/PaymentOrderStatus;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "DONE", "CANCELED", "FAILED", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentOrderStatus implements Parcelable {

    @c("active")
    public static final PaymentOrderStatus ACTIVE;

    @c(PaymentStateKt.PAYMENT_STATE_CANCELED)
    public static final PaymentOrderStatus CANCELED;

    @k
    public static final Parcelable.Creator<PaymentOrderStatus> CREATOR;

    @c(PaymentStateKt.PAYMENT_STATE_DONE)
    public static final PaymentOrderStatus DONE;

    @c(PaymentStateKt.PAYMENT_STATE_FAILED)
    public static final PaymentOrderStatus FAILED;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PaymentOrderStatus[] f328081b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f328082c;

    static {
        PaymentOrderStatus paymentOrderStatus = new PaymentOrderStatus("ACTIVE", 0);
        ACTIVE = paymentOrderStatus;
        PaymentOrderStatus paymentOrderStatus2 = new PaymentOrderStatus("DONE", 1);
        DONE = paymentOrderStatus2;
        PaymentOrderStatus paymentOrderStatus3 = new PaymentOrderStatus("CANCELED", 2);
        CANCELED = paymentOrderStatus3;
        PaymentOrderStatus paymentOrderStatus4 = new PaymentOrderStatus("FAILED", 3);
        FAILED = paymentOrderStatus4;
        PaymentOrderStatus[] paymentOrderStatusArr = {paymentOrderStatus, paymentOrderStatus2, paymentOrderStatus3, paymentOrderStatus4};
        f328081b = paymentOrderStatusArr;
        f328082c = kotlin.enums.c.a(paymentOrderStatusArr);
        CREATOR = new Parcelable.Creator<PaymentOrderStatus>() { // from class: com.avito.android.wallet.page.history.remote.dto.PaymentOrderStatus.a
            @Override // android.os.Parcelable.Creator
            public final PaymentOrderStatus createFromParcel(Parcel parcel) {
                return PaymentOrderStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentOrderStatus[] newArray(int i12) {
                return new PaymentOrderStatus[i12];
            }
        };
    }

    private PaymentOrderStatus(String str, int i12) {
    }

    public static PaymentOrderStatus valueOf(String str) {
        return (PaymentOrderStatus) Enum.valueOf(PaymentOrderStatus.class, str);
    }

    public static PaymentOrderStatus[] values() {
        return (PaymentOrderStatus[]) f328081b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
