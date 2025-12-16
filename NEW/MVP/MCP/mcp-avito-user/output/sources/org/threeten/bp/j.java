package org.threeten.bp;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import w81.AbstractC49471c;

/* compiled from: OffsetTime.java */
/* loaded from: classes8.dex */
public final class j extends AbstractC49471c implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Comparable<j>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f422086d = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: b, reason: collision with root package name */
    public final g f422087b;

    /* renamed from: c, reason: collision with root package name */
    public final q f422088c;

    /* compiled from: OffsetTime.java */
    public class a implements org.threeten.bp.temporal.j<j> {
        @Override // org.threeten.bp.temporal.j
        public final j a(org.threeten.bp.temporal.d dVar) {
            return j.o(dVar);
        }
    }

    /* compiled from: OffsetTime.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422089a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f422089a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422089a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f422089a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f422089a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f422089a[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f422089a[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f422089a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        g gVar = g.f422067f;
        q qVar = q.f422108i;
        gVar.getClass();
        new j(gVar, qVar);
        g gVar2 = g.f422068g;
        q qVar2 = q.f422107h;
        gVar2.getClass();
        new j(gVar2, qVar2);
        new a();
    }

    public j(g gVar, q qVar) {
        w81.d.f(gVar, CrashHianalyticsData.TIME);
        this.f422087b = gVar;
        w81.d.f(qVar, "offset");
        this.f422088c = qVar;
    }

    public static j o(org.threeten.bp.temporal.d dVar) {
        if (dVar instanceof j) {
            return (j) dVar;
        }
        try {
            return new j(g.r(dVar), q.t(dVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
        }
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 66, this);
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(this.f422087b.H(), ChronoField.f422129f).w(this.f422088c.f422109c, ChronoField.f422126H);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422126H ? ((ChronoField) hVar).f422152d : this.f422087b.b(hVar) : hVar.d(this);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: c */
    public final org.threeten.bp.temporal.c w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (j) hVar.a(this, j12);
        }
        ChronoField chronoField = ChronoField.f422126H;
        g gVar = this.f422087b;
        if (hVar != chronoField) {
            return r(gVar.c(j12, hVar), this.f422088c);
        }
        ChronoField chronoField2 = (ChronoField) hVar;
        return r(gVar, q.w(chronoField2.f422152d.a(j12, chronoField2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        j jVar2 = jVar;
        boolean zEquals = this.f422088c.equals(jVar2.f422088c);
        g gVar = this.f422087b;
        g gVar2 = jVar2.f422087b;
        if (zEquals) {
            return gVar.compareTo(gVar2);
        }
        int iA2 = w81.d.a(q(), jVar2.q());
        return iA2 == 0 ? gVar.compareTo(gVar2) : iA2;
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(e eVar) {
        return (j) eVar.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f422087b.equals(jVar.f422087b) && this.f422088c.equals(jVar.f422088c);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.NANOS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422202e || jVar == org.threeten.bp.temporal.i.f422201d) {
            return (R) this.f422088c;
        }
        if (jVar == org.threeten.bp.temporal.i.f422204g) {
            return (R) this.f422087b;
        }
        if (jVar == org.threeten.bp.temporal.i.f422199b || jVar == org.threeten.bp.temporal.i.f422203f || jVar == org.threeten.bp.temporal.i.f422198a) {
            return null;
        }
        return (R) super.f(jVar);
    }

    public final int hashCode() {
        return this.f422087b.hashCode() ^ this.f422088c.f422109c;
    }

    @Override // org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return j12 == Long.MIN_VALUE ? r(Long.MAX_VALUE, kVar).r(1L, kVar) : r(-j12, kVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? ((ChronoField) hVar).k() || hVar == ChronoField.f422126H : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422126H ? this.f422088c.f422109c : this.f422087b.m(hVar) : hVar.h(this);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final j r(long j12, org.threeten.bp.temporal.k kVar) {
        return kVar instanceof ChronoUnit ? r(this.f422087b.n(j12, kVar), this.f422088c) : (j) kVar.a(this, j12);
    }

    public final long q() {
        return this.f422087b.H() - (this.f422088c.f422109c * 1000000000);
    }

    public final j r(g gVar, q qVar) {
        return (this.f422087b == gVar && this.f422088c.equals(qVar)) ? this : new j(gVar, qVar);
    }

    public final String toString() {
        return this.f422087b.toString() + this.f422088c.f422110d;
    }
}
