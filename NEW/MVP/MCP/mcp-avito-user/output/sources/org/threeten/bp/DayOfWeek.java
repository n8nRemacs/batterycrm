package org.threeten.bp;

import com.yandex.div2.D8;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class DayOfWeek implements org.threeten.bp.temporal.d, org.threeten.bp.temporal.e {

    /* renamed from: b, reason: collision with root package name */
    public static final DayOfWeek f421836b;

    /* renamed from: c, reason: collision with root package name */
    public static final DayOfWeek f421837c;

    /* renamed from: d, reason: collision with root package name */
    public static final DayOfWeek f421838d;

    /* renamed from: e, reason: collision with root package name */
    public static final DayOfWeek f421839e;

    /* renamed from: f, reason: collision with root package name */
    public static final DayOfWeek[] f421840f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ DayOfWeek[] f421841g;

    static {
        DayOfWeek dayOfWeek = new DayOfWeek("MONDAY", 0);
        f421836b = dayOfWeek;
        DayOfWeek dayOfWeek2 = new DayOfWeek("TUESDAY", 1);
        DayOfWeek dayOfWeek3 = new DayOfWeek("WEDNESDAY", 2);
        f421837c = dayOfWeek3;
        DayOfWeek dayOfWeek4 = new DayOfWeek("THURSDAY", 3);
        f421838d = dayOfWeek4;
        DayOfWeek dayOfWeek5 = new DayOfWeek("FRIDAY", 4);
        DayOfWeek dayOfWeek6 = new DayOfWeek("SATURDAY", 5);
        DayOfWeek dayOfWeek7 = new DayOfWeek("SUNDAY", 6);
        f421839e = dayOfWeek7;
        f421841g = new DayOfWeek[]{dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        new org.threeten.bp.temporal.j<DayOfWeek>() { // from class: org.threeten.bp.DayOfWeek.a
            @Override // org.threeten.bp.temporal.j
            public final DayOfWeek a(org.threeten.bp.temporal.d dVar) {
                DayOfWeek dayOfWeek8 = DayOfWeek.f421836b;
                if (dVar instanceof DayOfWeek) {
                    return (DayOfWeek) dVar;
                }
                try {
                    return DayOfWeek.h(dVar.k(ChronoField.f422143t));
                } catch (DateTimeException e12) {
                    throw new DateTimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName(), e12);
                }
            }
        };
        f421840f = values();
    }

    public DayOfWeek() {
        throw null;
    }

    public static DayOfWeek h(int i12) {
        if (i12 < 1 || i12 > 7) {
            throw new DateTimeException(AK.c.g(i12, "Invalid value for DayOfWeek: "));
        }
        return f421840f[i12 - 1];
    }

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) f421841g.clone();
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(d(), ChronoField.f422143t);
    }

    @Override // org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422143t) {
            return hVar.f();
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.d(this);
    }

    public final int d() {
        return ordinal() + 1;
    }

    @Override // org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.DAYS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422203f || jVar == org.threeten.bp.temporal.i.f422204g || jVar == org.threeten.bp.temporal.i.f422199b || jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422202e) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return hVar == ChronoField.f422143t ? d() : b(hVar).a(m(hVar), hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422143t : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422143t) {
            return d();
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.h(this);
    }
}
