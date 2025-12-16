package com.google.android.play.integrity.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
public class e extends Binder implements IInterface {
    public boolean e4(Parcel parcel, int i12) {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
        if (i12 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i12, parcel, parcel2, i13)) {
            return true;
        }
        return e4(parcel, i12);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
