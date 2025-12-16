package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36962r5 implements Parcelable.Creator<zzmh> {
    @Override // android.os.Parcelable.Creator
    public final zzmh createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        long jU2 = 0;
        int iS2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 2) {
                jU2 = SafeParcelReader.u(parcel, i12);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                iS2 = SafeParcelReader.s(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzmh(strF, jU2, iS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmh[] newArray(int i12) {
        return new zzmh[i12];
    }
}
