package PX0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        byte[] bArrC = null;
        Bundle bundleB = null;
        long jU2 = 0;
        int iS2 = 0;
        int iS3 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 2) {
                iS3 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 3) {
                jU2 = SafeParcelReader.u(parcel, i12);
            } else if (c12 == 4) {
                bArrC = SafeParcelReader.c(parcel, i12);
            } else if (c12 == 5) {
                bundleB = SafeParcelReader.b(parcel, i12);
            } else if (c12 != 1000) {
                SafeParcelReader.x(parcel, i12);
            } else {
                iS2 = SafeParcelReader.s(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ProxyRequest(iS2, strF, iS3, jU2, bArrC, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new ProxyRequest[i12];
    }
}
