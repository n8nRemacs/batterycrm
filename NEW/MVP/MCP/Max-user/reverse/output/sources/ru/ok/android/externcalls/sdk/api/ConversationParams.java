package ru.ok.android.externcalls.sdk.api;

import android.util.Base64;
import defpackage.df3;
import defpackage.ho7;
import defpackage.ox7;
import defpackage.q4j;
import defpackage.xx7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.rate.Question;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.util.compressor.LZ4;

/* loaded from: classes2.dex */
public class ConversationParams {
    private static final String LOG_TAG = "ConversationParams";
    public static final ox7 PARSER = new df3(14);
    public String clientType;
    public int deviceIndex;
    public String endpoint;
    public String id;
    public boolean isP2PForbidden;
    public Integer ispAsNo;
    public String ispAsOrg;
    public String locCc;
    public String locReg;
    public RateCallData rateCallData;
    public List<PeerConnection.IceServer> stunTurnServers = new ArrayList();
    public String token;
    public String wtEndpoint;

    public static ConversationParams decode(String str) {
        int i;
        try {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length >= 2 && (i = Integer.parseInt(strArrSplit[0])) > 0) {
                byte[] bArr = new byte[i];
                if (LZ4.a(Base64.decode(strArrSplit[1], 0), bArr) != i) {
                    return null;
                }
                return parseCallParamsCompact(new JSONObject(new String(bArr)));
            }
            return null;
        } catch (Throwable th) {
            throw new RuntimeException("Error decode conversation params", th);
        }
    }

    public static ConversationParams parseCallParams(JSONObject jSONObject) throws JSONException {
        try {
            ConversationParams conversationParams = new ConversationParams();
            conversationParams.token = jSONObject.getString(ApiProtocol.KEY_TOKEN);
            conversationParams.deviceIndex = jSONObject.optInt(ApiProtocol.KEY_DEVICE_IDX, 0);
            conversationParams.clientType = jSONObject.optString(ApiProtocol.KEY_CLIENT_TYPE);
            conversationParams.rateCallData = parseRateCallData(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ApiProtocol.KEY_TURN_SERVER);
            if (jSONObjectOptJSONObject == null) {
                GlobalRTCLogger.logException(LOG_TAG, "null turn", new NullPointerException("null turn"));
            } else {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("urls");
                String strOptString = jSONObjectOptJSONObject.optString("username", null);
                String strOptString2 = jSONObjectOptJSONObject.optString("credential", null);
                if (jSONArrayOptJSONArray != null && strOptString != null && strOptString2 != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(jSONArrayOptJSONArray.getString(i)).setUsername(strOptString).setPassword(strOptString2).createIceServer());
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(ApiProtocol.KEY_STUN_SERVER);
            if (jSONObjectOptJSONObject2 == null) {
                GlobalRTCLogger.logException(LOG_TAG, "null stun", new NullPointerException("null stun"));
            } else {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(jSONArrayOptJSONArray2.getString(i2)).createIceServer());
                    }
                }
            }
            conversationParams.endpoint = jSONObject.optString(ApiProtocol.KEY_ENDPOINT);
            conversationParams.wtEndpoint = jSONObject.optString(ApiProtocol.KEY_WT_ENDPOINT, null);
            if (jSONObject.has("isp_as_no")) {
                conversationParams.ispAsNo = Integer.valueOf(jSONObject.optInt("isp_as_no"));
            }
            conversationParams.ispAsOrg = jSONObject.optString("isp_as_org");
            conversationParams.locCc = jSONObject.optString("loc_cc");
            conversationParams.locReg = jSONObject.optString("loc_reg");
            return conversationParams;
        } catch (JSONException e) {
            GlobalRTCLogger.logException(LOG_TAG, "json exception", e);
            return null;
        }
    }

    private static ConversationParams parseCallParamsCompact(JSONObject jSONObject) {
        ConversationParams conversationParams = new ConversationParams();
        try {
            conversationParams.token = jSONObject.getString("tkn");
            conversationParams.clientType = jSONObject.optString("srcp");
            String strOptString = jSONObject.optString("trne", null);
            String strOptString2 = jSONObject.optString("trnu", null);
            String strOptString3 = jSONObject.optString("trnp", null);
            if (strOptString != null && !strOptString.isEmpty() && strOptString2 != null && strOptString3 != null) {
                for (String str : strOptString.split(",")) {
                    if (!str.isEmpty()) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(str).setUsername(strOptString2).setPassword(strOptString3).createIceServer());
                    }
                }
            }
            String strOptString4 = jSONObject.optString("stne", null);
            if (strOptString4 != null && !strOptString4.isEmpty()) {
                for (String str2 : strOptString4.split(",")) {
                    if (!str2.isEmpty()) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(str2).createIceServer());
                    }
                }
            }
            conversationParams.endpoint = jSONObject.optString("wse");
            conversationParams.wtEndpoint = jSONObject.optString("wte", null);
            return conversationParams;
        } catch (JSONException e) {
            throw new RuntimeException("No token provided", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static RateCallData parseRateCallData(JSONObject jSONObject) throws JSONException {
        ?? arrayList;
        int iOptInt = jSONObject.optInt("max_rate_for_question", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("questions");
        if (jSONArrayOptJSONArray != null) {
            arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                arrayList.add(new Question(jSONObject2.getInt("id"), jSONObject2.getString("text")));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return new RateCallData(iOptInt, arrayList);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationParams{endpoint='");
        sb.append(this.endpoint);
        sb.append("', token='");
        sb.append(this.token);
        sb.append("', rateCallData=");
        sb.append(this.rateCallData);
        sb.append(", deviceIndex=");
        sb.append(this.deviceIndex);
        sb.append(", stunTurnServers=");
        sb.append(this.stunTurnServers);
        sb.append(", ispAsNo=");
        sb.append(this.ispAsNo);
        sb.append(", ispAsOrg='");
        sb.append(this.ispAsOrg);
        sb.append("', locCc='");
        sb.append(this.locCc);
        sb.append("', locReg='");
        return ho7.l(sb, this.locReg, "'}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConversationParams parseCallParams(xx7 xx7Var) throws JsonTypeMismatchException, IOException {
        return parseCallParams(q4j.b(xx7Var));
    }
}
