package com.geetest.captcha;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Base64;
import android.util.Pair;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"SdCardPath"})
    public static final String[] f342748a = {"/sdcard/.system_log.trace", "/sdcard/tencent/.DrvZPZQ", "/sdcard/alipay/.Wg83DS3"};

    public static Pair<String, String> a(Context context) throws JSONException {
        String string;
        try {
            string = context.getSharedPreferences("gt_fp", 0).getString("gt_di", null);
        } catch (Exception unused) {
            string = "$unknown";
        }
        if (!i.b(string)) {
            try {
                return new Pair<>(new JSONObject(n.a(i.a(Base64.decode(string, 2), "VedaT=ZbPq0Zv7Do"), "utf-8")).getString("gee_id"), string);
            } catch (Exception unused2) {
                return null;
            }
        }
        if (context.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0) {
            if (Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy()) {
                return null;
            }
            try {
                String strA = n.a(new FileReader(f342748a[0]));
                JSONObject jSONObject = new JSONObject(new String(i.a(Base64.decode(strA, 2), "VedaT=ZbPq0Zv7Do")));
                i.a(context, "gt_di", strA);
                return new Pair<>(jSONObject.getString("gee_id"), strA);
            } catch (Exception unused3) {
                try {
                    try {
                        try {
                            String[] strArr = f342748a;
                            String strA2 = n.a(new FileReader(strArr[1]));
                            JSONObject jSONObject2 = new JSONObject(new String(i.a(Base64.decode(strA2, 2), "VedaT=ZbPq0Zv7Do")));
                            i.a(context, "gt_di", strA2);
                            a(strA2, strArr[0]);
                            return new Pair<>(jSONObject2.getString("gee_id"), strA2);
                        } catch (Exception unused4) {
                            String string2 = UUID.randomUUID().toString();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("gee_id", string2);
                            jSONObject3.put("ts", System.currentTimeMillis());
                            jSONObject3.put("ver", "1.0.0");
                            String strA3 = n.a(Base64.encode(i.a(jSONObject3.toString(), "VedaT=ZbPq0Zv7Do"), 2), "utf-8");
                            i.a(context, "gt_di", strA3);
                            String[] strArr2 = f342748a;
                            a(strA3, strArr2[0]);
                            a(strA3, strArr2[1]);
                            a(strA3, strArr2[2]);
                            return new Pair<>(string2, strA3);
                        }
                    } catch (Exception unused5) {
                    }
                } catch (Exception unused6) {
                    String[] strArr3 = f342748a;
                    String strA4 = n.a(new FileReader(strArr3[2]));
                    JSONObject jSONObject4 = new JSONObject(new String(i.a(Base64.decode(strA4, 2), "VedaT=ZbPq0Zv7Do")));
                    i.a(context, "gt_di", strA4);
                    a(strA4, strArr3[0]);
                    a(strA4, strArr3[1]);
                    return new Pair<>(jSONObject4.getString("gee_id"), strA4);
                }
            }
        }
        return null;
    }

    public static void a(String str, String str2) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(str2);
            n.a(str, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException unused) {
        }
    }
}
