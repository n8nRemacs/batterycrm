package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* compiled from: IsoChronology.java */
/* loaded from: classes8.dex */
public final class o extends j implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final o f421908d = new o();
    private static final long serialVersionUID = -1440403870442975015L;

    public static boolean r(long j12) {
        return (3 & j12) == 0 && (j12 % 100 != 0 || j12 % 400 == 0);
    }

    private Object readResolve() {
        return f421908d;
    }

    @Override // org.threeten.bp.chrono.j
    public final c a(int i12, int i13, int i14) {
        return org.threeten.bp.e.N(i12, i13, i14);
    }

    @Override // org.threeten.bp.chrono.j
    public final c b(org.threeten.bp.temporal.d dVar) {
        return org.threeten.bp.e.B(dVar);
    }

    @Override // org.threeten.bp.chrono.j
    public final c c(long j12) {
        return org.threeten.bp.e.P(j12);
    }

    @Override // org.threeten.bp.chrono.j
    public final l h(int i12) {
        if (i12 == 0) {
            return IsoEra.f421854b;
        }
        if (i12 == 1) {
            return IsoEra.f421855c;
        }
        throw new DateTimeException(AK.c.g(i12, "Invalid era: "));
    }

    @Override // org.threeten.bp.chrono.j
    public final String k() {
        return "iso8601";
    }

    @Override // org.threeten.bp.chrono.j
    public final String l() {
        return "ISO";
    }

    @Override // org.threeten.bp.chrono.j
    public final d n(org.threeten.bp.temporal.c cVar) {
        return org.threeten.bp.f.B(cVar);
    }

    @Override // org.threeten.bp.chrono.j
    public final h q(org.threeten.bp.d dVar, org.threeten.bp.o oVar) {
        int i12 = org.threeten.bp.s.f422114e;
        w81.d.f(dVar, "instant");
        w81.d.f(oVar, "zone");
        return org.threeten.bp.s.B(dVar.f421935b, dVar.f421936c, oVar);
    }
}
