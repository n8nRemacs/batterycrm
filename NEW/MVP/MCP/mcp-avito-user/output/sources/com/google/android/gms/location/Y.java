package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i12, LocationRequest.CREATOR);
            } else if (c12 == 2) {
                zL2 = SafeParcelReader.l(parcel, i12);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                zL3 = SafeParcelReader.l(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new LocationSettingsRequest(arrayListJ, zL2, zL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new LocationSettingsRequest[i12];
    }
}
