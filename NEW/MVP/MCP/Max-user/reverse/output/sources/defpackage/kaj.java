package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public abstract class kaj {
    public static final String a(ag5 ag5Var) {
        Object next;
        int i = ag5Var.i;
        ArrayList arrayList = new ArrayList();
        String str = ag5Var.c;
        if (str != null) {
            arrayList.add(new imb("userId", str));
        }
        String str2 = ag5Var.b;
        if (str2 != null) {
            arrayList.add(new imb(ApiProtocol.KEY_TOKEN, str2));
        }
        arrayList.add(new imb(ApiProtocol.PARAM_CONVERSATION_ID, ag5Var.a));
        if (i >= 6) {
            arrayList.add(new imb("deviceIdx", String.valueOf(ag5Var.d)));
        }
        Long l = ag5Var.g;
        if (l != null) {
            arrayList.add(new imb(ApiProtocol.PARAM_PEER_ID, String.valueOf(l.longValue())));
        }
        Locale locale = ag5Var.o;
        if (locale != null) {
            arrayList.add(new imb("locale", locale.getLanguage()));
        }
        arrayList.add(new imb("version", String.valueOf(i)));
        arrayList.add(new imb("capabilities", ag5Var.j));
        arrayList.add(new imb("device", u45.k(Build.MANUFACTURER, "/", Build.MODEL)));
        arrayList.add(new imb(CallAnalyticsApiRequest.KEY_PLATFORM, AbstractUploader.SDK_TYPE_STRING));
        arrayList.add(new imb("clientType", ag5Var.h));
        arrayList.add(new imb("appVersion", ag5Var.f));
        arrayList.add(new imb("osVersion", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(new imb("ispAsOrg", ag5Var.l));
        arrayList.add(new imb("locCc", ag5Var.m));
        arrayList.add(new imb("locReg", ag5Var.n));
        Integer num = ag5Var.k;
        if (num != null) {
            arrayList.add(new imb("ispAsNo", String.valueOf(num.intValue())));
        }
        String str3 = ag5Var.p;
        if (str3 != null) {
            arrayList.add(new imb("compression", str3));
        }
        Uri.Builder builderBuildUpon = Uri.parse(ag5Var.e).buildUpon();
        Uri uriBuild = builderBuildUpon.build();
        Set<String> queryParameterNames = uriBuild.getQueryParameterNames();
        ArrayList arrayList2 = new ArrayList();
        for (String str4 : queryParameterNames) {
            for (String str5 : uriBuild.getQueryParameters(str4)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (fni.a(((imb) next).a, str4)) {
                        break;
                    }
                }
                imb imbVar = (imb) next;
                if (imbVar == null) {
                    arrayList2.add(new imb(str4, str5));
                } else {
                    arrayList2.add(new imb(str4, imbVar.b));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!queryParameterNames.contains(((imb) next2).a)) {
                arrayList3.add(next2);
            }
        }
        int size = arrayList3.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
            arrayList2.add((imb) obj);
        }
        builderBuildUpon.clearQuery();
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            imb imbVar2 = (imb) obj2;
            builderBuildUpon.appendQueryParameter((String) imbVar2.a, (String) imbVar2.b);
        }
        return builderBuildUpon.build().toString();
    }

    public static final Object b(SharedPreferences sharedPreferences, String str, Object obj, ca3 ca3Var) {
        if (ca3Var.equals(vid.a(Boolean.TYPE))) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (ca3Var.equals(vid.a(Double.TYPE))) {
            return Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
        }
        if (ca3Var.equals(vid.a(Float.TYPE))) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (ca3Var.equals(vid.a(Integer.TYPE))) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (ca3Var.equals(vid.a(Long.TYPE))) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        if (ca3Var.equals(vid.a(String.class))) {
            String string = sharedPreferences.getString(str, obj instanceof String ? (String) obj : null);
            if (string != null) {
                return string;
            }
        } else if (ca3Var.equals(vid.a(Set.class))) {
            Set<String> stringSet = sharedPreferences.getStringSet(str, obj instanceof Set ? (Set) obj : null);
            if (stringSet != null) {
                return stringSet;
            }
        } else if (ca3Var.equals(vid.a(Map.class))) {
            String string2 = sharedPreferences.getString(str, null);
            if (string2 != null) {
                return aoi.f(new JSONObject(string2));
            }
        } else {
            if (!ca3Var.equals(vid.a(List.class))) {
                if (ca3Var.equals(vid.a(s65.class))) {
                    int i = s65.d;
                    return new s65(v9j.i(sharedPreferences.getLong(str, s65.h(((s65) obj).a)), y65.NANOSECONDS));
                }
                throw new IllegalStateException(("Unsupported type: " + vid.a(sharedPreferences.getClass())).toString());
            }
            String string3 = sharedPreferences.getString(str, null);
            if (string3 != null) {
                return aoi.e(new JSONArray(string3));
            }
        }
        return obj;
    }

    public static final void c(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj == null) {
            editor.remove(str);
            return;
        }
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            editor.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            editor.putLong(str, Double.doubleToRawLongBits(((Number) obj).doubleValue()));
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Set) {
            editor.putStringSet(str, (Set) obj);
            return;
        }
        if (obj instanceof Map) {
            editor.putString(str, aoi.d((Map) obj).toString());
            return;
        }
        if (obj instanceof List) {
            editor.putString(str, aoi.c((List) obj).toString());
        } else {
            if (obj instanceof s65) {
                editor.putLong(str, s65.h(((s65) obj).a));
                return;
            }
            throw new IllegalStateException(("Unsupported value type: " + vid.a(editor.getClass())).toString());
        }
    }
}
