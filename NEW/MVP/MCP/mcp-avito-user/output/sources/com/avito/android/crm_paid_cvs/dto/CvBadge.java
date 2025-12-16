package com.avito.android.crm_paid_cvs.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvBadge.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/CvBadge;", "Landroid/os/Parcelable;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CvBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<CvBadge> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130323b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f130324c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f130325d;

    /* compiled from: CvBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvBadge> {
        @Override // android.os.Parcelable.Creator
        public final CvBadge createFromParcel(Parcel parcel) {
            return new CvBadge(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CvBadge[] newArray(int i12) {
            return new CvBadge[i12];
        }
    }

    public CvBadge(@k String str, @l String str2, @l String str3) {
        this.f130323b = str;
        this.f130324c = str2;
        this.f130325d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvBadge)) {
            return false;
        }
        CvBadge cvBadge = (CvBadge) obj;
        return L.f(this.f130323b, cvBadge.f130323b) && L.f(this.f130324c, cvBadge.f130324c) && L.f(this.f130325d, cvBadge.f130325d);
    }

    public final int hashCode() {
        int iHashCode = this.f130323b.hashCode() * 31;
        String str = this.f130324c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f130325d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvBadge(title=");
        sb2.append(this.f130323b);
        sb2.append(", badgeColor=");
        sb2.append(this.f130324c);
        sb2.append(", fontColor=");
        return C22026a.c(sb2, this.f130325d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130323b);
        parcel.writeString(this.f130324c);
        parcel.writeString(this.f130325d);
    }
}
