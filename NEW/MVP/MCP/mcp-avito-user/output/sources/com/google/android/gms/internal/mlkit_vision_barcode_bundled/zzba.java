package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import TX0.a;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352370b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352371c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352372d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final byte[] f352373e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Point[] f352374f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352375g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzat f352376h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzaw f352377i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzax f352378j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzaz f352379k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzay f352380l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzau f352381m;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzaq f352382n;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzar f352383o;

    /* renamed from: p, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzas f352384p;

    @SafeParcelable.b
    public zzba(@SafeParcelable.e int i12, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P byte[] bArr, @SafeParcelable.e @P Point[] pointArr, @SafeParcelable.e int i13, @SafeParcelable.e @P zzat zzatVar, @SafeParcelable.e @P zzaw zzawVar, @SafeParcelable.e @P zzax zzaxVar, @SafeParcelable.e @P zzaz zzazVar, @SafeParcelable.e @P zzay zzayVar, @SafeParcelable.e @P zzau zzauVar, @SafeParcelable.e @P zzaq zzaqVar, @SafeParcelable.e @P zzar zzarVar, @SafeParcelable.e @P zzas zzasVar) {
        this.f352370b = i12;
        this.f352371c = str;
        this.f352372d = str2;
        this.f352373e = bArr;
        this.f352374f = pointArr;
        this.f352375g = i13;
        this.f352376h = zzatVar;
        this.f352377i = zzawVar;
        this.f352378j = zzaxVar;
        this.f352379k = zzazVar;
        this.f352380l = zzayVar;
        this.f352381m = zzauVar;
        this.f352382n = zzaqVar;
        this.f352383o = zzarVar;
        this.f352384p = zzasVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352370b);
        a.j(parcel, 2, this.f352371c, false);
        a.j(parcel, 3, this.f352372d, false);
        a.b(parcel, 4, this.f352373e, false);
        a.m(parcel, 5, this.f352374f, i12);
        a.q(parcel, 6, 4);
        parcel.writeInt(this.f352375g);
        a.i(parcel, 7, this.f352376h, i12, false);
        a.i(parcel, 8, this.f352377i, i12, false);
        a.i(parcel, 9, this.f352378j, i12, false);
        a.i(parcel, 10, this.f352379k, i12, false);
        a.i(parcel, 11, this.f352380l, i12, false);
        a.i(parcel, 12, this.f352381m, i12, false);
        a.i(parcel, 13, this.f352382n, i12, false);
        a.i(parcel, 14, this.f352383o, i12, false);
        a.i(parcel, 15, this.f352384p, i12, false);
        a.p(parcel, iO2);
    }
}
