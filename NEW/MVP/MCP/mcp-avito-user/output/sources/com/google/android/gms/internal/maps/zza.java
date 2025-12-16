package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes6.dex */
public class zza implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f350537a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350538b;

    public zza(IBinder iBinder, String str) {
        this.f350537a = iBinder;
        this.f350538b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f350537a;
    }

    public final Parcel e4() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f350538b);
        return parcelObtain;
    }

    public final Parcel f4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f350537a.transact(i12, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e12) {
                parcelObtain.recycle();
                throw e12;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void g4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f350537a.transact(i12, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
