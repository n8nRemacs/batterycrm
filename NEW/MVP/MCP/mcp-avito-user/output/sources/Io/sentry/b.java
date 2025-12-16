package io.sentry;

import io.sentry.event.Event;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import t41.C48502a;
import v41.C49163b;
import w41.C49445a;
import x41.InterfaceC49766c;

/* compiled from: Sentry.java */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final org.slf4j.a f405066a = org.slf4j.b.d(b.class);

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f405067b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f405068c = new AtomicBoolean(false);

    public static void a(io.sentry.event.b bVar) {
        c cVarD = d();
        boolean zA2 = io.sentry.util.b.a(cVarD.f405077a);
        Event event = bVar.f405189a;
        if (!zA2) {
            event.f405176l = cVarD.f405077a.trim();
            if (!io.sentry.util.b.a(cVarD.f405078b)) {
                event.f405177m = cVarD.f405078b.trim();
            }
        }
        if (!io.sentry.util.b.a(cVarD.f405079c)) {
            event.f405178n = cVarD.f405079c.trim();
        }
        if (!io.sentry.util.b.a(cVarD.f405080d)) {
            event.f405179o = cVarD.f405080d.trim();
        }
        for (Map.Entry entry : cVarD.f405081e.entrySet()) {
            event.f405173i.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : cVarD.f405083g.entrySet()) {
            event.a().put((String) entry2.getKey(), entry2.getValue());
        }
        Iterator it = cVarD.f405086j.iterator();
        while (it.hasNext()) {
            ((InterfaceC49766c) it.next()).a(bVar);
        }
        cVarD.a(bVar.b());
    }

    public static void b() throws IOException {
        if (f405067b == null) {
            return;
        }
        c cVar = f405067b;
        e eVar = cVar.f405088l;
        if (eVar != null) {
            eVar.f405158b = Boolean.FALSE;
            if (Thread.getDefaultUncaughtExceptionHandler() == eVar) {
                Thread.setDefaultUncaughtExceptionHandler(eVar.f405157a);
            }
        }
        try {
            cVar.f405085i.close();
            f405067b = null;
            f405068c.set(false);
        } catch (IOException e12) {
            throw new RuntimeException("Couldn't close the Sentry connection", e12);
        }
    }

    public static io.sentry.context.a c() {
        return d().f405087k.getContext();
    }

    public static c d() {
        if (f405067b != null) {
            return f405067b;
        }
        synchronized (b.class) {
            try {
                if (f405067b == null) {
                    AtomicBoolean atomicBoolean = f405068c;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        e(null, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f405067b;
    }

    public static c e(String str, C48502a c48502a) throws Exception {
        org.slf4j.a aVar = d.f405155a;
        try {
            c cVarA = null;
            if (io.sentry.util.b.a(str)) {
                org.slf4j.a aVar2 = C49445a.f441268k;
                String strB = C49163b.b("dsn", null);
                if (io.sentry.util.b.a(strB)) {
                    strB = C49163b.b("dns", null);
                }
                if (io.sentry.util.b.a(strB)) {
                    C49445a.f441268k.f("*** Couldn't find a suitable DSN, Sentry operations will do nothing! See documentation: https://docs.sentry.io/clients/java/ ***");
                    str = "noop://localhost?async=false";
                } else {
                    str = strB;
                }
            }
            C49445a c49445a = new C49445a(str);
            d aVar3 = c48502a;
            if (c48502a == null) {
                String strB2 = C49163b.b("factory", c49445a);
                if (io.sentry.util.b.a(strB2)) {
                    aVar3 = new a();
                } else {
                    try {
                        aVar3 = (d) Class.forName(strB2).newInstance();
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e12) {
                        aVar.l("Error creating SentryClient using factory class: '" + strB2 + "'.", e12);
                    }
                }
                cVarA = aVar3.a(c49445a);
            } else {
                cVarA = aVar3.a(c49445a);
            }
            if (f405067b != null) {
                f405066a.h(f405067b, cVarA);
            }
            f405067b = cVarA;
            return cVarA;
        } catch (Exception e13) {
            aVar.d("Error creating valid DSN from: '{}'.", str, e13);
            throw e13;
        }
    }
}
