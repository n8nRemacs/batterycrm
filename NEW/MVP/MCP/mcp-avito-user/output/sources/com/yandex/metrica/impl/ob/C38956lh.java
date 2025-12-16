package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.Jf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.lh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38956lh {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Jf.e.b.a, String> f380984a = Collections.unmodifiableMap(new a());

    /* renamed from: b, reason: collision with root package name */
    private static final Map<H1.d, String> f380985b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.lh$a */
    public class a extends HashMap<Jf.e.b.a, String> {
        public a() {
            put(Jf.e.b.a.COMPLETE, "complete");
            put(Jf.e.b.a.ERROR, "error");
            put(Jf.e.b.a.OFFLINE, "offline");
            put(Jf.e.b.a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lh$b */
    public class b extends HashMap<H1.d, String> {
        public b() {
            put(H1.d.WIFI, "wifi");
            put(H1.d.CELL, "cell");
            put(H1.d.OFFLINE, "offline");
            put(H1.d.UNDEFINED, "undefined");
        }
    }

    public String a(@j.N Jf.e.b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("id", bVar.d().f378599a);
            jSONObject.putOpt(ContextActionHandler.Link.URL, bVar.d().f378600b);
            jSONObject.putOpt("status", f380984a.get(bVar.h()));
            jSONObject.putOpt("code", bVar.f());
            if (!A2.a(bVar.e())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.e(), 0));
            } else if (!A2.a(bVar.b())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.b(), 0));
            }
            jSONObject.putOpt("headers", a(bVar.g()));
            Throwable thC = bVar.c();
            if (thC != null) {
                str = thC.toString() + "\n" + Log.getStackTraceString(thC);
            } else {
                str = null;
            }
            jSONObject.putOpt("error", str);
            jSONObject.putOpt("network_type", f380985b.get(bVar.a()));
            return jSONObject.toString();
        } catch (Throwable th2) {
            return th2.toString();
        }
    }

    @j.P
    private JSONObject a(@j.P Map<String, List<String>> map) throws JSONException {
        if (A2.b(map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!A2.b(entry.getValue())) {
                List<String> value = entry.getValue();
                if (value.size() > 10) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i12 = 0; i12 < 10; i12++) {
                        arrayList.add(value.get(i12));
                    }
                    value = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : value) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList2.add(A2.a(str, 100));
                    }
                }
                jSONObject.putOpt(key, TextUtils.join(",", arrayList2));
            }
        }
        return jSONObject;
    }
}
