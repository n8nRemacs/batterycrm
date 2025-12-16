package com.google.android.gms.common.api;

import aZ0.InterfaceC19845a;
import aZ0.InterfaceC19846b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class Status extends AbstractSafeParcelable implements r, ReflectedParcelable {

    @N
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    @N
    @RX0.a
    @InterfaceC36733z
    public static final Status f348900f;

    /* renamed from: g, reason: collision with root package name */
    @N
    @RX0.a
    @InterfaceC36733z
    public static final Status f348901g;

    /* renamed from: h, reason: collision with root package name */
    @N
    @RX0.a
    @InterfaceC36733z
    public static final Status f348902h;

    /* renamed from: i, reason: collision with root package name */
    @N
    @RX0.a
    @InterfaceC36733z
    public static final Status f348903i;

    /* renamed from: j, reason: collision with root package name */
    @N
    @RX0.a
    @InterfaceC36733z
    public static final Status f348904j;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348905b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348906c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final PendingIntent f348907d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final ConnectionResult f348908e;

    static {
        new Status(-1, null, null, null);
        f348900f = new Status(0, null, null, null);
        f348901g = new Status(14, null, null, null);
        f348902h = new Status(8, null, null, null);
        f348903i = new Status(15, null, null, null);
        f348904j = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new F();
    }

    @SafeParcelable.b
    public Status(@SafeParcelable.e int i12, @SafeParcelable.e @P String str, @SafeParcelable.e @P PendingIntent pendingIntent, @SafeParcelable.e @P ConnectionResult connectionResult) {
        this.f348905b = i12;
        this.f348906c = str;
        this.f348907d = pendingIntent;
        this.f348908e = connectionResult;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f348905b == status.f348905b && C36727t.a(this.f348906c, status.f348906c) && C36727t.a(this.f348907d, status.f348907d) && C36727t.a(this.f348908e, status.f348908e);
    }

    @InterfaceC19846b
    public final boolean h() {
        return this.f348905b <= 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f348905b), this.f348906c, this.f348907d, this.f348908e});
    }

    @N
    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        String strA = this.f348906c;
        if (strA == null) {
            strA = C36621f.a(this.f348905b);
        }
        aVarB.a(strA, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        aVarB.a(this.f348907d, CommonCode.MapKey.HAS_RESOLUTION);
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348905b);
        TX0.a.j(parcel, 2, this.f348906c, false);
        TX0.a.i(parcel, 3, this.f348907d, i12, false);
        TX0.a.i(parcel, 4, this.f348908e, i12, false);
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.api.r
    @InterfaceC19845a
    @N
    public final Status getStatus() {
        return this;
    }
}
