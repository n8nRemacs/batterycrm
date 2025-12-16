package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzw implements Parcelable.Creator {
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
            if (c12 == 2) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 3) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 4) {
                strF2 = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF3 = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzj(iS2, strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzj[i12];
    }
}
