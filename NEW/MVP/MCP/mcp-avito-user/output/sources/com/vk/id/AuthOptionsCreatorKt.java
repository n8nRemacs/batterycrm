package com.vk.id;

import android.util.Base64;
import java.io.IOException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthOptionsCreator.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/json/JSONObject;", "", "", "scopes", "Lkotlin/G0;", "addOAuthParams", "(Lorg/json/JSONObject;Ljava/util/Set;)V", "Lcom/vk/id/StatParams;", "statParams", "createStatsInfo", "(Lcom/vk/id/StatParams;)Lorg/json/JSONObject;", "statsInfo", "addStatParams", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "toBase64", "(Lorg/json/JSONObject;)Ljava/lang/String;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthOptionsCreatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOAuthParams(JSONObject jSONObject, Set<String> set) throws JSONException {
        jSONObject.put("scope", C42745f0.O(set, " ", null, null, null, 62));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addStatParams(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        jSONObject.put("stats_info", jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject createStatsInfo(StatParams statParams) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (statParams != null) {
            jSONObject.put("flow_source", statParams.getFlowSource());
            jSONObject.put("session_id", statParams.getSessionId());
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toBase64(JSONObject jSONObject) throws IOException {
        String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(C43047d.f410589b), 0);
        StringBuilder sb2 = new StringBuilder();
        int length = strEncodeToString.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = strEncodeToString.charAt(i12);
            if (cCharAt != '\n') {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
