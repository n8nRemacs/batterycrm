package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        Boolean boolValueOf = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 3) {
                int iW2 = SafeParcelReader.w(parcel, i12);
                if (iW2 == 0) {
                    boolValueOf = null;
                } else {
                    SafeParcelReader.z(parcel, iW2, 4);
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
            } else if (c12 == 4) {
                strF2 = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF3 = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new AuthenticatorSelectionCriteria(boolValueOf, strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new AuthenticatorSelectionCriteria[i12];
    }
}
