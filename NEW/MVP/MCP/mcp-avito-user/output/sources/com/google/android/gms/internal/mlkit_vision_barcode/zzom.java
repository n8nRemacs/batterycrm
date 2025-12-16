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
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzpf();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352281b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352282c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352283d;

    @SafeParcelable.b
    public zzom(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e int i12) {
        this.f352281b = str;
        this.f352282c = str2;
        this.f352283d = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f352281b, false);
        a.j(parcel, 2, this.f352282c, false);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f352283d);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f352283d;
    }

    @P
    public final String zzb() {
        return this.f352282c;
    }

    @P
    public final String zzc() {
        return this.f352281b;
    }
}
