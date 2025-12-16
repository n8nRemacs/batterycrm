package com.avito.android.calltracking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessengerPhoneCallResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/calltracking/remote/model/IacResult;", "Landroid/os/Parcelable;", "", "can", "forceIac", "", "reason", "analyticParams", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "Z", "getCan", "()Z", "getForceIac", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "c", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class IacResult implements Parcelable {

    @k
    public static final Parcelable.Creator<IacResult> CREATOR = new a();

    @c("analyticParams")
    @l
    private final String analyticParams;

    @c("can")
    private final boolean can;

    @c("forceIac")
    private final boolean forceIac;

    @c("reason")
    @l
    private final String reason;

    /* compiled from: MessengerPhoneCallResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacResult> {
        @Override // android.os.Parcelable.Creator
        public final IacResult createFromParcel(Parcel parcel) {
            return new IacResult(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacResult[] newArray(int i12) {
            return new IacResult[i12];
        }
    }

    public IacResult(boolean z12, boolean z13, @l String str, @l String str2) {
        this.can = z12;
        this.forceIac = z13;
        this.reason = str;
        this.analyticParams = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAnalyticParams() {
        return this.analyticParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacResult)) {
            return false;
        }
        IacResult iacResult = (IacResult) obj;
        return this.can == iacResult.can && this.forceIac == iacResult.forceIac && L.f(this.reason, iacResult.reason) && L.f(this.analyticParams, iacResult.analyticParams);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.can) * 31, 31, this.forceIac);
        String str = this.reason;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticParams;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacResult(can=");
        sb2.append(this.can);
        sb2.append(", forceIac=");
        sb2.append(this.forceIac);
        sb2.append(", reason=");
        sb2.append(this.reason);
        sb2.append(", analyticParams=");
        return C22026a.c(sb2, this.analyticParams, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.can ? 1 : 0);
        parcel.writeInt(this.forceIac ? 1 : 0);
        parcel.writeString(this.reason);
        parcel.writeString(this.analyticParams);
    }
}
