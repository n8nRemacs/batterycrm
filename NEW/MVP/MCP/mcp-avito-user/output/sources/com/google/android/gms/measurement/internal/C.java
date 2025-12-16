package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class C implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final zzbe createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        zzaz zzazVar = null;
        String strF2 = null;
        long jU2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 3) {
                zzazVar = (zzaz) SafeParcelReader.e(parcel, i12, zzaz.CREATOR);
            } else if (c12 == 4) {
                strF2 = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                jU2 = SafeParcelReader.u(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzbe(strF, zzazVar, strF2, jU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbe[] newArray(int i12) {
        return new zzbe[i12];
    }
}
