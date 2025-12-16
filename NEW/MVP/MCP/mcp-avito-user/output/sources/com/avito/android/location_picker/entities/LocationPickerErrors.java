package com.avito.android.location_picker.entities;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LocationPickerErrors.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerErrors;", "Landroid/os/Parcelable;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LocationPickerErrors implements Parcelable {

    @k
    public static final Parcelable.Creator<LocationPickerErrors> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f182345b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f182346c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f182347d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f182348e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f182349f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f182350g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f182351h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f182352i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f182353j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f182354k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f182355l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f182356m;

    /* compiled from: LocationPickerErrors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationPickerErrors> {
        @Override // android.os.Parcelable.Creator
        public final LocationPickerErrors createFromParcel(Parcel parcel) {
            return new LocationPickerErrors(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationPickerErrors[] newArray(int i12) {
            return new LocationPickerErrors[i12];
        }
    }

    public LocationPickerErrors() {
        this(false, false, null, null, false, false, false, false, false, false, false, false, 4095, null);
    }

    public static LocationPickerErrors a(LocationPickerErrors locationPickerErrors, String str, String str2, boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
        boolean z16 = (i12 & 1) != 0 ? locationPickerErrors.f182345b : true;
        boolean z17 = (i12 & 2) != 0 ? locationPickerErrors.f182346c : true;
        String str3 = (i12 & 4) != 0 ? locationPickerErrors.f182347d : str;
        String str4 = (i12 & 8) != 0 ? locationPickerErrors.f182348e : str2;
        boolean z18 = (i12 & 16) != 0 ? locationPickerErrors.f182349f : true;
        boolean z19 = (i12 & 32) != 0 ? locationPickerErrors.f182350g : z12;
        boolean z22 = (i12 & 64) != 0 ? locationPickerErrors.f182351h : z13;
        boolean z23 = (i12 & 128) != 0 ? locationPickerErrors.f182352i : z14;
        boolean z24 = (i12 & 256) != 0 ? locationPickerErrors.f182353j : z15;
        boolean z25 = (i12 & 512) != 0 ? locationPickerErrors.f182354k : true;
        boolean z26 = (i12 & 1024) != 0 ? locationPickerErrors.f182355l : true;
        boolean z27 = (i12 & 2048) != 0 ? locationPickerErrors.f182356m : true;
        locationPickerErrors.getClass();
        return new LocationPickerErrors(z16, z17, str3, str4, z18, z19, z22, z23, z24, z25, z26, z27);
    }

    public final boolean c() {
        return (this.f182346c || this.f182349f || this.f182350g || this.f182351h || this.f182352i || this.f182353j || this.f182345b || this.f182347d != null || this.f182348e != null || this.f182354k || this.f182355l || this.f182356m) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationPickerErrors)) {
            return false;
        }
        LocationPickerErrors locationPickerErrors = (LocationPickerErrors) obj;
        return this.f182345b == locationPickerErrors.f182345b && this.f182346c == locationPickerErrors.f182346c && L.f(this.f182347d, locationPickerErrors.f182347d) && L.f(this.f182348e, locationPickerErrors.f182348e) && this.f182349f == locationPickerErrors.f182349f && this.f182350g == locationPickerErrors.f182350g && this.f182351h == locationPickerErrors.f182351h && this.f182352i == locationPickerErrors.f182352i && this.f182353j == locationPickerErrors.f182353j && this.f182354k == locationPickerErrors.f182354k && this.f182355l == locationPickerErrors.f182355l && this.f182356m == locationPickerErrors.f182356m;
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f182345b) * 31, 31, this.f182346c);
        String str = this.f182347d;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f182348e;
        return Boolean.hashCode(this.f182356m) + r.i(r.i(r.i(r.i(r.i(r.i(r.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f182349f), 31, this.f182350g), 31, this.f182351h), 31, this.f182352i), 31, this.f182353j), 31, this.f182354k), 31, this.f182355l);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationPickerErrors(hasGeneralNetworkError=");
        sb2.append(this.f182345b);
        sb2.append(", hasNetworkErrorOnConfirmation=");
        sb2.append(this.f182346c);
        sb2.append(", addressConfirmationError=");
        sb2.append(this.f182347d);
        sb2.append(", unknownError=");
        sb2.append(this.f182348e);
        sb2.append(", notGrantedPermissionError=");
        sb2.append(this.f182349f);
        sb2.append(", geoSettingsIsDisabled=");
        sb2.append(this.f182350g);
        sb2.append(", notSuggestedAddressError=");
        sb2.append(this.f182351h);
        sb2.append(", noSuggestsError=");
        sb2.append(this.f182352i);
        sb2.append(", emptyAddressError=");
        sb2.append(this.f182353j);
        sb2.append(", advertsCountError=");
        sb2.append(this.f182354k);
        sb2.append(", advertsCountNetworkError=");
        sb2.append(this.f182355l);
        sb2.append(", noCoordsError=");
        return r.x(sb2, this.f182356m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f182345b ? 1 : 0);
        parcel.writeInt(this.f182346c ? 1 : 0);
        parcel.writeString(this.f182347d);
        parcel.writeString(this.f182348e);
        parcel.writeInt(this.f182349f ? 1 : 0);
        parcel.writeInt(this.f182350g ? 1 : 0);
        parcel.writeInt(this.f182351h ? 1 : 0);
        parcel.writeInt(this.f182352i ? 1 : 0);
        parcel.writeInt(this.f182353j ? 1 : 0);
        parcel.writeInt(this.f182354k ? 1 : 0);
        parcel.writeInt(this.f182355l ? 1 : 0);
        parcel.writeInt(this.f182356m ? 1 : 0);
    }

    public LocationPickerErrors(boolean z12, boolean z13, @l String str, @l String str2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, boolean z23) {
        this.f182345b = z12;
        this.f182346c = z13;
        this.f182347d = str;
        this.f182348e = str2;
        this.f182349f = z14;
        this.f182350g = z15;
        this.f182351h = z16;
        this.f182352i = z17;
        this.f182353j = z18;
        this.f182354k = z19;
        this.f182355l = z22;
        this.f182356m = z23;
    }

    public /* synthetic */ LocationPickerErrors(boolean z12, boolean z13, String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, boolean z23, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? null : str, (i12 & 8) == 0 ? str2 : null, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15, (i12 & 64) != 0 ? false : z16, (i12 & 128) != 0 ? false : z17, (i12 & 256) != 0 ? false : z18, (i12 & 512) != 0 ? false : z19, (i12 & 1024) != 0 ? false : z22, (i12 & 2048) == 0 ? z23 : false);
    }
}
