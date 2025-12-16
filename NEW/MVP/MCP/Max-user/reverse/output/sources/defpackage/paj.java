package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class paj {
    public static String A(h29 h29Var) {
        if (h29Var == null) {
            return null;
        }
        int i = p9i.a[h29Var.ordinal()];
        if (i == 1) {
            return "UNMUTE";
        }
        if (i == 2) {
            return "MUTE";
        }
        if (i == 3) {
            return "MUTE_PERMANENT";
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalArgumentException("Unknown media option state: " + h29Var);
    }

    public static Integer B(JSONObject jSONObject) {
        String strOptString;
        if (!jSONObject.has("capabilities") || (strOptString = jSONObject.optString("capabilities", null)) == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strOptString, 16));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static ArrayList C(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(i).getString("externalId"));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public static ArrayList D(JSONObject jSONObject, String str) {
        ti1 ti1VarA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                try {
                    ti1VarA = ti1.a(jSONArrayOptJSONArray.getString(i));
                } catch (Exception unused) {
                    ti1VarA = null;
                }
                if (ti1VarA != null) {
                    arrayList.add(ti1VarA);
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public static fje E(JSONObject jSONObject) {
        return (!jSONObject.has("roomId") || jSONObject.isNull("roomId")) ? dje.a : new eje(jSONObject.getInt("roomId"));
    }

    public static xi1 F(JSONObject jSONObject) {
        return new xi1(Boolean.valueOf(jSONObject.getBoolean("connected")));
    }

    public static xi1 G(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sessionState");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return new xi1(Boolean.valueOf(jSONObjectOptJSONObject.getBoolean("connected")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String H(jfe jfeVar) {
        String str;
        String str2;
        nt1 nt1Var = jfeVar.a;
        nt1 nt1Var2 = jfeVar.a;
        y2a y2aVar = nt1Var.c;
        if (y2aVar != null) {
            str = ":m" + y2aVar.a;
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nt1Var2.b.b());
        sb.append(":");
        int i = p9i.b[nt1Var2.a.ordinal()];
        if (i == 1) {
            str2 = "sCAMERA";
        } else if (i == 2) {
            str2 = "sSCREEN";
        } else if (i == 3) {
            str2 = "sMOVIE";
        } else if (i == 4) {
            str2 = "sSTREAM";
        } else {
            if (i != 5) {
                throw new RuntimeException("Unknown VideoTrackType");
            }
            str2 = "sANIMOJI";
        }
        return ho7.l(sb, str2, str);
    }

    public static HashSet I(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        j07 j07Var;
        if (!"hungup".equals(jSONObject.optString("notification")) || (jSONArrayOptJSONArray = jSONObject.optJSONArray("errors")) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            int iOptInt = jSONArrayOptJSONArray.optInt(i, Integer.MIN_VALUE);
            if (iOptInt != Integer.MIN_VALUE) {
                j07[] j07VarArrValues = j07.values();
                int length = j07VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        j07Var = null;
                        break;
                    }
                    j07Var = j07VarArrValues[i2];
                    j07Var.getClass();
                    if (iOptInt == 1) {
                        break;
                    }
                    i2++;
                }
                if (j07Var != null) {
                    hashSet.add(j07Var);
                }
            }
        }
        return hashSet;
    }

    public static nt1 J(String str) {
        String[] strArrSplit = str.split(":");
        cdh cdhVar = cdh.a;
        ti1 ti1VarA = null;
        y2a y2aVar = null;
        cdh cdhVar2 = cdhVar;
        for (String str2 : strArrSplit) {
            if (str2 != null) {
                if (str2.startsWith("u") || str2.startsWith("g")) {
                    try {
                        ti1VarA = ti1.a(str);
                    } catch (Exception unused) {
                        ti1VarA = null;
                    }
                }
                if (str2.startsWith("s")) {
                    switch (str2) {
                        case "sANIMOJI":
                            cdhVar2 = cdh.c;
                            break;
                        case "sMOVIE":
                            cdhVar2 = cdh.d;
                            break;
                        case "sCAMERA":
                            cdhVar2 = cdhVar;
                            break;
                        case "sSCREEN":
                            cdhVar2 = cdh.b;
                            break;
                        case "sSTREAM":
                            cdhVar2 = cdh.o;
                            break;
                        default:
                            throw new RuntimeException("Unknown video track type");
                    }
                }
                if (str2.startsWith("m")) {
                    y2aVar = new y2a(Long.parseLong(str2.substring(1)));
                }
            }
        }
        if (ti1VarA == null) {
            return null;
        }
        hc8 hc8Var = new hc8(5);
        hc8Var.b = ti1VarA;
        hc8Var.c = cdhVar2;
        hc8Var.d = y2aVar;
        return hc8Var.u();
    }

    public static ti1 K(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("video-") && str.length() != 6) {
            try {
                return ti1.a(str.substring(6));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static fr6 a(JSONObject jSONObject, Boolean bool, boolean z) throws JSONException {
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, jSONObject2.toString());
        }
        return b(jSONObject, "add-participant");
    }

    public static fr6 b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("command", str);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return new fr6(jSONObject2);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(ti1 ti1Var, JSONObject jSONObject, boolean z) {
        jSONObject.put("participantId", ti1Var.a);
        jSONObject.put("participantType", xc0.m(ti1Var.b));
        if (z) {
            jSONObject.put("deviceIdx", ti1Var.c);
        }
    }

    public static fr6 d(Collection collection, Boolean bool, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ti1 ti1Var = (ti1) it.next();
            jSONArray.put(String.valueOf(xc0.a(ti1Var.b)) + ti1Var.a);
        }
        jSONObject.put("participantIds", jSONArray);
        return a(jSONObject, bool, z);
    }

    public static fr6 e(Set set, Set set2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jSONObject.put(((i01) it.next()).name(), true);
                }
            }
            if (set2 != null) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    jSONObject.put(((i01) it2.next()).name(), false);
                }
            }
            fr6 fr6VarB = b(null, "change-options");
            fr6VarB.a.put("options", jSONObject);
            return fr6VarB;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static fr6 f(Map map, ti1 ti1Var) throws JSONException {
        try {
            fr6 fr6VarB = b(null, "change-participant-state");
            JSONObject jSONObject = fr6VarB.a;
            jSONObject.put("participantState", new JSONObject().put("state", new JSONObject(map)));
            if (ti1Var != null) {
                jSONObject.put("participantId", ti1Var.b());
            }
            return fr6VarB;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static fr6 g(ti1 ti1Var, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("participantId", ti1Var.a);
            jSONObject2.put("participantType", xc0.m(ti1Var.b));
            jSONObject2.put("deviceIdx", ti1Var.c);
            jSONObject2.put("data", jSONObject);
            return b(jSONObject2, "custom-data");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static o81 h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int iOptInt = jSONObject.optInt("deviceIdx", 0);
            if (jSONObject.has("decorativeExternalParticipantId")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("decorativeExternalParticipantId");
                if (jSONObject2 == null) {
                    return null;
                }
                String string = jSONObject2.getString("id");
                String lowerCase = jSONObject2.getString("type").toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return new o81(string, lowerCase.equals("anonym") ? 3 : !lowerCase.equals("vk") ? 1 : 2, iOptInt);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("externalId");
            if (jSONObject3 == null) {
                return null;
            }
            String string2 = jSONObject3.getString("id");
            String lowerCase2 = jSONObject3.getString("type").toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return new o81(string2, lowerCase2.equals("anonym") ? 3 : !lowerCase2.equals("vk") ? 1 : 2, iOptInt);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject i(ti1 ti1Var, SessionDescription sessionDescription) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        c(ti1Var, jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", sessionDescription.type.canonicalForm());
        jSONObject2.put("sdp", sessionDescription.description);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("sdp", jSONObject2);
        jSONObject.put("data", jSONObject3);
        return jSONObject;
    }

    public static h29 j(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("UNMUTE")) {
            return h29.a;
        }
        if (str.equals("MUTE")) {
            return h29.b;
        }
        if (str.equals("MUTE_PERMANENT")) {
            return h29.c;
        }
        return null;
    }

    public static HashMap k(JSONObject jSONObject) {
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("muteStates");
        if (jSONObjectOptJSONObject != null) {
            map.put(g29.a, j(jSONObjectOptJSONObject.optString("AUDIO")));
            map.put(g29.b, j(jSONObjectOptJSONObject.optString("VIDEO")));
            map.put(g29.c, j(jSONObjectOptJSONObject.optString("SCREEN_SHARING")));
            map.put(g29.d, j(jSONObjectOptJSONObject.optString("MOVIE_SHARING")));
        }
        return map;
    }

    public static r8a l(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediaSettings");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new r8a(jSONObjectOptJSONObject.optBoolean("isAudioEnabled", false), jSONObjectOptJSONObject.optBoolean("isVideoEnabled", false), jSONObjectOptJSONObject.optBoolean("isScreenSharingEnabled", false), jSONObjectOptJSONObject.optBoolean("isAnimojiEnabled", false));
    }

    public static JSONObject m(d0f d0fVar, boolean z, boolean z2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isVideoEnabled", d0fVar.a);
            jSONObject.put("isAudioEnabled", d0fVar.b);
            jSONObject.put("isScreenSharingEnabled", d0fVar.c);
            jSONObject.put("isAnimojiEnabled", d0fVar.e);
            if (z) {
                jSONObject.put("isFastScreenSharingEnabled", d0fVar.d);
            }
            if (z2) {
                jSONObject.put("isAudioSharingEnabled", d0fVar.f);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static imb n(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ApiProtocol.PARAM_PEER_ID);
        if (jSONObjectOptJSONObject != null) {
            return new imb(jSONObjectOptJSONObject.getString("id"), jSONObjectOptJSONObject.optString("type", "WEB_SOCKET"));
        }
        return null;
    }

    public static fr6 o(ti1 ti1Var, boolean z) throws JSONException {
        try {
            fr6 fr6VarB = b(null, "promote-participant");
            JSONObject jSONObject = fr6VarB.a;
            jSONObject.put("demote", !z);
            jSONObject.put("participantId", ti1Var.b());
            return fr6VarB;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static fr6 p(int i, Integer num, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, boolean z8, boolean z9, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maxH264Decoders", i);
        if (num != null) {
            jSONObject.put("estimatedPerformanceIndex", num);
        }
        jSONObject.put("producerNotificationDataChannelVersion", 7);
        jSONObject.put("producerCommandDataChannelVersion", i2);
        jSONObject.put("audioMix", true);
        jSONObject.put("consumerUpdate", z);
        jSONObject.put("onDemandTracks", z2);
        jSONObject.put("singleSession", true);
        jSONObject.put("unifiedPlan", true);
        jSONObject.put("fastScreenShare", true);
        if (z3) {
            jSONObject.put("producerScreenDataChannelVersion", 1);
        }
        if (z4) {
            jSONObject.put("consumerScreenDataChannelVersion", 1);
        }
        if (z6) {
            jSONObject.put("animojiDataChannelVersion", 2);
        }
        if (z7) {
            jSONObject.put("animojiBackendRender", true);
        }
        if (z8) {
            jSONObject.put("asrDataChannelVersion", 1);
        }
        if (z9) {
            jSONObject.put("consumerFastScreenShare", true);
        }
        jSONObject.put("consumerFastScreenShareQualityOnDemand", true);
        if (z10) {
            jSONObject.put("audioShare", true);
        }
        jSONObject.put("red", z5);
        if (i3 > 0) {
            jSONObject.put("videoTracksCount", i3);
            jSONObject.put("csrcAccessible", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("capabilities", jSONObject);
        return b(jSONObject2, "allocate-consumer");
    }

    public static fr6 q(ti1 ti1Var, List list, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", ti1Var.b());
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((wi1) it.next());
        }
        jSONObject.put("roles", jSONArray);
        jSONObject.put("revoke", z);
        return b(jSONObject, "grant-roles");
    }

    public static fr6 r(ti1 ti1Var, fje fjeVar, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", ti1Var.b());
        if (fjeVar instanceof eje) {
            jSONObject.put("roomId", ((eje) fjeVar).a);
        }
        jSONObject.put("unpin", !z);
        return b(jSONObject, "pin-participant");
    }

    public static fr6 s(ti1 ti1Var, IceCandidate iceCandidate) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("candidate", w0a.e(iceCandidate));
        jSONObject.put("sdpMid", iceCandidate.sdpMid);
        jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidate", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        c(ti1Var, jSONObject3, true);
        jSONObject3.put("data", jSONObject2);
        return b(jSONObject3, "transmit-data");
    }

    public static fr6 t(ti1 ti1Var, IceCandidate[] iceCandidateArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (IceCandidate iceCandidate : iceCandidateArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidate", w0a.e(iceCandidate));
            jSONObject.put("sdpMid", iceCandidate.sdpMid);
            jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidates-removed", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c(ti1Var, jSONObject3, true);
        jSONObject3.put("data", jSONObject2);
        return b(jSONObject3, "transmit-data");
    }

    public static ArrayList u(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("roles")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    arrayList.add(wi1.valueOf(jSONArrayOptJSONArray.getString(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    public static ti1 v(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("participantId");
        String strOptString = jSONObject.optString("participantType");
        return new ti1("GROUP".equals(strOptString) ? 2 : 1, jSONObject.optInt("deviceIdx"), jOptLong);
    }

    public static ti1 w(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("id");
        String strOptString = jSONObject.optString("idType");
        return new ti1("GROUP".equals(strOptString) ? 2 : 1, jSONObject.optInt("deviceIdx"), jOptLong);
    }

    public static zpb x(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        bqb bqbVarA = null;
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        int iOptInt = jSONObjectOptJSONObject.optInt("maxDimension");
        int iOptInt2 = jSONObjectOptJSONObject.optInt("maxBitrateK");
        int iOptInt3 = jSONObjectOptJSONObject.optInt("maxFramerate");
        String strOptString = jSONObjectOptJSONObject.optString("degradationPreference");
        try {
            bqbVarA = bqb.a(jSONObjectOptJSONObject.getJSONObject("bitrates"));
        } catch (Exception unused) {
        }
        return new zpb(iOptInt, iOptInt, iOptInt2, iOptInt3, strOptString, bqbVarA, 1, 0, "");
    }

    public static boolean y(JSONObject jSONObject) {
        return jSONObject.optBoolean("unpin", false);
    }

    public static String z(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(c3d.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(c3d.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(c3d.fingerprint_error_no_fingerprints);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    return context.getString(c3d.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(c3d.default_error_msg);
            }
        }
        return context.getString(c3d.fingerprint_error_lockout);
    }
}
