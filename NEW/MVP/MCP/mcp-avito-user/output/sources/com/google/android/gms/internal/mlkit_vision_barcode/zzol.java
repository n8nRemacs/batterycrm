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
public final class zzol extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzol> CREATOR = new zzpe();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352279b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352280c;

    @SafeParcelable.b
    public zzol(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2) {
        this.f352279b = str;
        this.f352280c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f352279b, false);
        a.j(parcel, 2, this.f352280c, false);
        a.p(parcel, iO2);
    }

    @P
    public final String zza() {
        return this.f352279b;
    }

    @P
    public final String zzb() {
        return this.f352280c;
    }
}
