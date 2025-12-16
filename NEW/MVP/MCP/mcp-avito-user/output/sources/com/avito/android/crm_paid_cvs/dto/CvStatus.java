package com.avito.android.crm_paid_cvs.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import j.InterfaceC42158n;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvStatus.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/CvStatus;", "Landroid/os/Parcelable;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CvStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<CvStatus> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f130348c;

    /* renamed from: d, reason: collision with root package name */
    public final int f130349d;

    /* compiled from: CvStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvStatus> {
        @Override // android.os.Parcelable.Creator
        public final CvStatus createFromParcel(Parcel parcel) {
            return new CvStatus(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CvStatus[] newArray(int i12) {
            return new CvStatus[i12];
        }
    }

    public CvStatus(@k String str, @e0 int i12, @InterfaceC42158n int i13) {
        this.f130347b = str;
        this.f130348c = i12;
        this.f130349d = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvStatus)) {
            return false;
        }
        CvStatus cvStatus = (CvStatus) obj;
        return L.f(this.f130347b, cvStatus.f130347b) && this.f130348c == cvStatus.f130348c && this.f130349d == cvStatus.f130349d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130349d) + r.e(this.f130348c, this.f130347b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvStatus(id=");
        sb2.append(this.f130347b);
        sb2.append(", titleRes=");
        sb2.append(this.f130348c);
        sb2.append(", colorRes=");
        return r.t(sb2, this.f130349d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130347b);
        parcel.writeInt(this.f130348c);
        parcel.writeInt(this.f130349d);
    }
}
