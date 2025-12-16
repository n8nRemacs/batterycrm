package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new H();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354184b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354185c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354186d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354187e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354188f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354189g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f354190h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final WorkSource f354191i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzd f354192j;

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f354193a = 102;
    }

    @SafeParcelable.b
    public CurrentLocationRequest(@SafeParcelable.e long j12, @SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e long j13, @SafeParcelable.e boolean z12, @SafeParcelable.e int i14, @SafeParcelable.e @j.P String str, @SafeParcelable.e WorkSource workSource, @SafeParcelable.e @j.P zzd zzdVar) {
        boolean z13 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z13 = false;
        }
        C36729v.b(z13);
        this.f354184b = j12;
        this.f354185c = i12;
        this.f354186d = i13;
        this.f354187e = j13;
        this.f354188f = z12;
        this.f354189g = i14;
        this.f354190h = str;
        this.f354191i = workSource;
        this.f354192j = zzdVar;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.f354184b == currentLocationRequest.f354184b && this.f354185c == currentLocationRequest.f354185c && this.f354186d == currentLocationRequest.f354186d && this.f354187e == currentLocationRequest.f354187e && this.f354188f == currentLocationRequest.f354188f && this.f354189g == currentLocationRequest.f354189g && C36727t.a(this.f354190h, currentLocationRequest.f354190h) && C36727t.a(this.f354191i, currentLocationRequest.f354191i) && C36727t.a(this.f354192j, currentLocationRequest.f354192j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f354184b), Integer.valueOf(this.f354185c), Integer.valueOf(this.f354186d), Long.valueOf(this.f354187e)});
    }

    @j.N
    public final String toString() {
        String str;
        StringBuilder sbR = androidx.compose.foundation.H.r("CurrentLocationRequest[");
        sbR.append(C36799u.b(this.f354186d));
        long j12 = this.f354184b;
        if (j12 != Long.MAX_VALUE) {
            sbR.append(", maxAge=");
            zzdj.zzb(j12, sbR);
        }
        long j13 = this.f354187e;
        if (j13 != Long.MAX_VALUE) {
            sbR.append(", duration=");
            sbR.append(j13);
            sbR.append("ms");
        }
        int i12 = this.f354185c;
        if (i12 != 0) {
            sbR.append(", ");
            sbR.append(M.a(i12));
        }
        if (this.f354188f) {
            sbR.append(", bypass");
        }
        int i13 = this.f354189g;
        if (i13 != 0) {
            sbR.append(", ");
            if (i13 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i13 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            sbR.append(str);
        }
        String str2 = this.f354190h;
        if (str2 != null) {
            sbR.append(", moduleId=");
            sbR.append(str2);
        }
        WorkSource workSource = this.f354191i;
        if (!com.google.android.gms.common.util.D.b(workSource)) {
            sbR.append(", workSource=");
            sbR.append(workSource);
        }
        zzd zzdVar = this.f354192j;
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
        TX0.a.q(parcel, 1, 8);
        parcel.writeLong(this.f354184b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354185c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354186d);
        TX0.a.q(parcel, 4, 8);
        parcel.writeLong(this.f354187e);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f354188f ? 1 : 0);
        TX0.a.i(parcel, 6, this.f354191i, i12, false);
        TX0.a.q(parcel, 7, 4);
        parcel.writeInt(this.f354189g);
        TX0.a.j(parcel, 8, this.f354190h, false);
        TX0.a.i(parcel, 9, this.f354192j, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
