package org.threeten.bp.chrono;

import com.yandex.div2.D8;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class HijrahEra implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final HijrahEra f421851b;

    /* renamed from: c, reason: collision with root package name */
    public static final HijrahEra f421852c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ HijrahEra[] f421853d;

    static {
        HijrahEra hijrahEra = new HijrahEra("BEFORE_AH", 0);
        f421851b = hijrahEra;
        HijrahEra hijrahEra2 = new HijrahEra("AH", 1);
        f421852c = hijrahEra2;
        f421853d = new HijrahEra[]{hijrahEra, hijrahEra2};
    }

    public HijrahEra() {
        throw null;
    }

    public static HijrahEra valueOf(String str) {
        return (HijrahEra) Enum.valueOf(HijrahEra.class, str);
    }

    public static HijrahEra[] values() {
        return (HijrahEra[]) f421853d.clone();
    }

    private Object writeReplace() {
        return new u((byte) 4, this);
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(ordinal(), ChronoField.f422124F);
    }

    @Override // org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422124F) {
            return org.threeten.bp.temporal.l.d(1L, 1L);
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
