package dY0;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes6.dex */
public final class w0 extends zza implements InterfaceC39651d {
    @Override // dY0.InterfaceC39651d
    public final void b(InterfaceC39643C interfaceC39643C) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, interfaceC39643C);
        g4(parcelE4, 12);
    }

    @Override // dY0.InterfaceC39651d
    public final void c(Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, bundle);
        Parcel parcelF4 = f4(parcelE4, 10);
        if (parcelF4.readInt() != 0) {
            bundle.readFromParcel(parcelF4);
        }
        parcelF4.recycle();
    }

    @Override // dY0.InterfaceC39651d
    public final void d(Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, bundle);
        g4(parcelE4, 3);
    }

    @Override // dY0.InterfaceC39651d
    public final void e() {
        g4(e4(), 8);
    }

    @Override // dY0.InterfaceC39651d
    public final com.google.android.gms.dynamic.d i(com.google.android.gms.dynamic.f fVar, com.google.android.gms.dynamic.f fVar2, Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        zzc.zza(parcelE4, fVar2);
        zzc.zza(parcelE4, bundle);
        return P0.f(f4(parcelE4, 4));
    }

    @Override // dY0.InterfaceC39651d
    public final void onDestroyView() {
        g4(e4(), 7);
    }

    @Override // dY0.InterfaceC39651d
    public final void onLowMemory() {
        g4(e4(), 9);
    }

    @Override // dY0.InterfaceC39651d
    public final void onPause() {
        g4(e4(), 6);
    }

    @Override // dY0.InterfaceC39651d
    public final void onResume() {
        g4(e4(), 5);
    }

    @Override // dY0.InterfaceC39651d
    public final void onStart() {
        g4(e4(), 15);
    }

    @Override // dY0.InterfaceC39651d
    public final void onStop() {
        g4(e4(), 16);
    }

    @Override // dY0.InterfaceC39651d
    public final void u(com.google.android.gms.dynamic.f fVar, GoogleMapOptions googleMapOptions, Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        zzc.zza(parcelE4, googleMapOptions);
        zzc.zza(parcelE4, bundle);
        g4(parcelE4, 2);
    }
}
