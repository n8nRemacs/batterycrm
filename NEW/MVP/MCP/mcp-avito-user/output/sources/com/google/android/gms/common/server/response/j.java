package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        zaa zaaVar = null;
        int iS2 = 0;
        int iS3 = 0;
        boolean zL2 = false;
        int iS4 = 0;
        boolean zL3 = false;
        int iS5 = 0;
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
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 4:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 5:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 7:
                    iS5 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\t':
                    zaaVar = (zaa) SafeParcelReader.e(parcel, i12, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new FastJsonResponse.Field(iS2, iS3, zL2, iS4, zL3, strF, iS5, strF2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new FastJsonResponse.Field[i12];
    }
}
