package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a9j;
import defpackage.cki;
import defpackage.l4;
import defpackage.syi;
import defpackage.wci;
import defpackage.wki;
import java.util.Arrays;
import org.apache.http.HttpStatus;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class LocationRequest extends l4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new wci(3);
    public final int X;
    public final float Y;
    public final boolean Z;
    public int a;
    public final long b;
    public final long c;
    public final long d;
    public final long o;
    public final long s0;
    public final int t0;
    public final int u0;
    public final boolean v0;
    public final WorkSource w0;
    public final cki x0;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, cki ckiVar) {
        this.a = i;
        if (i == 105) {
            this.b = BuildConfig.MAX_TIME_TO_UPLOAD;
        } else {
            this.b = j;
        }
        this.c = j2;
        this.d = j3;
        this.o = j4 == BuildConfig.MAX_TIME_TO_UPLOAD ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.X = i2;
        this.Y = f;
        this.Z = z;
        this.s0 = j6 != -1 ? j6 : j;
        this.t0 = i3;
        this.u0 = i4;
        this.v0 = z2;
        this.w0 = workSource;
        this.x0 = ckiVar;
    }

    public static String c(long j) {
        String string;
        if (j == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return "∞";
        }
        StringBuilder sb = wki.a;
        synchronized (sb) {
            sb.setLength(0);
            wki.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final boolean b() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = this.a;
        if (i != locationRequest.a) {
            return false;
        }
        if ((i == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b()) {
            return (!b() || this.d == locationRequest.d) && this.o == locationRequest.o && this.X == locationRequest.X && this.Y == locationRequest.Y && this.Z == locationRequest.Z && this.t0 == locationRequest.t0 && this.u0 == locationRequest.u0 && this.v0 == locationRequest.v0 && this.w0.equals(locationRequest.w0) && syi.c(this.x0, locationRequest.x0);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.w0});
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        int i2 = this.a;
        a9j.m(parcel, 1, 4);
        parcel.writeInt(i2);
        a9j.m(parcel, 2, 8);
        parcel.writeLong(this.b);
        a9j.m(parcel, 3, 8);
        parcel.writeLong(this.c);
        a9j.m(parcel, 6, 4);
        parcel.writeInt(this.X);
        a9j.m(parcel, 7, 4);
        parcel.writeFloat(this.Y);
        a9j.m(parcel, 8, 8);
        parcel.writeLong(this.d);
        a9j.m(parcel, 9, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        a9j.m(parcel, 10, 8);
        parcel.writeLong(this.o);
        a9j.m(parcel, 11, 8);
        parcel.writeLong(this.s0);
        a9j.m(parcel, 12, 4);
        parcel.writeInt(this.t0);
        a9j.m(parcel, 13, 4);
        parcel.writeInt(this.u0);
        a9j.m(parcel, 15, 4);
        parcel.writeInt(this.v0 ? 1 : 0);
        a9j.f(parcel, 16, this.w0, i);
        a9j.f(parcel, 17, this.x0, i);
        a9j.l(parcel, iK);
    }

    @Deprecated
    public LocationRequest() {
        this(HttpStatus.SC_PROCESSING, 3600000L, 600000L, 0L, BuildConfig.MAX_TIME_TO_UPLOAD, BuildConfig.MAX_TIME_TO_UPLOAD, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
