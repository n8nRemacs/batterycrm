package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/AdvantageInfo;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdvantageInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvantageInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalImage f107850b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107851c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f107852d;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvantageInfo> {
        @Override // android.os.Parcelable.Creator
        public final AdvantageInfo createFromParcel(Parcel parcel) {
            return new AdvantageInfo((UniversalImage) parcel.readParcelable(AdvantageInfo.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvantageInfo[] newArray(int i12) {
            return new AdvantageInfo[i12];
        }
    }

    public AdvantageInfo(@k UniversalImage universalImage, @k String str, @k String str2) {
        this.f107850b = universalImage;
        this.f107851c = str;
        this.f107852d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvantageInfo)) {
            return false;
        }
        AdvantageInfo advantageInfo = (AdvantageInfo) obj;
        return L.f(this.f107850b, advantageInfo.f107850b) && L.f(this.f107851c, advantageInfo.f107851c) && L.f(this.f107852d, advantageInfo.f107852d);
    }

    public final int hashCode() {
        return this.f107852d.hashCode() + H.d(this.f107850b.hashCode() * 31, 31, this.f107851c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvantageInfo(image=");
        sb2.append(this.f107850b);
        sb2.append(", text=");
        sb2.append(this.f107851c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f107852d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f107850b, i12);
        parcel.writeString(this.f107851c);
        parcel.writeString(this.f107852d);
    }
}
