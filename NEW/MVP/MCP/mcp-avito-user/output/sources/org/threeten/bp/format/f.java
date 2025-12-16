package org.threeten.bp.format;

import androidx.appcompat.app.r;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.threeten.bp.chrono.o;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import w81.AbstractC49471c;

/* compiled from: DateTimeParseContext.java */
/* loaded from: classes8.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f422039a;

    /* renamed from: b, reason: collision with root package name */
    public final j f422040b;

    /* renamed from: c, reason: collision with root package name */
    public final o f422041c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f422042d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f422043e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<b> f422044f;

    /* compiled from: DateTimeParseContext.java */
    public final class b extends AbstractC49471c {

        /* renamed from: b, reason: collision with root package name */
        public org.threeten.bp.chrono.j f422045b;

        /* renamed from: c, reason: collision with root package name */
        public org.threeten.bp.o f422046c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f422047d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f422048e;

        /* renamed from: f, reason: collision with root package name */
        public final org.threeten.bp.k f422049f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f422050g;

        @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
        public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
            return jVar == org.threeten.bp.temporal.i.f422199b ? (R) this.f422045b : (jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422201d) ? (R) this.f422046c : (R) super.f(jVar);
        }

        @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
        public final int k(org.threeten.bp.temporal.h hVar) {
            HashMap map = this.f422047d;
            if (map.containsKey(hVar)) {
                return w81.d.m(((Long) map.get(hVar)).longValue());
            }
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }

        @Override // org.threeten.bp.temporal.d
        public final boolean l(org.threeten.bp.temporal.h hVar) {
            return this.f422047d.containsKey(hVar);
        }

        @Override // org.threeten.bp.temporal.d
        public final long m(org.threeten.bp.temporal.h hVar) {
            HashMap map = this.f422047d;
            if (map.containsKey(hVar)) {
                return ((Long) map.get(hVar)).longValue();
            }
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }

        public final String toString() {
            return this.f422047d.toString() + "," + this.f422045b + "," + this.f422046c;
        }

        public b() {
            this.f422045b = null;
            this.f422046c = null;
            this.f422047d = new HashMap();
            this.f422049f = org.threeten.bp.k.f422090c;
        }
    }

    public f(c cVar) {
        this.f422042d = true;
        this.f422043e = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f422044f = arrayList;
        this.f422039a = cVar.f421980b;
        this.f422040b = cVar.f421981c;
        this.f422041c = cVar.f421983e;
        arrayList.add(new b());
    }

    public final boolean a(char c12, char c13) {
        return this.f422042d ? c12 == c13 : c12 == c13 || Character.toUpperCase(c12) == Character.toUpperCase(c13) || Character.toLowerCase(c12) == Character.toLowerCase(c13);
    }

    public final b b() {
        return (b) r.j(1, this.f422044f);
    }

    public final Long c(ChronoField chronoField) {
        return (Long) b().f422047d.get(chronoField);
    }

    public final void d(org.threeten.bp.o oVar) {
        w81.d.f(oVar, "zone");
        b().f422046c = oVar;
    }

    public final int e(org.threeten.bp.temporal.h hVar, long j12, int i12, int i13) {
        w81.d.f(hVar, "field");
        Long l12 = (Long) b().f422047d.put(hVar, Long.valueOf(j12));
        return (l12 == null || l12.longValue() == j12) ? i13 : ~i12;
    }

    public final boolean f(CharSequence charSequence, int i12, CharSequence charSequence2, int i13, int i14) {
        if (i12 + i14 > charSequence.length() || i13 + i14 > charSequence2.length()) {
            return false;
        }
        if (this.f422042d) {
            for (int i15 = 0; i15 < i14; i15++) {
                if (charSequence.charAt(i12 + i15) != charSequence2.charAt(i13 + i15)) {
                    return false;
                }
            }
            return true;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            char cCharAt = charSequence.charAt(i12 + i16);
            char cCharAt2 = charSequence2.charAt(i13 + i16);
            if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return b().toString();
    }

    public f(f fVar) {
        this.f422042d = true;
        this.f422043e = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f422044f = arrayList;
        this.f422039a = fVar.f422039a;
        this.f422040b = fVar.f422040b;
        this.f422041c = fVar.f422041c;
        this.f422042d = fVar.f422042d;
        this.f422043e = fVar.f422043e;
        arrayList.add(new b());
    }
}
