package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        int iS2 = 0;
        short s5 = 0;
        int iS3 = 0;
        double dN2 = 0.0d;
        double dN3 = 0.0d;
        float fP2 = 0.0f;
        long jU2 = 0;
        int iS4 = -1;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 2:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 3:
                    SafeParcelReader.A(parcel, i12, 4);
                    s5 = (short) parcel.readInt();
                    break;
                case 4:
                    dN2 = SafeParcelReader.n(parcel, i12);
                    break;
                case 5:
                    dN3 = SafeParcelReader.n(parcel, i12);
                    break;
                case 6:
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                case 7:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\b':
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\t':
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzdh(strF, iS2, s5, dN2, dN3, fP2, jU2, iS3, iS4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzdh[i12];
    }
}
