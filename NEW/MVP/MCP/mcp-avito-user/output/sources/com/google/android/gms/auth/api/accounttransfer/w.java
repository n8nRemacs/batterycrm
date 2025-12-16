package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        HashSet hashSet = new HashSet();
        int iS2 = 0;
        zzw zzwVar = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
                hashSet.add(1);
            } else if (c12 == 2) {
                zzwVar = (zzw) SafeParcelReader.e(parcel, i12, zzw.CREATOR);
                hashSet.add(2);
            } else if (c12 == 3) {
                strF = SafeParcelReader.f(parcel, i12);
                hashSet.add(3);
            } else if (c12 == 4) {
                strF2 = SafeParcelReader.f(parcel, i12);
                hashSet.add(4);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF3 = SafeParcelReader.f(parcel, i12);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == iY2) {
            return new zzu(hashSet, iS2, zzwVar, strF, strF2, strF3);
        }
        throw new SafeParcelReader.ParseException(AK.c.g(iY2, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzu[i12];
    }
}
