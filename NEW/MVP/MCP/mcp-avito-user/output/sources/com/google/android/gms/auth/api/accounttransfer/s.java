package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        HashSet hashSet = new HashSet();
        int iS2 = 0;
        ArrayList arrayListJ = null;
        zzs zzsVar = null;
        int iS3 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
                hashSet.add(1);
            } else if (c12 == 2) {
                arrayListJ = SafeParcelReader.j(parcel, i12, zzu.CREATOR);
                hashSet.add(2);
            } else if (c12 == 3) {
                iS3 = SafeParcelReader.s(parcel, i12);
                hashSet.add(3);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                zzsVar = (zzs) SafeParcelReader.e(parcel, i12, zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iY2) {
            return new zzo(hashSet, iS2, arrayListJ, iS3, zzsVar);
        }
        throw new SafeParcelReader.ParseException(AK.c.g(iY2, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzo[i12];
    }
}
