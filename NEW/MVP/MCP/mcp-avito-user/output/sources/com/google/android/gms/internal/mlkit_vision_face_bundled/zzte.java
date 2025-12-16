package com.google.android.gms.internal.mlkit_vision_face_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzte extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzte> CREATOR = new zztf();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353995b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353996c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353997d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353998e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final long f353999f;

    @SafeParcelable.b
    public zzte(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e long j12) {
        this.f353995b = i12;
        this.f353996c = i13;
        this.f353997d = i14;
        this.f353998e = i15;
        this.f353999f = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f353995b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f353996c);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f353997d);
        a.q(parcel, 4, 4);
        parcel.writeInt(this.f353998e);
        a.q(parcel, 5, 8);
        parcel.writeLong(this.f353999f);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f353997d;
    }

    public final int zzb() {
        return this.f353995b;
    }

    public final int zzc() {
        return this.f353998e;
    }

    public final int zzd() {
        return this.f353996c;
    }

    public final long zze() {
        return this.f353999f;
    }
}
