package com.avito.android.remote.model.payment.status;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SimpleUserDialog;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentStatusResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "", "()V", "ForbiddenPayment", "PaymentStatus", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult$ForbiddenPayment;", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult$PaymentStatus;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PaymentStatusResult {

    /* compiled from: PaymentStatusResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/payment/status/PaymentStatusResult$ForbiddenPayment;", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ForbiddenPayment extends PaymentStatusResult {

        @c("message")
        @k
        private final String message;

        public ForbiddenPayment(@k String str) {
            super(null);
            this.message = str;
        }

        @k
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: PaymentStatusResult.kt */
    @d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/payment/status/PaymentStatusResult$PaymentStatus;", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "Landroid/os/Parcelable;", "", VoiceInfo.STATE, "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectDeeplink", "Lcom/avito/android/remote/model/SimpleUserDialog;", "userDialog", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/SimpleUserDialog;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getRedirectDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/SimpleUserDialog;", "getUserDialog", "()Lcom/avito/android/remote/model/SimpleUserDialog;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PaymentStatus extends PaymentStatusResult implements Parcelable {

        @k
        public static final Parcelable.Creator<PaymentStatus> CREATOR = new Creator();

        @c("redirectUri")
        @l
        private final DeepLink redirectDeeplink;

        @c("status")
        @k
        private final String state;

        @c("userDialog")
        @l
        private final SimpleUserDialog userDialog;

        /* compiled from: PaymentStatusResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PaymentStatus createFromParcel(@k Parcel parcel) {
                return new PaymentStatus(parcel.readString(), (DeepLink) parcel.readParcelable(PaymentStatus.class.getClassLoader()), (SimpleUserDialog) parcel.readParcelable(PaymentStatus.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PaymentStatus[] newArray(int i12) {
                return new PaymentStatus[i12];
            }
        }

        public PaymentStatus(@k String str, @l DeepLink deepLink, @l SimpleUserDialog simpleUserDialog) {
            super(null);
            this.state = str;
            this.redirectDeeplink = deepLink;
            this.userDialog = simpleUserDialog;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DeepLink getRedirectDeeplink() {
            return this.redirectDeeplink;
        }

        @k
        public final String getState() {
            return this.state;
        }

        @l
        public final SimpleUserDialog getUserDialog() {
            return this.userDialog;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.state);
            parcel.writeParcelable(this.redirectDeeplink, flags);
            parcel.writeParcelable(this.userDialog, flags);
        }
    }

    public /* synthetic */ PaymentStatusResult(C42822w c42822w) {
        this();
    }

    private PaymentStatusResult() {
    }
}
