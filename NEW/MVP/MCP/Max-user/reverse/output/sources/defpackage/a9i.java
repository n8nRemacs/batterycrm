package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.onelog.OneLogItem;

/* loaded from: classes2.dex */
public abstract class a9i {
    public static OneLogItem a(String str, y4c y4cVar, ey2 ey2Var, Object obj) {
        hsc hscVar;
        int iIncrementAndGet = 1;
        OneLogItem.Builder custom = OneLogItem.builder().setCollector("ok.mobile.apps.video").setType(1).setOperation(str).setCount(1).setTime(0L).setCustom("app", cwa.b).setCustom("vid", y4cVar.a).setCustom("vsid", y4cVar.b).setCustom("cdn_host", y4cVar.d).setCustom("ct", y4cVar.e).setCustom("auto", Boolean.valueOf(y4cVar.g)).setCustom("stat_type", y4cVar.g ? "auto" : "").setCustom("place", y4cVar.f).setCustom("in_history", Boolean.valueOf(y4cVar.i));
        fk6 fk6Var = (fk6) ey2Var.c;
        if (fk6Var != null) {
            switch (ayg.a[fk6Var.ordinal()]) {
                case 1:
                    hscVar = hsc._144p;
                    break;
                case 2:
                    hscVar = hsc._240p;
                    break;
                case 3:
                    hscVar = hsc._360p;
                    break;
                case 4:
                    hscVar = hsc._480p;
                    break;
                case 5:
                    hscVar = hsc._720p;
                    break;
                case 6:
                    hscVar = hsc._1080p;
                    break;
                case 7:
                    hscVar = hsc._1440p;
                    break;
                case 8:
                    hscVar = hsc._2160p;
                    break;
                case 9:
                    hscVar = hsc._4320p;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            hscVar = null;
        }
        OneLogItem.Builder custom2 = custom.setCustom("quality", hscVar).setCustom("param", obj);
        Long l = (Long) ey2Var.d;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue != 0) {
                custom2.setCustom("live_seek", Long.valueOf(jLongValue));
            }
        }
        o8i o8iVar = o8i.a;
        String str2 = y4cVar.b;
        Map map = y4cVar.j;
        synchronized (o8iVar) {
            HashMap map2 = o8i.b;
            AtomicInteger atomicInteger = (AtomicInteger) map2.get(str2);
            if (atomicInteger == null) {
                map2.put(str2, new AtomicInteger(1));
            } else {
                iIncrementAndGet = atomicInteger.incrementAndGet();
            }
        }
        map.get("event_number");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("event_number", Integer.valueOf(iIncrementAndGet));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            custom2.setCustom((String) entry.getKey(), entry.getValue());
        }
        return custom2.build();
    }

    public static void b(String str, y4c y4cVar, ey2 ey2Var, Serializable serializable) {
        if (y4cVar.a != null) {
            a(str, y4cVar, ey2Var, serializable).log();
        }
    }
}
