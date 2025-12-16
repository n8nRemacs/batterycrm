package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        short s5 = 0;
        short s12 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                SafeParcelReader.A(parcel, i12, 4);
                s5 = (short) parcel.readInt();
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                SafeParcelReader.A(parcel, i12, 4);
                s12 = (short) parcel.readInt();
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new UvmEntry(iS2, s5, s12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new UvmEntry[i12];
    }
}
