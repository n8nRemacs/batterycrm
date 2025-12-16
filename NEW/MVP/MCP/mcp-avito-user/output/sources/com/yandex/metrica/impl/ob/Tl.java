package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.metrica.impl.ob.C39299zl;
import com.yandex.metrica.impl.ob.If;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Tl {

    public static class a extends JSONObject {
        public a() {
        }

        @j.P
        public Long a(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        public String b(String str) {
            if (!has(str) || !has(str)) {
                return "";
            }
            try {
                return getString(str);
            } catch (Throwable unused) {
                return "";
            }
        }

        public String c(String str) {
            if (has(str)) {
                try {
                    return getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        public boolean d(String str) {
            try {
                return JSONObject.NULL != get(str);
            } catch (Throwable unused) {
                return false;
            }
        }

        public a(String str) {
            super(str);
        }
    }

    @j.N
    public static <T> T a(@j.P T t12, @j.N T t13) {
        return t12 == null ? t13 : t12;
    }

    @j.N
    public static byte[] b(@j.N String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes(Constants.ENCODING));
        return messageDigest.digest();
    }

    @j.N
    public static String c(Map<String, String> map) {
        if (A2.b(map)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(":");
            sb2.append(entry.getValue());
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
        return sb2.toString();
    }

    public static boolean d(@j.P Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Integer.parseInt(it.next().getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    @j.P
    public static JSONObject e(@j.P Map map) {
        if (A2.b(map)) {
            return null;
        }
        return A2.a(19) ? new JSONObject(map) : h(map);
    }

    @j.P
    public static JSONObject f(@j.P Map map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? new JSONObject() : e(map);
    }

    @j.P
    public static String g(@j.P Map map) {
        if (A2.b(map)) {
            return null;
        }
        return A2.a(19) ? new JSONObject(map).toString() : a((Object) map).toString();
    }

    @j.N
    private static JSONObject h(@j.N Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            if (string != null) {
                linkedHashMap.put(string, a(entry.getValue()));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    public static Map<String, String> i(Map<String, String> map) throws NumberFormatException {
        long j12;
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && !key.contains(":") && !key.contains(",") && !key.contains(ContainerUtils.FIELD_DELIMITER)) {
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(value)) {
                        try {
                            j12 = Long.parseLong(value);
                        } catch (NumberFormatException unused) {
                            j12 = -1;
                        }
                        if (j12 != -1) {
                            map2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
        }
        return map2;
    }

    @j.P
    public static String a(@j.N Context context, @j.N String str) {
        byte[] bArrA = a(context, Base64.decode(str.getBytes(Constants.ENCODING), 0));
        if (bArrA == null) {
            return null;
        }
        try {
            return new String(L0.a(new String(bArrA, Constants.ENCODING)), Constants.ENCODING);
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public static HashMap<String, String> d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public static C38717c2 f(@j.P String str) {
        com.yandex.metrica.b bVar;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("width");
                int iOptInt2 = jSONObject.optInt("height");
                int iOptInt3 = jSONObject.optInt("dpi");
                float fOptDouble = (float) jSONObject.optDouble("scaleFactor", 0.0d);
                String strOptString = jSONObject.optString("deviceType");
                com.yandex.metrica.b[] bVarArrValues = com.yandex.metrica.b.values();
                int i12 = 0;
                while (true) {
                    if (i12 >= 3) {
                        bVar = null;
                        break;
                    }
                    com.yandex.metrica.b bVar2 = bVarArrValues[i12];
                    if (bVar2.f377560b.equals(strOptString)) {
                        bVar = bVar2;
                        break;
                    }
                    i12++;
                }
                return new C38717c2(iOptInt, iOptInt2, iOptInt3, fOptDouble, bVar);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @j.P
    public static String b(@j.N Context context, @j.P String str) {
        String strA;
        try {
            strA = L0.a(str.getBytes(Constants.ENCODING));
        } catch (Throwable unused) {
            strA = null;
        }
        return Base64.encodeToString(a(context, strA.getBytes(Constants.ENCODING)), 0);
    }

    @j.N
    public static HashMap<String, String> e(@j.N String str) {
        return b(new JSONObject(str));
    }

    @j.N
    public static Map<String, String> a(@j.P String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int iIndexOf = str2.indexOf(":");
                if (iIndexOf != -1) {
                    map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                }
            }
        }
        return map;
    }

    @j.P
    public static String c(@j.P List<String> list) {
        if (A2.b(list)) {
            return null;
        }
        if (A2.a(19)) {
            return new JSONArray((Collection) list).toString();
        }
        return a((Object) list).toString();
    }

    @j.P
    private static JSONArray b(@j.P Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public static List<String> c(@j.P String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    try {
                        arrayList.add(jSONArray.getString(i12));
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    @j.P
    public static JSONArray b(@j.P List<?> list) {
        if (A2.b(list)) {
            return null;
        }
        if (A2.a(19)) {
            return new JSONArray((Collection) list);
        }
        return b((Collection<?>) list);
    }

    public static long a(@j.P Long l12, @j.N TimeUnit timeUnit, long j12) {
        return l12 == null ? j12 : timeUnit.toMillis(l12.longValue());
    }

    @j.P
    private static byte[] a(@j.N Context context, @j.N byte[] bArr) {
        try {
            byte[] bArrB = b(context.getPackageName());
            byte[] bArr2 = new byte[bArr.length];
            for (int i12 = 0; i12 < bArr.length; i12++) {
                bArr2[i12] = (byte) (bArr[i12] ^ bArrB[i12 % bArrB.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public static HashMap<String, String> b(JSONObject jSONObject) {
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static C38811fl c(@j.N JSONObject jSONObject) {
        C39227wl c39227wl;
        If.i iVar = new If.i();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("upc");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("uecc");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("ucfbc");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ruecc");
        boolean zOptBoolean = jSONObject.optBoolean("upe", iVar.f378376o);
        boolean zOptBoolean2 = jSONObject.optBoolean("uece", iVar.f378377p);
        boolean zOptBoolean3 = jSONObject.optBoolean("ucfbe", iVar.f378378q);
        boolean zOptBoolean4 = jSONObject.optBoolean("ruece", iVar.f378382u);
        if (jSONObjectOptJSONObject == null) {
            c39227wl = null;
        } else {
            If.w wVar = new If.w();
            c39227wl = new C39227wl(jSONObjectOptJSONObject.optInt("tltb", wVar.f378474a), jSONObjectOptJSONObject.optInt("ttb", wVar.f378475b), jSONObjectOptJSONObject.optInt("mvcl", wVar.f378476c), jSONObjectOptJSONObject.optLong("act", wVar.f378477d), jSONObjectOptJSONObject.optBoolean("rtsc", wVar.f378478e), jSONObjectOptJSONObject.optBoolean("er", wVar.f378479f), jSONObjectOptJSONObject.optBoolean("pabd", wVar.f378480g), a(jSONObjectOptJSONObject.optJSONArray("f")));
        }
        return new C38811fl(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, c39227wl, jSONObjectOptJSONObject2 == null ? null : a(jSONObjectOptJSONObject2, C38964m0.b()), jSONObjectOptJSONObject3 == null ? null : a(jSONObjectOptJSONObject3, C38964m0.a()), jSONObjectOptJSONObject4 != null ? a(jSONObjectOptJSONObject4, C38964m0.b()) : null);
    }

    @j.k0
    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i12 = 0; i12 < length; i12++) {
                    arrayList.add(a(Array.get(obj, i12)));
                }
                return new JSONArray((Collection) arrayList);
            }
            if (obj instanceof Collection) {
                return b((Collection<?>) obj);
            }
            return obj instanceof Map ? h((Map) obj) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public static String b(@j.P JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @j.P
    public static List<String> b(@j.P JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            arrayList.add(jSONArray.getString(i12));
        }
        return arrayList;
    }

    @j.P
    public static String a(@j.P Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? "" : g(map);
    }

    @j.P
    public static Long a(@j.P JSONObject jSONObject, @j.N String str, @j.P Long l12) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return l12;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return l12;
        }
    }

    @j.P
    public static String b(@j.P Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                JSONArray jSONArrayB = b((List<?>) entry.getValue());
                if (jSONArrayB != null) {
                    jSONObject.put(entry.getKey(), jSONArrayB.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static String a(@j.P JSONObject jSONObject, @j.P JSONObject jSONObject2, @j.N String str) {
        String strB = b(jSONObject, str);
        if (jSONObject2 == null || !jSONObject2.has(str)) {
            return strB;
        }
        try {
            return jSONObject2.getString(str);
        } catch (Throwable unused) {
            return strB;
        }
    }

    @j.P
    public static Integer a(@j.P JSONObject jSONObject, @j.N String str, @j.P Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return num;
        }
    }

    public static boolean a(@j.P JSONObject jSONObject, @j.N String str, boolean z12) {
        Boolean boolA = a(jSONObject, str, (Boolean) null);
        return boolA == null ? z12 : boolA.booleanValue();
    }

    @j.P
    public static Boolean a(@j.P JSONObject jSONObject, @j.N String str, @j.P Boolean bool) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return bool;
        }
    }

    public static JSONArray a(Collection<C39177uj> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator<C39177uj> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(a(it.next()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject a(C39177uj c39177uj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", c39177uj.b());
        jSONObject.put("signal_strength", c39177uj.p());
        jSONObject.put("lac", c39177uj.e());
        jSONObject.put("country_code", c39177uj.k());
        jSONObject.put("operator_id", c39177uj.l());
        jSONObject.put("operator_name", c39177uj.n());
        jSONObject.put("is_connected", c39177uj.q());
        jSONObject.put("cell_type", c39177uj.c());
        jSONObject.put("pci", c39177uj.o());
        jSONObject.put("last_visible_time_offset", c39177uj.d());
        jSONObject.put("lte_rsrq", c39177uj.h());
        jSONObject.put("lte_rssnr", c39177uj.j());
        jSONObject.put("arfcn", c39177uj.a());
        jSONObject.put("lte_rssi", c39177uj.i());
        jSONObject.put("lte_bandwidth", c39177uj.f());
        jSONObject.put("lte_cqi", c39177uj.g());
        return jSONObject;
    }

    public static JSONObject a(@j.N C38811fl c38811fl) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("upe", c38811fl.f380597a).put("uece", c38811fl.f380598b).put("ruece", c38811fl.f380600d).put("ucfbe", c38811fl.f380599c);
        C39227wl c39227wl = c38811fl.f380601e;
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("upc", c39227wl == null ? null : new JSONObject().put("tltb", c39227wl.f382144a).put("ttb", c39227wl.f382145b).put("mvcl", c39227wl.f382146c).put("act", c39227wl.f382147d).put("rtsc", c39227wl.f382148e).put("er", c39227wl.f382149f).put("pabd", c39227wl.f382150g).put("f", a(c39227wl.f382151h)));
        C38861hl c38861hl = c38811fl.f380602f;
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("uecc", c38861hl == null ? null : a(c38861hl));
        C38861hl c38861hl2 = c38811fl.f380604h;
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("ruecc", c38861hl2 == null ? null : a(c38861hl2));
        C38861hl c38861hl3 = c38811fl.f380603g;
        return jSONObjectPutOpt3.putOpt("ucfbc", c38861hl3 != null ? a(c38861hl3) : null);
    }

    private static JSONObject a(@j.N C38861hl c38861hl) {
        return new JSONObject().put("tsc", c38861hl.f380733a).put("rtsc1", c38861hl.f380734b).put("tvc", c38861hl.f380735c).put("tsc1", c38861hl.f380736d).put("ic", c38861hl.f380737e).put("ncvc", c38861hl.f380738f).put("tlc", c38861hl.f380739g).put("vh", c38861hl.f380740h).put("if", c38861hl.f380741i).put("wvuc", c38861hl.f380742j).put("tltb", c38861hl.f380743k).put("ttb", c38861hl.f380744l).put("mec", c38861hl.f380745m).put("mfcl", c38861hl.f380746n).put("wvul", c38861hl.f380747o).put("f", a(c38861hl.f380748p));
    }

    private static C38861hl a(@j.N JSONObject jSONObject, @j.N If.v vVar) {
        return new C38861hl(jSONObject.optBoolean("tsc", vVar.f378458a), jSONObject.optBoolean("rtsc1", vVar.f378459b), jSONObject.optBoolean("tvc", vVar.f378460c), jSONObject.optBoolean("tsc1", vVar.f378461d), jSONObject.optBoolean("ic", vVar.f378466i), jSONObject.optBoolean("ncvc", vVar.f378467j), jSONObject.optBoolean("tlc", vVar.f378468k), jSONObject.optBoolean("vh", vVar.f378469l), jSONObject.optBoolean("if", vVar.f378471n), jSONObject.optBoolean("wvuc", vVar.f378472o), jSONObject.optInt("tltb", vVar.f378462e), jSONObject.optInt("ttb", vVar.f378463f), jSONObject.optInt("mec", vVar.f378464g), jSONObject.optInt("mfcl", vVar.f378465h), jSONObject.optInt("wvul", vVar.f378473p), a(jSONObject.optJSONArray("f")));
    }

    @j.N
    private static JSONArray a(@j.N List<C39299zl> list) {
        JSONArray jSONArray = new JSONArray();
        for (C39299zl c39299zl : list) {
            try {
                jSONArray.put(new JSONObject().put("ft", c39299zl.f382327a.f382334a).put("fv", c39299zl.f382328b));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    @j.N
    private static List<C39299zl> a(@j.P JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i12);
                    arrayList.add(new C39299zl(C39299zl.b.a(jSONObject.getInt("ft")), jSONObject.optString("fv")));
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    @j.N
    public static C39096ra a(@j.N JSONObject jSONObject) {
        return new C39096ra(a(jSONObject, "activation"), a(jSONObject, "satellite_clids"), a(jSONObject, "preload_info"));
    }

    @j.N
    public static JSONObject a(@j.N C39096ra c39096ra) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("activation", a(c39096ra.f381733a));
            jSONObject.putOpt("preload_info", a(c39096ra.f381735c));
            jSONObject.putOpt("satellite_clids", a(c39096ra.f381734b));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @j.P
    private static C39073qa a(@j.N JSONObject jSONObject, @j.N String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return new C39073qa(jSONObjectOptJSONObject.optLong("exp_t"), jSONObjectOptJSONObject.optInt("interval"));
        }
        return null;
    }

    @j.P
    private static JSONObject a(@j.P C39073qa c39073qa) {
        if (c39073qa == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exp_t", c39073qa.f381452a).put("interval", c39073qa.f381453b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @j.P
    public static String a(@j.P C38717c2 c38717c2) {
        JSONObject jSONObject;
        if (c38717c2 == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("width", c38717c2.e()).put("height", c38717c2.c()).put("dpi", c38717c2.b()).put("scaleFactor", c38717c2.d()).putOpt("deviceType", c38717c2.a() == null ? null : c38717c2.a().f377560b);
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
