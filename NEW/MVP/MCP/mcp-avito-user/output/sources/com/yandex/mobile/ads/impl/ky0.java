package com.yandex.mobile.ads.impl;

import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ky0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f387278a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Map<String, Object> f387279b;

    public interface a {
        @j.N
        Map<String, Object> a();
    }

    public enum b {
        f387301b("ad_loading_result"),
        f387302c("ad_rendering_result"),
        f387303d("adapter_auto_refresh"),
        f387304e("adapter_invalid"),
        f387305f("adapter_request"),
        f387306g("adapter_response"),
        f387307h("adapter_bidder_token_request"),
        f387308i("adtune"),
        f387309j("ad_request"),
        f387310k("ad_response"),
        f387311l("vast_request"),
        f387312m("vast_response"),
        f387313n("vast_wrapper_request"),
        f387314o("vast_wrapper_response"),
        f387315p("video_ad_start"),
        f387316q("video_ad_complete"),
        f387317r("video_ad_player_error"),
        f387318s("vmap_request"),
        f387319t("vmap_response"),
        f387320u("rendering_start"),
        f387321v("impression_tracking_start"),
        f387322w("impression_tracking_success"),
        f387323x("impression_tracking_failure"),
        f387324y("forced_impression_tracking_failure"),
        f387325z("adapter_action"),
        f387280A("click"),
        f387281B("close"),
        f387282C("feedback"),
        f387283D(Constants.DEEPLINK),
        f387284E("show_social_actions"),
        f387285F("bound_assets"),
        f387286G("rendered_assets"),
        f387287H("rebind"),
        f387288I("binding_failure"),
        f387289J("expected_view_missing"),
        f387290K("returned_to_app"),
        f387291L("reward"),
        /* JADX INFO: Fake field, exist only in values array */
        EF0("js_error"),
        f387292M("video_ad_rendering_result"),
        f387293N("multibanner_event"),
        f387294O("ad_view_size_info"),
        f387295P("ad_unit_impression_tracking_start"),
        f387296Q("ad_unit_impression_tracking_success"),
        f387297R("ad_unit_impression_tracking_failure"),
        f387298S("forced_ad_unit_impression_tracking_failure"),
        f387299T("log");


        /* renamed from: a, reason: collision with root package name */
        private final String f387326a;

        b(String str) {
            this.f387326a = str;
        }

        @j.N
        public final String a() {
            return this.f387326a;
        }
    }

    public enum c {
        f387327b("success"),
        f387328c("error"),
        f387329d("no_ads"),
        /* JADX INFO: Fake field, exist only in values array */
        EF43("filtered");


        /* renamed from: a, reason: collision with root package name */
        private final String f387331a;

        c(String str) {
            this.f387331a = str;
        }

        @j.N
        public final String a() {
            return this.f387331a;
        }
    }

    public ky0(b bVar, Map<String, Object> map) {
        this(bVar.a(), map);
    }

    @j.N
    public final Map<String, Object> a() {
        return this.f387279b;
    }

    @j.N
    public final String b() {
        return this.f387278a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ky0.class != obj.getClass()) {
            return false;
        }
        ky0 ky0Var = (ky0) obj;
        if (this.f387278a.equals(ky0Var.f387278a)) {
            return this.f387279b.equals(ky0Var.f387279b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f387279b.hashCode() + (this.f387278a.hashCode() * 31);
    }

    public ky0(@j.N String str, Map<String, Object> map) {
        map.put(HianalyticsBaseData.SDK_VERSION, "6.0.1");
        this.f387279b = map;
        this.f387278a = str;
    }
}
