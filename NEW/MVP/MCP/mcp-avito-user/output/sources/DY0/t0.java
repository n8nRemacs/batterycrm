package dY0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.internal.maps.zzu;
import com.google.android.gms.internal.maps.zzw;
import com.google.android.gms.internal.maps.zzx;
import com.google.android.gms.internal.maps.zzz;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

/* loaded from: classes6.dex */
public final class t0 extends zza implements InterfaceC39647b {
    @Override // dY0.InterfaceC39647b
    public final boolean A1(MapStyleOptions mapStyleOptions) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, mapStyleOptions);
        Parcel parcelF4 = f4(parcelE4, 91);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // dY0.InterfaceC39647b
    public final void G1(E e12) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, e12);
        g4(parcelE4, 30);
    }

    @Override // dY0.InterfaceC39647b
    public final void J1(A0 a02) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, a02);
        g4(parcelE4, 99);
    }

    @Override // dY0.InterfaceC39647b
    public final zzw Q(PolygonOptions polygonOptions) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, polygonOptions);
        Parcel parcelF4 = f4(parcelE4, 10);
        zzw zzwVarZzh = zzx.zzh(parcelF4.readStrongBinder());
        parcelF4.recycle();
        return zzwVarZzh;
    }

    @Override // dY0.InterfaceC39647b
    public final void W(com.google.android.gms.dynamic.d dVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, dVar);
        g4(parcelE4, 5);
    }

    @Override // dY0.InterfaceC39647b
    public final void Z1() {
        Parcel parcelE4 = e4();
        parcelE4.writeInt(1);
        g4(parcelE4, 16);
    }

    @Override // dY0.InterfaceC39647b
    public final zzz Z3(PolylineOptions polylineOptions) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, polylineOptions);
        Parcel parcelF4 = f4(parcelE4, 9);
        zzz zzzVarZzi = zzaa.zzi(parcelF4.readStrongBinder());
        parcelF4.recycle();
        return zzzVarZzi;
    }

    @Override // dY0.InterfaceC39647b
    public final zzt c0(MarkerOptions markerOptions) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, markerOptions);
        Parcel parcelF4 = f4(parcelE4, 11);
        zzt zztVarZzg = zzu.zzg(parcelF4.readStrongBinder());
        parcelF4.recycle();
        return zztVarZzg;
    }

    @Override // dY0.InterfaceC39647b
    public final void clear() {
        g4(e4(), 14);
    }

    @Override // dY0.InterfaceC39647b
    public final CameraPosition getCameraPosition() {
        Parcel parcelF4 = f4(e4(), 1);
        CameraPosition cameraPosition = (CameraPosition) zzc.zza(parcelF4, CameraPosition.CREATOR);
        parcelF4.recycle();
        return cameraPosition;
    }

    @Override // dY0.InterfaceC39647b
    public final InterfaceC39663j getUiSettings() {
        InterfaceC39663j c39670m0;
        Parcel parcelF4 = f4(e4(), 25);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            c39670m0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            c39670m0 = iInterfaceQueryLocalInterface instanceof InterfaceC39663j ? (InterfaceC39663j) iInterfaceQueryLocalInterface : new C39670m0(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
        }
        parcelF4.recycle();
        return c39670m0;
    }

    @Override // dY0.InterfaceC39647b
    public final InterfaceC39655f h() {
        InterfaceC39655f c39658g0;
        Parcel parcelF4 = f4(e4(), 26);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            c39658g0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            c39658g0 = iInterfaceQueryLocalInterface instanceof InterfaceC39655f ? (InterfaceC39655f) iInterfaceQueryLocalInterface : new C39658g0(strongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
        }
        parcelF4.recycle();
        return c39658g0;
    }

    @Override // dY0.InterfaceC39647b
    public final void n(InterfaceC39679w interfaceC39679w) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, interfaceC39679w);
        g4(parcelE4, 28);
    }

    @Override // dY0.InterfaceC39647b
    public final void r2(G0 g02) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, g02);
        g4(parcelE4, 96);
    }

    @Override // dY0.InterfaceC39647b
    public final void setMaxZoomPreference(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 93);
    }

    @Override // dY0.InterfaceC39647b
    public final void setMinZoomPreference(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 92);
    }

    @Override // dY0.InterfaceC39647b
    public final void setPadding(int i12, int i13, int i14, int i15) {
        Parcel parcelE4 = e4();
        parcelE4.writeInt(i12);
        parcelE4.writeInt(i13);
        parcelE4.writeInt(i14);
        parcelE4.writeInt(i15);
        g4(parcelE4, 39);
    }

    @Override // dY0.InterfaceC39647b
    public final zzh w(CircleOptions circleOptions) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, circleOptions);
        Parcel parcelF4 = f4(parcelE4, 35);
        zzh zzhVarZzc = zzi.zzc(parcelF4.readStrongBinder());
        parcelF4.recycle();
        return zzhVarZzc;
    }

    @Override // dY0.InterfaceC39647b
    public final void y1(com.google.android.gms.dynamic.d dVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, dVar);
        g4(parcelE4, 4);
    }
}
