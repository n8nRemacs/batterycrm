package com.avito.android.wallet.page.history.remote.dto;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentRefundStatus.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/page/history/remote/dto/PaymentRefundStatus;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "FAIL", "SUCCESS", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentRefundStatus implements Parcelable {

    @c("available")
    public static final PaymentRefundStatus AVAILABLE;

    @k
    public static final Parcelable.Creator<PaymentRefundStatus> CREATOR;

    @c("fail")
    public static final PaymentRefundStatus FAIL;

    @c("success")
    public static final PaymentRefundStatus SUCCESS;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PaymentRefundStatus[] f328083b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f328084c;

    static {
        PaymentRefundStatus paymentRefundStatus = new PaymentRefundStatus("AVAILABLE", 0);
        AVAILABLE = paymentRefundStatus;
        PaymentRefundStatus paymentRefundStatus2 = new PaymentRefundStatus("FAIL", 1);
        FAIL = paymentRefundStatus2;
        PaymentRefundStatus paymentRefundStatus3 = new PaymentRefundStatus("SUCCESS", 2);
        SUCCESS = paymentRefundStatus3;
        PaymentRefundStatus[] paymentRefundStatusArr = {paymentRefundStatus, paymentRefundStatus2, paymentRefundStatus3};
        f328083b = paymentRefundStatusArr;
        f328084c = kotlin.enums.c.a(paymentRefundStatusArr);
        CREATOR = new Parcelable.Creator<PaymentRefundStatus>() { // from class: com.avito.android.wallet.page.history.remote.dto.PaymentRefundStatus.a
            @Override // android.os.Parcelable.Creator
            public final PaymentRefundStatus createFromParcel(Parcel parcel) {
                return PaymentRefundStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentRefundStatus[] newArray(int i12) {
                return new PaymentRefundStatus[i12];
            }
        };
    }

    private PaymentRefundStatus(String str, int i12) {
    }

    public static PaymentRefundStatus valueOf(String str) {
        return (PaymentRefundStatus) Enum.valueOf(PaymentRefundStatus.class, str);
    }

    public static PaymentRefundStatus[] values() {
        return (PaymentRefundStatus[]) f328083b.clone();
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
