package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public class zba implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f349972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f349973b;

    public zba(IBinder iBinder, String str) {
        this.f349972a = iBinder;
        this.f349973b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f349972a;
    }

    public final Parcel e4() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f349973b);
        return parcelObtain;
    }

    public final void f4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f349972a.transact(i12, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
