package com.google.android.gms.internal.mlkit_vision_barcode;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzog extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzog> CREATOR = new zzov();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352262b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352263c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352264d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352265e;

    @SafeParcelable.b
    public zzog(@SafeParcelable.e int i12, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3) {
        this.f352262b = i12;
        this.f352263c = str;
        this.f352264d = str2;
        this.f352265e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352262b);
        a.j(parcel, 2, this.f352263c, false);
        a.j(parcel, 3, this.f352264d, false);
        a.j(parcel, 4, this.f352265e, false);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f352262b;
    }

    @P
    public final String zzb() {
        return this.f352263c;
    }

    @P
    public final String zzc() {
        return this.f352265e;
    }

    @P
    public final String zzd() {
        return this.f352264d;
    }
}
