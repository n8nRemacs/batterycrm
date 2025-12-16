package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzar> CREATOR = new zzbg();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzav f352327b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352328c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352329d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzaw[] f352330e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzat[] f352331f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String[] f352332g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzao[] f352333h;

    @SafeParcelable.b
    public zzar(@SafeParcelable.e @P zzav zzavVar, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P zzaw[] zzawVarArr, @SafeParcelable.e @P zzat[] zzatVarArr, @SafeParcelable.e @P String[] strArr, @SafeParcelable.e @P zzao[] zzaoVarArr) {
        this.f352327b = zzavVar;
        this.f352328c = str;
        this.f352329d = str2;
        this.f352330e = zzawVarArr;
        this.f352331f = zzatVarArr;
        this.f352332g = strArr;
        this.f352333h = zzaoVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.i(parcel, 1, this.f352327b, i12, false);
        a.j(parcel, 2, this.f352328c, false);
        a.j(parcel, 3, this.f352329d, false);
        a.m(parcel, 4, this.f352330e, i12);
        a.m(parcel, 5, this.f352331f, i12);
        a.k(parcel, 6, this.f352332g, false);
        a.m(parcel, 7, this.f352333h, i12);
        a.p(parcel, iO2);
    }
}
