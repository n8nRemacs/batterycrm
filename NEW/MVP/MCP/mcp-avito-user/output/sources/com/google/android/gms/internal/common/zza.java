package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public class zza implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f350220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350221b;

    public zza(IBinder iBinder, String str) {
        this.f350220a = iBinder;
        this.f350221b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f350220a;
    }

    public final Parcel e4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f350220a.transact(i12, parcel, parcelObtain, 0);
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

    public final Parcel f4() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f350221b);
        return parcelObtain;
    }
}
