package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: DynamicLinkDataCreator.java */
/* loaded from: classes5.dex */
public class a implements Parcelable.Creator<DynamicLinkData> {
    @Override // android.os.Parcelable.Creator
    public final DynamicLinkData createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        int iS2 = 0;
        long jU2 = 0;
        String strF2 = null;
        Bundle bundleB = null;
        Uri uri = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 4:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 5:
                    bundleB = SafeParcelReader.b(parcel, i12);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, i12, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        DynamicLinkData dynamicLinkData = new DynamicLinkData();
        dynamicLinkData.f361521b = strF;
        dynamicLinkData.f361522c = strF2;
        dynamicLinkData.f361523d = iS2;
        dynamicLinkData.f361524e = jU2;
        dynamicLinkData.f361525f = bundleB;
        dynamicLinkData.f361526g = uri;
        return dynamicLinkData;
    }

    @Override // android.os.Parcelable.Creator
    public final DynamicLinkData[] newArray(int i12) {
        return new DynamicLinkData[i12];
    }
}
