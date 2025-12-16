package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC36708i0;
import com.google.android.gms.common.internal.Q0;
import com.google.android.gms.common.internal.R0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new Q();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349633b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @I41.h
    public final J f349634c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349635d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349636e;

    public zzs(String str, @I41.h J j12, boolean z12, boolean z13) {
        this.f349633b = str;
        this.f349634c = j12;
        this.f349635d = z12;
        this.f349636e = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f349633b, false);
        J j12 = this.f349634c;
        if (j12 == null) {
            j12 = null;
        }
        TX0.a.e(parcel, 2, j12);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349635d ? 1 : 0);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f349636e ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzs(@SafeParcelable.e String str, @SafeParcelable.e @I41.h IBinder iBinder, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13) {
        this.f349633b = str;
        K k12 = null;
        if (iBinder != null) {
            try {
                int i12 = R0.f349368a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                com.google.android.gms.dynamic.d dVarZzd = (iInterfaceQueryLocalInterface instanceof InterfaceC36708i0 ? (InterfaceC36708i0) iInterfaceQueryLocalInterface : new Q0(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = dVarZzd == null ? null : (byte[]) com.google.android.gms.dynamic.f.g4(dVarZzd);
                if (bArr != null) {
                    k12 = new K(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f349634c = k12;
        this.f349635d = z12;
        this.f349636e = z13;
    }
}
