package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.maps.zzag;

/* loaded from: classes6.dex */
public final class H implements Parcelable.Creator<TileOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final TileOverlayOptions createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        IBinder iBinderR = null;
        boolean zL2 = false;
        float fP2 = 0.0f;
        float fP3 = 0.0f;
        boolean zL3 = true;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                iBinderR = SafeParcelReader.r(parcel, i12);
            } else if (c12 == 3) {
                zL2 = SafeParcelReader.l(parcel, i12);
            } else if (c12 == 4) {
                fP2 = SafeParcelReader.p(parcel, i12);
            } else if (c12 == 5) {
                zL3 = SafeParcelReader.l(parcel, i12);
            } else if (c12 != 6) {
                SafeParcelReader.x(parcel, i12);
            } else {
                fP3 = SafeParcelReader.p(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.f354475c = true;
        tileOverlayOptions.f354477e = true;
        tileOverlayOptions.f354478f = 0.0f;
        tileOverlayOptions.f354474b = zzag.zzk(iBinderR);
        tileOverlayOptions.f354475c = zL2;
        tileOverlayOptions.f354476d = fP2;
        tileOverlayOptions.f354477e = zL3;
        tileOverlayOptions.f354478f = fP3;
        return tileOverlayOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TileOverlayOptions[] newArray(int i12) {
        return new TileOverlayOptions[i12];
    }
}
