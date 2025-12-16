package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.util.ArrayList;

/* compiled from: ShortDynamicLinkImplCreator.java */
/* loaded from: classes5.dex */
public class i implements Parcelable.Creator<ShortDynamicLinkImpl> {
    @Override // android.os.Parcelable.Creator
    public final ShortDynamicLinkImpl createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayListJ = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                uri = (Uri) SafeParcelReader.e(parcel, i12, Uri.CREATOR);
            } else if (c12 == 2) {
                uri2 = (Uri) SafeParcelReader.e(parcel, i12, Uri.CREATOR);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                arrayListJ = SafeParcelReader.j(parcel, i12, ShortDynamicLinkImpl.WarningImpl.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ShortDynamicLinkImpl(uri, uri2, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final ShortDynamicLinkImpl[] newArray(int i12) {
        return new ShortDynamicLinkImpl[i12];
    }
}
