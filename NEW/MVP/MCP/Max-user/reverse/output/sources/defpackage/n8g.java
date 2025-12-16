package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class n8g {
    public final qei a;

    public n8g(qei qeiVar) {
        this.a = qeiVar;
    }

    public final void a() {
        try {
            kei keiVar = (kei) this.a;
            keiVar.V(keiVar.T(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n8g)) {
            return false;
        }
        try {
            qei qeiVar = this.a;
            qei qeiVar2 = ((n8g) obj).a;
            kei keiVar = (kei) qeiVar;
            Parcel parcelT = keiVar.T();
            mgi.d(parcelT, qeiVar2);
            Parcel parcelS = keiVar.S(parcelT, 8);
            boolean z = parcelS.readInt() != 0;
            parcelS.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            kei keiVar = (kei) this.a;
            Parcel parcelS = keiVar.S(keiVar.T(), 9);
            int i = parcelS.readInt();
            parcelS.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
