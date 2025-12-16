package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        float fP2 = -1.0f;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 3:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 4:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 5:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 7:
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzh(iS2, iS3, iS4, zL2, zL3, fP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzh[i12];
    }
}
