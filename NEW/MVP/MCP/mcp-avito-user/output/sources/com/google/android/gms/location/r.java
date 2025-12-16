package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                status = (Status) SafeParcelReader.e(parcel, i12, Status.CREATOR);
            } else if (c12 != 2) {
                SafeParcelReader.x(parcel, i12);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.e(parcel, i12, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new LocationSettingsResult[i12];
    }
}
