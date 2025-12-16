package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import java.lang.ref.WeakReference;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class sx8 extends Binder implements ab7 {
    public static final /* synthetic */ int d = 0;
    public final WeakReference c;

    public sx8(py8 py8Var) {
        attachInterface(this, IMediaControllerCallback.DESCRIPTOR);
        this.c = new WeakReference(py8Var);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.ab7
    public final void f(f3c f3cVar) {
        py8 py8Var = (py8) this.c.get();
        if (py8Var != null) {
            py8Var.i(2, f3cVar, null);
        }
    }

    @Override // defpackage.ab7
    public final void onRepeatModeChanged(int i) {
        py8 py8Var = (py8) this.c.get();
        if (py8Var != null) {
            py8Var.i(9, Integer.valueOf(i), null);
        }
    }

    @Override // defpackage.ab7
    public final void onShuffleModeChanged(int i) {
        py8 py8Var = (py8) this.c.get();
        if (py8Var != null) {
            py8Var.i(12, Integer.valueOf(i), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString(IMediaControllerCallback.DESCRIPTOR);
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                String string = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                py8 py8Var = (py8) this.c.get();
                if (py8Var != null) {
                    py8Var.i(1, string, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                throw new AssertionError();
            case 3:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                f(parcel.readInt() != 0 ? f3c.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    x19.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 5:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                parcel.createTypedArrayList(e79.CREATOR);
                throw new AssertionError();
            case 6:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 7:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 8:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    smb.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 9:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                boolean z = parcel.readInt() != 0;
                py8 py8Var2 = (py8) this.c.get();
                if (py8Var2 != null) {
                    py8Var2.i(11, Boolean.valueOf(z), null);
                    return true;
                }
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                onShuffleModeChanged(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                py8 py8Var3 = (py8) this.c.get();
                if (py8Var3 != null) {
                    py8Var3.i(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
