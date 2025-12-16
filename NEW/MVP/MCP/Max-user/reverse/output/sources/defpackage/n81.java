package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* loaded from: classes2.dex */
public final class n81 implements m81, qdg {
    public static final List i = Collections.singletonList(RttRateHintConfig.RTT);
    public final CallAnalyticsSender a;
    public final y8g b;
    public final zkb c;
    public final a3b d;
    public final xt4 e;
    public final y6d f;
    public EventItemsMap g;
    public final ArrayList h = new ArrayList();

    public n81(CallAnalyticsSender callAnalyticsSender, y8g y8gVar, zkb zkbVar, a3b a3bVar, xt4 xt4Var, y6d y6dVar) {
        this.a = callAnalyticsSender;
        this.b = y8gVar;
        this.c = zkbVar;
        this.d = a3bVar;
        this.e = xt4Var;
        this.f = y6dVar;
    }

    public final void b(EventItemsMap eventItemsMap) {
        List<dai> listD0;
        synchronized (this.h) {
            listD0 = ue3.d0(this.h);
            this.h.clear();
        }
        for (dai daiVar : listD0) {
            EventItemsMap eventItemsMap2 = daiVar.c;
            eventItemsMap2.addAll(eventItemsMap);
            Long serverTimeMs = daiVar.d;
            this.a.send(new SdkMetricStatEvent.Builder(daiVar.a, daiVar.b).addAll(eventItemsMap2.getItems()).set("timestamp", Long.valueOf((serverTimeMs == null && (serverTimeMs = this.b.getServerTimeMs()) == null) ? this.b.localTimeMs() : serverTimeMs.longValue())).build());
        }
    }

    public final void c(String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        long jLongValue;
        this.f.log("CallEventualStatSenderImpl", "Event saved " + str + ", value " + eventItemValue + ", additional " + eventItemsMap);
        Long serverTimeMs = this.b.getServerTimeMs();
        dai daiVar = new dai(str, eventItemValue, eventItemsMap, serverTimeMs);
        EventItemsMap eventItemsMap2 = this.g;
        if (eventItemsMap2 == null) {
            synchronized (this.h) {
                this.h.add(daiVar);
            }
            return;
        }
        eventItemsMap.addAll(eventItemsMap2);
        if (serverTimeMs != null) {
            jLongValue = serverTimeMs.longValue();
        } else {
            Long serverTimeMs2 = this.b.getServerTimeMs();
            jLongValue = serverTimeMs2 != null ? serverTimeMs2.longValue() : this.b.localTimeMs();
        }
        this.a.send(new SdkMetricStatEvent.Builder(str, eventItemValue).addAll(eventItemsMap.getItems()).set("timestamp", Long.valueOf(jLongValue)).build());
    }

    @Override // defpackage.qdg
    public final void onTopologyUpdated(mdg mdgVar, mdg mdgVar2) {
        if (this.g == null) {
            EventItemsMap eventItemsMap = new EventItemsMap();
            this.c.j(eventItemsMap);
            eventItemsMap.set("vcid", ((p64) this.d.b).a);
            this.e.j(eventItemsMap);
            b(eventItemsMap);
            this.g = eventItemsMap;
        }
    }
}
