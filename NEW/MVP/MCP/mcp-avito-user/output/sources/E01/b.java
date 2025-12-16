package E01;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonUtil.java */
/* loaded from: classes7.dex */
public class b {
    public static int a(JSONObject jSONObject, String str, int i12) {
        if (jSONObject == null) {
            return i12;
        }
        try {
            return jSONObject.has(str) ? jSONObject.getInt(str) : i12;
        } catch (JSONException unused) {
            HMSLog.w("JsonUtil", "JSONException: get " + str + " error.");
            return i12;
        }
    }

    public static String b(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return str2;
        }
        try {
            return (!jSONObject.has(str) || jSONObject.get(str) == null) ? str2 : String.valueOf(jSONObject.get(str));
        } catch (JSONException unused) {
            HMSLog.w("JsonUtil", "JSONException: get " + str + " error.");
            return str2;
        }
    }

    public static void c(JSONObject jSONObject, Bundle bundle, HashMap<String, Object> map) throws JSONException {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                HMSLog.w("JsonUtil", "transfer jsonObject to bundle failed, defaultValue is null.");
            } else {
                strArr = null;
                strArr = null;
                String[] strArr = null;
                jArr = null;
                jArr = null;
                long[] jArr = null;
                iArr = null;
                iArr = null;
                int[] iArr = null;
                if (value instanceof String) {
                    String str = (String) value;
                    bundle.putString(key, b(jSONObject, key, TextUtils.isEmpty(str) ? null : str));
                } else if (value instanceof Integer) {
                    bundle.putInt(key, a(jSONObject, key, ((Integer) value).intValue()));
                } else {
                    int i12 = 0;
                    if (value instanceof int[]) {
                        int[] iArr2 = (int[]) value;
                        if (iArr2.length == 0) {
                            iArr2 = null;
                        }
                        if (jSONObject != null) {
                            try {
                                if (jSONObject.has(key)) {
                                    JSONArray jSONArray = jSONObject.getJSONArray(key);
                                    iArr = new int[jSONArray.length()];
                                    while (i12 < jSONArray.length()) {
                                        iArr[i12] = ((Integer) jSONArray.get(i12)).intValue();
                                        i12++;
                                    }
                                }
                            } catch (JSONException unused) {
                                HMSLog.w("JsonUtil", "JSONException: get " + key + " error.");
                            }
                        }
                        if (iArr != null) {
                            iArr2 = iArr;
                        }
                        bundle.putIntArray(key, iArr2);
                    } else if (value instanceof long[]) {
                        long[] jArr2 = (long[]) value;
                        if (jArr2.length == 0) {
                            jArr2 = null;
                        }
                        if (jSONObject != null) {
                            try {
                                if (jSONObject.has(key)) {
                                    JSONArray jSONArray2 = jSONObject.getJSONArray(key);
                                    jArr = new long[jSONArray2.length()];
                                    while (i12 < jSONArray2.length()) {
                                        jArr[i12] = jSONArray2.getLong(i12);
                                        i12++;
                                    }
                                }
                            } catch (JSONException unused2) {
                                HMSLog.w("JsonUtil", "JSONException: get " + key + " error.");
                            }
                        }
                        if (jArr != null) {
                            jArr2 = jArr;
                        }
                        bundle.putLongArray(key, jArr2);
                    } else if (value instanceof String[]) {
                        if (jSONObject != null) {
                            try {
                                if (jSONObject.has(key)) {
                                    JSONArray jSONArray3 = jSONObject.getJSONArray(key);
                                    strArr = new String[jSONArray3.length()];
                                    while (i12 < jSONArray3.length()) {
                                        strArr[i12] = (String) jSONArray3.get(i12);
                                        i12++;
                                    }
                                }
                            } catch (JSONException unused3) {
                                HMSLog.w("JsonUtil", "JSONException: get " + key + " error.");
                            }
                        }
                        bundle.putStringArray(key, strArr);
                    } else {
                        HMSLog.w("JsonUtil", "transfer jsonObject to bundle failed, invalid data type.");
                    }
                }
            }
        }
    }
}
