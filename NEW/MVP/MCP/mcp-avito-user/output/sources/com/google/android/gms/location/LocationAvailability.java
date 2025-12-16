package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @j.N
    public static final Parcelable.Creator<LocationAvailability> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354215b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354216c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354217d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354218e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final zzac[] f354219f;

    static {
        new LocationAvailability(0, 1, 1, 0L, null);
        new LocationAvailability(1000, 1, 1, 0L, null);
        CREATOR = new V();
    }

    @SafeParcelable.b
    public LocationAvailability(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e long j12, @SafeParcelable.e zzac[] zzacVarArr) {
        this.f354218e = i12 < 1000 ? 0 : 1000;
        this.f354215b = i13;
        this.f354216c = i14;
        this.f354217d = j12;
        this.f354219f = zzacVarArr;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f354215b == locationAvailability.f354215b && this.f354216c == locationAvailability.f354216c && this.f354217d == locationAvailability.f354217d && this.f354218e == locationAvailability.f354218e && Arrays.equals(this.f354219f, locationAvailability.f354219f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354218e)});
    }

    @j.N
    public final String toString() {
        return "LocationAvailability[" + (this.f354218e < 1000) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f354215b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354216c);
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(this.f354217d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f354218e);
        TX0.a.m(parcel, 5, this.f354219f, i12);
        int i13 = this.f354218e >= 1000 ? 0 : 1;
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(i13);
        TX0.a.p(parcel, iO2);
    }
}
