package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        PendingIntent pendingIntent = null;
        int iS2 = 0;
        int iS3 = 0;
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                iS3 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i12, PendingIntent.CREATOR);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ConnectionResult(iS2, iS3, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new ConnectionResult[i12];
    }
}
