package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class aoi {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(ip5 ip5Var) {
        umb umbVar = new umb(8);
        int i = y21.c(ip5Var, umbVar).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ip5Var.i(0, umbVar.a, 4);
        umbVar.J(0);
        int iJ = umbVar.j();
        if (iJ == 1463899717) {
            return true;
        }
        a8i.g("WavHeaderReader", "Unsupported form type: " + iJ);
        return false;
    }

    public static y21 b(int i, ip5 ip5Var, umb umbVar) throws ParserException {
        y21 y21VarC = y21.c(ip5Var, umbVar);
        while (true) {
            int i2 = y21VarC.b;
            if (i2 == i) {
                return y21VarC;
            }
            wy1.p(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = y21VarC.c;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            ip5Var.z((int) j2);
            y21VarC = y21.c(ip5Var, umbVar);
        }
    }

    public static final JSONArray c(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object objD : list) {
            if (objD instanceof List) {
                objD = c((List) objD);
            } else if (objD instanceof Map) {
                objD = d((Map) objD);
            }
            jSONArray.put(objD);
        }
        return jSONArray;
    }

    public static final JSONObject d(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                value = c((List) value);
            } else if (value instanceof Map) {
                value = d((Map) value);
            }
            jSONObject.putOpt(String.valueOf(key), value);
        }
        return jSONObject;
    }

    public static final ArrayList e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objF = jSONArray.get(i);
            if (objF instanceof JSONArray) {
                objF = e((JSONArray) objF);
            } else if (objF instanceof JSONObject) {
                objF = f((JSONObject) objF);
            }
            arrayList.add(objF);
        }
        return arrayList;
    }

    public static final HashMap f(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objF = jSONObject.get(next);
            if (objF instanceof JSONArray) {
                objF = e((JSONArray) objF);
            } else if (objF instanceof JSONObject) {
                objF = f((JSONObject) objF);
            }
            map.put(next, objF);
        }
        return map;
    }
}
