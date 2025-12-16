package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: InstallmentsFakeDoorLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/InstallmentsFakeDoorLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class InstallmentsFakeDoorLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<InstallmentsFakeDoorLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f133375b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133376c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133377d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DeepLink f133378e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133379f;

    /* renamed from: g, reason: collision with root package name */
    public final long f133380g;

    /* compiled from: InstallmentsFakeDoorLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsFakeDoorLink> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsFakeDoorLink createFromParcel(Parcel parcel) {
            return new InstallmentsFakeDoorLink(parcel.readLong(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(InstallmentsFakeDoorLink.class.getClassLoader()), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsFakeDoorLink[] newArray(int i12) {
            return new InstallmentsFakeDoorLink[i12];
        }
    }

    public InstallmentsFakeDoorLink(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.l String str3, long j13) {
        this.f133375b = j12;
        this.f133376c = str;
        this.f133377d = str2;
        this.f133378e = deepLink;
        this.f133379f = str3;
        this.f133380g = j13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsFakeDoorLink)) {
            return false;
        }
        InstallmentsFakeDoorLink installmentsFakeDoorLink = (InstallmentsFakeDoorLink) obj;
        return this.f133375b == installmentsFakeDoorLink.f133375b && kotlin.jvm.internal.L.f(this.f133376c, installmentsFakeDoorLink.f133376c) && kotlin.jvm.internal.L.f(this.f133377d, installmentsFakeDoorLink.f133377d) && kotlin.jvm.internal.L.f(this.f133378e, installmentsFakeDoorLink.f133378e) && kotlin.jvm.internal.L.f(this.f133379f, installmentsFakeDoorLink.f133379f) && this.f133380g == installmentsFakeDoorLink.f133380g;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f133378e, androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(Long.hashCode(this.f133375b) * 31, 31, this.f133376c), 31, this.f133377d), 31);
        String str = this.f133379f;
        return Long.hashCode(this.f133380g) + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsFakeDoorLink(itemID=");
        sb2.append(this.f133375b);
        sb2.append(", installmentsPlan=");
        sb2.append(this.f133376c);
        sb2.append(", fromPage=");
        sb2.append(this.f133377d);
        sb2.append(", buyButtonDeepLink=");
        sb2.append(this.f133378e);
        sb2.append(", context=");
        sb2.append(this.f133379f);
        sb2.append(", loanAmount=");
        return androidx.appcompat.app.r.u(sb2, this.f133380g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f133375b);
        parcel.writeString(this.f133376c);
        parcel.writeString(this.f133377d);
        parcel.writeParcelable(this.f133378e, i12);
        parcel.writeString(this.f133379f);
        parcel.writeLong(this.f133380g);
    }
}
