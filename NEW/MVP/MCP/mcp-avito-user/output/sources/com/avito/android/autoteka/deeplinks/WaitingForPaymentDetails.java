package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaWaitingForPaymentLink.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/WaitingForPaymentDetails;", "Landroid/os/Parcelable;", "", "externalId", "autotekaX", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WaitingForPaymentDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<WaitingForPaymentDetails> CREATOR = new a();

    @c("autotekaX")
    @l
    private final String autotekaX;

    @c("externalId")
    @k
    private final String externalId;

    /* compiled from: AutotekaWaitingForPaymentLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WaitingForPaymentDetails> {
        @Override // android.os.Parcelable.Creator
        public final WaitingForPaymentDetails createFromParcel(Parcel parcel) {
            return new WaitingForPaymentDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WaitingForPaymentDetails[] newArray(int i12) {
            return new WaitingForPaymentDetails[i12];
        }
    }

    public WaitingForPaymentDetails(@k String str, @l String str2) {
        this.externalId = str;
        this.autotekaX = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAutotekaX() {
        return this.autotekaX;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaitingForPaymentDetails)) {
            return false;
        }
        WaitingForPaymentDetails waitingForPaymentDetails = (WaitingForPaymentDetails) obj;
        return L.f(this.externalId, waitingForPaymentDetails.externalId) && L.f(this.autotekaX, waitingForPaymentDetails.autotekaX);
    }

    public final int hashCode() {
        int iHashCode = this.externalId.hashCode() * 31;
        String str = this.autotekaX;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WaitingForPaymentDetails(externalId=");
        sb2.append(this.externalId);
        sb2.append(", autotekaX=");
        return C22026a.c(sb2, this.autotekaX, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.externalId);
        parcel.writeString(this.autotekaX);
    }
}
