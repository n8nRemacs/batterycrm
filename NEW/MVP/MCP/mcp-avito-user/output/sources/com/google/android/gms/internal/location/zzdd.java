package com.google.android.gms.internal.location;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.D;
import com.google.android.gms.location.LocationRequest;
import j.P;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
@Deprecated
/* loaded from: classes6.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final LocationRequest f350503b;

    @SafeParcelable.b
    public zzdd(@SafeParcelable.e LocationRequest locationRequest, @SafeParcelable.f @P ArrayList arrayList, @SafeParcelable.f boolean z12, @SafeParcelable.f boolean z13, @SafeParcelable.f @P String str, @SafeParcelable.f boolean z14, @SafeParcelable.f boolean z15, @SafeParcelable.f @P String str2, @SafeParcelable.f long j12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    D.a(workSource, clientIdentity.f349304b, clientIdentity.f349305c);
                }
            }
            aVar.f354248n = workSource;
        }
        boolean z16 = true;
        if (z12) {
            aVar.f354244j = 1;
        }
        if (z13) {
            aVar.c(2);
        }
        if (str != null) {
            aVar.b(str);
        } else if (str2 != null) {
            aVar.b(str2);
        }
        if (z14) {
            aVar.f354247m = true;
        }
        if (z15) {
            aVar.f354242h = true;
        }
        if (j12 != Long.MAX_VALUE) {
            if (j12 != -1 && j12 < 0) {
                z16 = false;
            }
            C36729v.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z16);
            aVar.f354243i = j12;
        }
        this.f350503b = aVar.a();
    }

    @Deprecated
    public static zzdd zza(@P String str, LocationRequest locationRequest) {
        return new zzdd(locationRequest, null, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(@P Object obj) {
        if (obj instanceof zzdd) {
            return C36727t.a(this.f350503b, ((zzdd) obj).f350503b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f350503b.hashCode();
    }

    public final String toString() {
        return this.f350503b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.i(parcel, 1, this.f350503b, i12, false);
        a.p(parcel, iO2);
    }
}
