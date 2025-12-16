package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class p5c {
    public final fei a;

    public p5c(fei feiVar) {
        s5j.g(feiVar);
        this.a = feiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p5c)) {
            return false;
        }
        try {
            fei feiVar = this.a;
            fei feiVar2 = ((p5c) obj).a;
            aei aeiVar = (aei) feiVar;
            Parcel parcelT = aeiVar.T();
            mgi.d(parcelT, feiVar2);
            Parcel parcelS = aeiVar.S(parcelT, 15);
            boolean z = parcelS.readInt() != 0;
            parcelS.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            aei aeiVar = (aei) this.a;
            Parcel parcelS = aeiVar.S(aeiVar.T(), 16);
            int i = parcelS.readInt();
            parcelS.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
