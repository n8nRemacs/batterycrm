package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class C0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Bundle bundleB = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iS2 = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                bundleB = SafeParcelReader.b(parcel, i12);
            } else if (c12 == 2) {
                featureArr = (Feature[]) SafeParcelReader.i(parcel, i12, Feature.CREATOR);
            } else if (c12 == 3) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.e(parcel, i12, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        zzk zzkVar = new zzk();
        zzkVar.f349494b = bundleB;
        zzkVar.f349495c = featureArr;
        zzkVar.f349496d = iS2;
        zzkVar.f349497e = connectionTelemetryConfiguration;
        return zzkVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzk[i12];
    }
}
