package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        String strF = null;
        IBinder iBinderR = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 2:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 3:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 4:
                    iBinderR = SafeParcelReader.r(parcel, i12);
                    break;
                case 5:
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    zL5 = SafeParcelReader.l(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzo(strF, zL2, zL3, iBinderR, zL4, zL5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzo[i12];
    }
}
