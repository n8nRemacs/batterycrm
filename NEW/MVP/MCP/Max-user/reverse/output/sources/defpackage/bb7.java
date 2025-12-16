package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaSession;

/* loaded from: classes.dex */
public final class bb7 implements db7 {
    public IBinder c;

    @Override // defpackage.db7
    public final void C(ab7 ab7Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeStrongBinder((sx8) ab7Var);
            if (!this.c.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i = a79.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.db7
    public final void I(ab7 ab7Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeStrongBinder((sx8) ab7Var);
            if (!this.c.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i = a79.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.db7
    public final f3c getPlaybackState() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(28, parcelObtain, parcelObtain2, 0)) {
                int i = a79.d;
            }
            parcelObtain2.readException();
            f3c f3cVarCreateFromParcel = parcelObtain2.readInt() != 0 ? f3c.CREATOR.createFromParcel(parcelObtain2) : null;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return f3cVarCreateFromParcel;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.db7
    public final int getRepeatMode() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(37, parcelObtain, parcelObtain2, 0)) {
                int i = a79.d;
            }
            parcelObtain2.readException();
            int i2 = parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return i2;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.db7
    public final int getShuffleMode() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(47, parcelObtain, parcelObtain2, 0)) {
                int i = a79.d;
            }
            parcelObtain2.readException();
            int i2 = parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return i2;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.db7
    public final boolean isCaptioningEnabled() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(45, parcelObtain, parcelObtain2, 0)) {
                int i = a79.d;
            }
            parcelObtain2.readException();
            boolean z = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
