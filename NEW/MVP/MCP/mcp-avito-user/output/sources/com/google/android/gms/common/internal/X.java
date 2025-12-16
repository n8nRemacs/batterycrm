package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = -1;
        int iS3 = 0;
        int iS4 = 0;
        int iS5 = 0;
        int iS6 = 0;
        String strF = null;
        String strF2 = null;
        long jU2 = 0;
        long jU3 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 3:
                    iS5 = SafeParcelReader.s(parcel, i12);
                    break;
                case 4:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 5:
                    jU3 = SafeParcelReader.u(parcel, i12);
                    break;
                case 6:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    iS6 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\t':
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new MethodInvocation(iS3, iS4, iS5, jU2, jU3, strF, strF2, iS6, iS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new MethodInvocation[i12];
    }
}
