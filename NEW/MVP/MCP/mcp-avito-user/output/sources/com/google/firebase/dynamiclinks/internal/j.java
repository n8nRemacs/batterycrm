package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

/* compiled from: WarningImplCreator.java */
/* loaded from: classes5.dex */
public class j implements Parcelable.Creator<ShortDynamicLinkImpl.WarningImpl> {
    @Override // android.os.Parcelable.Creator
    public final ShortDynamicLinkImpl.WarningImpl createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            if (((char) i12) != 2) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ShortDynamicLinkImpl.WarningImpl(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final ShortDynamicLinkImpl.WarningImpl[] newArray(int i12) {
        return new ShortDynamicLinkImpl.WarningImpl[i12];
    }
}
