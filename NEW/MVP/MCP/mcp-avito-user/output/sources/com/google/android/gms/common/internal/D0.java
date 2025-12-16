package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class D0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zL2 = false;
        boolean zL3 = false;
        int iS2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.e(parcel, i12, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 3:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 4:
                    iArrD = SafeParcelReader.d(parcel, i12);
                    break;
                case 5:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 6:
                    iArrD2 = SafeParcelReader.d(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zL2, zL3, iArrD, iS2, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new ConnectionTelemetryConfiguration[i12];
    }
}
