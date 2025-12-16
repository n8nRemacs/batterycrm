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
public final class zzoc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoc> CREATOR = new zzor();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352226b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352227c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352228d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352229e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352230f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352231g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f352232h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352233i;

    @SafeParcelable.b
    public zzoc(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e int i16, @SafeParcelable.e int i17, @SafeParcelable.e boolean z12, @SafeParcelable.e @P String str) {
        this.f352226b = i12;
        this.f352227c = i13;
        this.f352228d = i14;
        this.f352229e = i15;
        this.f352230f = i16;
        this.f352231g = i17;
        this.f352232h = z12;
        this.f352233i = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352226b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f352227c);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f352228d);
        a.q(parcel, 4, 4);
        parcel.writeInt(this.f352229e);
        a.q(parcel, 5, 4);
        parcel.writeInt(this.f352230f);
        a.q(parcel, 6, 4);
        parcel.writeInt(this.f352231g);
        a.q(parcel, 7, 4);
        parcel.writeInt(this.f352232h ? 1 : 0);
        a.j(parcel, 8, this.f352233i, false);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f352228d;
    }

    public final int zzb() {
        return this.f352229e;
    }

    public final int zzc() {
        return this.f352230f;
    }

    public final int zzd() {
        return this.f352227c;
    }

    public final int zze() {
        return this.f352231g;
    }

    public final int zzf() {
        return this.f352226b;
    }

    @P
    public final String zzg() {
        return this.f352233i;
    }

    public final boolean zzh() {
        return this.f352232h;
    }
}
