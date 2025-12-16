package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zzox();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353464b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final Rect f353465c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final float f353466d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final float f353467e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final float f353468f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final float f353469g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final float f353470h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final float f353471i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final float f353472j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final List f353473k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    public final List f353474l;

    @SafeParcelable.b
    public zzow(@SafeParcelable.e int i12, @SafeParcelable.e Rect rect, @SafeParcelable.e float f12, @SafeParcelable.e float f13, @SafeParcelable.e float f14, @SafeParcelable.e float f15, @SafeParcelable.e float f16, @SafeParcelable.e float f17, @SafeParcelable.e float f18, @SafeParcelable.e List list, @SafeParcelable.e List list2) {
        this.f353464b = i12;
        this.f353465c = rect;
        this.f353466d = f12;
        this.f353467e = f13;
        this.f353468f = f14;
        this.f353469g = f15;
        this.f353470h = f16;
        this.f353471i = f17;
        this.f353472j = f18;
        this.f353473k = list;
        this.f353474l = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f353464b);
        a.i(parcel, 2, this.f353465c, i12, false);
        a.q(parcel, 3, 4);
        parcel.writeFloat(this.f353466d);
        a.q(parcel, 4, 4);
        parcel.writeFloat(this.f353467e);
        a.q(parcel, 5, 4);
        parcel.writeFloat(this.f353468f);
        a.q(parcel, 6, 4);
        parcel.writeFloat(this.f353469g);
        a.q(parcel, 7, 4);
        parcel.writeFloat(this.f353470h);
        a.q(parcel, 8, 4);
        parcel.writeFloat(this.f353471i);
        a.q(parcel, 9, 4);
        parcel.writeFloat(this.f353472j);
        a.n(parcel, 10, this.f353473k, false);
        a.n(parcel, 11, this.f353474l, false);
        a.p(parcel, iO2);
    }

    public final float zza() {
        return this.f353469g;
    }

    public final float zzb() {
        return this.f353467e;
    }

    public final float zzc() {
        return this.f353470h;
    }

    public final float zzd() {
        return this.f353466d;
    }

    public final float zze() {
        return this.f353471i;
    }

    public final float zzf() {
        return this.f353468f;
    }

    public final int zzg() {
        return this.f353464b;
    }

    public final Rect zzh() {
        return this.f353465c;
    }

    public final List zzi() {
        return this.f353474l;
    }

    public final List zzj() {
        return this.f353473k;
    }
}
