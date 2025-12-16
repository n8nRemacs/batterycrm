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
public final class zzod extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzod> CREATOR = new zzos();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352234b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352235c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352236d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352237e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352238f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzoc f352239g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzoc f352240h;

    @SafeParcelable.b
    public zzod(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e @P String str4, @SafeParcelable.e @P String str5, @SafeParcelable.e @P zzoc zzocVar, @SafeParcelable.e @P zzoc zzocVar2) {
        this.f352234b = str;
        this.f352235c = str2;
        this.f352236d = str3;
        this.f352237e = str4;
        this.f352238f = str5;
        this.f352239g = zzocVar;
        this.f352240h = zzocVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f352234b, false);
        a.j(parcel, 2, this.f352235c, false);
        a.j(parcel, 3, this.f352236d, false);
        a.j(parcel, 4, this.f352237e, false);
        a.j(parcel, 5, this.f352238f, false);
        a.i(parcel, 6, this.f352239g, i12, false);
        a.i(parcel, 7, this.f352240h, i12, false);
        a.p(parcel, iO2);
    }

    @P
    public final zzoc zza() {
        return this.f352240h;
    }

    @P
    public final zzoc zzb() {
        return this.f352239g;
    }

    @P
    public final String zzc() {
        return this.f352235c;
    }

    @P
    public final String zzd() {
        return this.f352236d;
    }

    @P
    public final String zze() {
        return this.f352237e;
    }

    @P
    public final String zzf() {
        return this.f352238f;
    }

    @P
    public final String zzg() {
        return this.f352234b;
    }
}
