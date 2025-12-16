package x41;

import io.sentry.event.Breadcrumb;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import y41.C50063i;

/* compiled from: ContextBuilderHelper.java */
/* renamed from: x41.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49765b implements InterfaceC49766c {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.c f442208a;

    @Override // x41.InterfaceC49766c
    public final void a(io.sentry.event.b bVar) {
        Map mapEmptyMap;
        io.sentry.context.a context = this.f442208a.f405087k.getContext();
        List<Breadcrumb> listB = context.b();
        if (!listB.isEmpty()) {
            bVar.f405189a.f405174j = listB;
        }
        synchronized (context) {
        }
        if (context.f405151c != null) {
            io.sentry.event.e eVar = context.f405151c;
            bVar.d(new C50063i(eVar.f405202b, eVar.f405203c, eVar.f405204d, eVar.f405205e), true);
        }
        synchronized (context) {
            mapEmptyMap = Collections.emptyMap();
        }
        if (!mapEmptyMap.isEmpty()) {
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                bVar.f405189a.f405173i.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, Object> mapC = context.c();
        if (mapC.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry2 : mapC.entrySet()) {
            bVar.f405189a.a().put(entry2.getKey(), entry2.getValue());
        }
    }
}
