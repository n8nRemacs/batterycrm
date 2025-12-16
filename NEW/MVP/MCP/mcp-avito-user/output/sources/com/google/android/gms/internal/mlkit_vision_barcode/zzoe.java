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
public final class zzoe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoe> CREATOR = new zzot();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzoi f352241b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352242c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352243d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzoj[] f352244e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzog[] f352245f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String[] f352246g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzob[] f352247h;

    @SafeParcelable.b
    public zzoe(@SafeParcelable.e @P zzoi zzoiVar, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P zzoj[] zzojVarArr, @SafeParcelable.e @P zzog[] zzogVarArr, @SafeParcelable.e @P String[] strArr, @SafeParcelable.e @P zzob[] zzobVarArr) {
        this.f352241b = zzoiVar;
        this.f352242c = str;
        this.f352243d = str2;
        this.f352244e = zzojVarArr;
        this.f352245f = zzogVarArr;
        this.f352246g = strArr;
        this.f352247h = zzobVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.i(parcel, 1, this.f352241b, i12, false);
        a.j(parcel, 2, this.f352242c, false);
        a.j(parcel, 3, this.f352243d, false);
        a.m(parcel, 4, this.f352244e, i12);
        a.m(parcel, 5, this.f352245f, i12);
        a.k(parcel, 6, this.f352246g, false);
        a.m(parcel, 7, this.f352247h, i12);
        a.p(parcel, iO2);
    }

    @P
    public final zzoi zza() {
        return this.f352241b;
    }

    @P
    public final String zzb() {
        return this.f352242c;
    }

    @P
    public final String zzc() {
        return this.f352243d;
    }

    @P
    public final zzob[] zzd() {
        return this.f352247h;
    }

    @P
    public final zzog[] zze() {
        return this.f352245f;
    }

    @P
    public final zzoj[] zzf() {
        return this.f352244e;
    }

    @P
    public final String[] zzg() {
        return this.f352246g;
    }
}
