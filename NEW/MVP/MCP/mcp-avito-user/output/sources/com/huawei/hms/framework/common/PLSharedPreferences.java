package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PLSharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f363467a;

    public PLSharedPreferences(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            Logger.e("PLSharedPreferences", "context is null, must call init method to set context");
            sharedPreferences = null;
        } else {
            Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            SharedPreferences sharedPreferences2 = contextCreateDeviceProtectedStorageContext.getSharedPreferences("grs_move2DE_records", 0);
            if (sharedPreferences2.getBoolean(str, false)) {
                context = contextCreateDeviceProtectedStorageContext;
                sharedPreferences = context.getSharedPreferences(str, 0);
            } else {
                if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                    SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                    editorEdit.putBoolean(str, true);
                    editorEdit.apply();
                    context = contextCreateDeviceProtectedStorageContext;
                }
                sharedPreferences = context.getSharedPreferences(str, 0);
            }
        }
        this.f363467a = sharedPreferences;
    }

    public void clear() {
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    public SharedPreferences.Editor edit() {
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.edit();
    }

    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null) {
            return null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        StringBuilder sb2 = new StringBuilder("sp size ");
        sb2.append(all == null ? 0 : all.size());
        Logger.i("PLSharedPreferences", sb2.toString());
        return all;
    }

    public Map<String, String> getHashMap(String str) throws JSONException {
        HashMap map = new HashMap();
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null) {
            return map;
        }
        try {
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(str, ""));
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i12);
                JSONArray jSONArrayNames = jSONObject.names();
                if (jSONArrayNames != null) {
                    for (int i13 = 0; i13 < jSONArrayNames.length(); i13++) {
                        String string = jSONArrayNames.getString(i13);
                        map.put(string, jSONObject.getString(string));
                    }
                }
            }
        } catch (JSONException e12) {
            Logger.w("PLSharedPreferences", "getHashMap parse Json to map error: %s", StringUtils.anonymizeMessage(e12.getMessage()));
        }
        return map;
    }

    public long getLong(String str, long j12) {
        SharedPreferences sharedPreferences = this.f363467a;
        return sharedPreferences == null ? j12 : sharedPreferences.getLong(str, j12);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public void putHashMap(String str, Map<String, String> map) throws JSONException {
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null || map == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e12) {
                Logger.w("PLSharedPreferences", "putHashMap one object error: %s", StringUtils.anonymizeMessage(e12.getMessage()));
            }
        }
        jSONArray.put(jSONObject);
        sharedPreferences.edit().putString(str, jSONArray.toString()).apply();
    }

    public void putLong(String str, long j12) {
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong(str, j12).apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public void remove(String str) {
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public void removeKeyValue(String str) {
        SharedPreferences sharedPreferences = this.f363467a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f363467a;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }
}
