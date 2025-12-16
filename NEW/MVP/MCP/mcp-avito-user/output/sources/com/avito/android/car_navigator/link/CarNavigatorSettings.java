package com.avito.android.car_navigator.link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CarNavigatorLink.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/link/CarNavigatorSettings;", "Landroid/os/Parcelable;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CarNavigatorSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<CarNavigatorSettings> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115191b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f115192c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f115193d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f115194e;

    /* compiled from: CarNavigatorLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarNavigatorSettings> {
        @Override // android.os.Parcelable.Creator
        public final CarNavigatorSettings createFromParcel(Parcel parcel) {
            return new CarNavigatorSettings(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CarNavigatorSettings[] newArray(int i12) {
            return new CarNavigatorSettings[i12];
        }
    }

    public CarNavigatorSettings() {
        this(false, false, false, false, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarNavigatorSettings)) {
            return false;
        }
        CarNavigatorSettings carNavigatorSettings = (CarNavigatorSettings) obj;
        return this.f115191b == carNavigatorSettings.f115191b && this.f115192c == carNavigatorSettings.f115192c && this.f115193d == carNavigatorSettings.f115193d && this.f115194e == carNavigatorSettings.f115194e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115194e) + r.i(r.i(Boolean.hashCode(this.f115191b) * 31, 31, this.f115192c), 31, this.f115193d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarNavigatorSettings(fullscreen=");
        sb2.append(this.f115191b);
        sb2.append(", withMavAuthorization=");
        sb2.append(this.f115192c);
        sb2.append(", keepOnDeepLinkOpen=");
        sb2.append(this.f115193d);
        sb2.append(", needAppAuth=");
        return r.x(sb2, this.f115194e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f115191b ? 1 : 0);
        parcel.writeInt(this.f115192c ? 1 : 0);
        parcel.writeInt(this.f115193d ? 1 : 0);
        parcel.writeInt(this.f115194e ? 1 : 0);
    }

    public CarNavigatorSettings(boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f115191b = z12;
        this.f115192c = z13;
        this.f115193d = z14;
        this.f115194e = z15;
    }

    public /* synthetic */ CarNavigatorSettings(boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? true : z14, (i12 & 8) != 0 ? false : z15);
    }
}
