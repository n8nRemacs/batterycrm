package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaReportGenerationLink.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/ReportGenerationDetails;", "Landroid/os/Parcelable;", "", "usagePublicId", "autotekaX", "", "fromBlock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReportGenerationDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<ReportGenerationDetails> CREATOR = new a();

    @c("autotekaX")
    @l
    private final String autotekaX;

    @c("fromBlock")
    @l
    private final Long fromBlock;

    @c("usagePublicId")
    @k
    private final String usagePublicId;

    /* compiled from: AutotekaReportGenerationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReportGenerationDetails> {
        @Override // android.os.Parcelable.Creator
        public final ReportGenerationDetails createFromParcel(Parcel parcel) {
            return new ReportGenerationDetails(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReportGenerationDetails[] newArray(int i12) {
            return new ReportGenerationDetails[i12];
        }
    }

    public ReportGenerationDetails(@k String str, @l String str2, @l Long l12) {
        this.usagePublicId = str;
        this.autotekaX = str2;
        this.fromBlock = l12;
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
    public final String getUsagePublicId() {
        return this.usagePublicId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportGenerationDetails)) {
            return false;
        }
        ReportGenerationDetails reportGenerationDetails = (ReportGenerationDetails) obj;
        return L.f(this.usagePublicId, reportGenerationDetails.usagePublicId) && L.f(this.autotekaX, reportGenerationDetails.autotekaX) && L.f(this.fromBlock, reportGenerationDetails.fromBlock);
    }

    public final int hashCode() {
        int iHashCode = this.usagePublicId.hashCode() * 31;
        String str = this.autotekaX;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.fromBlock;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportGenerationDetails(usagePublicId=");
        sb2.append(this.usagePublicId);
        sb2.append(", autotekaX=");
        sb2.append(this.autotekaX);
        sb2.append(", fromBlock=");
        return m.m(sb2, this.fromBlock, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.usagePublicId);
        parcel.writeString(this.autotekaX);
        Long l12 = this.fromBlock;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
