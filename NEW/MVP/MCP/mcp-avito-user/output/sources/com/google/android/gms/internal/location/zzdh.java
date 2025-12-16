package com.google.android.gms.internal.location;

import AK.c;
import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.InterfaceC36782c;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@VisibleForTesting
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzdh extends AbstractSafeParcelable implements InterfaceC36782c {
    public static final Parcelable.Creator<zzdh> CREATOR = new zzdi();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f350511b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final long f350512c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final short f350513d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final double f350514e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final double f350515f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final float f350516g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final int f350517h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final int f350518i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final int f350519j;

    @SafeParcelable.b
    public zzdh(@SafeParcelable.e String str, @SafeParcelable.e int i12, @SafeParcelable.e short s5, @SafeParcelable.e double d12, @SafeParcelable.e double d13, @SafeParcelable.e float f12, @SafeParcelable.e long j12, @SafeParcelable.e int i13, @SafeParcelable.e int i14) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException(m.i(f12, "invalid radius: "));
        }
        if (d12 > 90.0d || d12 < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d12);
        }
        if (d13 > 180.0d || d13 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d13);
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            throw new IllegalArgumentException(c.g(i12, "No supported transition specified: "));
        }
        this.f350513d = s5;
        this.f350511b = str;
        this.f350514e = d12;
        this.f350515f = d13;
        this.f350516g = f12;
        this.f350512c = j12;
        this.f350517h = i15;
        this.f350518i = i13;
        this.f350519j = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdh) {
            zzdh zzdhVar = (zzdh) obj;
            if (this.f350516g == zzdhVar.f350516g && this.f350514e == zzdhVar.f350514e && this.f350515f == zzdhVar.f350515f && this.f350513d == zzdhVar.f350513d) {
                return true;
            }
        }
        return false;
    }

    public final long getExpirationTime() {
        return this.f350512c;
    }

    public final double getLatitude() {
        return this.f350514e;
    }

    public final int getLoiteringDelay() {
        return this.f350519j;
    }

    public final double getLongitude() {
        return this.f350515f;
    }

    public final int getNotificationResponsiveness() {
        return this.f350518i;
    }

    public final float getRadius() {
        return this.f350516g;
    }

    public final String getRequestId() {
        return this.f350511b;
    }

    public final int getTransitionTypes() {
        return this.f350517h;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f350514e);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f350515f);
        return ((((Float.floatToIntBits(this.f350516g) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.f350513d) * 31) + this.f350517h;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s5 = this.f350513d;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s5 != -1 ? s5 != 1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CIRCLE" : "INVALID", this.f350511b.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f350517h), Double.valueOf(this.f350514e), Double.valueOf(this.f350515f), Float.valueOf(this.f350516g), Integer.valueOf(this.f350518i / 1000), Integer.valueOf(this.f350519j), Long.valueOf(this.f350512c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f350511b, false);
        a.q(parcel, 2, 8);
        parcel.writeLong(this.f350512c);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f350513d);
        a.q(parcel, 4, 8);
        parcel.writeDouble(this.f350514e);
        a.q(parcel, 5, 8);
        parcel.writeDouble(this.f350515f);
        a.q(parcel, 6, 4);
        parcel.writeFloat(this.f350516g);
        a.q(parcel, 7, 4);
        parcel.writeInt(this.f350517h);
        a.q(parcel, 8, 4);
        parcel.writeInt(this.f350518i);
        a.q(parcel, 9, 4);
        parcel.writeInt(this.f350519j);
        a.p(parcel, iO2);
    }
}
