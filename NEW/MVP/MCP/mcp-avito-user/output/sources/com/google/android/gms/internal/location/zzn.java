package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC36652k;
import com.google.android.gms.common.internal.InterfaceC36719o;
import com.google.android.gms.common.internal.O0;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzn extends zza implements zzo {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final Location zzd() {
        Parcel parcelF4 = f4(e4(), 7);
        Location location = (Location) zzc.zza(parcelF4, Location.CREATOR);
        parcelF4.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final InterfaceC36719o zze(CurrentLocationRequest currentLocationRequest, zzq zzqVar) {
        InterfaceC36719o o02;
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, currentLocationRequest);
        zzc.zze(parcelE4, zzqVar);
        Parcel parcelF4 = f4(parcelE4, 87);
        IBinder strongBinder = parcelF4.readStrongBinder();
        int i12 = InterfaceC36719o.a.f349452a;
        if (strongBinder == null) {
            o02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            o02 = iInterfaceQueryLocalInterface instanceof InterfaceC36719o ? (InterfaceC36719o) iInterfaceQueryLocalInterface : new O0(strongBinder, "com.google.android.gms.common.internal.ICancelToken");
        }
        parcelF4.recycle();
        return o02;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final LocationAvailability zzf(String str) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        Parcel parcelF4 = f4(parcelE4, 34);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(parcelF4, LocationAvailability.CREATOR);
        parcelF4.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzg(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzm zzmVar) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, geofencingRequest);
        zzc.zzd(parcelE4, pendingIntent);
        zzc.zze(parcelE4, zzmVar);
        g4(parcelE4, 57);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzh(LocationSettingsRequest locationSettingsRequest, zzs zzsVar, String str) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, locationSettingsRequest);
        zzc.zze(parcelE4, zzsVar);
        parcelE4.writeString(null);
        g4(parcelE4, 63);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzi(zzk zzkVar) {
        Parcel parcelE4 = e4();
        zzc.zze(parcelE4, zzkVar);
        g4(parcelE4, 67);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzj(LastLocationRequest lastLocationRequest, zzq zzqVar) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, lastLocationRequest);
        zzc.zze(parcelE4, zzqVar);
        g4(parcelE4, 82);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzk(zzdb zzdbVar, LocationRequest locationRequest, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzdbVar);
        zzc.zzd(parcelE4, locationRequest);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 88);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzl(PendingIntent pendingIntent, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, pendingIntent);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 73);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzm(PendingIntent pendingIntent) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, pendingIntent);
        g4(parcelE4, 6);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzn(PendingIntent pendingIntent, zzm zzmVar, String str) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, pendingIntent);
        zzc.zze(parcelE4, zzmVar);
        parcelE4.writeString(str);
        g4(parcelE4, 2);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzo(String[] strArr, zzm zzmVar, String str) {
        Parcel parcelE4 = e4();
        parcelE4.writeStringArray(strArr);
        zzc.zze(parcelE4, zzmVar);
        parcelE4.writeString(str);
        g4(parcelE4, 3);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzp(PendingIntent pendingIntent, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, pendingIntent);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 69);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzq(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, activityTransitionRequest);
        zzc.zzd(parcelE4, pendingIntent);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 72);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzr(long j12, boolean z12, PendingIntent pendingIntent) {
        Parcel parcelE4 = e4();
        parcelE4.writeLong(j12);
        zzc.zzc(parcelE4, true);
        zzc.zzd(parcelE4, pendingIntent);
        g4(parcelE4, 5);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzs(com.google.android.gms.location.zzb zzbVar, PendingIntent pendingIntent, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzbVar);
        zzc.zzd(parcelE4, pendingIntent);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 70);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzt(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, pendingIntent);
        zzc.zzd(parcelE4, sleepSegmentRequest);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 79);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzu(Location location) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, location);
        g4(parcelE4, 13);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzv(Location location, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, location);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 85);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzw(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.zzc(parcelE4, z12);
        g4(parcelE4, 12);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzx(boolean z12, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzc(parcelE4, z12);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 84);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzy(zzdb zzdbVar, InterfaceC36652k interfaceC36652k) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzdbVar);
        zzc.zze(parcelE4, interfaceC36652k);
        g4(parcelE4, 89);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzz(zzdf zzdfVar) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzdfVar);
        g4(parcelE4, 59);
    }
}
