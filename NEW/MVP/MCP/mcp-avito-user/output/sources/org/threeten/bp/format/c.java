package org.threeten.bp.format;

import androidx.appcompat.app.r;
import java.io.IOException;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.o;
import org.threeten.bp.format.d;
import org.threeten.bp.format.f;
import org.threeten.bp.temporal.ChronoField;
import w81.AbstractC49471c;

/* compiled from: DateTimeFormatter.java */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final c f421976f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f421977g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f421978h;

    /* renamed from: a, reason: collision with root package name */
    public final d.f f421979a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f421980b;

    /* renamed from: c, reason: collision with root package name */
    public final j f421981c;

    /* renamed from: d, reason: collision with root package name */
    public final ResolverStyle f421982d;

    /* renamed from: e, reason: collision with root package name */
    public final o f421983e;

    /* compiled from: DateTimeFormatter.java */
    public class a implements org.threeten.bp.temporal.j<org.threeten.bp.k> {
        @Override // org.threeten.bp.temporal.j
        public final org.threeten.bp.k a(org.threeten.bp.temporal.d dVar) {
            return dVar instanceof org.threeten.bp.format.a ? ((org.threeten.bp.format.a) dVar).f421975h : org.threeten.bp.k.f422090c;
        }
    }

    /* compiled from: DateTimeFormatter.java */
    public class b implements org.threeten.bp.temporal.j<Boolean> {
        @Override // org.threeten.bp.temporal.j
        public final Boolean a(org.threeten.bp.temporal.d dVar) {
            return dVar instanceof org.threeten.bp.format.a ? Boolean.valueOf(((org.threeten.bp.format.a) dVar).f421974g) : Boolean.FALSE;
        }
    }

    static {
        d dVar = new d();
        ChronoField chronoField = ChronoField.f422123E;
        SignStyle signStyle = SignStyle.f421960e;
        dVar.m(chronoField, 4, 10, signStyle);
        dVar.c('-');
        ChronoField chronoField2 = ChronoField.f422120B;
        dVar.l(chronoField2, 2);
        dVar.c('-');
        ChronoField chronoField3 = ChronoField.f422146w;
        dVar.l(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.f421953b;
        c cVarQ = dVar.q(resolverStyle);
        o oVar = o.f421908d;
        c cVarE = cVarQ.e(oVar);
        f421976f = cVarE;
        d dVar2 = new d();
        d.q qVar = d.q.f422020c;
        dVar2.b(qVar);
        dVar2.a(cVarE);
        d.n nVar = d.n.f422010e;
        dVar2.b(nVar);
        dVar2.q(resolverStyle).e(oVar);
        d dVar3 = new d();
        dVar3.b(qVar);
        dVar3.a(cVarE);
        dVar3.o();
        dVar3.b(nVar);
        dVar3.q(resolverStyle).e(oVar);
        d dVar4 = new d();
        ChronoField chronoField4 = ChronoField.f422140q;
        dVar4.l(chronoField4, 2);
        dVar4.c(':');
        ChronoField chronoField5 = ChronoField.f422136m;
        dVar4.l(chronoField5, 2);
        dVar4.o();
        dVar4.c(':');
        ChronoField chronoField6 = ChronoField.f422134k;
        dVar4.l(chronoField6, 2);
        dVar4.o();
        dVar4.b(new d.i(ChronoField.f422128e, 0, 9, true));
        c cVarQ2 = dVar4.q(resolverStyle);
        f421977g = cVarQ2;
        d dVar5 = new d();
        dVar5.b(qVar);
        dVar5.a(cVarQ2);
        dVar5.b(nVar);
        dVar5.q(resolverStyle);
        d dVar6 = new d();
        dVar6.b(qVar);
        dVar6.a(cVarQ2);
        dVar6.o();
        dVar6.b(nVar);
        dVar6.q(resolverStyle);
        d dVar7 = new d();
        dVar7.b(qVar);
        dVar7.a(cVarE);
        dVar7.c('T');
        dVar7.a(cVarQ2);
        c cVarE2 = dVar7.q(resolverStyle).e(oVar);
        d dVar8 = new d();
        dVar8.b(qVar);
        dVar8.a(cVarE2);
        dVar8.b(nVar);
        c cVarE3 = dVar8.q(resolverStyle).e(oVar);
        d dVar9 = new d();
        dVar9.a(cVarE3);
        dVar9.o();
        dVar9.c('[');
        d.q qVar2 = d.q.f422019b;
        dVar9.b(qVar2);
        org.threeten.bp.temporal.j<org.threeten.bp.o> jVar = d.f421984h;
        dVar9.b(new d.u("ZoneRegionId()", jVar));
        dVar9.c(']');
        dVar9.q(resolverStyle).e(oVar);
        d dVar10 = new d();
        dVar10.a(cVarE2);
        dVar10.o();
        dVar10.b(nVar);
        dVar10.o();
        dVar10.c('[');
        dVar10.b(qVar2);
        dVar10.b(new d.u("ZoneRegionId()", jVar));
        dVar10.c(']');
        dVar10.q(resolverStyle).e(oVar);
        d dVar11 = new d();
        dVar11.b(qVar);
        dVar11.m(chronoField, 4, 10, signStyle);
        dVar11.c('-');
        dVar11.l(ChronoField.f422147x, 3);
        dVar11.o();
        dVar11.b(nVar);
        dVar11.q(resolverStyle).e(oVar);
        d dVar12 = new d();
        dVar12.b(qVar);
        dVar12.m(org.threeten.bp.temporal.a.f422174c, 4, 10, signStyle);
        dVar12.d("-W");
        dVar12.l(org.threeten.bp.temporal.a.f422173b, 2);
        dVar12.c('-');
        ChronoField chronoField7 = ChronoField.f422143t;
        dVar12.l(chronoField7, 1);
        dVar12.o();
        dVar12.b(nVar);
        dVar12.q(resolverStyle).e(oVar);
        d dVar13 = new d();
        dVar13.b(qVar);
        dVar13.b(new d.j());
        f421978h = dVar13.q(resolverStyle);
        d dVar14 = new d();
        dVar14.b(qVar);
        dVar14.l(chronoField, 4);
        dVar14.l(chronoField2, 2);
        dVar14.l(chronoField3, 2);
        dVar14.o();
        dVar14.f("+HHMMss", "Z");
        dVar14.q(resolverStyle).e(oVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        d dVar15 = new d();
        dVar15.b(qVar);
        dVar15.b(d.q.f422021d);
        dVar15.o();
        dVar15.h(chronoField7, map);
        dVar15.d(", ");
        dVar15.n();
        dVar15.m(chronoField3, 1, 2, SignStyle.f421959d);
        dVar15.c(' ');
        dVar15.h(chronoField2, map2);
        dVar15.c(' ');
        dVar15.l(chronoField, 4);
        dVar15.c(' ');
        dVar15.l(chronoField4, 2);
        dVar15.c(':');
        dVar15.l(chronoField5, 2);
        dVar15.o();
        dVar15.c(':');
        dVar15.l(chronoField6, 2);
        dVar15.n();
        dVar15.c(' ');
        dVar15.f("+HHMM", "GMT");
        dVar15.q(ResolverStyle.f421954c).e(oVar);
        new a();
        new b();
    }

    public c(d.f fVar, Locale locale, j jVar, ResolverStyle resolverStyle, o oVar) {
        w81.d.f(fVar, "printerParser");
        this.f421979a = fVar;
        w81.d.f(locale, "locale");
        this.f421980b = locale;
        w81.d.f(jVar, "decimalStyle");
        this.f421981c = jVar;
        w81.d.f(resolverStyle, "resolverStyle");
        this.f421982d = resolverStyle;
        this.f421983e = oVar;
    }

    public static c b(String str) {
        d dVar = new d();
        dVar.g(str);
        return dVar.p();
    }

    public final String a(AbstractC49471c abstractC49471c) {
        StringBuilder sb2 = new StringBuilder(32);
        try {
            this.f421979a.b(new h(abstractC49471c, this), sb2);
            return sb2.toString();
        } catch (IOException e12) {
            throw new DateTimeException(e12.getMessage(), e12);
        }
    }

    public final Object c(String str, org.threeten.bp.temporal.j jVar) {
        String string;
        w81.d.f(str, "text");
        w81.d.f(jVar, "type");
        try {
            org.threeten.bp.format.a aVarD = d(str);
            aVarD.v(this.f421982d);
            return jVar.a(aVarD);
        } catch (DateTimeParseException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (str.length() > 64) {
                string = str.subSequence(0, 64).toString() + "...";
            } else {
                string = str.toString();
            }
            StringBuilder sbA = r.A("Text '", string, "' could not be parsed: ");
            sbA.append(e13.getMessage());
            throw new DateTimeParseException(sbA.toString(), str, e13);
        }
    }

    public final org.threeten.bp.format.a d(String str) {
        f.b bVarB;
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        w81.d.f(str, "text");
        f fVar = new f(this);
        int iA2 = this.f421979a.a(fVar, str, parsePosition.getIndex());
        if (iA2 < 0) {
            parsePosition.setErrorIndex(~iA2);
            bVarB = null;
        } else {
            parsePosition.setIndex(iA2);
            bVarB = fVar.b();
        }
        if (bVarB == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < str.length()) {
            if (str.length() > 64) {
                string = str.subSequence(0, 64).toString() + "...";
            } else {
                string = str.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                StringBuilder sbA = r.A("Text '", string, "' could not be parsed at index ");
                sbA.append(parsePosition.getErrorIndex());
                throw new DateTimeParseException(sbA.toString(), str, parsePosition.getErrorIndex());
            }
            StringBuilder sbA2 = r.A("Text '", string, "' could not be parsed, unparsed text found at index ");
            sbA2.append(parsePosition.getIndex());
            throw new DateTimeParseException(sbA2.toString(), str, parsePosition.getIndex());
        }
        org.threeten.bp.format.a aVar = new org.threeten.bp.format.a();
        aVar.f421969b.putAll(bVarB.f422047d);
        f fVar2 = f.this;
        org.threeten.bp.chrono.j jVar = fVar2.b().f422045b;
        if (jVar == null && (jVar = fVar2.f422041c) == null) {
            jVar = o.f421908d;
        }
        aVar.f421970c = jVar;
        org.threeten.bp.o oVar = bVarB.f422046c;
        if (oVar != null) {
            aVar.f421971d = oVar;
        } else {
            aVar.f421971d = null;
        }
        aVar.f421974g = bVarB.f422048e;
        aVar.f421975h = bVarB.f422049f;
        return aVar;
    }

    public final c e(o oVar) {
        if (w81.d.b(oVar, this.f421983e)) {
            return this;
        }
        return new c(this.f421979a, this.f421980b, this.f421981c, this.f421982d, oVar);
    }

    public final String toString() {
        String string = this.f421979a.toString();
        return string.startsWith("[") ? string : androidx.compose.ui.graphics.colorspace.e.h(1, 1, string);
    }

    /* compiled from: DateTimeFormatter.java */
    /* renamed from: org.threeten.bp.format.c$c, reason: collision with other inner class name */
    public static class C12239c extends Format {
        @Override // java.text.Format
        public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            w81.d.f(obj, "obj");
            w81.d.f(stringBuffer, "toAppendTo");
            w81.d.f(fieldPosition, "pos");
            if (!(obj instanceof org.threeten.bp.temporal.d)) {
                throw new IllegalArgumentException("Format target must implement TemporalAccessor");
            }
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(0);
            try {
                throw null;
            } catch (RuntimeException e12) {
                throw new IllegalArgumentException(e12.getMessage(), e12);
            }
        }

        @Override // java.text.Format
        public final Object parseObject(String str) throws ParseException {
            w81.d.f(str, "text");
            try {
                try {
                    c cVar = c.f421976f;
                    throw null;
                } catch (DateTimeParseException e12) {
                    throw new ParseException(e12.getMessage(), e12.f421951b);
                }
            } catch (RuntimeException e13) {
                throw ((ParseException) new ParseException(e13.getMessage(), 0).initCause(e13));
            }
        }

        @Override // java.text.Format
        public final Object parseObject(String str, ParsePosition parsePosition) {
            w81.d.f(str, "text");
            try {
                c cVar = c.f421976f;
                throw null;
            } catch (IndexOutOfBoundsException unused) {
                if (parsePosition.getErrorIndex() < 0) {
                    parsePosition.setErrorIndex(0);
                }
                return null;
            }
        }
    }
}
