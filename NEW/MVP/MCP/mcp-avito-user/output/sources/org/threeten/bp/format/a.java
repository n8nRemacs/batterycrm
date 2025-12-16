package org.threeten.bp.format;

import com.yandex.div2.D8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.o;
import org.threeten.bp.q;
import org.threeten.bp.temporal.ChronoField;
import w81.AbstractC49471c;

/* compiled from: DateTimeBuilder.java */
/* loaded from: classes8.dex */
final class a extends AbstractC49471c implements org.threeten.bp.temporal.d, Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f421969b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public org.threeten.bp.chrono.j f421970c;

    /* renamed from: d, reason: collision with root package name */
    public o f421971d;

    /* renamed from: e, reason: collision with root package name */
    public org.threeten.bp.chrono.c f421972e;

    /* renamed from: f, reason: collision with root package name */
    public org.threeten.bp.g f421973f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f421974g;

    /* renamed from: h, reason: collision with root package name */
    public org.threeten.bp.k f421975h;

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422198a) {
            return (R) this.f421971d;
        }
        if (jVar == org.threeten.bp.temporal.i.f422199b) {
            return (R) this.f421970c;
        }
        if (jVar == org.threeten.bp.temporal.i.f422203f) {
            org.threeten.bp.chrono.c cVar = this.f421972e;
            if (cVar != null) {
                return (R) org.threeten.bp.e.B(cVar);
            }
            return null;
        }
        if (jVar == org.threeten.bp.temporal.i.f422204g) {
            return (R) this.f421973f;
        }
        if (jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422202e) {
            return jVar.a(this);
        }
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        org.threeten.bp.chrono.c cVar;
        org.threeten.bp.g gVar;
        if (hVar == null) {
            return false;
        }
        return this.f421969b.containsKey(hVar) || ((cVar = this.f421972e) != null && cVar.l(hVar)) || ((gVar = this.f421973f) != null && gVar.l(hVar));
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        w81.d.f(hVar, "field");
        Long l12 = (Long) this.f421969b.get(hVar);
        if (l12 != null) {
            return l12.longValue();
        }
        org.threeten.bp.chrono.c cVar = this.f421972e;
        if (cVar != null && cVar.l(hVar)) {
            return this.f421972e.m(hVar);
        }
        org.threeten.bp.g gVar = this.f421973f;
        if (gVar == null || !gVar.l(hVar)) {
            throw new DateTimeException(D8.p("Field not found: ", hVar));
        }
        return this.f421973f.m(hVar);
    }

    public final void o(ChronoField chronoField, long j12) {
        w81.d.f(chronoField, "field");
        HashMap map = this.f421969b;
        Long l12 = (Long) map.get(chronoField);
        if (l12 == null || l12.longValue() == j12) {
            map.put(chronoField, Long.valueOf(j12));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l12 + " differs from " + chronoField + " " + j12 + ": " + this);
    }

    public final void p(org.threeten.bp.e eVar) {
        if (eVar != null) {
            this.f421972e = eVar;
            HashMap map = this.f421969b;
            for (org.threeten.bp.temporal.h hVar : map.keySet()) {
                if ((hVar instanceof ChronoField) && ((ChronoField) hVar).e()) {
                    try {
                        long jM2 = eVar.m(hVar);
                        Long l12 = (Long) map.get(hVar);
                        if (jM2 != l12.longValue()) {
                            throw new DateTimeException("Conflict found: Field " + hVar + " " + jM2 + " differs from " + hVar + " " + l12 + " derived from " + eVar);
                        }
                    } catch (DateTimeException unused) {
                        continue;
                    }
                }
            }
        }
    }

    public final void q(org.threeten.bp.temporal.d dVar) {
        Iterator it = this.f421969b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            org.threeten.bp.temporal.h hVar = (org.threeten.bp.temporal.h) entry.getKey();
            long jLongValue = ((Long) entry.getValue()).longValue();
            if (dVar.l(hVar)) {
                try {
                    long jM2 = dVar.m(hVar);
                    if (jM2 != jLongValue) {
                        throw new DateTimeException("Cross check failed: " + hVar + " " + jM2 + " vs " + hVar + " " + jLongValue);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(org.threeten.bp.format.ResolverStyle r15) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.a.r(org.threeten.bp.format.ResolverStyle):void");
    }

    public final void s() {
        HashMap map = this.f421969b;
        if (map.containsKey(ChronoField.f422125G)) {
            o oVar = this.f421971d;
            if (oVar != null) {
                t(oVar);
                return;
            }
            Long l12 = (Long) map.get(ChronoField.f422126H);
            if (l12 != null) {
                t(q.w(l12.intValue()));
            }
        }
    }

    public final void t(o oVar) {
        HashMap map = this.f421969b;
        ChronoField chronoField = ChronoField.f422125G;
        org.threeten.bp.chrono.h<?> hVarQ = this.f421970c.q(org.threeten.bp.d.o(0, ((Long) map.remove(chronoField)).longValue()), oVar);
        if (this.f421972e == null) {
            this.f421972e = hVarQ.u();
        } else {
            x(chronoField, hVarQ.u());
        }
        o(ChronoField.f422135l, hVarQ.w().J());
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(128, "DateTimeBuilder[");
        HashMap map = this.f421969b;
        if (map.size() > 0) {
            sbQ.append("fields=");
            sbQ.append(map);
        }
        sbQ.append(", ");
        sbQ.append(this.f421970c);
        sbQ.append(", ");
        sbQ.append(this.f421971d);
        sbQ.append(", ");
        sbQ.append(this.f421972e);
        sbQ.append(", ");
        return org.webrtc.h.f(sbQ, this.f421973f, ']');
    }

    public final void u(ResolverStyle resolverStyle) {
        HashMap map = this.f421969b;
        ChronoField chronoField = ChronoField.f422141r;
        boolean zContainsKey = map.containsKey(chronoField);
        ResolverStyle resolverStyle2 = ResolverStyle.f421954c;
        ResolverStyle resolverStyle3 = ResolverStyle.f421955d;
        if (zContainsKey) {
            long jLongValue = ((Long) map.remove(chronoField)).longValue();
            if (resolverStyle != resolverStyle3 && (resolverStyle != resolverStyle2 || jLongValue != 0)) {
                chronoField.i(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.f422140q;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            o(chronoField2, jLongValue);
        }
        ChronoField chronoField3 = ChronoField.f422139p;
        if (map.containsKey(chronoField3)) {
            long jLongValue2 = ((Long) map.remove(chronoField3)).longValue();
            if (resolverStyle != resolverStyle3 && (resolverStyle != resolverStyle2 || jLongValue2 != 0)) {
                chronoField3.i(jLongValue2);
            }
            o(ChronoField.f422138o, jLongValue2 != 12 ? jLongValue2 : 0L);
        }
        if (resolverStyle != resolverStyle3) {
            ChronoField chronoField4 = ChronoField.f422142s;
            if (map.containsKey(chronoField4)) {
                chronoField4.i(((Long) map.get(chronoField4)).longValue());
            }
            ChronoField chronoField5 = ChronoField.f422138o;
            if (map.containsKey(chronoField5)) {
                chronoField5.i(((Long) map.get(chronoField5)).longValue());
            }
        }
        ChronoField chronoField6 = ChronoField.f422142s;
        if (map.containsKey(chronoField6)) {
            ChronoField chronoField7 = ChronoField.f422138o;
            if (map.containsKey(chronoField7)) {
                o(ChronoField.f422140q, (((Long) map.remove(chronoField6)).longValue() * 12) + ((Long) map.remove(chronoField7)).longValue());
            }
        }
        ChronoField chronoField8 = ChronoField.f422129f;
        if (map.containsKey(chronoField8)) {
            long jLongValue3 = ((Long) map.remove(chronoField8)).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField8.i(jLongValue3);
            }
            o(ChronoField.f422135l, jLongValue3 / 1000000000);
            o(ChronoField.f422128e, jLongValue3 % 1000000000);
        }
        ChronoField chronoField9 = ChronoField.f422131h;
        if (map.containsKey(chronoField9)) {
            long jLongValue4 = ((Long) map.remove(chronoField9)).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField9.i(jLongValue4);
            }
            o(ChronoField.f422135l, jLongValue4 / 1000000);
            o(ChronoField.f422130g, jLongValue4 % 1000000);
        }
        ChronoField chronoField10 = ChronoField.f422133j;
        if (map.containsKey(chronoField10)) {
            long jLongValue5 = ((Long) map.remove(chronoField10)).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField10.i(jLongValue5);
            }
            o(ChronoField.f422135l, jLongValue5 / 1000);
            o(ChronoField.f422132i, jLongValue5 % 1000);
        }
        ChronoField chronoField11 = ChronoField.f422135l;
        if (map.containsKey(chronoField11)) {
            long jLongValue6 = ((Long) map.remove(chronoField11)).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField11.i(jLongValue6);
            }
            o(ChronoField.f422140q, jLongValue6 / 3600);
            o(ChronoField.f422136m, (jLongValue6 / 60) % 60);
            o(ChronoField.f422134k, jLongValue6 % 60);
        }
        ChronoField chronoField12 = ChronoField.f422137n;
        if (map.containsKey(chronoField12)) {
            long jLongValue7 = ((Long) map.remove(chronoField12)).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField12.i(jLongValue7);
            }
            o(ChronoField.f422140q, jLongValue7 / 60);
            o(ChronoField.f422136m, jLongValue7 % 60);
        }
        if (resolverStyle != resolverStyle3) {
            ChronoField chronoField13 = ChronoField.f422132i;
            if (map.containsKey(chronoField13)) {
                chronoField13.i(((Long) map.get(chronoField13)).longValue());
            }
            ChronoField chronoField14 = ChronoField.f422130g;
            if (map.containsKey(chronoField14)) {
                chronoField14.i(((Long) map.get(chronoField14)).longValue());
            }
        }
        ChronoField chronoField15 = ChronoField.f422132i;
        if (map.containsKey(chronoField15)) {
            ChronoField chronoField16 = ChronoField.f422130g;
            if (map.containsKey(chronoField16)) {
                o(chronoField16, (((Long) map.get(chronoField16)).longValue() % 1000) + (((Long) map.remove(chronoField15)).longValue() * 1000));
            }
        }
        ChronoField chronoField17 = ChronoField.f422130g;
        if (map.containsKey(chronoField17)) {
            ChronoField chronoField18 = ChronoField.f422128e;
            if (map.containsKey(chronoField18)) {
                o(chronoField17, ((Long) map.get(chronoField18)).longValue() / 1000);
                map.remove(chronoField17);
            }
        }
        if (map.containsKey(chronoField15)) {
            ChronoField chronoField19 = ChronoField.f422128e;
            if (map.containsKey(chronoField19)) {
                o(chronoField15, ((Long) map.get(chronoField19)).longValue() / 1000000);
                map.remove(chronoField15);
            }
        }
        if (map.containsKey(chronoField17)) {
            o(ChronoField.f422128e, ((Long) map.remove(chronoField17)).longValue() * 1000);
        } else if (map.containsKey(chronoField15)) {
            o(ChronoField.f422128e, ((Long) map.remove(chronoField15)).longValue() * 1000000);
        }
    }

    public final void v(ResolverStyle resolverStyle) {
        org.threeten.bp.k kVar;
        org.threeten.bp.chrono.c cVar;
        org.threeten.bp.g gVar;
        ChronoField chronoField;
        org.threeten.bp.g gVar2;
        HashMap map = this.f421969b;
        s();
        r(resolverStyle);
        u(resolverStyle);
        int i12 = 0;
        loop0: while (i12 < 100) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                org.threeten.bp.temporal.h hVar = (org.threeten.bp.temporal.h) ((Map.Entry) it.next()).getKey();
                org.threeten.bp.temporal.d dVarC = hVar.c(map, this, resolverStyle);
                if (dVarC != null) {
                    if (dVarC instanceof org.threeten.bp.chrono.h) {
                        org.threeten.bp.chrono.h hVar2 = (org.threeten.bp.chrono.h) dVarC;
                        o oVar = this.f421971d;
                        if (oVar == null) {
                            this.f421971d = hVar2.q();
                        } else if (!oVar.equals(hVar2.q())) {
                            throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.f421971d);
                        }
                        dVarC = hVar2.v();
                    }
                    if (dVarC instanceof org.threeten.bp.chrono.c) {
                        x(hVar, (org.threeten.bp.chrono.c) dVarC);
                    } else if (dVarC instanceof org.threeten.bp.g) {
                        w(hVar, (org.threeten.bp.g) dVarC);
                    } else {
                        if (!(dVarC instanceof org.threeten.bp.chrono.d)) {
                            throw new DateTimeException("Unknown type: ".concat(dVarC.getClass().getName()));
                        }
                        org.threeten.bp.chrono.d dVar = (org.threeten.bp.chrono.d) dVarC;
                        x(hVar, dVar.u());
                        w(hVar, dVar.v());
                    }
                } else if (!map.containsKey(hVar)) {
                    break;
                }
                i12++;
            }
        }
        if (i12 == 100) {
            throw new DateTimeException("Badly written field");
        }
        if (i12 > 0) {
            s();
            r(resolverStyle);
            u(resolverStyle);
        }
        ChronoField chronoField2 = ChronoField.f422140q;
        Long l12 = (Long) map.get(chronoField2);
        ChronoField chronoField3 = ChronoField.f422136m;
        Long l13 = (Long) map.get(chronoField3);
        ChronoField chronoField4 = ChronoField.f422134k;
        Long l14 = (Long) map.get(chronoField4);
        ChronoField chronoField5 = ChronoField.f422128e;
        Long l15 = (Long) map.get(chronoField5);
        if (l12 != null && ((l13 != null || (l14 == null && l15 == null)) && (l13 == null || l14 != null || l15 == null))) {
            if (resolverStyle != ResolverStyle.f421955d) {
                if (resolverStyle == ResolverStyle.f421954c && l12.longValue() == 24 && ((l13 == null || l13.longValue() == 0) && ((l14 == null || l14.longValue() == 0) && (l15 == null || l15.longValue() == 0)))) {
                    l12 = 0L;
                    this.f421975h = org.threeten.bp.k.b(1);
                }
                chronoField = chronoField2;
                int iA2 = chronoField.f422152d.a(l12.longValue(), chronoField);
                if (l13 != null) {
                    int iA3 = chronoField3.f422152d.a(l13.longValue(), chronoField3);
                    if (l14 != null) {
                        int iA4 = chronoField4.f422152d.a(l14.longValue(), chronoField4);
                        if (l15 != null) {
                            this.f421973f = org.threeten.bp.g.v(iA2, iA3, iA4, chronoField5.f422152d.a(l15.longValue(), chronoField5));
                        } else {
                            org.threeten.bp.g gVar3 = org.threeten.bp.g.f422067f;
                            chronoField.i(iA2);
                            if ((iA3 | iA4) == 0) {
                                gVar2 = org.threeten.bp.g.f422071j[iA2];
                            } else {
                                chronoField3.i(iA3);
                                chronoField4.i(iA4);
                                gVar2 = new org.threeten.bp.g(iA2, iA3, iA4, 0);
                            }
                            this.f421973f = gVar2;
                        }
                    } else if (l15 == null) {
                        this.f421973f = org.threeten.bp.g.u(iA2, iA3);
                    }
                } else if (l14 == null && l15 == null) {
                    this.f421973f = org.threeten.bp.g.u(iA2, 0);
                }
            } else {
                chronoField = chronoField2;
                long jLongValue = l12.longValue();
                if (l13 == null) {
                    int iM2 = w81.d.m(w81.d.c(jLongValue, 24L));
                    this.f421973f = org.threeten.bp.g.u(w81.d.e(24, jLongValue), 0);
                    this.f421975h = org.threeten.bp.k.b(iM2);
                } else if (l14 != null) {
                    if (l15 == null) {
                        l15 = 0L;
                    }
                    long jH2 = w81.d.h(w81.d.h(w81.d.h(w81.d.j(jLongValue, 3600000000000L), w81.d.j(l13.longValue(), 60000000000L)), w81.d.j(l14.longValue(), 1000000000L)), l15.longValue());
                    int iC2 = (int) w81.d.c(jH2, 86400000000000L);
                    this.f421973f = org.threeten.bp.g.w(((jH2 % 86400000000000L) + 86400000000000L) % 86400000000000L);
                    this.f421975h = org.threeten.bp.k.b(iC2);
                } else {
                    long jH3 = w81.d.h(w81.d.j(jLongValue, 3600L), w81.d.j(l13.longValue(), 60L));
                    int iC3 = (int) w81.d.c(jH3, 86400L);
                    this.f421973f = org.threeten.bp.g.z(((jH3 % 86400) + 86400) % 86400);
                    this.f421975h = org.threeten.bp.k.b(iC3);
                }
            }
            map.remove(chronoField);
            map.remove(chronoField3);
            map.remove(chronoField4);
            map.remove(chronoField5);
        }
        if (map.size() > 0) {
            org.threeten.bp.chrono.c cVar2 = this.f421972e;
            if (cVar2 != null && (gVar = this.f421973f) != null) {
                q(cVar2.o(gVar));
            } else if (cVar2 != null) {
                q(cVar2);
            } else {
                org.threeten.bp.temporal.d dVar2 = this.f421973f;
                if (dVar2 != null) {
                    q(dVar2);
                }
            }
        }
        org.threeten.bp.k kVar2 = this.f421975h;
        if (kVar2 != null && kVar2 != (kVar = org.threeten.bp.k.f422090c) && (cVar = this.f421972e) != null && this.f421973f != null) {
            this.f421972e = cVar.u(kVar2);
            this.f421975h = kVar;
        }
        if (this.f421973f == null && (map.containsKey(ChronoField.f422125G) || map.containsKey(ChronoField.f422135l) || map.containsKey(chronoField4))) {
            if (map.containsKey(chronoField5)) {
                long jLongValue2 = ((Long) map.get(chronoField5)).longValue();
                map.put(ChronoField.f422130g, Long.valueOf(jLongValue2 / 1000));
                map.put(ChronoField.f422132i, Long.valueOf(jLongValue2 / 1000000));
            } else {
                map.put(chronoField5, 0L);
                map.put(ChronoField.f422130g, 0L);
                map.put(ChronoField.f422132i, 0L);
            }
        }
        if (this.f421972e == null || this.f421973f == null) {
            return;
        }
        Long l16 = (Long) map.get(ChronoField.f422126H);
        if (l16 != null) {
            AbstractC49471c abstractC49471cO = this.f421972e.o(this.f421973f).o(q.w(l16.intValue()));
            ChronoField chronoField6 = ChronoField.f422125G;
            map.put(chronoField6, Long.valueOf(abstractC49471cO.m(chronoField6)));
        } else if (this.f421971d != null) {
            AbstractC49471c abstractC49471cO2 = this.f421972e.o(this.f421973f).o(this.f421971d);
            ChronoField chronoField7 = ChronoField.f422125G;
            map.put(chronoField7, Long.valueOf(abstractC49471cO2.m(chronoField7)));
        }
    }

    public final void w(org.threeten.bp.temporal.h hVar, org.threeten.bp.g gVar) {
        long jH2 = gVar.H();
        Long l12 = (Long) this.f421969b.put(ChronoField.f422129f, Long.valueOf(jH2));
        if (l12 == null || l12.longValue() == jH2) {
            return;
        }
        throw new DateTimeException("Conflict found: " + org.threeten.bp.g.w(l12.longValue()) + " differs from " + gVar + " while resolving  " + hVar);
    }

    public final void x(org.threeten.bp.temporal.h hVar, org.threeten.bp.chrono.c cVar) {
        if (!this.f421970c.equals(cVar.q())) {
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f421970c);
        }
        long jV2 = cVar.v();
        Long l12 = (Long) this.f421969b.put(ChronoField.f422148y, Long.valueOf(jV2));
        if (l12 == null || l12.longValue() == jV2) {
            return;
        }
        throw new DateTimeException("Conflict found: " + org.threeten.bp.e.P(l12.longValue()) + " differs from " + org.threeten.bp.e.P(jV2) + " while resolving  " + hVar);
    }
}
