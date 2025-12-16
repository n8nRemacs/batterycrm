package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public class zaa implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f350195a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350196b;

    public zaa(IBinder iBinder, String str) {
        this.f350195a = iBinder;
        this.f350196b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f350195a;
    }

    public final Parcel e4() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f350196b);
        return parcelObtain;
    }

    public final void f4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f350195a.transact(i12, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
