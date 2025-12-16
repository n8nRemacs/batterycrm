package io.sentry;

import io.sentry.connection.LockedDownException;
import io.sentry.connection.TooManyRequestsException;
import io.sentry.event.Event;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import x41.InterfaceC49770g;

/* compiled from: SentryClient.java */
/* loaded from: classes8.dex */
public class c {

    /* renamed from: m, reason: collision with root package name */
    public static final org.slf4j.a f405075m = org.slf4j.b.d(c.class);

    /* renamed from: n, reason: collision with root package name */
    public static final org.slf4j.a f405076n = org.slf4j.b.e(c.class.getName().concat(".lockdown"));

    /* renamed from: a, reason: collision with root package name */
    public String f405077a;

    /* renamed from: b, reason: collision with root package name */
    public String f405078b;

    /* renamed from: c, reason: collision with root package name */
    public String f405079c;

    /* renamed from: d, reason: collision with root package name */
    public String f405080d;

    /* renamed from: i, reason: collision with root package name */
    public final io.sentry.connection.d f405085i;

    /* renamed from: k, reason: collision with root package name */
    public final io.sentry.context.b f405087k;

    /* renamed from: l, reason: collision with root package name */
    public e f405088l;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f405081e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f405082f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f405083g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f405084h = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f405086j = new CopyOnWriteArrayList();

    public c(io.sentry.connection.d dVar, io.sentry.context.b bVar) {
        this.f405085i = dVar;
        this.f405087k = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.UUID] */
    public final void a(Event event) {
        org.slf4j.a aVar;
        InterfaceC49770g interfaceC49770g;
        io.sentry.context.b context = this.f405087k;
        Iterator it = this.f405084h.iterator();
        do {
            boolean zHasNext = it.hasNext();
            aVar = f405075m;
            try {
                if (!zHasNext) {
                    try {
                        this.f405085i.L2(event);
                        context = context.getContext();
                    } catch (LockedDownException | TooManyRequestsException unused) {
                        aVar.debug("Dropping an Event due to lockdown: " + event);
                        context = context.getContext();
                    } catch (Exception e12) {
                        aVar.l("An exception occurred while sending the event to Sentry.", e12);
                        context = context.getContext();
                    }
                    event = event.f405166b;
                    context.getClass();
                    return;
                }
                interfaceC49770g = (InterfaceC49770g) it.next();
            } catch (Throwable th2) {
                io.sentry.context.a context2 = context.getContext();
                UUID uuid = event.f405166b;
                context2.getClass();
                throw th2;
            }
        } while (interfaceC49770g.a());
        aVar.c(interfaceC49770g);
    }

    public final String toString() {
        return "SentryClient{release='" + this.f405077a + "', dist='" + this.f405078b + "', environment='" + this.f405079c + "', serverName='" + this.f405080d + "', tags=" + this.f405081e + ", mdcTags=" + this.f405082f + ", extra=" + this.f405083g + ", connection=" + this.f405085i + ", builderHelpers=" + this.f405086j + ", contextManager=" + this.f405087k + ", uncaughtExceptionHandler=" + this.f405088l + '}';
    }
}
