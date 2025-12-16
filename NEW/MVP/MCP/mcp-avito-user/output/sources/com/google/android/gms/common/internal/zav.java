package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC36717n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C36700e0();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349484b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final IBinder f349485c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final ConnectionResult f349486d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349487e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349488f;

    @SafeParcelable.b
    public zav(@SafeParcelable.e int i12, @SafeParcelable.e @j.P IBinder iBinder, @SafeParcelable.e ConnectionResult connectionResult, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13) {
        this.f349484b = i12;
        this.f349485c = iBinder;
        this.f349486d = connectionResult;
        this.f349487e = z12;
        this.f349488f = z13;
    }

    public final boolean equals(@j.P Object obj) {
        Object n02;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (this.f349486d.equals(zavVar.f349486d)) {
            Object n03 = null;
            IBinder iBinder = this.f349485c;
            if (iBinder == null) {
                n02 = null;
            } else {
                int i12 = InterfaceC36717n.a.f349450a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                n02 = iInterfaceQueryLocalInterface instanceof InterfaceC36717n ? (InterfaceC36717n) iInterfaceQueryLocalInterface : new N0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            IBinder iBinder2 = zavVar.f349485c;
            if (iBinder2 != null) {
                int i13 = InterfaceC36717n.a.f349450a;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                n03 = iInterfaceQueryLocalInterface2 instanceof InterfaceC36717n ? (InterfaceC36717n) iInterfaceQueryLocalInterface2 : new N0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            if (C36727t.a(n02, n03)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349484b);
        TX0.a.e(parcel, 2, this.f349485c);
        TX0.a.i(parcel, 3, this.f349486d, i12, false);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f349487e ? 1 : 0);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f349488f ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
