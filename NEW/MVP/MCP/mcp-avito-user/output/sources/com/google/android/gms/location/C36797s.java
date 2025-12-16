package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* renamed from: com.google.android.gms.location.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36797s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        boolean zL6 = false;
        boolean zL7 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 2:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 3:
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                case 4:
                    zL5 = SafeParcelReader.l(parcel, i12);
                    break;
                case 5:
                    zL6 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    zL7 = SafeParcelReader.l(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new LocationSettingsStates(zL2, zL3, zL4, zL5, zL6, zL7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new LocationSettingsStates[i12];
    }
}
