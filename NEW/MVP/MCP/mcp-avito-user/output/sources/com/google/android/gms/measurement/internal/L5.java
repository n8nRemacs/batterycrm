package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class L5 implements Parcelable.Creator<zznb> {
    @Override // android.os.Parcelable.Creator
    public final zznb createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        String strF = null;
        Long lV2 = null;
        Float fQ2 = null;
        String strF2 = null;
        String strF3 = null;
        Double dO2 = null;
        long jU2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 4:
                    lV2 = SafeParcelReader.v(parcel, i12);
                    break;
                case 5:
                    fQ2 = SafeParcelReader.q(parcel, i12);
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    dO2 = SafeParcelReader.o(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zznb(iS2, strF, jU2, lV2, fQ2, strF2, strF3, dO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zznb[] newArray(int i12) {
        return new zznb[i12];
    }
}
