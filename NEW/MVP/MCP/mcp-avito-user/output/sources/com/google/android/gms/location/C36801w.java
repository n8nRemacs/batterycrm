package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* renamed from: com.google.android.gms.location.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36801w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        long jU2 = 0;
        long jU3 = 0;
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                jU2 = SafeParcelReader.u(parcel, i12);
            } else if (c12 == 2) {
                jU3 = SafeParcelReader.u(parcel, i12);
            } else if (c12 == 3) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 4) {
                iS3 = SafeParcelReader.s(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                iS4 = SafeParcelReader.s(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new SleepSegmentEvent(jU2, iS2, iS3, iS4, jU3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new SleepSegmentEvent[i12];
    }
}
