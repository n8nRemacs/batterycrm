package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        ArrayList arrayListJ2 = null;
        String strF2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i12, ActivityTransition.CREATOR);
            } else if (c12 == 2) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 3) {
                arrayListJ2 = SafeParcelReader.j(parcel, i12, ClientIdentity.CREATOR);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF2 = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ActivityTransitionRequest(strF, strF2, arrayListJ, arrayListJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new ActivityTransitionRequest[i12];
    }
}
