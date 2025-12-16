package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        byte[] bArrC = null;
        boolean zL2 = false;
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                zL2 = SafeParcelReader.l(parcel, i12);
            } else if (c12 == 2) {
                bArrC = SafeParcelReader.c(parcel, i12);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new BeginSignInRequest.PasskeysRequestOptions(zL2, bArrC, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new BeginSignInRequest.PasskeysRequestOptions[i12];
    }
}
