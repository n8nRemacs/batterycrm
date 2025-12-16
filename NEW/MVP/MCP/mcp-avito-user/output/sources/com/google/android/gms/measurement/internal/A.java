package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class A implements Parcelable.Creator<zzaz> {
    @Override // android.os.Parcelable.Creator
    public final zzaz createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            if (((char) i12) != 2) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bundleB = SafeParcelReader.b(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzaz(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaz[] newArray(int i12) {
        return new zzaz[i12];
    }
}
