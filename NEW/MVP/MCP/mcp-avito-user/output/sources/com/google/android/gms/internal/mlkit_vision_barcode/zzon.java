package com.google.android.gms.internal.mlkit_vision_barcode;

import TX0.a;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzon extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzon> CREATOR = new zzoo();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352284b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352285c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352286d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final byte[] f352287e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Point[] f352288f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352289g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzog f352290h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzoj f352291i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzok f352292j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzom f352293k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzol f352294l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzoh f352295m;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzod f352296n;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzoe f352297o;

    /* renamed from: p, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzof f352298p;

    @SafeParcelable.b
    public zzon(@SafeParcelable.e int i12, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P byte[] bArr, @SafeParcelable.e @P Point[] pointArr, @SafeParcelable.e int i13, @SafeParcelable.e @P zzog zzogVar, @SafeParcelable.e @P zzoj zzojVar, @SafeParcelable.e @P zzok zzokVar, @SafeParcelable.e @P zzom zzomVar, @SafeParcelable.e @P zzol zzolVar, @SafeParcelable.e @P zzoh zzohVar, @SafeParcelable.e @P zzod zzodVar, @SafeParcelable.e @P zzoe zzoeVar, @SafeParcelable.e @P zzof zzofVar) {
        this.f352284b = i12;
        this.f352285c = str;
        this.f352286d = str2;
        this.f352287e = bArr;
        this.f352288f = pointArr;
        this.f352289g = i13;
        this.f352290h = zzogVar;
        this.f352291i = zzojVar;
        this.f352292j = zzokVar;
        this.f352293k = zzomVar;
        this.f352294l = zzolVar;
        this.f352295m = zzohVar;
        this.f352296n = zzodVar;
        this.f352297o = zzoeVar;
        this.f352298p = zzofVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352284b);
        a.j(parcel, 2, this.f352285c, false);
        a.j(parcel, 3, this.f352286d, false);
        a.b(parcel, 4, this.f352287e, false);
        a.m(parcel, 5, this.f352288f, i12);
        a.q(parcel, 6, 4);
        parcel.writeInt(this.f352289g);
        a.i(parcel, 7, this.f352290h, i12, false);
        a.i(parcel, 8, this.f352291i, i12, false);
        a.i(parcel, 9, this.f352292j, i12, false);
        a.i(parcel, 10, this.f352293k, i12, false);
        a.i(parcel, 11, this.f352294l, i12, false);
        a.i(parcel, 12, this.f352295m, i12, false);
        a.i(parcel, 13, this.f352296n, i12, false);
        a.i(parcel, 14, this.f352297o, i12, false);
        a.i(parcel, 15, this.f352298p, i12, false);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f352284b;
    }

    public final int zzb() {
        return this.f352289g;
    }

    @P
    public final zzod zzc() {
        return this.f352296n;
    }

    @P
    public final zzoe zzd() {
        return this.f352297o;
    }

    @P
    public final zzof zze() {
        return this.f352298p;
    }

    @P
    public final zzog zzf() {
        return this.f352290h;
    }

    @P
    public final zzoh zzg() {
        return this.f352295m;
    }

    @P
    public final zzoj zzh() {
        return this.f352291i;
    }

    @P
    public final zzok zzi() {
        return this.f352292j;
    }

    @P
    public final zzol zzj() {
        return this.f352294l;
    }

    @P
    public final zzom zzk() {
        return this.f352293k;
    }

    @P
    public final String zzl() {
        return this.f352285c;
    }

    @P
    public final String zzm() {
        return this.f352286d;
    }

    @P
    public final byte[] zzn() {
        return this.f352287e;
    }

    @P
    public final Point[] zzo() {
        return this.f352288f;
    }
}
