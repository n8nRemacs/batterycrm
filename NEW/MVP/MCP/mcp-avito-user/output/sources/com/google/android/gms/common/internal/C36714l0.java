package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36714l0 implements InterfaceC36723q {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f349449a;

    public C36714l0(IBinder iBinder) {
        this.f349449a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC36723q
    public final void V1(v0 v0Var, @j.P GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(v0Var.asBinder());
            parcelObtain.writeInt(1);
            E0.a(getServiceRequest, parcelObtain, 0);
            this.f349449a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f349449a;
    }
}
