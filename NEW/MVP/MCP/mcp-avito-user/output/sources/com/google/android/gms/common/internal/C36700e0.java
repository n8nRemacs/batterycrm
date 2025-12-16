package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36700e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        IBinder iBinderR = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                iBinderR = SafeParcelReader.r(parcel, i12);
            } else if (c12 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, i12, ConnectionResult.CREATOR);
            } else if (c12 == 4) {
                zL2 = SafeParcelReader.l(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                zL3 = SafeParcelReader.l(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zav(iS2, iBinderR, connectionResult, zL2, zL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zav[i12];
    }
}
