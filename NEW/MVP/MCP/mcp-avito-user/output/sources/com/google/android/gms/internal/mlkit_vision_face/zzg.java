package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        int iS3 = 0;
        float fP2 = 0.0f;
        float fP3 = 0.0f;
        float fP4 = 0.0f;
        float fP5 = 0.0f;
        float fP6 = 0.0f;
        float fP7 = 0.0f;
        float fP8 = 0.0f;
        float fP9 = Float.MAX_VALUE;
        float fP10 = Float.MAX_VALUE;
        float fP11 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float fP12 = -1.0f;
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
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                case 4:
                    fP3 = SafeParcelReader.p(parcel, i12);
                    break;
                case 5:
                    fP4 = SafeParcelReader.p(parcel, i12);
                    break;
                case 6:
                    fP5 = SafeParcelReader.p(parcel, i12);
                    break;
                case 7:
                    fP9 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\b':
                    fP10 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\t':
                    zznVarArr = (zzn[]) SafeParcelReader.i(parcel, i12, zzn.CREATOR);
                    break;
                case '\n':
                    fP6 = SafeParcelReader.p(parcel, i12);
                    break;
                case 11:
                    fP7 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\f':
                    fP8 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\r':
                    zzdVarArr = (zzd[]) SafeParcelReader.i(parcel, i12, zzd.CREATOR);
                    break;
                case 14:
                    fP11 = SafeParcelReader.p(parcel, i12);
                    break;
                case 15:
                    fP12 = SafeParcelReader.p(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzf(iS2, iS3, fP2, fP3, fP4, fP5, fP9, fP10, fP11, zznVarArr, fP6, fP7, fP8, zzdVarArr, fP12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzf[i12];
    }
}
