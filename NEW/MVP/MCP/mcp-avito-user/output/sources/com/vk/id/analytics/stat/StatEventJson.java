package com.vk.id.analytics.stat;

import Y61.k;
import com.avito.android.publish.drafts.LocalPublishState;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.id.analytics.VKIDAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StatEventJson.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001b\u001a\u00020\u001a*\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/vk/id/analytics/stat/StatEventJson;", "", "", "name", "", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "params", "", "eventId", "prevEventId", "<init>", "(Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;II)V", "typeAction", "screen", "Lorg/json/JSONObject;", "data", "actionJson", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;II)Lorg/json/JSONObject;", "eventName", "", "eventParams", "", "topLevelParams", "eventJson", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lorg/json/JSONObject;", "techEventJson", "Lkotlin/G0;", "putFields", "(Lorg/json/JSONObject;Ljava/util/List;)V", "actionForEvent", "(Ljava/lang/String;)Ljava/lang/String;", "json", "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", "Companion", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StatEventJson {

    @k
    private static final Companion Companion = new Companion(null);

    @k
    private static final List<String> specialParams = C42745f0.U("screen_current", "screen_to", "error", "wrapper_sdk_type", HiAnalyticsConstant.BI_KEY_APP_ID, "external_device_id");

    @k
    private static final Set<String> techEvents = Collections.singleton("vkid_sdk_init");

    @k
    private final JSONObject json;

    /* compiled from: StatEventJson.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vk/id/analytics/stat/StatEventJson$Companion;", "", "<init>", "()V", "specialParams", "", "", "techEvents", "", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    public StatEventJson(@k String str, @k VKIDAnalytics.EventParam[] eventParamArr, int i12, int i13) {
        String str2;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = "nowhere";
        for (VKIDAnalytics.EventParam eventParam : eventParamArr) {
            String name = eventParam.getName();
            str2 = "";
            if (L.f(name, "screen")) {
                String strValue = eventParam.getStrValue();
                str3 = strValue != null ? strValue : "";
            } else if (specialParams.contains(name)) {
                String name2 = eventParam.getName();
                String strValue2 = eventParam.getStrValue();
                if (strValue2 == null) {
                    Integer intValue = eventParam.getIntValue();
                    if (intValue != null) {
                        str2 = intValue;
                    }
                } else {
                    str2 = strValue2;
                }
                linkedHashMap.put(name2, str2);
            } else {
                arrayList.add(eventParam);
            }
        }
        this.json = actionJson(actionForEvent(str), str3, techEvents.contains(str) ? techEventJson(str, arrayList, linkedHashMap) : eventJson(str, arrayList, linkedHashMap), i12, i13);
    }

    private final String actionForEvent(String name) {
        return techEvents.contains(name) ? "type_sak_sessions_event_item" : "type_registration_item";
    }

    private final JSONObject actionJson(String typeAction, String screen, JSONObject data, int eventId, int prevEventId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", eventId);
        jSONObject.put("prev_event_id", prevEventId);
        jSONObject.put("prev_nav_id", 0);
        jSONObject.put("screen", screen);
        jSONObject.put("timestamp", String.valueOf(System.currentTimeMillis()));
        jSONObject.put("type", "type_action");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", typeAction);
        jSONObject2.put(typeAction, data);
        G0 g02 = G0.f406611a;
        jSONObject.put("type_action", jSONObject2);
        return jSONObject;
    }

    private final JSONObject eventJson(String eventName, List<VKIDAnalytics.EventParam> eventParams, Map<String, ? extends Object> topLevelParams) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", eventName);
        putFields(jSONObject, eventParams);
        for (Map.Entry<String, ? extends Object> entry : topLevelParams.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    private final void putFields(JSONObject jSONObject, List<VKIDAnalytics.EventParam> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (VKIDAnalytics.EventParam eventParam : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", eventParam.getName());
            if (eventParam.getStrValue() != null) {
                jSONObject2.put("value", eventParam.getStrValue());
            } else if (eventParam.getIntValue() != null) {
                jSONObject2.put("value", eventParam.getIntValue().intValue());
            }
            jSONArray.put(jSONObject2);
        }
        G0 g02 = G0.f406611a;
        jSONObject.put(LocalPublishState.FIELDS, jSONArray);
    }

    private final JSONObject techEventJson(String eventName, List<VKIDAnalytics.EventParam> eventParams, Map<String, ? extends Object> topLevelParams) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("step", eventName);
        putFields(jSONObject, eventParams);
        for (Map.Entry<String, ? extends Object> entry : topLevelParams.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @k
    public final JSONObject getJson() {
        return this.json;
    }
}
