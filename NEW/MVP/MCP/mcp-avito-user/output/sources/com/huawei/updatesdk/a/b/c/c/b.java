package com.huawei.updatesdk.a.b.c.c;

import androidx.camera.view.k;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.media3.exoplayer.analytics.m;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.huawei.updatesdk.a.a.d.g;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class b {
    private static final char COMMA = ',';
    private static final String END_FLAG = "_";
    private static final String TAG = "b";

    public static class a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        private Field f363794a;

        public a(Field field) {
            this.f363794a = field;
        }

        @Override // java.security.PrivilegedAction
        public Object run() throws SecurityException {
            this.f363794a.setAccessible(true);
            return null;
        }
    }

    private String arrayToJson(Object obj) {
        int length = Array.getLength(obj);
        if (length <= 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbR = H.r("[");
        for (int i12 = 0; i12 < length; i12++) {
            String strValueToJson = valueToJson(Array.get(obj, i12));
            if (strValueToJson != null) {
                sbR.append(strValueToJson);
                sbR.append(COMMA);
            }
        }
        formatJsonStr(sbR);
        sbR.append("]");
        return sbR.toString();
    }

    private void formatJsonStr(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            int i12 = length - 1;
            if (sb2.charAt(i12) == ',') {
                sb2.delete(i12, length);
            }
        }
    }

    private boolean isPrimitiveObj(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Short);
    }

    private Object jsonBeanFromJson(Class cls, Object obj) throws JSONException, IllegalAccessException, IllegalArgumentException {
        b bVar = (b) cls.newInstance();
        bVar.fromJson((JSONObject) obj);
        return bVar;
    }

    private Object listFromJson(Class cls, Object obj) {
        if (cls == null) {
            throw new IllegalArgumentException("generic type is null");
        }
        if (!(obj instanceof JSONArray)) {
            throw new IllegalArgumentException(k.a(obj, "jsonobject is not JSONArray, jsonValue:"));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = (JSONArray) obj;
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            Object objValueFromJson = valueFromJson(cls, null, jSONArray.get(i12));
            if (objValueFromJson != null) {
                if (cls.equals(objValueFromJson.getClass())) {
                    arrayList.add(objValueFromJson);
                } else {
                    com.huawei.updatesdk.a.a.c.a.a.a.b(TAG, "listFromJson error, memberClass:" + cls + ", valueClass:" + objValueFromJson.getClass());
                }
            }
        }
        return arrayList;
    }

    private Object mapFromJson(Class cls, Object obj) {
        if (cls == null) {
            throw new IllegalArgumentException("generic type is null");
        }
        if (!(obj instanceof JSONObject)) {
            throw new IllegalArgumentException(k.a(obj, "jsonobject is not JSONObject, jsonValue:"));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objValueFromJson = valueFromJson(cls, null, jSONObject.get(next));
            if (objValueFromJson != null) {
                if (cls.equals(objValueFromJson.getClass())) {
                    linkedHashMap.put(next, objValueFromJson);
                } else {
                    com.huawei.updatesdk.a.a.c.a.a.a.b(TAG, "mapFromJson error, memberClass:" + cls + ", valueClass:" + objValueFromJson.getClass());
                }
            }
        }
        return linkedHashMap;
    }

    private String mapToJson(Map map) {
        if (map.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Iterator it = map.entrySet().iterator();
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String strValueToJson = valueToJson(entry.getValue());
            if (strValueToJson != null) {
                m.p(sb2, "\"", str, "\":", strValueToJson);
            }
            if (!it.hasNext()) {
                sb2.append("}");
                return sb2.toString();
            }
            if (strValueToJson != null) {
                sb2.append(COMMA);
            }
        }
    }

    private void processValueError(Field field, Object obj) throws IllegalAccessException, IllegalArgumentException {
        Object objValueOf;
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        try {
            Class<?> type = field.getType();
            if (type.isPrimitive()) {
                String name = type.getName();
                if (IntParameter.TYPE.equals(name)) {
                    objValueOf = Integer.valueOf(Integer.parseInt((String) obj));
                } else if ("float".equals(name)) {
                    objValueOf = Float.valueOf(Float.parseFloat((String) obj));
                } else if (Constants.LONG.equals(name)) {
                    objValueOf = Long.valueOf(Long.parseLong((String) obj));
                } else if (BooleanParameter.TYPE.equals(name)) {
                    objValueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj));
                } else if ("double".equals(name)) {
                    objValueOf = Double.valueOf(Double.parseDouble((String) obj));
                } else if ("short".equals(name)) {
                    objValueOf = Short.valueOf(Short.parseShort((String) obj));
                } else if ("byte".equals(name)) {
                    objValueOf = Byte.valueOf(Byte.parseByte((String) obj));
                } else if (!CharParameter.TYPE.equals(name)) {
                    return;
                } else {
                    objValueOf = Character.valueOf(((String) obj).charAt(0));
                }
                field.set(this, objValueOf);
            }
        } catch (IllegalAccessException e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.b(TAG, "processValueError Throwable:" + e12.getMessage());
        }
    }

    private Object valueFromJson(Class cls, Class cls2, Object obj) {
        if (cls.isPrimitive() || cls.equals(String.class)) {
            return ("float".equals(cls.getName()) && (obj instanceof Double)) ? Float.valueOf(((Double) obj).floatValue()) : obj;
        }
        if (List.class.isAssignableFrom(cls)) {
            return listFromJson(cls2, obj);
        }
        if (b.class.isAssignableFrom(cls)) {
            if (cls.equals(b.class)) {
                throw new IllegalArgumentException(e.k(cls, "error type, type:"));
            }
            return jsonBeanFromJson(cls, obj);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return mapFromJson(cls2, obj);
        }
        throw new IllegalArgumentException(e.k(cls, "unsupport type, Type:"));
    }

    private String valueToJson(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return JSONObject.quote(obj.toString());
        }
        if (isPrimitiveObj(obj)) {
            return String.valueOf(obj);
        }
        if (obj instanceof b) {
            return ((b) obj).toJson();
        }
        if (obj instanceof List) {
            return listToJson((List) obj);
        }
        if (obj instanceof Map) {
            return mapToJson((Map) obj);
        }
        if (obj.getClass().isArray()) {
            return arrayToJson(obj);
        }
        return null;
    }

    public void fromJson(JSONObject jSONObject) throws JSONException, IllegalAccessException, IllegalArgumentException {
        Field[] fieldArrA = g.a(getClass());
        Object objValueFromJson = null;
        for (int i12 = 0; i12 < fieldArrA.length; i12++) {
            AccessController.doPrivileged(new a(fieldArrA[i12]));
            String name = fieldArrA[i12].getName();
            if (fieldArrA[i12].isAnnotationPresent(SDKNetTransmission.class) || name.endsWith(END_FLAG)) {
                if (name.endsWith(END_FLAG)) {
                    name = e.h(1, 0, name);
                }
                if (jSONObject.has(name)) {
                    Object obj = jSONObject.get(name);
                    if (!JSONObject.NULL.equals(obj)) {
                        try {
                            objValueFromJson = valueFromJson(fieldArrA[i12].getType(), g.a(fieldArrA[i12]), obj);
                            fieldArrA[i12].set(this, objValueFromJson);
                        } catch (Exception e12) {
                            com.huawei.updatesdk.a.a.a.a(TAG, getClass().getName() + ".fromJson error, fieldName:" + name + e12.toString());
                            processValueError(fieldArrA[i12], objValueFromJson);
                        }
                    }
                }
            }
        }
    }

    public String listToJson(List list) {
        if (list.size() <= 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbR = H.r("[");
        for (int i12 = 0; i12 < list.size(); i12++) {
            String strValueToJson = valueToJson(list.get(i12));
            if (strValueToJson != null) {
                sbR.append(strValueToJson);
                sbR.append(COMMA);
            }
        }
        formatJsonStr(sbR);
        sbR.append("]");
        return sbR.toString();
    }

    public String toJson() {
        Field[] fieldArrA = g.a(getClass());
        if (fieldArrA.length <= 0) {
            return "";
        }
        StringBuilder sbR = H.r("{");
        for (int i12 = 0; i12 < fieldArrA.length; i12++) {
            AccessController.doPrivileged(new a(fieldArrA[i12]));
            String name = fieldArrA[i12].getName();
            if (fieldArrA[i12].isAnnotationPresent(SDKNetTransmission.class) || (name != null && name.endsWith(END_FLAG))) {
                if (name.endsWith(END_FLAG)) {
                    name = e.h(1, 0, name);
                }
                String strValueToJson = valueToJson(fieldArrA[i12].get(this));
                if (strValueToJson != null) {
                    m.p(sbR, "\"", name, "\":", strValueToJson);
                    sbR.append(COMMA);
                }
            }
        }
        formatJsonStr(sbR);
        sbR.append("}");
        return sbR.toString();
    }
}
