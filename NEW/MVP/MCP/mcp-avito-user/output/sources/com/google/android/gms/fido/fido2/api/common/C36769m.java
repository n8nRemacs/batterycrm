package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36769m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        while (true) {
            byte[][] bArr = null;
            while (parcel.dataPosition() < iY2) {
                int i12 = parcel.readInt();
                if (((char) i12) != 1) {
                    SafeParcelReader.x(parcel, i12);
                } else {
                    int iW2 = SafeParcelReader.w(parcel, i12);
                    int iDataPosition = parcel.dataPosition();
                    if (iW2 == 0) {
                        break;
                    }
                    int i13 = parcel.readInt();
                    byte[][] bArr2 = new byte[i13][];
                    for (int i14 = 0; i14 < i13; i14++) {
                        bArr2[i14] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(iDataPosition + iW2);
                    bArr = bArr2;
                }
            }
            SafeParcelReader.k(parcel, iY2);
            return new zzak(bArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzak[i12];
    }
}
