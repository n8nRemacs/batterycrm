package org.threeten.bp.chrono;

import java.io.InvalidObjectException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: Chronology.java */
/* loaded from: classes8.dex */
public abstract class j implements Comparable<j> {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<String, j> f421874b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, j> f421875c;

    /* compiled from: Chronology.java */
    public class a implements org.threeten.bp.temporal.j<j> {
        @Override // org.threeten.bp.temporal.j
        public final j a(org.threeten.bp.temporal.d dVar) {
            return j.i(dVar);
        }
    }

    static {
        new a();
        f421874b = new ConcurrentHashMap<>();
        f421875c = new ConcurrentHashMap<>();
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    public static j i(org.threeten.bp.temporal.d dVar) {
        w81.d.f(dVar, "temporal");
        j jVar = (j) dVar.f(org.threeten.bp.temporal.i.f422199b);
        return jVar != null ? jVar : o.f421908d;
    }

    public static void m() {
        ConcurrentHashMap<String, j> concurrentHashMap = f421874b;
        if (concurrentHashMap.isEmpty()) {
            o(o.f421908d);
            o(v.f421929d);
            o(s.f421922d);
            o(p.f421910e);
            m mVar = m.f421876d;
            o(mVar);
            concurrentHashMap.putIfAbsent("Hijrah", mVar);
            ConcurrentHashMap<String, j> concurrentHashMap2 = f421875c;
            concurrentHashMap2.putIfAbsent("islamic", mVar);
            Iterator it = ServiceLoader.load(j.class, j.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                concurrentHashMap.putIfAbsent(jVar.l(), jVar);
                concurrentHashMap2.putIfAbsent(jVar.k(), jVar);
            }
        }
    }

    public static void o(j jVar) {
        f421874b.putIfAbsent(jVar.l(), jVar);
        f421875c.putIfAbsent(jVar.k(), jVar);
    }

    public static void p(HashMap map, ChronoField chronoField, long j12) {
        Long l12 = (Long) map.get(chronoField);
        if (l12 == null || l12.longValue() == j12) {
            map.put(chronoField, Long.valueOf(j12));
            return;
        }
        throw new DateTimeException("Invalid state, field: " + chronoField + " " + l12 + " conflicts with " + chronoField + " " + j12);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new u((byte) 11, this);
    }

    public abstract c a(int i12, int i13, int i14);

    public abstract c b(org.threeten.bp.temporal.d dVar);

    public abstract c c(long j12);

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        return l().compareTo(jVar.l());
    }

    public final <D extends c> D d(org.threeten.bp.temporal.c cVar) {
        D d12 = (D) cVar;
        if (equals(d12.q())) {
            return d12;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + l() + ", actual: " + d12.q().l());
    }

    public final <D extends c> e<D> e(org.threeten.bp.temporal.c cVar) {
        e<D> eVar = (e) cVar;
        if (equals(eVar.f421865b.q())) {
            return eVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + l() + ", supplied: " + eVar.f421865b.q().l());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && l().compareTo(((j) obj).l()) == 0;
    }

    public final <D extends c> i<D> f(org.threeten.bp.temporal.c cVar) {
        i<D> iVar = (i) cVar;
        if (equals(iVar.u().q())) {
            return iVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + l() + ", supplied: " + iVar.u().q().l());
    }

    public abstract l h(int i12);

    public final int hashCode() {
        return getClass().hashCode() ^ l().hashCode();
    }

    public abstract String k();

    public abstract String l();

    public d n(org.threeten.bp.temporal.c cVar) {
        try {
            return b(cVar).o(org.threeten.bp.g.r(cVar));
        } catch (DateTimeException e12) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + cVar.getClass(), e12);
        }
    }

    public h<?> q(org.threeten.bp.d dVar, org.threeten.bp.o oVar) {
        return i.C(this, dVar, oVar);
    }

    public final String toString() {
        return l();
    }
}
