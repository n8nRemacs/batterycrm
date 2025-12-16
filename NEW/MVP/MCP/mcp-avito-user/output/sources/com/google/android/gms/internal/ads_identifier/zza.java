package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes6.dex */
public class zza implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f349949a;

    public zza(IBinder iBinder) {
        this.f349949a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f349949a;
    }

    public final Parcel e4(Parcel parcel, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f349949a.transact(i12, parcel, parcelObtain, 0);
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
}
