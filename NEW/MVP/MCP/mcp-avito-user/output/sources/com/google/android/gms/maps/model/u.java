package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.dynamic.d;

/* loaded from: classes6.dex */
public final class u implements Parcelable.Creator<MarkerOptions> {
    @Override // android.os.Parcelable.Creator
    public final MarkerOptions createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        float fP2 = 0.5f;
        float fP3 = 1.0f;
        LatLng latLng = null;
        String strF = null;
        String strF2 = null;
        IBinder iBinderR = null;
        float fP4 = 0.0f;
        float fP5 = 0.0f;
        float fP6 = 0.0f;
        float fP7 = 0.0f;
        float fP8 = 0.0f;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    iBinderR = SafeParcelReader.r(parcel, i12);
                    break;
                case 6:
                    fP4 = SafeParcelReader.p(parcel, i12);
                    break;
                case 7:
                    fP5 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\b':
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\t':
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\n':
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                case 11:
                    fP6 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\f':
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\r':
                    fP7 = SafeParcelReader.p(parcel, i12);
                    break;
                case 14:
                    fP3 = SafeParcelReader.p(parcel, i12);
                    break;
                case 15:
                    fP8 = SafeParcelReader.p(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.f354420f = 0.5f;
        markerOptions.f354421g = 1.0f;
        markerOptions.f354423i = true;
        markerOptions.f354424j = false;
        markerOptions.f354425k = 0.0f;
        markerOptions.f354426l = 0.5f;
        markerOptions.f354427m = 0.0f;
        markerOptions.f354428n = 1.0f;
        markerOptions.f354416b = latLng;
        markerOptions.f354417c = strF;
        markerOptions.f354418d = strF2;
        if (iBinderR == null) {
            markerOptions.f354419e = null;
        } else {
            markerOptions.f354419e = new C36817a(d.a.f4(iBinderR));
        }
        markerOptions.f354420f = fP4;
        markerOptions.f354421g = fP5;
        markerOptions.f354422h = zL2;
        markerOptions.f354423i = zL3;
        markerOptions.f354424j = zL4;
        markerOptions.f354425k = fP6;
        markerOptions.f354426l = fP2;
        markerOptions.f354427m = fP7;
        markerOptions.f354428n = fP3;
        markerOptions.f354429o = fP8;
        return markerOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions[] newArray(int i12) {
        return new MarkerOptions[i12];
    }
}
