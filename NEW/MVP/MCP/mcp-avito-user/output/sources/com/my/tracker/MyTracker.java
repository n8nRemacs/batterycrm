package com.my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.e2;
import com.my.tracker.obfuscated.f2;
import com.my.tracker.obfuscated.g2;
import com.my.tracker.obfuscated.p0;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class MyTracker {
    public static final String VERSION = "3.2.0";

    /* renamed from: a, reason: collision with root package name */
    private static final List<MyTrackerPluginConfig> f365233a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private static volatile p0 f365234b;

    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    public interface FlushListener {
        void onResult(boolean z12);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final f2 f365235a;

        /* renamed from: b, reason: collision with root package name */
        static final MyTrackerParams f365236b;

        /* renamed from: c, reason: collision with root package name */
        static final MyTrackerConfig f365237c;

        static {
            f2 f2VarU = f2.u();
            f365235a = f2VarU;
            f365237c = MyTrackerConfig.newConfig(f2VarU);
            f365236b = f2VarU.j();
        }
    }

    private MyTracker() {
    }

    private static void a(int i12, boolean z12) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(i12, z12);
        }
    }

    public static void applyPlugin(MyTrackerPluginConfig myTrackerPluginConfig) {
        f365233a.add(myTrackerPluginConfig);
    }

    public static void flush() {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a();
        }
    }

    public static String getInstanceId(Context context) {
        return g2.a(context);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return a.f365237c;
    }

    public static MyTrackerParams getTrackerParams() {
        return a.f365236b;
    }

    public static String handleDeeplink(Intent intent) {
        p0 p0Var = f365234b;
        if (p0Var != null) {
            return p0Var.a(intent);
        }
        e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    public static void incrementEventTimeSpent(int i12) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(i12);
        }
    }

    public static void initTracker(String str, Application application) {
        if (TextUtils.isEmpty(str)) {
            e2.b("MyTracker initialization failed: id can't be empty");
            return;
        }
        if (f365234b != null) {
            e2.c("MyTracker has already been initialized");
            return;
        }
        synchronized (MyTracker.class) {
            try {
                if (f365234b != null) {
                    e2.c("MyTracker has already been initialized");
                    return;
                }
                f2 f2Var = a.f365235a;
                ArrayList arrayList = new ArrayList(f365233a);
                p0 p0VarA = p0.a(str, f2Var, application);
                p0VarA.a(arrayList);
                f365234b = p0VarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isDebugMode() {
        return e2.a();
    }

    public static void onActivityResult(int i12, Intent intent) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(i12, intent);
        }
    }

    public static void onPurchasesUpdated(int i12, List<Object> list) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(i12, list);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    public static void setDebugMode(boolean z12) {
        e2.a(z12);
    }

    public static void startAnytimeTimeSpent(int i12) {
        a(i12, true);
    }

    public static void startForegroundTimeSpent(int i12) {
        a(i12, false);
    }

    public static void stopAnytimeTimeSpent(int i12) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.b(i12, true);
        }
    }

    public static void stopForegroundTimeSpent(int i12) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.b(i12, false);
        }
    }

    public static void trackAdEvent(AdEvent adEvent) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(adEvent);
        }
    }

    public static void trackAppGalleryPurchaseEvent(Object obj, String str, String str2, String str3, Map<String, String> map) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(obj, str, str2, str3, map);
        }
    }

    public static void trackEvent(String str) {
        trackEvent(str, null);
    }

    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    public static void trackLaunchManually(Activity activity) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(activity);
        }
    }

    public static void trackLevelEvent() {
        trackLevelEvent(null);
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, null);
    }

    public static void trackMiniAppEvent(MiniAppEvent miniAppEvent) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(miniAppEvent);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, null);
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, null);
    }

    public static void flush(FlushListener flushListener) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(flushListener);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        a.f365235a.a(attributionListener, handler);
    }

    public static void trackEvent(String str, Map<String, String> map) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(str, map);
        }
    }

    public static void trackInviteEvent(Map<String, String> map) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(map);
        }
    }

    public static void trackLevelEvent(int i12, Map<String, String> map) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(i12, map);
        }
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(str, str2, map);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.a(jSONObject, jSONObject2, str, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.b(str, str2, map);
        }
    }

    public static void trackLevelEvent(Map<String, String> map) {
        p0 p0Var = f365234b;
        if (p0Var == null) {
            e2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            p0Var.b(map);
        }
    }
}
