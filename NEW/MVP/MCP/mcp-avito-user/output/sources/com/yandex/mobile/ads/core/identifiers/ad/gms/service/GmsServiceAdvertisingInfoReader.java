package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j.N;
import j.P;

/* loaded from: classes8.dex */
class GmsServiceAdvertisingInfoReader implements a, IInterface {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final IBinder f382690a;

    public GmsServiceAdvertisingInfoReader(@N IBinder iBinder) {
        this.f382690a = iBinder;
    }

    @Override // android.os.IInterface
    @N
    public IBinder asBinder() {
        return this.f382690a;
    }

    @Override // com.yandex.mobile.ads.core.identifiers.ad.gms.service.a
    @P
    public Boolean readAdTrackingLimited() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z12 = true;
            parcelObtain.writeInt(1);
            this.f382690a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() == 0) {
                z12 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z12);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return boolValueOf;
        } catch (Throwable unused) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.core.identifiers.ad.gms.service.a
    @P
    public String readAdvertisingId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f382690a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return string;
        } catch (Throwable unused) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return null;
        }
    }
}
