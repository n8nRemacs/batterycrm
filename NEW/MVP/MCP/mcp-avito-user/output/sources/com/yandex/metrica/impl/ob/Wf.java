package com.yandex.metrica.impl.ob;

import com.yandex.metrica.f;
import com.yandex.metrica.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public class Wf {
    @j.N
    public com.yandex.metrica.j a(@j.N com.yandex.metrica.j jVar) {
        if (!A2.a(jVar.maxReportsInDatabaseCount)) {
            return jVar;
        }
        j.b bVarA = com.yandex.metrica.j.a(jVar);
        bVarA.f382351b = new ArrayList();
        A2.a((Object) null);
        Map<String, String> map = jVar.f382342a;
        if (A2.a((Object) map) && A2.a((Object) null)) {
            bVarA.f382353d = map;
        }
        Integer num = jVar.f382344c;
        if (A2.a(num)) {
            if (num.intValue() < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            bVarA.f382352c = num;
        }
        Integer num2 = jVar.f382345d;
        if (A2.a(num2)) {
            num2.getClass();
            bVarA.f382354e = num2;
        }
        Integer num3 = jVar.f382346e;
        if (A2.a(num3)) {
            num3.getClass();
            bVarA.f382355f = num3;
        }
        A2.a((Object) null);
        Map<String, String> map2 = jVar.f382347f;
        if (A2.a((Object) map2)) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                bVarA.f382356g.put(entry.getKey(), entry.getValue());
            }
        }
        Boolean bool = jVar.f382348g;
        if (A2.a(bool)) {
            bool.getClass();
            bVarA.f382357h = bool;
        }
        List<String> list = jVar.f382343b;
        if (A2.a((Object) list)) {
            bVarA.f382351b = list;
        }
        Boolean bool2 = jVar.f382349h;
        if (A2.a(bool2)) {
            bool2.getClass();
            bVarA.f382358i = bool2;
        }
        bVarA.f382350a.withMaxReportsInDatabaseCount(a(jVar.maxReportsInDatabaseCount, jVar.apiKey));
        return new com.yandex.metrica.j(bVarA, null);
    }

    @j.N
    public com.yandex.metrica.f a(@j.N com.yandex.metrica.f fVar) {
        if (!A2.a(fVar.maxReportsInDatabaseCount)) {
            return fVar;
        }
        f.a aVar = new f.a(fVar.apiKey);
        if (A2.a(fVar.sessionTimeout)) {
            aVar.f377690a.withSessionTimeout(fVar.sessionTimeout.intValue());
        }
        if (A2.a(fVar.logs) && fVar.logs.booleanValue()) {
            aVar.f377690a.withLogs();
        }
        if (A2.a(fVar.statisticsSending)) {
            aVar.f377690a.withStatisticsSending(fVar.statisticsSending.booleanValue());
        }
        if (A2.a(fVar.maxReportsInDatabaseCount)) {
            aVar.f377690a.withMaxReportsInDatabaseCount(fVar.maxReportsInDatabaseCount.intValue());
        }
        if (!A2.a((Object) null) && !A2.a((Object) null)) {
            Map<String, String> map = fVar.f377689a;
            if (A2.a((Object) map)) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVar.f377691b.put(entry.getKey(), entry.getValue());
                }
            }
            if (A2.a((Object) fVar.userProfileID)) {
                aVar.f377690a.withUserProfileID(fVar.userProfileID);
            }
            aVar.f377690a.withMaxReportsInDatabaseCount(a(fVar.maxReportsInDatabaseCount, fVar.apiKey));
            return new com.yandex.metrica.f(aVar);
        }
        throw null;
    }

    private int a(@j.P Integer num, @j.N String str) {
        if (num.intValue() < 100) {
            Ul.b(str).fw("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        }
        if (num.intValue() > 10000) {
            Ul.b(str).fw("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", 10000, num, 10000);
            return 10000;
        }
        return num.intValue();
    }
}
