package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbu> CREATOR = new zzbv();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352386b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352387c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352388d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352389e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final long f352390f;

    @SafeParcelable.b
    public zzbu(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e long j12) {
        this.f352386b = i12;
        this.f352387c = i13;
        this.f352388d = i14;
        this.f352389e = i15;
        this.f352390f = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352386b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f352387c);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f352388d);
        a.q(parcel, 4, 4);
        parcel.writeInt(this.f352389e);
        a.q(parcel, 5, 8);
        parcel.writeLong(this.f352390f);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f352388d;
    }

    public final int zzb() {
        return this.f352386b;
    }

    public final int zzc() {
        return this.f352389e;
    }

    public final int zzd() {
        return this.f352387c;
    }
}
