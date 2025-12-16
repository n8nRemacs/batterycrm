package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import dY0.C39669m;

/* renamed from: com.google.android.gms.maps.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36828p implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final GoogleMapOptions createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        byte bM2 = -1;
        byte bM3 = -1;
        CameraPosition cameraPosition = null;
        byte bM4 = -1;
        byte bM5 = -1;
        byte bM6 = -1;
        byte bM7 = -1;
        byte bM8 = -1;
        byte bM9 = -1;
        byte bM10 = -1;
        byte bM11 = -1;
        byte bM12 = -1;
        Float fQ2 = null;
        Float fQ3 = null;
        LatLngBounds latLngBounds = null;
        byte bM13 = -1;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    bM2 = SafeParcelReader.m(parcel, i12);
                    break;
                case 3:
                    bM3 = SafeParcelReader.m(parcel, i12);
                    break;
                case 4:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.e(parcel, i12, CameraPosition.CREATOR);
                    break;
                case 6:
                    bM4 = SafeParcelReader.m(parcel, i12);
                    break;
                case 7:
                    bM5 = SafeParcelReader.m(parcel, i12);
                    break;
                case '\b':
                    bM6 = SafeParcelReader.m(parcel, i12);
                    break;
                case '\t':
                    bM7 = SafeParcelReader.m(parcel, i12);
                    break;
                case '\n':
                    bM8 = SafeParcelReader.m(parcel, i12);
                    break;
                case 11:
                    bM9 = SafeParcelReader.m(parcel, i12);
                    break;
                case '\f':
                    bM10 = SafeParcelReader.m(parcel, i12);
                    break;
                case '\r':
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
                case 14:
                    bM11 = SafeParcelReader.m(parcel, i12);
                    break;
                case 15:
                    bM12 = SafeParcelReader.m(parcel, i12);
                    break;
                case 16:
                    fQ2 = SafeParcelReader.q(parcel, i12);
                    break;
                case 17:
                    fQ3 = SafeParcelReader.q(parcel, i12);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.e(parcel, i12, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bM13 = SafeParcelReader.m(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.f354301d = -1;
        googleMapOptions.f354312o = null;
        googleMapOptions.f354313p = null;
        googleMapOptions.f354314q = null;
        googleMapOptions.f354299b = C39669m.b(bM2);
        googleMapOptions.f354300c = C39669m.b(bM3);
        googleMapOptions.f354301d = iS2;
        googleMapOptions.f354302e = cameraPosition;
        googleMapOptions.f354303f = C39669m.b(bM4);
        googleMapOptions.f354304g = C39669m.b(bM5);
        googleMapOptions.f354305h = C39669m.b(bM6);
        googleMapOptions.f354306i = C39669m.b(bM7);
        googleMapOptions.f354307j = C39669m.b(bM8);
        googleMapOptions.f354308k = C39669m.b(bM9);
        googleMapOptions.f354309l = C39669m.b(bM10);
        googleMapOptions.f354310m = C39669m.b(bM11);
        googleMapOptions.f354311n = C39669m.b(bM12);
        googleMapOptions.f354312o = fQ2;
        googleMapOptions.f354313p = fQ3;
        googleMapOptions.f354314q = latLngBounds;
        googleMapOptions.f354315r = C39669m.b(bM13);
        return googleMapOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i12) {
        return new GoogleMapOptions[i12];
    }
}
