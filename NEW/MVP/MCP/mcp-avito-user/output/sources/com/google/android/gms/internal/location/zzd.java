package com.google.android.gms.internal.location;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f350486b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f350487c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f350488d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f350489e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f350490f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f350491g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzd f350492h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final zzds f350493i;

    static {
        Process.myUid();
        Process.myPid();
    }

    @SafeParcelable.b
    public zzd(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e int i14, @SafeParcelable.e List list, @SafeParcelable.e @P zzd zzdVar) {
        this.f350486b = i12;
        this.f350487c = i13;
        this.f350488d = str;
        this.f350489e = str2;
        this.f350491g = str3;
        this.f350490f = i14;
        this.f350493i = zzds.zzj(list);
        this.f350492h = zzdVar;
    }

    public final boolean equals(@P Object obj) {
        if (obj instanceof zzd) {
            zzd zzdVar = (zzd) obj;
            if (this.f350486b == zzdVar.f350486b && this.f350487c == zzdVar.f350487c && this.f350490f == zzdVar.f350490f && this.f350488d.equals(zzdVar.f350488d) && zzdl.zza(this.f350489e, zzdVar.f350489e) && zzdl.zza(this.f350491g, zzdVar.f350491g) && zzdl.zza(this.f350492h, zzdVar.f350492h) && this.f350493i.equals(zzdVar.f350493i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f350486b), this.f350488d, this.f350489e, this.f350491g});
    }

    public final String toString() {
        String str = this.f350488d;
        int length = str.length() + 18;
        String str2 = this.f350489e;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f350486b);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (str2.startsWith(str)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f350491g;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f350486b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f350487c);
        a.j(parcel, 3, this.f350488d, false);
        a.j(parcel, 4, this.f350489e, false);
        a.q(parcel, 5, 4);
        parcel.writeInt(this.f350490f);
        a.j(parcel, 6, this.f350491g, false);
        a.i(parcel, 7, this.f350492h, i12, false);
        a.n(parcel, 8, this.f350493i, false);
        a.p(parcel, iO2);
    }
}
