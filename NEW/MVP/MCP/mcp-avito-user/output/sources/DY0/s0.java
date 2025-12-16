package dY0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zze;
import com.google.android.gms.internal.maps.zzf;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes6.dex */
public final class s0 extends zza implements r0 {
    @Override // dY0.r0
    public final InterfaceC39659h F2(com.google.android.gms.dynamic.f fVar) {
        InterfaceC39659h c39666k0;
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        Parcel parcelF4 = f4(parcelE4, 8);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            c39666k0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            c39666k0 = iInterfaceQueryLocalInterface instanceof InterfaceC39659h ? (InterfaceC39659h) iInterfaceQueryLocalInterface : new C39666k0(strongBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        }
        parcelF4.recycle();
        return c39666k0;
    }

    @Override // dY0.r0
    public final void R2(com.google.android.gms.dynamic.f fVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        parcelE4.writeInt(12451000);
        g4(parcelE4, 6);
    }

    @Override // dY0.r0
    public final InterfaceC39651d S2(com.google.android.gms.dynamic.f fVar) {
        InterfaceC39651d w0Var;
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        Parcel parcelF4 = f4(parcelE4, 2);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            w0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            w0Var = iInterfaceQueryLocalInterface instanceof InterfaceC39651d ? (InterfaceC39651d) iInterfaceQueryLocalInterface : new w0(strongBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
        }
        parcelF4.recycle();
        return w0Var;
    }

    @Override // dY0.r0
    public final InterfaceC39653e y3(com.google.android.gms.dynamic.f fVar, GoogleMapOptions googleMapOptions) {
        InterfaceC39653e x0Var;
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, fVar);
        zzc.zza(parcelE4, googleMapOptions);
        Parcel parcelF4 = f4(parcelE4, 3);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            x0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            x0Var = iInterfaceQueryLocalInterface instanceof InterfaceC39653e ? (InterfaceC39653e) iInterfaceQueryLocalInterface : new x0(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
        }
        parcelF4.recycle();
        return x0Var;
    }

    @Override // dY0.r0
    public final InterfaceC39645a zze() {
        InterfaceC39645a n12;
        Parcel parcelF4 = f4(e4(), 4);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            n12 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            n12 = iInterfaceQueryLocalInterface instanceof InterfaceC39645a ? (InterfaceC39645a) iInterfaceQueryLocalInterface : new N(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        }
        parcelF4.recycle();
        return n12;
    }

    @Override // dY0.r0
    public final zze zzf() {
        Parcel parcelF4 = f4(e4(), 5);
        zze zzeVarZzb = zzf.zzb(parcelF4.readStrongBinder());
        parcelF4.recycle();
        return zzeVarZzb;
    }
}
