package com.yandex.metrica.impl.ob;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class F2 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f378114a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f378115b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f378116c;

    /* renamed from: d, reason: collision with root package name */
    public final int f378117d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final Long f378118e;

    public F2(@j.P String str, @j.P String str2, boolean z12, int i12, @j.P Long l12) {
        this.f378114a = str;
        this.f378115b = str2;
        this.f378116c = z12;
        this.f378117d = i12;
        this.f378118e = l12;
    }

    @j.N
    public static JSONArray a(@j.P Collection<F2> collection) {
        JSONObject jSONObjectPut;
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (F2 f22 : collection) {
                f22.getClass();
                try {
                    jSONObjectPut = new JSONObject().put("mac", f22.f378114a).put("ssid", f22.f378115b).put("signal_strength", f22.f378117d).put("is_connected", f22.f378116c).put("last_visible_offset_seconds", f22.f378118e);
                } catch (Throwable unused) {
                    jSONObjectPut = null;
                }
                if (jSONObjectPut != null) {
                    jSONArray.put(jSONObjectPut);
                }
            }
        }
        return jSONArray;
    }
}
