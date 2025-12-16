package org.threeten.bp;

import com.yandex.div2.D8;
import java.io.InvalidObjectException;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import w81.AbstractC49471c;

/* compiled from: Instant.java */
/* loaded from: classes8.dex */
public final class d extends AbstractC49471c implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Comparable<d>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final d f421934d = new d(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: b, reason: collision with root package name */
    public final long f421935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f421936c;

    /* compiled from: Instant.java */
    public class a implements org.threeten.bp.temporal.j<d> {
        @Override // org.threeten.bp.temporal.j
        public final d a(org.threeten.bp.temporal.d dVar) {
            return d.p(dVar);
        }
    }

    /* compiled from: Instant.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421937a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f421938b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f421938b = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421938b[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421938b[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421938b[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421938b[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421938b[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421938b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f421938b[ChronoUnit.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f421937a = iArr2;
            try {
                iArr2[ChronoField.f422128e.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f421937a[ChronoField.f422130g.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f421937a[ChronoField.f422132i.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f421937a[ChronoField.f422125G.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        q(-31557014167219200L, 0L);
        q(31556889864403199L, 999999999L);
        new a();
    }

    public d(long j12, int i12) {
        this.f421935b = j12;
        this.f421936c = i12;
    }

    public static d o(int i12, long j12) {
        if ((i12 | j12) == 0) {
            return f421934d;
        }
        if (j12 < -31557014167219200L || j12 > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new d(j12, i12);
    }

    public static d p(org.threeten.bp.temporal.d dVar) {
        try {
            return q(dVar.m(ChronoField.f422125G), dVar.k(ChronoField.f422128e));
        } catch (DateTimeException e12) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName(), e12);
        }
    }

    public static d q(long j12, long j13) {
        return o(w81.d.e(Http2Connection.DEGRADED_PONG_TIMEOUT_NS, j13), w81.d.h(j12, w81.d.c(j13, 1000000000L)));
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 2, this);
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(this.f421935b, ChronoField.f422125G).w(this.f421936c, ChronoField.f422128e);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: c */
    public final org.threeten.bp.temporal.c w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (d) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        chronoField.i(j12);
        int iOrdinal = chronoField.ordinal();
        int i12 = this.f421936c;
        long j13 = this.f421935b;
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                int i13 = ((int) j12) * 1000;
                if (i13 != i12) {
                    return o(i13, j13);
                }
            } else if (iOrdinal == 4) {
                int i14 = ((int) j12) * 1000000;
                if (i14 != i12) {
                    return o(i14, j13);
                }
            } else {
                if (iOrdinal != 28) {
                    throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
                }
                if (j12 != j13) {
                    return o(i12, j12);
                }
            }
        } else if (j12 != i12) {
            return o((int) j12, j13);
        }
        return this;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        int iA2 = w81.d.a(this.f421935b, dVar2.f421935b);
        return iA2 != 0 ? iA2 : this.f421936c - dVar2.f421936c;
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(e eVar) {
        return (d) eVar.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f421935b == dVar.f421935b && this.f421936c == dVar.f421936c;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.NANOS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422203f || jVar == org.threeten.bp.temporal.i.f422204g || jVar == org.threeten.bp.temporal.i.f422199b || jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422202e) {
            return null;
        }
        return jVar.a(this);
    }

    public final int hashCode() {
        long j12 = this.f421935b;
        return (this.f421936c * 51) + ((int) (j12 ^ (j12 >>> 32)));
    }

    @Override // org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return j12 == Long.MIN_VALUE ? r(Long.MAX_VALUE, kVar).r(1L, kVar) : r(-j12, kVar);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return super.b(hVar).a(hVar.h(this), hVar);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        int i12 = this.f421936c;
        if (iOrdinal == 0) {
            return i12;
        }
        if (iOrdinal == 2) {
            return i12 / 1000;
        }
        if (iOrdinal == 4) {
            return i12 / 1000000;
        }
        throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422125G || hVar == ChronoField.f422128e || hVar == ChronoField.f422130g || hVar == ChronoField.f422132i : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        int i12;
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        int i13 = this.f421936c;
        if (iOrdinal == 0) {
            return i13;
        }
        if (iOrdinal == 2) {
            i12 = i13 / 1000;
        } else {
            if (iOrdinal != 4) {
                if (iOrdinal == 28) {
                    return this.f421935b;
                }
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
            }
            i12 = i13 / 1000000;
        }
        return i12;
    }

    public final d r(long j12, long j13) {
        if ((j12 | j13) == 0) {
            return this;
        }
        return q(w81.d.h(w81.d.h(this.f421935b, j12), j13 / 1000000000), this.f421936c + (j13 % 1000000000));
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final d r(long j12, org.threeten.bp.temporal.k kVar) {
        if (!(kVar instanceof ChronoUnit)) {
            return (d) kVar.a(this, j12);
        }
        switch (((ChronoUnit) kVar).ordinal()) {
            case 0:
                return r(0L, j12);
            case 1:
                return r(j12 / 1000000, (j12 % 1000000) * 1000);
            case 2:
                return r(j12 / 1000, (j12 % 1000) * 1000000);
            case 3:
                return r(j12, 0L);
            case 4:
                return r(w81.d.i(60, j12), 0L);
            case 5:
                return r(w81.d.i(3600, j12), 0L);
            case 6:
                return r(w81.d.i(43200, j12), 0L);
            case 7:
                return r(w81.d.i(86400, j12), 0L);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
        }
    }

    public final String toString() {
        return org.threeten.bp.format.c.f421978h.a(this);
    }
}
