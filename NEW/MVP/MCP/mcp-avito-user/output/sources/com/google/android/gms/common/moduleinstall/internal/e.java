package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        boolean zL2 = false;
        String strF2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i12, Feature.CREATOR);
            } else if (c12 == 2) {
                zL2 = SafeParcelReader.l(parcel, i12);
            } else if (c12 == 3) {
                strF2 = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ApiFeatureRequest(strF2, strF, arrayListJ, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new ApiFeatureRequest[i12];
    }
}
