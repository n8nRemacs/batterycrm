package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.C36898i3;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.InterfaceC36871e4;
import com.google.android.gms.measurement.internal.InterfaceC36933n3;
import com.google.android.gms.measurement.internal.InterfaceC36940o3;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import j.N;
import j.a0;
import j.c0;
import j.k0;
import j.l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@RX0.a
@InterfaceC36733z
@Deprecated
/* loaded from: classes6.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f354498b;

    /* renamed from: a, reason: collision with root package name */
    public final c f354499a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    @RX0.a
    @InterfaceC36733z
    public static class ConditionalUserProperty {

        @RX0.a
        @Keep
        @InterfaceC36733z
        public boolean mActive;

        @N
        @Keep
        @RX0.a
        @InterfaceC36733z
        public String mAppId;

        @RX0.a
        @Keep
        @InterfaceC36733z
        public long mCreationTimestamp;

        @N
        @Keep
        public String mExpiredEventName;

        @N
        @Keep
        public Bundle mExpiredEventParams;

        @N
        @Keep
        @RX0.a
        @InterfaceC36733z
        public String mName;

        @N
        @Keep
        @RX0.a
        @InterfaceC36733z
        public String mOrigin;

        @RX0.a
        @Keep
        @InterfaceC36733z
        public long mTimeToLive;

        @N
        @Keep
        public String mTimedOutEventName;

        @N
        @Keep
        public Bundle mTimedOutEventParams;

        @N
        @Keep
        @RX0.a
        @InterfaceC36733z
        public String mTriggerEventName;

        @RX0.a
        @Keep
        @InterfaceC36733z
        public long mTriggerTimeout;

        @N
        @Keep
        public String mTriggeredEventName;

        @N
        @Keep
        public Bundle mTriggeredEventParams;

        @RX0.a
        @Keep
        @InterfaceC36733z
        public long mTriggeredTimestamp;

        @N
        @Keep
        @RX0.a
        @InterfaceC36733z
        public Object mValue;

        @RX0.a
        public ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    @RX0.a
    @InterfaceC36733z
    public interface a extends InterfaceC36940o3 {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    @RX0.a
    @InterfaceC36733z
    public interface b extends InterfaceC36933n3 {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    public static abstract class c implements InterfaceC36871e4 {
        public c() {
        }
    }

    public AppMeasurement(I2 i22) {
        this.f354499a = new com.google.android.gms.measurement.b(i22);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @N
    @Keep
    @Deprecated
    @RX0.a
    @InterfaceC36733z
    @a0
    public static AppMeasurement getInstance(@N Context context) {
        if (f354498b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f354498b == null) {
                        InterfaceC36871e4 interfaceC36871e4 = (InterfaceC36871e4) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (interfaceC36871e4 != null) {
                            f354498b = new AppMeasurement(interfaceC36871e4);
                        } else {
                            f354498b = new AppMeasurement(I2.a(context, new zzdd(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f354498b;
    }

    @Keep
    public void beginAdUnitExposure(@N @c0 String str) {
        this.f354499a.zzb(str);
    }

    @RX0.a
    @Keep
    @InterfaceC36733z
    public void clearConditionalUserProperty(@N @c0 String str, @N String str2, @N Bundle bundle) {
        this.f354499a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@N @c0 String str) {
        this.f354499a.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.f354499a.zza();
    }

    @N
    @Keep
    public String getAppInstanceId() {
        return this.f354499a.zzf();
    }

    @N
    @Keep
    @l0
    @RX0.a
    @InterfaceC36733z
    public List<ConditionalUserProperty> getConditionalUserProperties(@N String str, @N @c0 String str2) {
        List<Bundle> listB = this.f354499a.b(str, str2);
        ArrayList arrayList = new ArrayList(listB == null ? 0 : listB.size());
        for (Bundle bundle : listB) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            C36729v.j(bundle);
            conditionalUserProperty.mAppId = (String) C36898i3.a(bundle, HiAnalyticsConstant.BI_KEY_APP_ID, String.class, null);
            conditionalUserProperty.mOrigin = (String) C36898i3.a(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) C36898i3.a(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = C36898i3.a(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) C36898i3.a(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) C36898i3.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) C36898i3.a(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) C36898i3.a(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) C36898i3.a(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) C36898i3.a(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) C36898i3.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) C36898i3.a(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) C36898i3.a(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) C36898i3.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) C36898i3.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) C36898i3.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @N
    @Keep
    public String getCurrentScreenClass() {
        return this.f354499a.zzg();
    }

    @N
    @Keep
    public String getCurrentScreenName() {
        return this.f354499a.zzh();
    }

    @N
    @Keep
    public String getGmpAppId() {
        return this.f354499a.zzi();
    }

    @Keep
    @l0
    @RX0.a
    @InterfaceC36733z
    public int getMaxUserProperties(@N @c0 String str) {
        return this.f354499a.zza(str);
    }

    @N
    @k0
    @Keep
    @l0
    public Map<String, Object> getUserProperties(@N String str, @N @c0 String str2, boolean z12) {
        return this.f354499a.d(str, str2, z12);
    }

    @Keep
    @InterfaceC36733z
    public void logEventInternal(@N String str, @N String str2, @N Bundle bundle) {
        this.f354499a.c(str, str2, bundle);
    }

    @RX0.a
    @Keep
    @InterfaceC36733z
    public void setConditionalUserProperty(@N ConditionalUserProperty conditionalUserProperty) {
        C36729v.j(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C36898i3.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f354499a.zza(bundle);
    }

    public AppMeasurement(InterfaceC36871e4 interfaceC36871e4) {
        this.f354499a = new d(interfaceC36871e4);
    }
}
