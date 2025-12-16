package com.avito.android.realty_agency.checkerboard.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CheckerboardLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/deeplink/CheckerboardLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final /* data */ class CheckerboardLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CheckerboardLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f251084b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f251085c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f251086d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SearchParams f251087e;

    /* compiled from: CheckerboardLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckerboardLink> {
        @Override // android.os.Parcelable.Creator
        public final CheckerboardLink createFromParcel(Parcel parcel) {
            return new CheckerboardLink(parcel.readLong(), parcel.readString(), parcel.readString(), (SearchParams) parcel.readParcelable(CheckerboardLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CheckerboardLink[] newArray(int i12) {
            return new CheckerboardLink[i12];
        }
    }

    public CheckerboardLink(long j12, @k String str, @k String str2, @k SearchParams searchParams) {
        this.f251084b = j12;
        this.f251085c = str;
        this.f251086d = str2;
        this.f251087e = searchParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckerboardLink)) {
            return false;
        }
        CheckerboardLink checkerboardLink = (CheckerboardLink) obj;
        return this.f251084b == checkerboardLink.f251084b && L.f(this.f251085c, checkerboardLink.f251085c) && L.f(this.f251086d, checkerboardLink.f251086d) && L.f(this.f251087e, checkerboardLink.f251087e);
    }

    public final int hashCode() {
        return this.f251087e.hashCode() + H.d(H.d(Long.hashCode(this.f251084b) * 31, 31, this.f251085c), 31, this.f251086d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckerboardLink(developmentId=");
        sb2.append(this.f251084b);
        sb2.append(", developmentName=");
        sb2.append(this.f251085c);
        sb2.append(", developerName=");
        sb2.append(this.f251086d);
        sb2.append(", searchParams=");
        return com.avito.android.bxcontent.mvi.entity.f.m(sb2, this.f251087e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f251084b);
        parcel.writeString(this.f251085c);
        parcel.writeString(this.f251086d);
        parcel.writeParcelable(this.f251087e, i12);
    }
}
