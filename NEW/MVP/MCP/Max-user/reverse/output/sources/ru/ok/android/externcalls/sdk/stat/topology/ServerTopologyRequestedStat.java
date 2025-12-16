package ru.ok.android.externcalls.sdk.stat.topology;

import defpackage.cm6;
import defpackage.m81;
import defpackage.n81;
import defpackage.odg;
import defpackage.pdg;
import defpackage.y8g;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/topology/ServerTopologyRequestedStat;", "", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "Ly8g;", "timeProvider", "<init>", "(Lcm6;Ly8g;)V", "Lpdg;", "event", "Lqqg;", "onServerTopologyRequested", "(Lpdg;)V", "Lcm6;", "Ly8g;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServerTopologyRequestedStat {
    private final cm6 getEventualStatSender;
    private final y8g timeProvider;

    public ServerTopologyRequestedStat(cm6 cm6Var, y8g y8gVar) {
        this.getEventualStatSender = cm6Var;
        this.timeProvider = y8gVar;
    }

    public final void onServerTopologyRequested(pdg event) {
        long j;
        long j2;
        if (event instanceof odg) {
            long msSinceBoot = this.timeProvider.getMsSinceBoot();
            odg odgVar = (odg) event;
            switch (odgVar.b) {
                case 0:
                    j2 = odgVar.c;
                    break;
                case 1:
                    j2 = odgVar.c;
                    break;
                case 2:
                    j2 = odgVar.c;
                    break;
                default:
                    j2 = odgVar.c;
                    break;
            }
            j = msSinceBoot - j2;
        } else {
            j = 0;
        }
        m81 m81Var = (m81) this.getEventualStatSender.invoke();
        if (m81Var != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(j);
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set(SdkMetricStatEvent.STRING_VALUE_KEY, event.a.a);
            ((n81) m81Var).c("client_requested_server_topology", eventItemValue, eventItemsMap);
        }
    }
}
