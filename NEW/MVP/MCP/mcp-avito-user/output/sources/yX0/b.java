package yX0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: BaseStub.java */
/* loaded from: classes5.dex */
public class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
        if (i12 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i12, parcel, parcel2, i13)) {
            return true;
        }
        return e4(i12, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
