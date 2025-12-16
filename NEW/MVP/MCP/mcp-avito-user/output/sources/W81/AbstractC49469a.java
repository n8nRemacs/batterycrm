package w81;

import com.yandex.div2.D8;
import org.threeten.bp.chrono.l;
import org.threeten.bp.chrono.r;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;

/* compiled from: DefaultInterfaceEra.java */
/* renamed from: w81.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC49469a extends AbstractC49471c implements l {
    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(((r) this).f421919b, ChronoField.f422124F);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(j<R> jVar) {
        if (jVar == i.f422200c) {
            return (R) ChronoUnit.ERAS;
        }
        if (jVar == i.f422199b || jVar == i.f422201d || jVar == i.f422198a || jVar == i.f422202e || jVar == i.f422203f || jVar == i.f422204g) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(h hVar) {
        return hVar == ChronoField.f422124F ? ((r) this).f421919b : b(hVar).a(m(hVar), hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422124F : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(h hVar) {
        if (hVar == ChronoField.f422124F) {
            return ((r) this).f421919b;
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.h(this);
    }
}
