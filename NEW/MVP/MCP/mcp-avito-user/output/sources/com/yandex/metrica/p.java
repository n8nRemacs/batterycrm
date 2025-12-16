package com.yandex.metrica;

import android.content.Context;
import com.yandex.metrica.impl.ob.L2;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f382464a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url");

    public interface Ucc {
        void onError(@N String str);

        void onResult(@N JSONObject jSONObject);
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, @N List<String> list) {
        L2.a(context, iIdentifierCallback, new ArrayList(list));
    }

    @N
    @Deprecated
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String str) {
        return L2.a(yandexMetricaConfig, str);
    }

    @N
    public static String gcni(@N Context context) {
        return L2.a(context);
    }

    @P
    public static String gdid(@N Context context) {
        return L2.b(context);
    }

    @N
    public static String gmsvn(int i12) {
        return L2.a(i12);
    }

    public static void guc(@N Ucc ucc, boolean z12) {
        L2.a(ucc, z12);
    }

    @P
    public static String guid(@N Context context) {
        return L2.d(context);
    }

    @Deprecated(since = "Use ModulesFacade.isActivatedForApp")
    public static boolean iifa() {
        return ModulesFacade.isActivatedForApp();
    }

    @N
    public static String mpn(Context context) {
        return L2.c(context);
    }

    @P
    public static String pgai() {
        try {
            return L2.a().get();
        } catch (Throwable unused) {
            return null;
        }
    }

    @P
    public static Boolean plat() {
        try {
            return L2.b().get();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Deprecated(since = "Use ModulesFacade.reportEvent")
    public static void rce(int i12, String str, String str2, Map<String, String> map) {
        ModulesFacade.reportEvent(i12, str, str2, map);
    }

    public static void rlse(@N Context context, @P Map<String, Object> map) {
        L2.a(context, map);
    }

    @Deprecated(since = "Use ModulesFacade.sendEventsBuffer")
    public static void seb() {
        ModulesFacade.sendEventsBuffer();
    }

    @Deprecated(since = "Will be removed in next major release")
    public static void slte(Context context, boolean z12) {
        L2.a(context, z12);
    }

    @N
    public static String u(@N String str) {
        return L2.a(str);
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, @N String... strArr) {
        a(context, iIdentifierCallback, (List<String>) Arrays.asList(strArr));
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback) {
        a(context, iIdentifierCallback, f382464a);
    }
}
