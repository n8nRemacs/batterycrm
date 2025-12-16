package com.geetest.captcha;

import android.content.Context;
import com.geetest.gtc4.GeeGuard;
import com.geetest.gtc4.GeeGuardConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public static Map<String, ? extends JSONObject> f342692a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a0 f342693b = new a0();

    public final String a(Context context, String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            h0.f342732d.b("isGtc4Available");
            Object objNewInstance = GeeGuardConfiguration.Builder.class.newInstance();
            Method method = GeeGuardConfiguration.Builder.class.getMethod("setAppId", String.class);
            if (method != null) {
                method.invoke(objNewInstance, "54847f3301740c85982a1d3d566bd24e");
            }
            Method method2 = GeeGuardConfiguration.Builder.class.getMethod("setExtraInfo", HashMap.class);
            if (method2 != null) {
                method2.invoke(objNewInstance, f342692a);
            }
            Method method3 = GeeGuardConfiguration.Builder.class.getMethod("setAlInfo", Boolean.TYPE);
            if (method3 != null) {
                method3.invoke(objNewInstance, Boolean.FALSE);
            }
            Method method4 = GeeGuardConfiguration.Builder.class.getMethod("setDevInfo", Boolean.TYPE);
            if (method4 != null) {
                method4.invoke(objNewInstance, Boolean.TRUE);
            }
            Method method5 = GeeGuardConfiguration.Builder.class.getMethod("setLevel", Integer.TYPE);
            if (method5 != null) {
                method5.invoke(objNewInstance, 1);
            }
            Method method6 = GeeGuardConfiguration.Builder.class.getMethod("addSignature", String.class);
            if (method6 != null) {
                method6.invoke(objNewInstance, str);
            }
            Method method7 = GeeGuardConfiguration.Builder.class.getMethod("build", new Class[0]);
            Object objInvoke = method7 != null ? method7.invoke(objNewInstance, new Object[0]) : null;
            Method method8 = GeeGuard.class.getMethod("getData", Context.class, GeeGuardConfiguration.class);
            Object objInvoke2 = method8 != null ? method8.invoke(null, context, objInvoke) : null;
            if (objInvoke2 != null) {
                return (String) objInvoke2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e12) {
            h0.f342732d.b("gtc4 date:" + e12);
            return null;
        }
    }

    @Y61.l
    public final String b(@Y61.l Context context, @Y61.k String str) throws JSONException {
        Map<String, String> map;
        if (context != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                f0 f0VarA = f0.f342719c.a(str);
                JSONObject jSONObject = new JSONObject(URLDecoder.decode((f0VarA == null || (map = f0VarA.f342721b) == null) ? null : map.get("data"), "utf-8"));
                String string = jSONObject.getString("challenge");
                sb2.append(jSONObject.getString("captchaId"));
                sb2.append(string);
                sb2.append(context.getPackageName());
                sb2.append("1.8.3.1");
                h0.f342732d.a("Sign content: " + ((Object) sb2));
                return a(context, sb2.toString());
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return null;
    }
}
