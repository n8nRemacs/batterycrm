package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hb7 implements ib7 {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.ib7
    public final void j(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(ib7.a);
            parcelObtain.writeStringArray(strArr);
            this.c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
