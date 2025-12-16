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
public final class zzoj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoj> CREATOR = new zzpc();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352275b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352276c;

    @SafeParcelable.b
    public zzoj(@SafeParcelable.e int i12, @SafeParcelable.e @P String str) {
        this.f352275b = i12;
        this.f352276c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352275b);
        a.j(parcel, 2, this.f352276c, false);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f352275b;
    }

    @P
    public final String zzb() {
        return this.f352276c;
    }
}
