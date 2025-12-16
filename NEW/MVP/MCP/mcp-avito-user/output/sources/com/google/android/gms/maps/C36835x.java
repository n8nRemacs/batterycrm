package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import dY0.C39669m;

/* renamed from: com.google.android.gms.maps.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36835x implements Parcelable.Creator<StreetViewPanoramaOptions> {
    @Override // android.os.Parcelable.Creator
    public final StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        LatLng latLng = null;
        Integer numT = null;
        StreetViewSource streetViewSource = null;
        byte bM2 = 0;
        byte bM3 = 0;
        byte bM4 = 0;
        byte bM5 = 0;
        byte bM6 = 0;
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.e(parcel, i12, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
                    break;
                case 5:
                    numT = SafeParcelReader.t(parcel, i12);
                    break;
                case 6:
                    bM2 = SafeParcelReader.m(parcel, i12);
                    break;
                case 7:
                    bM3 = SafeParcelReader.m(parcel, i12);
                    break;
                case '\b':
                    bM4 = SafeParcelReader.m(parcel, i12);
                    break;
                case '\t':
                    bM5 = SafeParcelReader.m(parcel, i12);
                    break;
                case '\n':
                    bM6 = SafeParcelReader.m(parcel, i12);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) SafeParcelReader.e(parcel, i12, StreetViewSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions();
        Boolean bool = Boolean.TRUE;
        streetViewPanoramaOptions.f354329f = bool;
        streetViewPanoramaOptions.f354330g = bool;
        streetViewPanoramaOptions.f354331h = bool;
        streetViewPanoramaOptions.f354332i = bool;
        streetViewPanoramaOptions.f354334k = StreetViewSource.f354469c;
        streetViewPanoramaOptions.f354325b = streetViewPanoramaCamera;
        streetViewPanoramaOptions.f354327d = latLng;
        streetViewPanoramaOptions.f354328e = numT;
        streetViewPanoramaOptions.f354326c = strF;
        streetViewPanoramaOptions.f354329f = C39669m.b(bM2);
        streetViewPanoramaOptions.f354330g = C39669m.b(bM3);
        streetViewPanoramaOptions.f354331h = C39669m.b(bM4);
        streetViewPanoramaOptions.f354332i = C39669m.b(bM5);
        streetViewPanoramaOptions.f354333j = C39669m.b(bM6);
        streetViewPanoramaOptions.f354334k = streetViewSource;
        return streetViewPanoramaOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOptions[] newArray(int i12) {
        return new StreetViewPanoramaOptions[i12];
    }
}
