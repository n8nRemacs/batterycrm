package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public class zza implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f352937a;

    /* renamed from: b, reason: collision with root package name */
    public final String f352938b;

    public zza(IBinder iBinder, String str) {
        this.f352937a = iBinder;
        this.f352938b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f352937a;
    }

    public final Parcel e4() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f352938b);
        return parcelObtain;
    }

    public final Parcel f4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f352937a.transact(i12, parcel, parcelObtain, 0);
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
            this.f352937a.transact(i12, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
