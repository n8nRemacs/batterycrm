package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
@InterfaceC36733z
/* loaded from: classes6.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new A();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354288b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354289c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final WorkSource f354290d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f354291e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final int[] f354292f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354293g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f354294h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354295i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public String f354296j;

    @SafeParcelable.b
    public zzb(@SafeParcelable.e long j12, @SafeParcelable.e boolean z12, @SafeParcelable.e @j.P WorkSource workSource, @SafeParcelable.e @j.P String str, @SafeParcelable.e @j.P int[] iArr, @SafeParcelable.e boolean z13, @SafeParcelable.e @j.P String str2, @SafeParcelable.e long j13, @SafeParcelable.e @j.P String str3) {
        this.f354288b = j12;
        this.f354289c = z12;
        this.f354290d = workSource;
        this.f354291e = str;
        this.f354292f = iArr;
        this.f354293g = z13;
        this.f354294h = str2;
        this.f354295i = j13;
        this.f354296j = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 8);
        parcel.writeLong(this.f354288b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354289c ? 1 : 0);
        TX0.a.i(parcel, 3, this.f354290d, i12, false);
        TX0.a.j(parcel, 4, this.f354291e, false);
        TX0.a.f(parcel, 5, this.f354292f, false);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f354293g ? 1 : 0);
        TX0.a.j(parcel, 7, this.f354294h, false);
        TX0.a.q(parcel, 8, 8);
        parcel.writeLong(this.f354295i);
        TX0.a.j(parcel, 9, this.f354296j, false);
        TX0.a.p(parcel, iO2);
    }
}
