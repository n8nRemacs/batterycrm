package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        HashSet hashSet = new HashSet();
        int iS2 = 0;
        String strF = null;
        byte[] bArrC = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int iS3 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    hashSet.add(1);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    hashSet.add(2);
                    break;
                case 3:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrC = SafeParcelReader.c(parcel, i12);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i12, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.e(parcel, i12, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        if (parcel.dataPosition() == iY2) {
            return new zzw(hashSet, iS2, strF, iS3, bArrC, pendingIntent, deviceMetaData);
        }
        throw new SafeParcelReader.ParseException(AK.c.g(iY2, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzw[i12];
    }
}
