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
public final class zzoi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoi> CREATOR = new zzpb();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352268b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352269c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352270d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352271e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352272f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352273g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352274h;

    @SafeParcelable.b
    public zzoi(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e @P String str4, @SafeParcelable.e @P String str5, @SafeParcelable.e @P String str6, @SafeParcelable.e @P String str7) {
        this.f352268b = str;
        this.f352269c = str2;
        this.f352270d = str3;
        this.f352271e = str4;
        this.f352272f = str5;
        this.f352273g = str6;
        this.f352274h = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f352268b, false);
        a.j(parcel, 2, this.f352269c, false);
        a.j(parcel, 3, this.f352270d, false);
        a.j(parcel, 4, this.f352271e, false);
        a.j(parcel, 5, this.f352272f, false);
        a.j(parcel, 6, this.f352273g, false);
        a.j(parcel, 7, this.f352274h, false);
        a.p(parcel, iO2);
    }

    @P
    public final String zza() {
        return this.f352271e;
    }

    @P
    public final String zzb() {
        return this.f352268b;
    }

    @P
    public final String zzc() {
        return this.f352273g;
    }

    @P
    public final String zzd() {
        return this.f352272f;
    }

    @P
    public final String zze() {
        return this.f352270d;
    }

    @P
    public final String zzf() {
        return this.f352269c;
    }

    @P
    public final String zzg() {
        return this.f352274h;
    }
}
