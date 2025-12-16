package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.UtmParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaLandingLink.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/LandingDetails;", "Landroid/os/Parcelable;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LandingDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingDetails> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f96242b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UtmParams f96243c;

    /* compiled from: AutotekaLandingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingDetails> {
        @Override // android.os.Parcelable.Creator
        public final LandingDetails createFromParcel(Parcel parcel) {
            return new LandingDetails(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UtmParams) parcel.readParcelable(LandingDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LandingDetails[] newArray(int i12) {
            return new LandingDetails[i12];
        }
    }

    public LandingDetails(@l Integer num, @l UtmParams utmParams) {
        this.f96242b = num;
        this.f96243c = utmParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingDetails)) {
            return false;
        }
        LandingDetails landingDetails = (LandingDetails) obj;
        return L.f(this.f96242b, landingDetails.f96242b) && L.f(this.f96243c, landingDetails.f96243c);
    }

    public final int hashCode() {
        Integer num = this.f96242b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UtmParams utmParams = this.f96243c;
        return iHashCode + (utmParams != null ? utmParams.f318752b.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "LandingDetails(fromBlock=" + this.f96242b + ", utmParams=" + this.f96243c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f96242b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f96243c, i12);
    }
}
