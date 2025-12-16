package com.google.android.gms.internal.mlkit_vision_face_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzti extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzti> CREATOR = new zztj();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354002b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354003c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354004d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354005e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354006f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354007g;

    @SafeParcelable.b
    public zzti(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e boolean z12, @SafeParcelable.e float f12) {
        this.f354002b = i12;
        this.f354003c = i13;
        this.f354004d = i14;
        this.f354005e = i15;
        this.f354006f = z12;
        this.f354007g = f12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f354002b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f354003c);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f354004d);
        a.q(parcel, 4, 4);
        parcel.writeInt(this.f354005e);
        a.q(parcel, 5, 4);
        parcel.writeInt(this.f354006f ? 1 : 0);
        a.q(parcel, 6, 4);
        parcel.writeFloat(this.f354007g);
        a.p(parcel, iO2);
    }

    public final float zza() {
        return this.f354007g;
    }

    public final int zzb() {
        return this.f354004d;
    }

    public final int zzc() {
        return this.f354005e;
    }

    public final int zzd() {
        return this.f354003c;
    }

    public final int zze() {
        return this.f354002b;
    }

    public final boolean zzf() {
        return this.f354006f;
    }
}
