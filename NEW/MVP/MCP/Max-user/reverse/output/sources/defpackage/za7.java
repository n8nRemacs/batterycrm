package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;

/* loaded from: classes.dex */
public final class za7 implements ab7 {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.ab7
    public final void f(f3c f3cVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(1);
            f3cVar.writeToParcel(parcelObtain, 0);
            if (!this.c.transact(3, parcelObtain, null, 1)) {
                int i = sx8.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.ab7
    public final void onRepeatModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (!this.c.transact(9, parcelObtain, null, 1)) {
                int i2 = sx8.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.ab7
    public final void onShuffleModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (!this.c.transact(12, parcelObtain, null, 1)) {
                int i2 = sx8.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
