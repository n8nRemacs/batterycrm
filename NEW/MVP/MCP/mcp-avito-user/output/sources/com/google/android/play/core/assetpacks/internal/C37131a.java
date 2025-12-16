package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.internal.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37131a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f358372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358373b;

    public C37131a(IBinder iBinder, String str) {
        this.f358372a = iBinder;
        this.f358373b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f358372a;
    }

    public final Parcel e4() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f358373b);
        return parcelObtain;
    }

    public final void f4(Parcel parcel, int i12) {
        try {
            this.f358372a.transact(i12, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
