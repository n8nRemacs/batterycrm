package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        Bundle bundleB = null;
        long jU2 = 0;
        long jU3 = 0;
        int iS2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i12, DetectedActivity.CREATOR);
            } else if (c12 == 2) {
                jU2 = SafeParcelReader.u(parcel, i12);
            } else if (c12 == 3) {
                jU3 = SafeParcelReader.u(parcel, i12);
            } else if (c12 == 4) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bundleB = SafeParcelReader.b(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ActivityRecognitionResult(arrayListJ, jU2, jU3, iS2, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new ActivityRecognitionResult[i12];
    }
}
