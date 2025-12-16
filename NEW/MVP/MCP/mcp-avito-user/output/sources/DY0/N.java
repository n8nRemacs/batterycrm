package dY0;

import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class N extends zza implements InterfaceC39645a {
    @Override // dY0.InterfaceC39645a
    public final com.google.android.gms.dynamic.d V2(LatLngBounds latLngBounds, int i12) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, latLngBounds);
        parcelE4.writeInt(i12);
        return P0.f(f4(parcelE4, 10));
    }

    @Override // dY0.InterfaceC39645a
    public final com.google.android.gms.dynamic.d u3(LatLng latLng, float f12) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, latLng);
        parcelE4.writeFloat(f12);
        return P0.f(f4(parcelE4, 9));
    }
}
