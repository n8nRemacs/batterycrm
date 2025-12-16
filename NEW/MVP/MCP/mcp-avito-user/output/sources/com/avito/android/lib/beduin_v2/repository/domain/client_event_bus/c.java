package com.avito.android.lib.beduin_v2.repository.domain.client_event_bus;

import Y41.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import mx0.InterfaceC44149a;
import vj.C49337a;

/* compiled from: ClientEventBusRepositoryClientImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmx0/a;", "socketEvent", "Lkotlin/G0;", "accept", "(Lmx0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<Map<String, String>, G0> f176582b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super Map<String, String>, G0> lVar) {
        this.f176582b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Map mapC;
        InterfaceC44149a interfaceC44149a = (InterfaceC44149a) obj;
        if (interfaceC44149a instanceof C49337a) {
            Map<String, Object> map = ((C49337a) interfaceC44149a).f440940a;
            mapC = new LinkedHashMap(P0.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                mapC.put(entry.getKey(), entry.getValue().toString());
            }
        } else {
            mapC = P0.c();
        }
        this.f176582b.invoke(mapC);
    }
}
