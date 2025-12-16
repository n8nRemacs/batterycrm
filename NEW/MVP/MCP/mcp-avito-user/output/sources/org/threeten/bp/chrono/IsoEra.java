package org.threeten.bp.chrono;

import com.yandex.div2.D8;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class IsoEra implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final IsoEra f421854b;

    /* renamed from: c, reason: collision with root package name */
    public static final IsoEra f421855c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ IsoEra[] f421856d;

    static {
        IsoEra isoEra = new IsoEra("BCE", 0);
        f421854b = isoEra;
        IsoEra isoEra2 = new IsoEra("CE", 1);
        f421855c = isoEra2;
        f421856d = new IsoEra[]{isoEra, isoEra2};
    }

    public IsoEra() {
        throw null;
    }

    public static IsoEra valueOf(String str) {
        return (IsoEra) Enum.valueOf(IsoEra.class, str);
    }

    public static IsoEra[] values() {
        return (IsoEra[]) f421856d.clone();
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(ordinal(), ChronoField.f422124F);
    }

    @Override // org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422124F) {
            return hVar.f();
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.d(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.ERAS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422199b || jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422202e || jVar == org.threeten.bp.temporal.i.f422203f || jVar == org.threeten.bp.temporal.i.f422204g) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return hVar == ChronoField.f422124F ? ordinal() : b(hVar).a(m(hVar), hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422124F : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422124F) {
            return ordinal();
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.h(this);
    }
}
