package com.avito.android.wallet.page.history.details.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryDetailsOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/PaymentHistoryDetailsOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentHistoryDetailsOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<PaymentHistoryDetailsOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f327875b;

    /* compiled from: PaymentHistoryDetailsOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentHistoryDetailsOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final PaymentHistoryDetailsOpenParams createFromParcel(Parcel parcel) {
            return new PaymentHistoryDetailsOpenParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentHistoryDetailsOpenParams[] newArray(int i12) {
            return new PaymentHistoryDetailsOpenParams[i12];
        }
    }

    public PaymentHistoryDetailsOpenParams(@Y61.k String str) {
        this.f327875b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentHistoryDetailsOpenParams) && L.f(this.f327875b, ((PaymentHistoryDetailsOpenParams) obj).f327875b);
    }

    public final int hashCode() {
        return this.f327875b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("PaymentHistoryDetailsOpenParams(id="), this.f327875b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f327875b);
    }
}
