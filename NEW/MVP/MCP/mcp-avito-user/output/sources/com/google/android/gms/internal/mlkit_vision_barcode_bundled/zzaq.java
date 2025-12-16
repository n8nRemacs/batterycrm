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
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzbf();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352320b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352321c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352322d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352323e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352324f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzap f352325g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzap f352326h;

    @SafeParcelable.b
    public zzaq(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e @P String str4, @SafeParcelable.e @P String str5, @SafeParcelable.e @P zzap zzapVar, @SafeParcelable.e @P zzap zzapVar2) {
        this.f352320b = str;
        this.f352321c = str2;
        this.f352322d = str3;
        this.f352323e = str4;
        this.f352324f = str5;
        this.f352325g = zzapVar;
        this.f352326h = zzapVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f352320b, false);
        a.j(parcel, 2, this.f352321c, false);
        a.j(parcel, 3, this.f352322d, false);
        a.j(parcel, 4, this.f352323e, false);
        a.j(parcel, 5, this.f352324f, false);
        a.i(parcel, 6, this.f352325g, i12, false);
        a.i(parcel, 7, this.f352326h, i12, false);
        a.p(parcel, iO2);
    }
}
