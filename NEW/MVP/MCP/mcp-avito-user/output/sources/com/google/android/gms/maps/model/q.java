package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.dynamic.d;

/* loaded from: classes6.dex */
public final class q implements Parcelable.Creator<GroundOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final GroundOverlayOptions createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        IBinder iBinderR = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float fP2 = 0.0f;
        float fP3 = 0.0f;
        float fP4 = 0.0f;
        float fP5 = 0.0f;
        boolean zL2 = false;
        float fP6 = 0.0f;
        float fP7 = 0.0f;
        float fP8 = 0.0f;
        boolean zL3 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    iBinderR = SafeParcelReader.r(parcel, i12);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
                    break;
                case 4:
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                case 5:
                    fP3 = SafeParcelReader.p(parcel, i12);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.e(parcel, i12, LatLngBounds.CREATOR);
                    break;
                case 7:
                    fP4 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\b':
                    fP5 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\t':
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\n':
                    fP6 = SafeParcelReader.p(parcel, i12);
                    break;
                case 11:
                    fP7 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\f':
                    fP8 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\r':
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        groundOverlayOptions.f354402i = true;
        groundOverlayOptions.f354403j = 0.0f;
        groundOverlayOptions.f354404k = 0.5f;
        groundOverlayOptions.f354405l = 0.5f;
        groundOverlayOptions.f354406m = false;
        groundOverlayOptions.f354395b = new C36817a(d.a.f4(iBinderR));
        groundOverlayOptions.f354396c = latLng;
        groundOverlayOptions.f354397d = fP2;
        groundOverlayOptions.f354398e = fP3;
        groundOverlayOptions.f354399f = latLngBounds;
        groundOverlayOptions.f354400g = fP4;
        groundOverlayOptions.f354401h = fP5;
        groundOverlayOptions.f354402i = zL2;
        groundOverlayOptions.f354403j = fP6;
        groundOverlayOptions.f354404k = fP7;
        groundOverlayOptions.f354405l = fP8;
        groundOverlayOptions.f354406m = zL3;
        return groundOverlayOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GroundOverlayOptions[] newArray(int i12) {
        return new GroundOverlayOptions[i12];
    }
}
