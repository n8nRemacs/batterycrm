package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaReportLink.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/ReportDetails;", "Lcom/avito/android/util/OpenParams;", "", "autotekaX", "reportPublicId", "", "fromBlock", "actionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "getActionType", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReportDetails implements OpenParams {

    @k
    public static final Parcelable.Creator<ReportDetails> CREATOR = new a();

    @c("actionType")
    @l
    private final String actionType;

    @c("autotekaX")
    @l
    private final String autotekaX;

    @c("fromBlock")
    @l
    private final Long fromBlock;

    @c("reportPublicId")
    @k
    private final String reportPublicId;

    /* compiled from: AutotekaReportLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReportDetails> {
        @Override // android.os.Parcelable.Creator
        public final ReportDetails createFromParcel(Parcel parcel) {
            return new ReportDetails(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportDetails[] newArray(int i12) {
            return new ReportDetails[i12];
        }
    }

    public ReportDetails(@l String str, @k String str2, @l Long l12, @l String str3) {
        this.autotekaX = str;
        this.reportPublicId = str2;
        this.fromBlock = l12;
        this.actionType = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAutotekaX() {
        return this.autotekaX;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getFromBlock() {
        return this.fromBlock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getReportPublicId() {
        return this.reportPublicId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportDetails)) {
            return false;
        }
        ReportDetails reportDetails = (ReportDetails) obj;
        return L.f(this.autotekaX, reportDetails.autotekaX) && L.f(this.reportPublicId, reportDetails.reportPublicId) && L.f(this.fromBlock, reportDetails.fromBlock) && L.f(this.actionType, reportDetails.actionType);
    }

    public final int hashCode() {
        String str = this.autotekaX;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.reportPublicId);
        Long l12 = this.fromBlock;
        int iHashCode = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.actionType;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportDetails(autotekaX=");
        sb2.append(this.autotekaX);
        sb2.append(", reportPublicId=");
        sb2.append(this.reportPublicId);
        sb2.append(", fromBlock=");
        sb2.append(this.fromBlock);
        sb2.append(", actionType=");
        return C22026a.c(sb2, this.actionType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.autotekaX);
        parcel.writeString(this.reportPublicId);
        Long l12 = this.fromBlock;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.actionType);
    }
}
