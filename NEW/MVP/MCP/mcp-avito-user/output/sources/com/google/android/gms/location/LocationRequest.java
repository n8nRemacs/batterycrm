package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @j.N
    public static final Parcelable.Creator<LocationRequest> CREATOR = new W();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public int f354220b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public long f354221c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public long f354222d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354223e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354224f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354225g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public float f354226h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354227i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public long f354228j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354229k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354230l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f354231m;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354232n;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.c
    public final WorkSource f354233o;

    /* renamed from: p, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzd f354234p;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    @j.N
    @Deprecated
    public static LocationRequest h() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i12 = this.f354220b;
            if (i12 == locationRequest.f354220b && ((i12 == 105 || this.f354221c == locationRequest.f354221c) && this.f354222d == locationRequest.f354222d && i() == locationRequest.i() && ((!i() || this.f354223e == locationRequest.f354223e) && this.f354224f == locationRequest.f354224f && this.f354225g == locationRequest.f354225g && this.f354226h == locationRequest.f354226h && this.f354227i == locationRequest.f354227i && this.f354229k == locationRequest.f354229k && this.f354230l == locationRequest.f354230l && this.f354232n == locationRequest.f354232n && this.f354233o.equals(locationRequest.f354233o) && C36727t.a(this.f354231m, locationRequest.f354231m) && C36727t.a(this.f354234p, locationRequest.f354234p)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354220b), Long.valueOf(this.f354221c), Long.valueOf(this.f354222d), this.f354233o});
    }

    @Pure
    public final boolean i() {
        long j12 = this.f354223e;
        return j12 > 0 && (j12 >> 1) >= this.f354221c;
    }

    @j.N
    @Deprecated
    public final void j(long j12) {
        C36729v.a("intervalMillis must be greater than or equal to 0", j12 >= 0);
        long j13 = this.f354222d;
        long j14 = this.f354221c;
        if (j13 == j14 / 6) {
            this.f354222d = j12 / 6;
        }
        if (this.f354228j == j14) {
            this.f354228j = j12;
        }
        this.f354221c = j12;
    }

    @j.N
    public final String toString() {
        String str;
        StringBuilder sbR = androidx.compose.foundation.H.r("Request[");
        int i12 = this.f354220b;
        if (i12 == 105) {
            sbR.append(C36799u.b(i12));
        } else {
            sbR.append("@");
            if (i()) {
                zzdj.zzb(this.f354221c, sbR);
                sbR.append("/");
                zzdj.zzb(this.f354223e, sbR);
            } else {
                zzdj.zzb(this.f354221c, sbR);
            }
            sbR.append(" ");
            sbR.append(C36799u.b(this.f354220b));
        }
        if (this.f354220b == 105 || this.f354222d != this.f354221c) {
            sbR.append(", minUpdateInterval=");
            long j12 = this.f354222d;
            sbR.append(j12 == Long.MAX_VALUE ? "∞" : zzdj.zza(j12));
        }
        if (this.f354226h > 0.0d) {
            sbR.append(", minUpdateDistance=");
            sbR.append(this.f354226h);
        }
        if (!(this.f354220b == 105) ? this.f354228j != this.f354221c : this.f354228j != Long.MAX_VALUE) {
            sbR.append(", maxUpdateAge=");
            long j13 = this.f354228j;
            sbR.append(j13 != Long.MAX_VALUE ? zzdj.zza(j13) : "∞");
        }
        long j14 = this.f354224f;
        if (j14 != Long.MAX_VALUE) {
            sbR.append(", duration=");
            zzdj.zzb(j14, sbR);
        }
        int i13 = this.f354225g;
        if (i13 != Integer.MAX_VALUE) {
            sbR.append(", maxUpdates=");
            sbR.append(i13);
        }
        int i14 = this.f354230l;
        if (i14 != 0) {
            sbR.append(", ");
            if (i14 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i14 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i14 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            sbR.append(str);
        }
        int i15 = this.f354229k;
        if (i15 != 0) {
            sbR.append(", ");
            sbR.append(M.a(i15));
        }
        if (this.f354227i) {
            sbR.append(", waitForAccurateLocation");
        }
        if (this.f354232n) {
            sbR.append(", bypass");
        }
        String str2 = this.f354231m;
        if (str2 != null) {
            sbR.append(", moduleId=");
            sbR.append(str2);
        }
        WorkSource workSource = this.f354233o;
        if (!com.google.android.gms.common.util.D.b(workSource)) {
            sbR.append(", ");
            sbR.append(workSource);
        }
        zzd zzdVar = this.f354234p;
        if (zzdVar != null) {
            sbR.append(", impersonation=");
            sbR.append(zzdVar);
        }
        sbR.append(']');
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        int i13 = this.f354220b;
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(i13);
        long j12 = this.f354221c;
        TX0.a.q(parcel, 2, 8);
        parcel.writeLong(j12);
        long j13 = this.f354222d;
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(j13);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f354225g);
        float f12 = this.f354226h;
        TX0.a.q(parcel, 7, 4);
        parcel.writeFloat(f12);
        TX0.a.q(parcel, 8, 8);
        parcel.writeLong(this.f354223e);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(this.f354227i ? 1 : 0);
        TX0.a.q(parcel, 10, 8);
        parcel.writeLong(this.f354224f);
        long j14 = this.f354228j;
        TX0.a.q(parcel, 11, 8);
        parcel.writeLong(j14);
        TX0.a.q(parcel, 12, 4);
        parcel.writeInt(this.f354229k);
        TX0.a.q(parcel, 13, 4);
        parcel.writeInt(this.f354230l);
        TX0.a.j(parcel, 14, this.f354231m, false);
        TX0.a.q(parcel, 15, 4);
        parcel.writeInt(this.f354232n ? 1 : 0);
        TX0.a.i(parcel, 16, this.f354233o, i12, false);
        TX0.a.i(parcel, 17, this.f354234p, i12, false);
        TX0.a.p(parcel, iO2);
    }

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f354235a;

        /* renamed from: b, reason: collision with root package name */
        public final long f354236b;

        /* renamed from: c, reason: collision with root package name */
        public long f354237c;

        /* renamed from: d, reason: collision with root package name */
        public final long f354238d;

        /* renamed from: e, reason: collision with root package name */
        public long f354239e;

        /* renamed from: f, reason: collision with root package name */
        public final int f354240f;

        /* renamed from: g, reason: collision with root package name */
        public final float f354241g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f354242h;

        /* renamed from: i, reason: collision with root package name */
        public long f354243i;

        /* renamed from: j, reason: collision with root package name */
        public int f354244j;

        /* renamed from: k, reason: collision with root package name */
        public int f354245k;

        /* renamed from: l, reason: collision with root package name */
        @j.P
        public String f354246l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f354247m;

        /* renamed from: n, reason: collision with root package name */
        @j.P
        public WorkSource f354248n;

        /* renamed from: o, reason: collision with root package name */
        @j.P
        public final zzd f354249o;

        public a(int i12, long j12) {
            C36729v.a("intervalMillis must be greater than or equal to 0", j12 >= 0);
            C36799u.a(i12);
            this.f354235a = i12;
            this.f354236b = j12;
            this.f354237c = -1L;
            this.f354238d = 0L;
            this.f354239e = Long.MAX_VALUE;
            this.f354240f = Integer.MAX_VALUE;
            this.f354241g = 0.0f;
            this.f354242h = true;
            this.f354243i = -1L;
            this.f354244j = 0;
            this.f354245k = 0;
            this.f354246l = null;
            this.f354247m = false;
            this.f354248n = null;
            this.f354249o = null;
        }

        @j.N
        public final LocationRequest a() {
            long j12;
            long jMin = this.f354237c;
            int i12 = this.f354235a;
            long j13 = this.f354236b;
            if (jMin == -1) {
                j12 = j13;
            } else {
                if (i12 != 105) {
                    jMin = Math.min(jMin, j13);
                }
                j12 = jMin;
            }
            long j14 = this.f354238d;
            long j15 = this.f354236b;
            long jMax = Math.max(j14, j15);
            long j16 = this.f354239e;
            boolean z12 = this.f354242h;
            long j17 = this.f354243i;
            return new LocationRequest(i12, j13, j12, jMax, Long.MAX_VALUE, j16, this.f354240f, this.f354241g, z12, j17 == -1 ? j15 : j17, this.f354244j, this.f354245k, this.f354246l, this.f354247m, new WorkSource(this.f354248n), this.f354249o);
        }

        @j.N
        @Deprecated
        public final void b(@j.P String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f354246l = str;
            }
        }

        @j.N
        public final void c(int i12) {
            int i13;
            boolean z12 = true;
            if (i12 == 0 || i12 == 1) {
                i13 = i12;
            } else {
                i13 = 2;
                if (i12 == 2) {
                    i12 = 2;
                } else {
                    z12 = false;
                    i13 = i12;
                }
            }
            C36729v.c(z12, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i12));
            this.f354245k = i13;
        }

        public a(@j.N LocationRequest locationRequest) {
            this.f354235a = locationRequest.f354220b;
            this.f354236b = locationRequest.f354221c;
            this.f354237c = locationRequest.f354222d;
            this.f354238d = locationRequest.f354223e;
            this.f354239e = locationRequest.f354224f;
            this.f354240f = locationRequest.f354225g;
            this.f354241g = locationRequest.f354226h;
            this.f354242h = locationRequest.f354227i;
            this.f354243i = locationRequest.f354228j;
            this.f354244j = locationRequest.f354229k;
            this.f354245k = locationRequest.f354230l;
            this.f354246l = locationRequest.f354231m;
            this.f354247m = locationRequest.f354232n;
            this.f354248n = locationRequest.f354233o;
            this.f354249o = locationRequest.f354234p;
        }
    }

    @SafeParcelable.b
    public LocationRequest(@SafeParcelable.e int i12, @SafeParcelable.e long j12, @SafeParcelable.e long j13, @SafeParcelable.e long j14, @SafeParcelable.f long j15, @SafeParcelable.e long j16, @SafeParcelable.e int i13, @SafeParcelable.e float f12, @SafeParcelable.e boolean z12, @SafeParcelable.e long j17, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e @j.P String str, @SafeParcelable.e boolean z13, @SafeParcelable.e WorkSource workSource, @SafeParcelable.e @j.P zzd zzdVar) {
        this.f354220b = i12;
        long j18 = j12;
        this.f354221c = j18;
        this.f354222d = j13;
        this.f354223e = j14;
        this.f354224f = j15 == Long.MAX_VALUE ? j16 : Math.min(Math.max(1L, j15 - SystemClock.elapsedRealtime()), j16);
        this.f354225g = i13;
        this.f354226h = f12;
        this.f354227i = z12;
        this.f354228j = j17 != -1 ? j17 : j18;
        this.f354229k = i14;
        this.f354230l = i15;
        this.f354231m = str;
        this.f354232n = z13;
        this.f354233o = workSource;
        this.f354234p = zzdVar;
    }
}
