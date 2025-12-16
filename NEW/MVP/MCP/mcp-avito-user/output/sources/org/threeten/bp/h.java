package org.threeten.bp;

import androidx.camera.camera2.internal.G;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.yandex.div2.D8;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import w81.AbstractC49471c;

/* compiled from: MonthDay.java */
/* loaded from: classes8.dex */
public final class h extends AbstractC49471c implements org.threeten.bp.temporal.d, org.threeten.bp.temporal.e, Comparable<h>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f422078d = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: b, reason: collision with root package name */
    public final int f422079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f422080c;

    /* compiled from: MonthDay.java */
    public class a implements org.threeten.bp.temporal.j<h> {
        @Override // org.threeten.bp.temporal.j
        public final h a(org.threeten.bp.temporal.d dVar) {
            int i12 = h.f422078d;
            if (dVar instanceof h) {
                return (h) dVar;
            }
            try {
                if (!org.threeten.bp.chrono.o.f421908d.equals(org.threeten.bp.chrono.j.i(dVar))) {
                    dVar = e.B(dVar);
                }
                return h.o(dVar.k(ChronoField.f422120B), dVar.k(ChronoField.f422146w));
            } catch (DateTimeException unused) {
                throw new DateTimeException("Unable to obtain MonthDay from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
            }
        }
    }

    /* compiled from: MonthDay.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422081a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f422081a = iArr;
            try {
                iArr[ChronoField.f422146w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422081a[ChronoField.f422120B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a();
        org.threeten.bp.format.d dVar = new org.threeten.bp.format.d();
        dVar.d("--");
        dVar.l(ChronoField.f422120B, 2);
        dVar.c('-');
        dVar.l(ChronoField.f422146w, 2);
        dVar.p();
    }

    public h(int i12, int i13) {
        this.f422079b = i12;
        this.f422080c = i13;
    }

    public static h o(int i12, int i13) {
        Month monthQ = Month.q(i12);
        w81.d.f(monthQ, SelectionType.TYPE_MONTH);
        ChronoField.f422146w.i(i13);
        if (i13 <= monthQ.p()) {
            return new h(monthQ.h(), i13);
        }
        StringBuilder sbJ = G.j(i13, "Illegal value for DayOfMonth field, value ", " is not valid for month ");
        sbJ.append(monthQ.name());
        throw new DateTimeException(sbJ.toString());
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 64, this);
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        if (!org.threeten.bp.chrono.j.i(cVar).equals(org.threeten.bp.chrono.o.f421908d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        org.threeten.bp.temporal.c cVarW = cVar.w(this.f422079b, ChronoField.f422120B);
        ChronoField chronoField = ChronoField.f422146w;
        return cVarW.w(Math.min(cVarW.b(chronoField).f422208e, this.f422080c), chronoField);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422120B) {
            return hVar.f();
        }
        if (hVar != ChronoField.f422146w) {
            return super.b(hVar);
        }
        int iOrdinal = Month.q(this.f422079b).ordinal();
        return org.threeten.bp.temporal.l.e(1L, 1L, iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : 28, Month.q(r10).p());
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        h hVar2 = hVar;
        int i12 = this.f422079b - hVar2.f422079b;
        return i12 == 0 ? this.f422080c - hVar2.f422080c : i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f422079b == hVar.f422079b && this.f422080c == hVar.f422080c;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        return jVar == org.threeten.bp.temporal.i.f422199b ? (R) org.threeten.bp.chrono.o.f421908d : (R) super.f(jVar);
    }

    public final int hashCode() {
        return (this.f422079b << 6) + this.f422080c;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return b(hVar).a(m(hVar), hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422120B || hVar == ChronoField.f422146w : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        int i12;
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        if (iOrdinal == 18) {
            i12 = this.f422080c;
        } else {
            if (iOrdinal != 23) {
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
            }
            i12 = this.f422079b;
        }
        return i12;
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(10, "--");
        int i12 = this.f422079b;
        sbQ.append(i12 < 10 ? "0" : "");
        sbQ.append(i12);
        int i13 = this.f422080c;
        sbQ.append(i13 < 10 ? "-0" : "-");
        sbQ.append(i13);
        return sbQ.toString();
    }
}
