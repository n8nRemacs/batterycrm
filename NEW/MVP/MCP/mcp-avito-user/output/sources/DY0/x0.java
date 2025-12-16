package dY0;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes6.dex */
public final class x0 extends zza implements InterfaceC39653e {
    @Override // dY0.InterfaceC39653e
    public final void b(InterfaceC39643C interfaceC39643C) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, interfaceC39643C);
        g4(parcelE4, 9);
    }

    @Override // dY0.InterfaceC39653e
    public final void c(Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, bundle);
        Parcel parcelF4 = f4(parcelE4, 7);
        if (parcelF4.readInt() != 0) {
            bundle.readFromParcel(parcelF4);
        }
        parcelF4.recycle();
    }

    @Override // dY0.InterfaceC39653e
    public final void d(Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, bundle);
        g4(parcelE4, 2);
    }

    @Override // dY0.InterfaceC39653e
    public final void e() {
        g4(e4(), 5);
    }

    @Override // dY0.InterfaceC39653e
    public final com.google.android.gms.dynamic.d getView() {
        return P0.f(f4(e4(), 8));
    }

    @Override // dY0.InterfaceC39653e
    public final void onLowMemory() {
        g4(e4(), 6);
    }

    @Override // dY0.InterfaceC39653e
    public final void onPause() {
        g4(e4(), 4);
    }

    @Override // dY0.InterfaceC39653e
    public final void onResume() {
        g4(e4(), 3);
    }

    @Override // dY0.InterfaceC39653e
    public final void onStart() {
        g4(e4(), 12);
    }

    @Override // dY0.InterfaceC39653e
    public final void onStop() {
        g4(e4(), 13);
    }
}
