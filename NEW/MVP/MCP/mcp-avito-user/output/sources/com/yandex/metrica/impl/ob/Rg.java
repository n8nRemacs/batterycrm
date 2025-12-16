package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.metrica.impl.ob.C39185v3;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Rg implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Kg f379323a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC38927kd f379324b;

    public Rg(@j.N Kg kg2, @j.N InterfaceC38927kd interfaceC38927kd) {
        this.f379323a = kg2;
        this.f379324b = interfaceC38927kd;
    }

    private void a(@j.N Uri.Builder builder, @j.N C39169ub c39169ub, @j.N String str) {
        if (c39169ub.a()) {
            builder.appendQueryParameter(this.f379323a.a(str), c39169ub.f381928a.f381872b);
        } else {
            builder.appendQueryParameter(this.f379323a.a(str), "");
        }
    }

    @Override // com.yandex.metrica.networktasks.api.IParamsAppender
    public void appendParams(@j.N Uri.Builder builder, @j.N Object obj) {
        int i12;
        C38756dg c38756dgA;
        Mg mg2 = (Mg) obj;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f379323a.a("deviceid"), mg2.g());
        C39112s2 c39112s2U = F0.g().u();
        C39289zb c39289zbA = mg2.a();
        if (c39112s2U.c()) {
            builder.appendQueryParameter(this.f379323a.a("adv_id"), "");
            builder.appendQueryParameter(this.f379323a.a("oaid"), "");
            builder.appendQueryParameter(this.f379323a.a("yandex_adv_id"), "");
        } else {
            a(builder, c39289zbA.a(), "adv_id");
            a(builder, c39289zbA.b(), "oaid");
            a(builder, c39289zbA.c(), "yandex_adv_id");
        }
        builder.appendQueryParameter(this.f379323a.a("app_set_id"), mg2.d());
        builder.appendQueryParameter(this.f379323a.a("app_set_id_scope"), mg2.e());
        builder.appendQueryParameter(this.f379323a.a("app_platform"), "android");
        builder.appendQueryParameter(this.f379323a.a("protocol_version"), "2");
        builder.appendQueryParameter(this.f379323a.a("analytics_sdk_version_name"), "5.3.0");
        builder.appendQueryParameter(this.f379323a.a("model"), mg2.m());
        builder.appendQueryParameter(this.f379323a.a("manufacturer"), mg2.l());
        builder.appendQueryParameter(this.f379323a.a("os_version"), mg2.o());
        builder.appendQueryParameter(this.f379323a.a("screen_width"), String.valueOf(mg2.u()));
        builder.appendQueryParameter(this.f379323a.a("screen_height"), String.valueOf(mg2.t()));
        builder.appendQueryParameter(this.f379323a.a("screen_dpi"), String.valueOf(mg2.s()));
        builder.appendQueryParameter(this.f379323a.a("scalefactor"), String.valueOf(mg2.r()));
        builder.appendQueryParameter(this.f379323a.a("locale"), mg2.k());
        builder.appendQueryParameter(this.f379323a.a("device_type"), mg2.i());
        builder.appendQueryParameter(this.f379323a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("query_hosts"), String.valueOf(2));
        String strA = this.f379323a.a("features");
        List<String> listB = this.f379324b.b();
        String[] strArr = {this.f379323a.a("easy_collecting"), this.f379323a.a("egress"), this.f379323a.a("package_info"), this.f379323a.a("socket"), this.f379323a.a("permissions_collecting"), this.f379323a.a("features_collecting"), this.f379323a.a("location_collecting"), this.f379323a.a("lbs_collecting"), this.f379323a.a("google_aid"), this.f379323a.a("huawei_oaid"), this.f379323a.a("throttling"), this.f379323a.a("wifi_around"), this.f379323a.a("wifi_connected"), this.f379323a.a("cells_around"), this.f379323a.a("sim_info"), this.f379323a.a("sdk_list"), this.f379323a.a("identity_light_collecting"), this.f379323a.a("gpl_collecting"), this.f379323a.a("ui_parsing"), this.f379323a.a("ui_collecting_for_bridge"), this.f379323a.a("ui_event_sending"), this.f379323a.a("ui_raw_event_sending"), this.f379323a.a("cell_additional_info"), this.f379323a.a("cell_additional_info_connected_only"), this.f379323a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listB);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strA, TextUtils.join(",", (String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f379323a.a("socket"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a(HiAnalyticsConstant.BI_KEY_APP_ID), mg2.p());
        builder.appendQueryParameter(this.f379323a.a("location_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("app_debuggable"), mg2.z());
        builder.appendQueryParameter(this.f379323a.a("sdk_list"), String.valueOf(1));
        if (mg2.L()) {
            String strD = mg2.D();
            if (!TextUtils.isEmpty(strD)) {
                builder.appendQueryParameter(this.f379323a.a("country_init"), strD);
            }
            i12 = 1;
        } else {
            i12 = 1;
            builder.appendQueryParameter(this.f379323a.a("detect_locale"), String.valueOf(1));
        }
        C39185v3.a aVarB = mg2.B();
        if (!A2.b(aVarB.b())) {
            builder.appendQueryParameter(this.f379323a.a("distribution_customization"), String.valueOf(i12));
            builder.appendQueryParameter(this.f379323a.a("clids_set"), Tl.c(aVarB.b()));
            int iOrdinal = aVarB.a().ordinal();
            builder.appendQueryParameter(this.f379323a.a("clids_set_source"), iOrdinal != i12 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String strE = mg2.E();
            String strF = mg2.F();
            if (TextUtils.isEmpty(strE) && (c38756dgA = mg2.H().a()) != null) {
                strE = c38756dgA.f380375a;
                strF = c38756dgA.f380378d.f380383a;
            }
            if (!TextUtils.isEmpty(strE)) {
                builder.appendQueryParameter(this.f379323a.a(Constants.INSTALL_REFERRER), strE);
                if (strF == null) {
                    strF = "null";
                }
                builder.appendQueryParameter(this.f379323a.a("install_referrer_source"), strF);
            }
        }
        String strW = mg2.w();
        if (!TextUtils.isEmpty(strW)) {
            builder.appendQueryParameter(this.f379323a.a("uuid"), strW);
        }
        builder.appendQueryParameter(this.f379323a.a(CrashHianalyticsData.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("requests"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("permissions"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("identity_light_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("ui_parsing"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("ui_collecting_for_bridge"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("ui_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("ui_raw_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("throttling"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("mediascope_api_keys"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("diagnostics"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("app_system_flag"), mg2.A());
        builder.appendQueryParameter(this.f379323a.a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("easy_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("egress"), String.valueOf(1));
        builder.appendQueryParameter(this.f379323a.a("startup_update"), String.valueOf(1));
        Map<String, Integer> mapA = this.f379324b.a();
        for (String str : mapA.keySet()) {
            builder.appendQueryParameter(str, String.valueOf(mapA.get(str)));
        }
    }
}
