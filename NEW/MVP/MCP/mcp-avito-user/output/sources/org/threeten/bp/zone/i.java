package org.threeten.bp.zone;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.zone.h;

/* compiled from: ZoneRulesProvider.java */
/* loaded from: classes16.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<i> f422258a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f422259b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        if (h.f422256a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<h> atomicReference = h.f422257b;
        h.b bVar = new h.b();
        while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
        }
        atomicReference.get().a();
    }

    public static f a(String str, boolean z12) {
        w81.d.f(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f422259b;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar != null) {
            return iVar.b(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException("Unknown time-zone ID: ".concat(str));
    }

    public static void d(i iVar) {
        w81.d.f(iVar, "provider");
        Iterator it = iVar.c().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            w81.d.f(str, "zoneId");
            if (((i) f422259b.putIfAbsent(str, iVar)) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
            }
        }
        f422258a.add(iVar);
    }

    public abstract f b(String str);

    public abstract HashSet c();
}
