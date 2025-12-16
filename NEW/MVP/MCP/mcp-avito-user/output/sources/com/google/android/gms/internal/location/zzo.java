package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.InterfaceC36652k;
import com.google.android.gms.common.internal.InterfaceC36719o;
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
public interface zzo extends IInterface {
    @Deprecated
    Location zzd();

    @Deprecated
    InterfaceC36719o zze(CurrentLocationRequest currentLocationRequest, zzq zzqVar);

    @Deprecated
    LocationAvailability zzf(String str);

    void zzg(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzm zzmVar);

    void zzh(LocationSettingsRequest locationSettingsRequest, zzs zzsVar, String str);

    void zzi(zzk zzkVar);

    @Deprecated
    void zzj(LastLocationRequest lastLocationRequest, zzq zzqVar);

    void zzk(zzdb zzdbVar, LocationRequest locationRequest, InterfaceC36652k interfaceC36652k);

    void zzl(PendingIntent pendingIntent, InterfaceC36652k interfaceC36652k);

    void zzm(PendingIntent pendingIntent);

    void zzn(PendingIntent pendingIntent, zzm zzmVar, String str);

    void zzo(String[] strArr, zzm zzmVar, String str);

    void zzp(PendingIntent pendingIntent, InterfaceC36652k interfaceC36652k);

    void zzq(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, InterfaceC36652k interfaceC36652k);

    void zzr(long j12, boolean z12, PendingIntent pendingIntent);

    void zzs(com.google.android.gms.location.zzb zzbVar, PendingIntent pendingIntent, InterfaceC36652k interfaceC36652k);

    void zzt(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, InterfaceC36652k interfaceC36652k);

    @Deprecated
    void zzu(Location location);

    void zzv(Location location, InterfaceC36652k interfaceC36652k);

    @Deprecated
    void zzw(boolean z12);

    void zzx(boolean z12, InterfaceC36652k interfaceC36652k);

    void zzy(zzdb zzdbVar, InterfaceC36652k interfaceC36652k);

    @Deprecated
    void zzz(zzdf zzdfVar);
}
