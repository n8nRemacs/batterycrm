package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.na, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38999na implements InterfaceC39120sa<YandexMetricaConfig> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC38712bm f381157a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39264ya f381158b;

    @j.k0
    public C38999na(@j.N InterfaceC38712bm interfaceC38712bm, @j.N C39264ya c39264ya) {
        this.f381157a = interfaceC38712bm;
        this.f381158b = c39264ya;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39120sa
    @j.N
    public JSONObject a(@j.P YandexMetricaConfig yandexMetricaConfig) {
        YandexMetricaConfig yandexMetricaConfig2 = yandexMetricaConfig;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (yandexMetricaConfig2 != null) {
                JSONObject jSONObjectPutOpt = jSONObject2.put("api_key", yandexMetricaConfig2.apiKey).putOpt("app_version", yandexMetricaConfig2.appVersion).putOpt("session_timeout", yandexMetricaConfig2.sessionTimeout).putOpt("crash_reporting", yandexMetricaConfig2.crashReporting).putOpt("native_crash_reporting", yandexMetricaConfig2.nativeCrashReporting).putOpt("location", a(yandexMetricaConfig2.location)).putOpt("location_tracking", yandexMetricaConfig2.locationTracking).putOpt("logs", yandexMetricaConfig2.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig2.preloadInfo;
                jSONObjectPutOpt.putOpt("preload_info", preloadInfo == null ? null : new JSONObject().putOpt("tracking_id", preloadInfo.getTrackingId()).putOpt("additional_parameters", Tl.f(preloadInfo.getAdditionalParams()))).putOpt("first_activation_as_update", yandexMetricaConfig2.firstActivationAsUpdate).putOpt("statistics_sending", yandexMetricaConfig2.statisticsSending).putOpt("max_reports_in_database_count", yandexMetricaConfig2.maxReportsInDatabaseCount).putOpt("error_environment", Tl.f(yandexMetricaConfig2.errorEnvironment)).putOpt("user_profile_id", yandexMetricaConfig2.userProfileID).putOpt("revenue_auto_tracking_enabled", yandexMetricaConfig2.revenueAutoTrackingEnabled).putOpt("sessions_auto_tracking_enabled", yandexMetricaConfig2.sessionsAutoTrackingEnabled).putOpt("app_open_tracking_enabled", yandexMetricaConfig2.appOpenTrackingEnabled);
                if (yandexMetricaConfig2 instanceof com.yandex.metrica.j) {
                    com.yandex.metrica.j jVar = (com.yandex.metrica.j) yandexMetricaConfig2;
                    JSONObject jSONObjectPutOpt2 = jSONObject2.putOpt("device_type", null).putOpt("clids", Tl.f(jVar.f382342a)).putOpt("distribution_referrer", null);
                    List<String> list = jVar.f382343b;
                    JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("custom_hosts", list == null ? null : list.isEmpty() ? new JSONArray() : Tl.b((List<?>) list)).putOpt("app_build_number", jVar.f382344c).putOpt("dispatch_period_seconds", jVar.f382345d).putOpt("max_reports_count", jVar.f382346e).putOpt("app_environment", Tl.f(jVar.f382347f)).putOpt("preload_info_auto_tracking", null).putOpt("permissions_collection", jVar.f382348g).putOpt("anr_monitoring", jVar.f382349h);
                    this.f381158b.getClass();
                    jSONObjectPutOpt3.putOpt("pulse_config", null).putOpt("rtm_config", null).put("crash_transformer_set", false);
                }
            }
            jSONObject.putOpt(Navigation.CONFIG, jSONObject2).putOpt("process_name", ((Xl) this.f381157a).b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @j.P
    private JSONObject a(@j.P Location location) {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt("provider", location.getProvider()).put("timestamp", location.getTime()).put("precision", location.getAccuracy()).put("altitude", location.getAltitude()).put(MessageBody.Location.LONGITUDE, location.getLongitude()).put("lat", location.getLatitude()).put("direction", location.getBearing()).put("speed", location.getSpeed());
    }
}
