package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class wti extends uai implements oci {
    public final int d;

    public wti(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 4);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.d = Arrays.hashCode(bArr);
    }

    public static byte[] W(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.uai
    public final boolean T(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            tqa tqaVar = new tqa(X());
            parcel2.writeNoException();
            wgi.c(parcel2, tqaVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.d);
        return true;
    }

    public abstract byte[] X();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof oci)) {
            try {
                oci ociVar = (oci) obj;
                if (((wti) ociVar).d == this.d) {
                    return Arrays.equals(X(), (byte[]) tqa.X(new tqa(((wti) ociVar).X())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
