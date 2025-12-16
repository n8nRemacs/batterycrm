package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzcw extends zzbu implements zzcu {
    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void beginAdUnitExposure(String str, long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeLong(j12);
        g4(parcelE4, 23);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, bundle);
        g4(parcelE4, 9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void clearMeasurementEnabled(long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeLong(j12);
        g4(parcelE4, 43);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void endAdUnitExposure(String str, long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeLong(j12);
        g4(parcelE4, 24);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void generateEventId(zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 22);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getAppInstanceId(zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 20);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCachedAppInstanceId(zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 19);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getConditionalUserProperties(String str, String str2, zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenClass(zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 17);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenName(zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getGmpAppId(zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 21);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getMaxUserProperties(String str, zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getSessionId(zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 46);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getTestFlag(zzcv zzcvVar, int i12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        parcelE4.writeInt(i12);
        g4(parcelE4, 38);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getUserProperties(String str, String str2, boolean z12, zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, z12);
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void initForTests(Map map) {
        Parcel parcelE4 = e4();
        parcelE4.writeMap(map);
        g4(parcelE4, 37);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void initialize(d dVar, zzdd zzddVar, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        zzbw.zza(parcelE4, zzddVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void isDataCollectionEnabled(zzcv zzcvVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzcvVar);
        g4(parcelE4, 40);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logEvent(String str, String str2, Bundle bundle, boolean z12, boolean z13, long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, bundle);
        zzbw.zza(parcelE4, z12);
        zzbw.zza(parcelE4, z13);
        parcelE4.writeLong(j12);
        g4(parcelE4, 2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, bundle);
        zzbw.zza(parcelE4, zzcvVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logHealthData(int i12, String str, d dVar, d dVar2, d dVar3) {
        Parcel parcelE4 = e4();
        parcelE4.writeInt(i12);
        parcelE4.writeString(str);
        zzbw.zza(parcelE4, dVar);
        zzbw.zza(parcelE4, dVar2);
        zzbw.zza(parcelE4, dVar3);
        g4(parcelE4, 33);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityCreated(d dVar, Bundle bundle, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        zzbw.zza(parcelE4, bundle);
        parcelE4.writeLong(j12);
        g4(parcelE4, 27);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityDestroyed(d dVar, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 28);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityPaused(d dVar, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 29);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityResumed(d dVar, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 30);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivitySaveInstanceState(d dVar, zzcv zzcvVar, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        zzbw.zza(parcelE4, zzcvVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStarted(d dVar, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStopped(d dVar, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 26);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void performAction(Bundle bundle, zzcv zzcvVar, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, bundle);
        zzbw.zza(parcelE4, zzcvVar);
        parcelE4.writeLong(j12);
        g4(parcelE4, 32);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void registerOnMeasurementEventListener(zzda zzdaVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzdaVar);
        g4(parcelE4, 35);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void resetAnalyticsData(long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeLong(j12);
        g4(parcelE4, 12);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConditionalUserProperty(Bundle bundle, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, bundle);
        parcelE4.writeLong(j12);
        g4(parcelE4, 8);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConsent(Bundle bundle, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, bundle);
        parcelE4.writeLong(j12);
        g4(parcelE4, 44);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConsentThirdParty(Bundle bundle, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, bundle);
        parcelE4.writeLong(j12);
        g4(parcelE4, 45);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setCurrentScreen(d dVar, String str, String str2, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, dVar);
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        parcelE4.writeLong(j12);
        g4(parcelE4, 15);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setDataCollectionEnabled(boolean z12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, z12);
        g4(parcelE4, 39);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, bundle);
        g4(parcelE4, 42);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setEventInterceptor(zzda zzdaVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzdaVar);
        g4(parcelE4, 34);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setInstanceIdProvider(zzdb zzdbVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzdbVar);
        g4(parcelE4, 18);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setMeasurementEnabled(boolean z12, long j12) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, z12);
        parcelE4.writeLong(j12);
        g4(parcelE4, 11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setMinimumSessionDuration(long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeLong(j12);
        g4(parcelE4, 13);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setSessionTimeoutDuration(long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeLong(j12);
        g4(parcelE4, 14);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setUserId(String str, long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeLong(j12);
        g4(parcelE4, 7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setUserProperty(String str, String str2, d dVar, boolean z12, long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, dVar);
        zzbw.zza(parcelE4, z12);
        parcelE4.writeLong(j12);
        g4(parcelE4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzdaVar);
        g4(parcelE4, 36);
    }
}
