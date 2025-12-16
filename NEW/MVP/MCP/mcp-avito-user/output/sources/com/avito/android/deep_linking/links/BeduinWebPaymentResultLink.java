package com.avito.android.deep_linking.links;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BeduinWebPaymentResultLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/BeduinWebPaymentResultLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class BeduinWebPaymentResultLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<BeduinWebPaymentResultLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133047b;

    /* compiled from: BeduinWebPaymentResultLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinWebPaymentResultLink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinWebPaymentResultLink createFromParcel(Parcel parcel) {
            return new BeduinWebPaymentResultLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinWebPaymentResultLink[] newArray(int i12) {
            return new BeduinWebPaymentResultLink[i12];
        }
    }

    public BeduinWebPaymentResultLink(@Y61.k String str) {
        this.f133047b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BeduinWebPaymentResultLink) && kotlin.jvm.internal.L.f(this.f133047b, ((BeduinWebPaymentResultLink) obj).f133047b);
    }

    public final int hashCode() {
        return this.f133047b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("BeduinWebPaymentResultLink(beduinActionsJson="), this.f133047b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133047b);
    }
}
