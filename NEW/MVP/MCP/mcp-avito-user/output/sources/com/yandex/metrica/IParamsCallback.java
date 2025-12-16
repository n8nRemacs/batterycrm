package com.yandex.metrica;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.A2;
import j.N;
import j.P;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IParamsCallback {
    public static final String APP_METRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final String YANDEX_MOBILE_METRICA_CLIDS = "yandex_mobile_metrica_clids";
    public static final String YANDEX_MOBILE_METRICA_DEVICE_ID = "yandex_mobile_metrica_device_id";
    public static final String YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED = "yandex_mobile_metrica_lib_ssl_enabled";
    public static final String YANDEX_MOBILE_METRICA_GET_AD_URL = "yandex_mobile_metrica_get_ad_url";
    public static final String YANDEX_MOBILE_METRICA_REPORT_AD_URL = "yandex_mobile_metrica_report_ad_url";
    public static final String YANDEX_MOBILE_METRICA_UUID = "yandex_mobile_metrica_uuid";

    public enum Reason {
        UNKNOWN,
        NETWORK,
        INVALID_RESPONSE,
        INCONSISTENT_CLIDS
    }

    public static class Result {

        @P
        private final Map<String, String> clids;

        @P
        private final Map<String, List<String>> customSdkHosts;

        @P
        private final String deviceId;

        @P
        private final String deviceIdHash;

        @N
        private final FeaturesResult features;

        @P
        private final String getUrl;

        @P
        private final String reportUrl;

        @P
        private final String uuid;

        public Result(@P String str, @P String str2, @P String str3, @P String str4, @P String str5, @P Map<String, String> map, @P Map<String, List<String>> map2, @N FeaturesResult featuresResult) {
            this.deviceId = str;
            this.uuid = str2;
            this.reportUrl = str3;
            this.getUrl = str4;
            this.deviceIdHash = str5;
            this.clids = map;
            this.customSdkHosts = map2;
            this.features = featuresResult;
        }

        @P
        public Map<String, String> getClids() {
            return this.clids;
        }

        @P
        public Map<String, List<String>> getCustomSdkHosts() {
            return this.customSdkHosts;
        }

        @P
        public String getDeviceId() {
            return this.deviceId;
        }

        @P
        public String getDeviceIdHash() {
            return this.deviceIdHash;
        }

        @N
        public FeaturesResult getFeatures() {
            return this.features;
        }

        @P
        public String getGetUrl() {
            return this.getUrl;
        }

        @P
        public String getReportUrl() {
            return this.reportUrl;
        }

        @P
        public String getUuid() {
            return this.uuid;
        }

        public boolean hasClids() {
            return !A2.b(this.clids);
        }

        public boolean hasCustomSdkHosts() {
            return !A2.b(this.customSdkHosts);
        }

        public boolean hasDeviceId() {
            return !TextUtils.isEmpty(this.deviceId);
        }

        public boolean hasDeviceIdHash() {
            return !TextUtils.isEmpty(this.deviceIdHash);
        }

        public boolean hasGetUrl() {
            return !TextUtils.isEmpty(this.getUrl);
        }

        public boolean hasReportUrl() {
            return !TextUtils.isEmpty(this.reportUrl);
        }

        public boolean hasUuid() {
            return !TextUtils.isEmpty(this.uuid);
        }
    }

    void onReceive(Result result);

    void onRequestError(Reason reason, Result result);
}
