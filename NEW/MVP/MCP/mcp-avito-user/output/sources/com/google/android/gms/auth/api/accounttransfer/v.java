package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList<String> arrayListH = null;
        ArrayList<String> arrayListH2 = null;
        ArrayList<String> arrayListH3 = null;
        ArrayList<String> arrayListH4 = null;
        ArrayList<String> arrayListH5 = null;
        int iS2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    arrayListH = SafeParcelReader.h(parcel, i12);
                    break;
                case 3:
                    arrayListH2 = SafeParcelReader.h(parcel, i12);
                    break;
                case 4:
                    arrayListH3 = SafeParcelReader.h(parcel, i12);
                    break;
                case 5:
                    arrayListH4 = SafeParcelReader.h(parcel, i12);
                    break;
                case 6:
                    arrayListH5 = SafeParcelReader.h(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzs(iS2, arrayListH, arrayListH2, arrayListH3, arrayListH4, arrayListH5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzs[i12];
    }
}
