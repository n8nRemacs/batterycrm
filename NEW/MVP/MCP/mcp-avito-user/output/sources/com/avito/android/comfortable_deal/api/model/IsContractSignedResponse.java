package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: IsContractSignedResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/IsContractSignedResponse;", "Landroid/os/Parcelable;", "", "isSigned", "isRootAgent", "<init>", "(ZZ)V", "Z", "d", "()Z", "c", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class IsContractSignedResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<IsContractSignedResponse> CREATOR = new a();

    @c("isRootAgent")
    private final boolean isRootAgent;

    @c("isSigned")
    private final boolean isSigned;

    /* compiled from: IsContractSignedResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IsContractSignedResponse> {
        @Override // android.os.Parcelable.Creator
        public final IsContractSignedResponse createFromParcel(Parcel parcel) {
            return new IsContractSignedResponse(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IsContractSignedResponse[] newArray(int i12) {
            return new IsContractSignedResponse[i12];
        }
    }

    public IsContractSignedResponse(boolean z12, boolean z13) {
        this.isSigned = z12;
        this.isRootAgent = z13;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsRootAgent() {
        return this.isRootAgent;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSigned() {
        return this.isSigned;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IsContractSignedResponse)) {
            return false;
        }
        IsContractSignedResponse isContractSignedResponse = (IsContractSignedResponse) obj;
        return this.isSigned == isContractSignedResponse.isSigned && this.isRootAgent == isContractSignedResponse.isRootAgent;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isRootAgent) + (Boolean.hashCode(this.isSigned) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IsContractSignedResponse(isSigned=");
        sb2.append(this.isSigned);
        sb2.append(", isRootAgent=");
        return r.x(sb2, this.isRootAgent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.isSigned ? 1 : 0);
        parcel.writeInt(this.isRootAgent ? 1 : 0);
    }
}
