package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class sy6 {
    public final hcj a;

    public sy6(hcj hcjVar) {
        this.a = hcjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sy6)) {
            return false;
        }
        try {
            hcj hcjVar = this.a;
            hcj hcjVar2 = ((sy6) obj).a;
            vaj vajVar = (vaj) hcjVar;
            Parcel parcelT = vajVar.T();
            mgi.d(parcelT, hcjVar2);
            Parcel parcelS = vajVar.S(parcelT, 19);
            boolean z = parcelS.readInt() != 0;
            parcelS.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            vaj vajVar = (vaj) this.a;
            Parcel parcelS = vajVar.S(vajVar.T(), 20);
            int i = parcelS.readInt();
            parcelS.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
