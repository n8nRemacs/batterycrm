package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public class zza implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f350254a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350255b;

    public zza(IBinder iBinder, String str) {
        this.f350254a = iBinder;
        this.f350255b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f350254a;
    }

    public final Parcel e4() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f350255b);
        return parcelObtain;
    }

    public final void f4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f350254a.transact(i12, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
