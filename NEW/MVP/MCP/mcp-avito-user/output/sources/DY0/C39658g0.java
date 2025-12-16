package dY0;

import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: dY0.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39658g0 extends zza implements InterfaceC39655f {
    @Override // dY0.InterfaceC39655f
    public final LatLng T3(com.google.android.gms.dynamic.f fVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        Parcel parcelF4 = f4(parcelE4, 1);
        LatLng latLng = (LatLng) zzc.zza(parcelF4, LatLng.CREATOR);
        parcelF4.recycle();
        return latLng;
    }

    @Override // dY0.InterfaceC39655f
    public final com.google.android.gms.dynamic.d U0(LatLng latLng) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, latLng);
        return P0.f(f4(parcelE4, 2));
    }

    @Override // dY0.InterfaceC39655f
    public final VisibleRegion getVisibleRegion() {
        Parcel parcelF4 = f4(e4(), 3);
        VisibleRegion visibleRegion = (VisibleRegion) zzc.zza(parcelF4, VisibleRegion.CREATOR);
        parcelF4.recycle();
        return visibleRegion;
    }
}
