package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzbi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 3) {
                strF2 = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF3 = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzat(iS2, strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzat[i12];
    }
}
