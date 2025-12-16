package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39054pf;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public class Yc {
    @j.N
    public C39054pf.a a(@j.N C38951lc c38951lc) {
        C39054pf.a aVar = new C39054pf.a();
        aVar.f381298a = c38951lc.f() == null ? aVar.f381298a : c38951lc.f().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f381299b = timeUnit.toSeconds(c38951lc.d());
        aVar.f381302e = timeUnit.toSeconds(c38951lc.c());
        aVar.f381303f = c38951lc.b() == null ? 0 : J1.a(c38951lc.b());
        aVar.f381304g = c38951lc.e() == null ? 3 : J1.a(c38951lc.e());
        JSONArray jSONArrayA = c38951lc.a();
        if (jSONArrayA != null) {
            aVar.f381300c = J1.b(jSONArrayA);
        }
        JSONArray jSONArrayG = c38951lc.g();
        if (jSONArrayG != null) {
            aVar.f381301d = J1.a(jSONArrayG);
        }
        return aVar;
    }
}
