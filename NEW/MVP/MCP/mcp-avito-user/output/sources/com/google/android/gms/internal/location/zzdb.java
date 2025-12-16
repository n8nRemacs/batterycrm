package com.google.android.gms.internal.location;

import TX0.a;
import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.T;
import j.P;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f350497b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final IBinder f350498c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final IBinder f350499d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final PendingIntent f350500e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f350501f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f350502g;

    @SafeParcelable.b
    public zzdb(@SafeParcelable.e int i12, @SafeParcelable.e @P IBinder iBinder, @SafeParcelable.e @P IBinder iBinder2, @SafeParcelable.e @P PendingIntent pendingIntent, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2) {
        this.f350497b = i12;
        this.f350498c = iBinder;
        this.f350499d = iBinder2;
        this.f350500e = pendingIntent;
        this.f350501f = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f350502g = str2;
    }

    public static zzdb zza(PendingIntent pendingIntent, @P String str, @P String str2) {
        return new zzdb(3, null, null, pendingIntent, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.P] */
    public static zzdb zzb(@P IInterface iInterface, com.google.android.gms.location.P p12, @P String str, @P String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(2, iInterface, p12, null, null, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.T] */
    public static zzdb zzc(@P IInterface iInterface, T t12, @P String str, @P String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(1, iInterface, t12, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f350497b);
        a.e(parcel, 2, this.f350498c);
        a.e(parcel, 3, this.f350499d);
        a.i(parcel, 4, this.f350500e, i12, false);
        a.j(parcel, 5, this.f350501f, false);
        a.j(parcel, 6, this.f350502g, false);
        a.p(parcel, iO2);
    }
}
