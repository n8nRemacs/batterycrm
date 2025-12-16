package dY0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: dY0.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39666k0 extends zza implements InterfaceC39659h {
    @Override // dY0.InterfaceC39659h
    public final void c(Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, bundle);
        Parcel parcelF4 = f4(parcelE4, 10);
        if (parcelF4.readInt() != 0) {
            bundle.readFromParcel(parcelF4);
        }
        parcelF4.recycle();
    }

    @Override // dY0.InterfaceC39659h
    public final void d(Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, bundle);
        g4(parcelE4, 3);
    }

    @Override // dY0.InterfaceC39659h
    public final void e() {
        g4(e4(), 8);
    }

    @Override // dY0.InterfaceC39659h
    public final void f2(com.google.android.gms.dynamic.f fVar, Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        zzc.zza(parcelE4, (Parcelable) null);
        zzc.zza(parcelE4, bundle);
        g4(parcelE4, 2);
    }

    @Override // dY0.InterfaceC39659h
    public final com.google.android.gms.dynamic.d i(com.google.android.gms.dynamic.f fVar, com.google.android.gms.dynamic.f fVar2, Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        zzc.zza(parcelE4, fVar2);
        zzc.zza(parcelE4, bundle);
        return P0.f(f4(parcelE4, 4));
    }

    @Override // dY0.InterfaceC39659h
    public final void onDestroyView() {
        g4(e4(), 7);
    }

    @Override // dY0.InterfaceC39659h
    public final void onLowMemory() {
        g4(e4(), 9);
    }

    @Override // dY0.InterfaceC39659h
    public final void onPause() {
        g4(e4(), 6);
    }

    @Override // dY0.InterfaceC39659h
    public final void onResume() {
        g4(e4(), 5);
    }

    @Override // dY0.InterfaceC39659h
    public final void onStart() {
        g4(e4(), 13);
    }

    @Override // dY0.InterfaceC39659h
    public final void onStop() {
        g4(e4(), 14);
    }

    @Override // dY0.InterfaceC39659h
    public final void q(InterfaceC39654e0 interfaceC39654e0) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, interfaceC39654e0);
        g4(parcelE4, 12);
    }
}
