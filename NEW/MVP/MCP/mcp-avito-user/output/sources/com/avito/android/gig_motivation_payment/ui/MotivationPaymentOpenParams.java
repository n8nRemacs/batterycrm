package com.avito.android.gig_motivation_payment.ui;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: MotivationPaymentOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/MotivationPaymentOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MotivationPaymentOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<MotivationPaymentOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f160119b;

    /* compiled from: MotivationPaymentOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MotivationPaymentOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final MotivationPaymentOpenParams createFromParcel(Parcel parcel) {
            return new MotivationPaymentOpenParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MotivationPaymentOpenParams[] newArray(int i12) {
            return new MotivationPaymentOpenParams[i12];
        }
    }

    public MotivationPaymentOpenParams(@k String str) {
        this.f160119b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f160119b);
    }
}
