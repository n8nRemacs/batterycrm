package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public class Signer {

    /* renamed from: a, reason: collision with root package name */
    public boolean f59003a = false;

    /* renamed from: b, reason: collision with root package name */
    public d f59004b;

    /* renamed from: c, reason: collision with root package name */
    public a f59005c;

    /* renamed from: d, reason: collision with root package name */
    public c f59006d;

    public static String getVersion() {
        return "3.32.0";
    }

    public final synchronized void a() {
        if (this.f59003a) {
            return;
        }
        this.f59004b = new d();
        this.f59006d = new c(Build.VERSION.SDK_INT);
        this.f59005c = new NativeLibHelper();
        this.f59003a = true;
    }

    public synchronized void onResume() {
        a();
        d dVar = this.f59004b;
        a aVar = this.f59005c;
        dVar.getClass();
        if (!d.f59008a) {
            ((NativeLibHelper) aVar).a();
        }
    }

    public synchronized void sign(Context context, Map<String, String> map, String str, String str2) {
        a();
        d dVar = this.f59004b;
        c cVar = this.f59006d;
        a aVar = this.f59005c;
        dVar.getClass();
        d.a(context, cVar, aVar, map, str, str2);
    }

    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        try {
            a();
            d dVar = this.f59004b;
            c cVar = this.f59006d;
            a aVar = this.f59005c;
            dVar.getClass();
            if (map != null && map.size() != 0 && map2 != null && map3 != null) {
                HashMap map4 = new HashMap();
                d.a(map.keySet(), map, map4);
                String str = map2.get("activity_kind");
                String str2 = map2.get("client_sdk");
                if ("b".equals(map2.get("a"))) {
                    d.a(map.keySet(), map, map3);
                    d.a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                } else {
                    d.a(context, cVar, aVar, map4, str, str2);
                    if (map4.containsKey("signature") && map4.containsKey("adj_signing_id") && map4.containsKey("headers_id") && map4.containsKey("algorithm") && map4.containsKey("native_version")) {
                        String str3 = (String) map4.get("adj_signing_id");
                        String str4 = (String) map4.get("headers_id");
                        String str5 = (String) map4.get("signature");
                        String str6 = (String) map4.get("algorithm");
                        String str7 = (String) map4.get("native_version");
                        Locale locale = Locale.US;
                        String str8 = "algorithm=\"" + str6 + "\"";
                        map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + "," + ("adj_signing_id=\"" + str3 + "\"") + "," + str8 + "," + ("headers_id=\"" + str4 + "\"") + "," + ("native_version=\"" + str7 + "\""));
                        d.a(map.keySet(), map, map3);
                        d.a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                    }
                }
            }
        } finally {
        }
    }
}
