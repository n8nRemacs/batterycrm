package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class HianalyticsBaseData {
    public static final String EVENT_ID = "url_request";
    public static final String SDK_NAME = "sdk_name";
    public static final String SDK_TYPE = "sdk_type";
    public static final String SDK_VERSION = "sdk_version";

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<String, String> f363474a;

    public HianalyticsBaseData() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        this.f363474a = linkedHashMap;
        linkedHashMap.put(SDK_TYPE, "UxPP");
        linkedHashMap.put(SDK_NAME, "networkkit");
    }

    public LinkedHashMap<String, String> get() {
        return this.f363474a;
    }

    public HianalyticsBaseData put(String str, String str2) {
        if (str == null || str2 == null) {
            Logger.v("HianalyticsBaseData", "key = " + str + " : value = " + str2);
        } else {
            this.f363474a.put(str, str2);
        }
        return this;
    }

    public HianalyticsBaseData putIfNotDefault(String str, long j12, long j13) {
        return j12 == j13 ? this : put(str, j12);
    }

    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : get().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e12) {
            Logger.w("HianalyticsBaseData", "catch JSONException", e12);
        }
        return jSONObject.toString();
    }

    public HianalyticsBaseData put(String str, long j12) {
        if (str == null) {
            Logger.v("HianalyticsBaseData", "key = null : value = " + j12);
        } else {
            this.f363474a.put(str, "" + j12);
        }
        return this;
    }

    public HianalyticsBaseData put(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            this.f363474a.putAll(linkedHashMap);
        } else {
            Logger.v("HianalyticsBaseData", "data is null");
        }
        return this;
    }
}
