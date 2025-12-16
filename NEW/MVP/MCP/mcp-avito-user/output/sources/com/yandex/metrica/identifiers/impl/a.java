package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes7.dex */
class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f377713a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f377713a;
    }

    @Override // com.yandex.metrica.identifiers.impl.c
    public final String b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.f377713a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i12 = b.f377714a;
            }
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return string;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // com.yandex.metrica.identifiers.impl.c
    public final boolean d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.f377713a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i12 = b.f377714a;
            }
            parcelObtain2.readException();
            boolean z12 = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z12;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
