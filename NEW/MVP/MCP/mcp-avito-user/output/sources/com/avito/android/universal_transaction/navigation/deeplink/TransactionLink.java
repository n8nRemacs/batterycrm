package com.avito.android.universal_transaction.navigation.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TransactionLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/navigation/deeplink/TransactionLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TransactionLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<TransactionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f306475b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f306476c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f306477d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f306478e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f306479f;

    /* compiled from: TransactionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TransactionLink> {
        @Override // android.os.Parcelable.Creator
        public final TransactionLink createFromParcel(Parcel parcel) {
            return new TransactionLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TransactionLink[] newArray(int i12) {
            return new TransactionLink[i12];
        }
    }

    public TransactionLink(@k String str, @k String str2, @k String str3, @l String str4, @l String str5) {
        this.f306475b = str;
        this.f306476c = str2;
        this.f306477d = str3;
        this.f306478e = str4;
        this.f306479f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionLink)) {
            return false;
        }
        TransactionLink transactionLink = (TransactionLink) obj;
        return L.f(this.f306475b, transactionLink.f306475b) && L.f(this.f306476c, transactionLink.f306476c) && L.f(this.f306477d, transactionLink.f306477d) && L.f(this.f306478e, transactionLink.f306478e) && L.f(this.f306479f, transactionLink.f306479f);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f306475b.hashCode() * 31, 31, this.f306476c), 31, this.f306477d);
        String str = this.f306478e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f306479f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionLink(orderId=");
        sb2.append(this.f306475b);
        sb2.append(", scenario=");
        sb2.append(this.f306476c);
        sb2.append(", namespace=");
        sb2.append(this.f306477d);
        sb2.append(", extra=");
        sb2.append(this.f306478e);
        sb2.append(", eventParams=");
        return C22026a.c(sb2, this.f306479f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f306475b);
        parcel.writeString(this.f306476c);
        parcel.writeString(this.f306477d);
        parcel.writeString(this.f306478e);
        parcel.writeString(this.f306479f);
    }
}
