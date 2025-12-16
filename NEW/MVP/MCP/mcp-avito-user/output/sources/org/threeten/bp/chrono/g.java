package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: ChronoPeriodImpl.java */
/* loaded from: classes8.dex */
final class g extends f implements Serializable {
    private static final long serialVersionUID = 275618735781L;

    @Override // org.threeten.bp.temporal.g
    public final org.threeten.bp.temporal.c a(c cVar) {
        if (((j) cVar.f(org.threeten.bp.temporal.i.f422199b)) == null) {
            return cVar;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        ((g) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        for (org.threeten.bp.temporal.k kVar : Collections.unmodifiableList(Arrays.asList(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS))) {
            if (kVar != ChronoUnit.YEARS && kVar != ChronoUnit.MONTHS && kVar != ChronoUnit.DAYS) {
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
            }
            if (0 != 0) {
                return "null P";
            }
        }
        return "null P0D";
    }
}
