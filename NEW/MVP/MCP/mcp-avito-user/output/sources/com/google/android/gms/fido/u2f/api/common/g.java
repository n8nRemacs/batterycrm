package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        int iS2 = 0;
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                bArrC = SafeParcelReader.c(parcel, i12);
            } else if (c12 == 3) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                arrayListJ = SafeParcelReader.j(parcel, i12, Transport.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new KeyHandle(iS2, strF, arrayListJ, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new KeyHandle[i12];
    }
}
