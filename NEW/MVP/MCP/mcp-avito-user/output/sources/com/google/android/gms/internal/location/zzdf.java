package com.google.android.gms.internal.location;

import TX0.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.O;
import com.google.android.gms.location.S;
import com.google.android.gms.location.T;
import j.P;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
@Deprecated
/* loaded from: classes6.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f350504b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzdd f350505c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final T f350506d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final com.google.android.gms.location.P f350507e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final PendingIntent f350508f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zzk f350509g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f350510h;

    @SafeParcelable.b
    public zzdf(@SafeParcelable.e int i12, @SafeParcelable.e @P zzdd zzddVar, @SafeParcelable.e @P IBinder iBinder, @SafeParcelable.e @P IBinder iBinder2, @SafeParcelable.e @P PendingIntent pendingIntent, @SafeParcelable.e @P IBinder iBinder3, @SafeParcelable.e @P String str) {
        this.f350504b = i12;
        this.f350505c = zzddVar;
        zzk zziVar = null;
        this.f350506d = iBinder != null ? S.zzb(iBinder) : null;
        this.f350508f = pendingIntent;
        this.f350507e = iBinder2 != null ? O.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zziVar = iInterfaceQueryLocalInterface instanceof zzk ? (zzk) iInterfaceQueryLocalInterface : new zzi(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        }
        this.f350509g = zziVar;
        this.f350510h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f350504b);
        a.i(parcel, 2, this.f350505c, i12, false);
        T t12 = this.f350506d;
        a.e(parcel, 3, t12 == null ? null : t12.asBinder());
        a.i(parcel, 4, this.f350508f, i12, false);
        com.google.android.gms.location.P p12 = this.f350507e;
        a.e(parcel, 5, p12 == null ? null : p12.asBinder());
        zzk zzkVar = this.f350509g;
        a.e(parcel, 6, zzkVar != null ? zzkVar.asBinder() : null);
        a.j(parcel, 8, this.f350510h, false);
        a.p(parcel, iO2);
    }
}
