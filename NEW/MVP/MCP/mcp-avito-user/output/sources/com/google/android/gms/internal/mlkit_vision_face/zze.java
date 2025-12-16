package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        PointF[] pointFArr = null;
        int iS2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                pointFArr = (PointF[]) SafeParcelReader.i(parcel, i12, PointF.CREATOR);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                iS2 = SafeParcelReader.s(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzd(pointFArr, iS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzd[i12];
    }
}
