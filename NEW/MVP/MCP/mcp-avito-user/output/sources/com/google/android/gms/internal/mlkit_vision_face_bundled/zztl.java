package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zztl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Rect rect = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        float fP2 = 0.0f;
        float fP3 = 0.0f;
        float fP4 = 0.0f;
        float fP5 = 0.0f;
        float fP6 = 0.0f;
        float fP7 = 0.0f;
        float fP8 = 0.0f;
        int iS2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    rect = (Rect) SafeParcelReader.e(parcel, i12, Rect.CREATOR);
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
                    fP6 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\b':
                    fP7 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\t':
                    fP8 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\n':
                    arrayListJ = SafeParcelReader.j(parcel, i12, zztr.CREATOR);
                    break;
                case 11:
                    arrayListJ2 = SafeParcelReader.j(parcel, i12, zztg.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zztk(iS2, rect, fP2, fP3, fP4, fP5, fP6, fP7, fP8, arrayListJ, arrayListJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zztk[i12];
    }
}
