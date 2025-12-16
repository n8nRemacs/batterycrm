package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zztj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        float fP2 = 0.0f;
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        int iS5 = 0;
        boolean zL2 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 3:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 4:
                    iS5 = SafeParcelReader.s(parcel, i12);
                    break;
                case 5:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzti(iS2, iS3, iS4, iS5, zL2, fP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzti[i12];
    }
}
