package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public class zzbu implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f350596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350597b;

    public zzbu(IBinder iBinder, String str) {
        this.f350596a = iBinder;
        this.f350597b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f350596a;
    }

    public final Parcel e4() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f350597b);
        return parcelObtain;
    }

    public final Parcel f4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f350596a.transact(i12, parcel, parcelObtain, 0);
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
            this.f350596a.transact(i12, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
