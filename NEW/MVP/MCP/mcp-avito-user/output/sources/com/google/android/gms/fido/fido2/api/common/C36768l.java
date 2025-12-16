package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36768l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                bArrC = SafeParcelReader.c(parcel, i12);
            } else if (c12 == 2) {
                bArrC2 = SafeParcelReader.c(parcel, i12);
            } else if (c12 == 3) {
                bArrC3 = SafeParcelReader.c(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                iS2 = SafeParcelReader.s(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzai(bArrC == null ? null : zzgx.zzl(bArrC, 0, bArrC.length), bArrC2 == null ? null : zzgx.zzl(bArrC2, 0, bArrC2.length), bArrC3 != null ? zzgx.zzl(bArrC3, 0, bArrC3.length) : null, iS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzai[i12];
    }
}
