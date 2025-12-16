package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final List f354251b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f354250c = Collections.emptyList();

    @j.N
    public static final Parcelable.Creator<LocationResult> CREATOR = new X();

    @SafeParcelable.b
    public LocationResult(@SafeParcelable.e List list) {
        this.f354251b = list;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i12 = Build.VERSION.SDK_INT;
        List<Location> list = this.f354251b;
        if (i12 >= 31) {
            return list.equals(locationResult.f354251b);
        }
        if (list.size() != locationResult.f354251b.size()) {
            return false;
        }
        Iterator it = locationResult.f354251b.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !C36727t.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    @j.P
    public final Location h() {
        List list = this.f354251b;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        return (Location) list.get(size - 1);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f354251b});
    }

    @j.N
    public final String toString() {
        return "LocationResult".concat(String.valueOf(this.f354251b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f354251b, false);
        TX0.a.p(parcel, iO2);
    }
}
