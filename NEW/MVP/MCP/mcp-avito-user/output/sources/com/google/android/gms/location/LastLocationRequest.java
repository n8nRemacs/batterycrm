package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new U();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354210b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354211c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354212d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f354213e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzd f354214f;

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static final class a {
    }

    @SafeParcelable.b
    public LastLocationRequest(@SafeParcelable.e long j12, @SafeParcelable.e int i12, @SafeParcelable.e boolean z12, @SafeParcelable.e @j.P String str, @SafeParcelable.e @j.P zzd zzdVar) {
        this.f354210b = j12;
        this.f354211c = i12;
        this.f354212d = z12;
        this.f354213e = str;
        this.f354214f = zzdVar;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.f354210b == lastLocationRequest.f354210b && this.f354211c == lastLocationRequest.f354211c && this.f354212d == lastLocationRequest.f354212d && C36727t.a(this.f354213e, lastLocationRequest.f354213e) && C36727t.a(this.f354214f, lastLocationRequest.f354214f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f354210b), Integer.valueOf(this.f354211c), Boolean.valueOf(this.f354212d)});
    }

    @j.N
    public final String toString() {
        StringBuilder sbR = androidx.compose.foundation.H.r("LastLocationRequest[");
        long j12 = this.f354210b;
        if (j12 != Long.MAX_VALUE) {
            sbR.append("maxAge=");
            zzdj.zzb(j12, sbR);
        }
        int i12 = this.f354211c;
        if (i12 != 0) {
            sbR.append(", ");
            sbR.append(M.a(i12));
        }
        if (this.f354212d) {
            sbR.append(", bypass");
        }
        String str = this.f354213e;
        if (str != null) {
            sbR.append(", moduleId=");
            sbR.append(str);
        }
        zzd zzdVar = this.f354214f;
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
        parcel.writeLong(this.f354210b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354211c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354212d ? 1 : 0);
        TX0.a.j(parcel, 4, this.f354213e, false);
        TX0.a.i(parcel, 5, this.f354214f, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
