package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class jo7 {
    public static Context b;
    public static Boolean c;
    public static final Object d = new Object();
    public static volatile String o;
    public final /* synthetic */ int a = 2;

    public static wxf c(String str) throws JSONException {
        Object ipdVar;
        LinkedHashMap linkedHashMap;
        String str2;
        String str3;
        Set setA;
        String str4;
        String str5;
        String string;
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        JSONArray jSONArrayNames = jSONObject2.names();
        int length = jSONArrayNames != null ? jSONArrayNames.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArrayNames != null && (string = jSONArrayNames.getString(i)) != null) {
                linkedHashMap2.put(string, jSONObject2.getString(string));
            }
        }
        String str6 = "versionName";
        String string2 = jSONObject.getString("versionName");
        long j = jSONObject.getLong("versionCode");
        String strOptString = jSONObject.optString("packageName");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        if (strOptString == null) {
            try {
                Context context = feg.d;
                if (context == null) {
                    context = null;
                }
                ipdVar = context.getPackageName();
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            if (kpd.a(ipdVar) != null) {
                ipdVar = "NA";
            }
            strOptString = (String) ipdVar;
        }
        String strOptString2 = jSONObject.optString("environment");
        if (strOptString2.length() <= 0) {
            strOptString2 = null;
        }
        String strOptString3 = jSONObject.optString("buildUuid");
        if (strOptString3.length() <= 0) {
            strOptString3 = null;
        }
        String strOptString4 = jSONObject.optString("sessionUuid");
        if (strOptString4.length() <= 0) {
            strOptString4 = null;
        }
        if (strOptString4 == null) {
            strOptString4 = UUID.randomUUID().toString();
        }
        String string3 = jSONObject.getString("device");
        String string4 = jSONObject.getString("deviceId");
        String string5 = jSONObject.getString("vendor");
        String str7 = strOptString;
        String string6 = jSONObject.getString("osVersion");
        boolean z = jSONObject.getBoolean("inBackground");
        boolean z2 = jSONObject.getBoolean("isRooted");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("hostedLibrariesInfo");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            linkedHashMap = linkedHashMap2;
            str2 = string4;
            str3 = string2;
            setA = rd5.a;
        } else {
            bke bkeVar = new bke();
            linkedHashMap = linkedHashMap2;
            int length2 = jSONArrayOptJSONArray.length();
            str2 = string4;
            int i2 = 0;
            while (i2 < length2) {
                int i3 = length2;
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                String string7 = jSONObject3.getString("packageName");
                int i4 = i2;
                String string8 = jSONObject3.getString(str6);
                String strOptString5 = jSONObject3.optString("buildUuid");
                if (strOptString5.length() > 0) {
                    str4 = str6;
                    str5 = strOptString5;
                } else {
                    str4 = str6;
                    str5 = null;
                }
                String strOptString6 = jSONObject3.optString("environment");
                if (strOptString6.length() <= 0) {
                    strOptString6 = null;
                }
                String str8 = string2;
                bkeVar.add(new s77(string7, string8, str5, strOptString6));
                i2 = i4 + 1;
                length2 = i3;
                jSONArrayOptJSONArray = jSONArray;
                str6 = str4;
                string2 = str8;
            }
            str3 = string2;
            setA = gke.a(bkeVar);
        }
        return new wxf(str3, j, str7, strOptString2, strOptString3, strOptString4, string3, str2, string5, string6, z, z2, linkedHashMap, setA);
    }

    public static final String e(Context context) {
        String str = o;
        if (str != null) {
            return str;
        }
        synchronized (d) {
            String str2 = o;
            if (str2 != null) {
                return str2;
            }
            String strG = g(context.getApplicationContext());
            o = strG;
            return strG;
        }
    }

    public static final String g(Context context) throws IOException {
        SharedPreferences sharedPreferences = context.getSharedPreferences("tracer", 0);
        String str = null;
        String string = sharedPreferences.getString("device_id", null);
        String str2 = string == null ? "00000000-0000-0000-0000-000000000000" : string;
        try {
            File fileG = jz5.g(context.getFilesDir(), "tracer");
            nbj.b(fileG);
            File fileG2 = jz5.g(fileG, "device_id.txt");
            if (fileG2.exists()) {
                try {
                    String string2 = vmf.c0(jz5.f(fileG2)).toString();
                    if (string2.length() > 0) {
                        str = string2;
                    }
                } catch (IOException unused) {
                }
            }
            if (str != null) {
                return str;
            }
            String string3 = string == null ? UUID.randomUUID().toString() : string;
            FileOutputStream fileOutputStream = new FileOutputStream(fileG2);
            try {
                fileOutputStream.write(string3.getBytes(lb2.a));
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (string != null) {
                    sharedPreferences.edit().remove("device_id").apply();
                }
                return string3;
            } finally {
            }
        } catch (IOException unused2) {
            return str2;
        }
    }

    public static JSONObject h(wxf wxfVar) throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", wxfVar.a);
        jSONObject.put("versionCode", wxfVar.b);
        jSONObject.put("packageName", wxfVar.c);
        jSONObject.put("environment", wxfVar.d);
        jSONObject.put("buildUuid", wxfVar.e);
        jSONObject.put("sessionUuid", wxfVar.f);
        jSONObject.put("device", wxfVar.g);
        jSONObject.put("deviceId", wxfVar.h);
        jSONObject.put("vendor", wxfVar.i);
        jSONObject.put("osVersion", wxfVar.j);
        jSONObject.put("inBackground", wxfVar.k);
        jSONObject.put("isRooted", wxfVar.l);
        jSONObject.put("properties", new JSONObject(wxfVar.m));
        Set<s77> set = wxfVar.n;
        if (set == null || set.isEmpty()) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            for (s77 s77Var : set) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", s77Var.a);
                jSONObject2.put("versionName", s77Var.b);
                jSONObject2.put("buildUuid", s77Var.c);
                jSONObject2.put("environment", s77Var.d);
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("hostedLibrariesInfo", jSONArray);
        return jSONObject;
    }

    public abstract Object a();

    public String toString() {
        switch (this.a) {
            case 2:
                return a().toString();
            default:
                return super.toString();
        }
    }
}
