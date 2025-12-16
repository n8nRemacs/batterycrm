package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.dynamic.d;

/* loaded from: classes6.dex */
public final class o implements Parcelable.Creator<Cap> {
    @Override // android.os.Parcelable.Creator
    public final Cap createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        IBinder iBinderR = null;
        Float fQ2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 3) {
                iBinderR = SafeParcelReader.r(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                fQ2 = SafeParcelReader.q(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new Cap(iS2, iBinderR != null ? new C36817a(d.a.f4(iBinderR)) : null, fQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Cap[] newArray(int i12) {
        return new Cap[i12];
    }
}
