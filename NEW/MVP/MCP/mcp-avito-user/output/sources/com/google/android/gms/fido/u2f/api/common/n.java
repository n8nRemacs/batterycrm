package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        byte[] bArrC = null;
        String strF = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                bArrC = SafeParcelReader.c(parcel, i12);
            } else if (c12 == 3) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 4) {
                bArrC2 = SafeParcelReader.c(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bArrC3 = SafeParcelReader.c(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new SignResponseData(bArrC, bArrC2, strF, bArrC3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new SignResponseData[i12];
    }
}
