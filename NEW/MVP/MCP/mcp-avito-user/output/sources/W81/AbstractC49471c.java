package w81;

import com.yandex.div2.D8;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.l;

/* compiled from: DefaultInterfaceTemporalAccessor.java */
/* renamed from: w81.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC49471c implements org.threeten.bp.temporal.d {
    @Override // org.threeten.bp.temporal.d
    public l b(h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.d(this);
        }
        if (l(hVar)) {
            return ((ChronoField) hVar).f422152d;
        }
        throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
    }

    @Override // org.threeten.bp.temporal.d
    public <R> R f(j<R> jVar) {
        if (jVar == i.f422198a || jVar == i.f422199b || jVar == i.f422200c) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // org.threeten.bp.temporal.d
    public int k(h hVar) {
        return b(hVar).a(m(hVar), hVar);
    }
}
