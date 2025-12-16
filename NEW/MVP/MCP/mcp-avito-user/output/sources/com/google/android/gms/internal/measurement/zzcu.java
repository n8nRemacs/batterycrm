package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public interface zzcu extends IInterface {
    void beginAdUnitExposure(String str, long j12);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j12);

    void endAdUnitExposure(String str, long j12);

    void generateEventId(zzcv zzcvVar);

    void getAppInstanceId(zzcv zzcvVar);

    void getCachedAppInstanceId(zzcv zzcvVar);

    void getConditionalUserProperties(String str, String str2, zzcv zzcvVar);

    void getCurrentScreenClass(zzcv zzcvVar);

    void getCurrentScreenName(zzcv zzcvVar);

    void getGmpAppId(zzcv zzcvVar);

    void getMaxUserProperties(String str, zzcv zzcvVar);

    void getSessionId(zzcv zzcvVar);

    void getTestFlag(zzcv zzcvVar, int i12);

    void getUserProperties(String str, String str2, boolean z12, zzcv zzcvVar);

    void initForTests(Map map);

    void initialize(d dVar, zzdd zzddVar, long j12);

    void isDataCollectionEnabled(zzcv zzcvVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z12, boolean z13, long j12);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j12);

    void logHealthData(int i12, String str, d dVar, d dVar2, d dVar3);

    void onActivityCreated(d dVar, Bundle bundle, long j12);

    void onActivityDestroyed(d dVar, long j12);

    void onActivityPaused(d dVar, long j12);

    void onActivityResumed(d dVar, long j12);

    void onActivitySaveInstanceState(d dVar, zzcv zzcvVar, long j12);

    void onActivityStarted(d dVar, long j12);

    void onActivityStopped(d dVar, long j12);

    void performAction(Bundle bundle, zzcv zzcvVar, long j12);

    void registerOnMeasurementEventListener(zzda zzdaVar);

    void resetAnalyticsData(long j12);

    void setConditionalUserProperty(Bundle bundle, long j12);

    void setConsent(Bundle bundle, long j12);

    void setConsentThirdParty(Bundle bundle, long j12);

    void setCurrentScreen(d dVar, String str, String str2, long j12);

    void setDataCollectionEnabled(boolean z12);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzdaVar);

    void setInstanceIdProvider(zzdb zzdbVar);

    void setMeasurementEnabled(boolean z12, long j12);

    void setMinimumSessionDuration(long j12);

    void setSessionTimeoutDuration(long j12);

    void setUserId(String str, long j12);

    void setUserProperty(String str, String str2, d dVar, boolean z12, long j12);

    void unregisterOnMeasurementEventListener(zzda zzdaVar);
}
