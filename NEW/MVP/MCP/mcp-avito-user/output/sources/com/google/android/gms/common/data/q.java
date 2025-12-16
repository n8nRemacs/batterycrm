package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String[] strArrG = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleB = null;
        int iS2 = 0;
        int iS3 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                strArrG = SafeParcelReader.g(parcel, i12);
            } else if (c12 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.i(parcel, i12, CursorWindow.CREATOR);
            } else if (c12 == 3) {
                iS3 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 4) {
                bundleB = SafeParcelReader.b(parcel, i12);
            } else if (c12 != 1000) {
                SafeParcelReader.x(parcel, i12);
            } else {
                iS2 = SafeParcelReader.s(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        DataHolder dataHolder = new DataHolder(iS2, strArrG, cursorWindowArr, iS3, bundleB);
        dataHolder.h();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new DataHolder[i12];
    }
}
