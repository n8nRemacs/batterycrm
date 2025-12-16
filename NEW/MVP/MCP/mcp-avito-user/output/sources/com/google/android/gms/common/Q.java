package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        boolean zL2 = false;
        String strF = null;
        IBinder iBinderR = null;
        boolean zL3 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 2) {
                iBinderR = SafeParcelReader.r(parcel, i12);
            } else if (c12 == 3) {
                zL2 = SafeParcelReader.l(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                zL3 = SafeParcelReader.l(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzs(strF, iBinderR, zL2, zL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzs[i12];
    }
}
