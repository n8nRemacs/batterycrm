package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bArrC = SafeParcelReader.c(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzaz(strF, bArrC, 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzaz[i12];
    }
}
