package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class r93 {
    public final d2j a;

    public r93(d2j d2jVar) {
        s5j.g(d2jVar);
        this.a = d2jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r93)) {
            return false;
        }
        try {
            d2j d2jVar = this.a;
            d2j d2jVar2 = ((r93) obj).a;
            hyi hyiVar = (hyi) d2jVar;
            Parcel parcelT = hyiVar.T();
            mgi.d(parcelT, d2jVar2);
            Parcel parcelS = hyiVar.S(parcelT, 17);
            boolean z = parcelS.readInt() != 0;
            parcelS.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            hyi hyiVar = (hyi) this.a;
            Parcel parcelS = hyiVar.S(hyiVar.T(), 18);
            int i = parcelS.readInt();
            parcelS.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
