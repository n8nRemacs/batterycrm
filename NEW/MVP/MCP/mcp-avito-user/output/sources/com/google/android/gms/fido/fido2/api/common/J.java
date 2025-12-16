package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        byte[] bArrC = null;
        boolean zL2 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                zL2 = SafeParcelReader.l(parcel, i12);
            } else if (c12 != 2) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bArrC = SafeParcelReader.c(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzh(zL2, bArrC != null ? zzgx.zzl(bArrC, 0, bArrC.length) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzh[i12];
    }
}
