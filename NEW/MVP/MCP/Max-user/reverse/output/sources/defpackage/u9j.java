package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class u9j {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ArrayList a(String str) throws JSONException {
        int i;
        sse sseVar;
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("versionName");
            long j = jSONObject.getLong("versionCode");
            String strOptString = jSONObject.optString("environment", "");
            sse sseVar2 = null;
            String str2 = strOptString.length() > 0 ? strOptString : null;
            String strOptString2 = jSONObject.optString("sessionUuid", "");
            if (strOptString2.length() <= 0) {
                strOptString2 = null;
            }
            if (strOptString2 == null) {
                strOptString2 = UUID.randomUUID().toString();
            }
            String strOptString3 = jSONObject.optString("processName", "");
            if (strOptString3.length() <= 0) {
                strOptString3 = null;
            }
            String string2 = jSONObject.getString("status");
            if (string2 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string2.equals("BLANK")) {
                i = 1;
            } else if (string2.equals("CRASH")) {
                i = 2;
            } else if (string2.equals("ANR")) {
                i = 3;
            } else {
                if (!string2.equals("NATIVE")) {
                    throw new IllegalArgumentException("No enum constant ru.ok.tracer.session.SessionState.Status.".concat(string2));
                }
                i = 4;
            }
            String strOptString4 = jSONObject.optString("maxSeverity", "");
            if (strOptString4.length() <= 0) {
                strOptString4 = null;
            }
            if (strOptString4 != null) {
                int iHashCode = strOptString4.hashCode();
                sse sseVar3 = sse.Z;
                switch (iHashCode) {
                    case -1986360616:
                        if (strOptString4.equals("NOTICE")) {
                            sseVar = sse.X;
                            sseVar2 = sseVar;
                            break;
                        }
                        sseVar2 = sseVar3;
                        break;
                    case 2251950:
                        if (strOptString4.equals("INFO")) {
                            sseVar = sse.Y;
                            sseVar2 = sseVar;
                            break;
                        }
                        sseVar2 = sseVar3;
                        break;
                    case 64921139:
                        strOptString4.equals("DEBUG");
                        sseVar2 = sseVar3;
                        break;
                    case 66247144:
                        if (strOptString4.equals("ERROR")) {
                            sseVar = sse.d;
                            sseVar2 = sseVar;
                            break;
                        }
                        sseVar2 = sseVar3;
                        break;
                    case 66665700:
                        if (strOptString4.equals("FATAL")) {
                            sseVar = sse.c;
                            sseVar2 = sseVar;
                            break;
                        }
                        sseVar2 = sseVar3;
                        break;
                    case 1842428796:
                        if (strOptString4.equals("WARNING")) {
                            sseVar = sse.o;
                            sseVar2 = sseVar;
                            break;
                        }
                        sseVar2 = sseVar3;
                        break;
                    default:
                        sseVar2 = sseVar3;
                        break;
                }
            }
            arrayList.add(new lje(j, string, str2, strOptString2, strOptString3, i, sseVar2, jSONObject.optBoolean("isInBackground")));
        }
        return arrayList;
    }

    public static JSONArray b(List list) throws JSONException {
        String str;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lje ljeVar = (lje) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", ljeVar.b);
            jSONObject.put("versionCode", ljeVar.a);
            jSONObject.put("environment", ljeVar.c);
            jSONObject.put("sessionUuid", ljeVar.d);
            jSONObject.put("processName", ljeVar.e);
            int i = ljeVar.f;
            if (i == 1) {
                str = "BLANK";
            } else if (i == 2) {
                str = "CRASH";
            } else if (i == 3) {
                str = "ANR";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "NATIVE";
            }
            jSONObject.put("status", str);
            sse sseVar = ljeVar.g;
            jSONObject.put("maxSeverity", sseVar != null ? sseVar.equals(sse.c) ? "FATAL" : sseVar.equals(sse.d) ? "ERROR" : sseVar.equals(sse.o) ? "WARNING" : sseVar.equals(sse.X) ? "NOTICE" : sseVar.equals(sse.Y) ? "INFO" : "DEBUG" : null);
            jSONObject.put("isInBackground", ljeVar.h);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
