package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.o;
import org.threeten.bp.temporal.ChronoField;
import w81.AbstractC49471c;

/* compiled from: DateTimePrintContext.java */
/* loaded from: classes8.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC49471c f422056a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f422057b;

    /* renamed from: c, reason: collision with root package name */
    public final j f422058c;

    /* renamed from: d, reason: collision with root package name */
    public int f422059d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, org.threeten.bp.chrono.j] */
    public h(AbstractC49471c abstractC49471c, c cVar) {
        o oVar = cVar.f421983e;
        if (oVar != null) {
            ?? r12 = (org.threeten.bp.chrono.j) abstractC49471c.f(org.threeten.bp.temporal.i.f422199b);
            org.threeten.bp.o oVar2 = (org.threeten.bp.o) abstractC49471c.f(org.threeten.bp.temporal.i.f422198a);
            org.threeten.bp.chrono.c cVarB = null;
            oVar = w81.d.b(oVar, r12) ? null : oVar;
            w81.d.b(null, oVar2);
            if (oVar != null) {
                o oVar3 = oVar != null ? oVar : r12;
                if (oVar != null) {
                    if (abstractC49471c.l(ChronoField.f422148y)) {
                        cVarB = oVar3.b(abstractC49471c);
                    } else if (oVar != o.f421908d || r12 != 0) {
                        for (ChronoField chronoField : ChronoField.values()) {
                            if (chronoField.e() && abstractC49471c.l(chronoField)) {
                                throw new DateTimeException("Invalid override chronology for temporal: " + oVar + " " + abstractC49471c);
                            }
                        }
                    }
                }
                abstractC49471c = new g(cVarB, abstractC49471c, oVar3, oVar2);
            }
        }
        this.f422056a = abstractC49471c;
        this.f422057b = cVar.f421980b;
        this.f422058c = cVar.f421981c;
    }

    public final Long a(org.threeten.bp.temporal.h hVar) {
        try {
            return Long.valueOf(this.f422056a.m(hVar));
        } catch (DateTimeException e12) {
            if (this.f422059d > 0) {
                return null;
            }
            throw e12;
        }
    }

    public final <R> R b(org.threeten.bp.temporal.j<R> jVar) {
        AbstractC49471c abstractC49471c = this.f422056a;
        R r12 = (R) abstractC49471c.f(jVar);
        if (r12 != null || this.f422059d != 0) {
            return r12;
        }
        throw new DateTimeException("Unable to extract value: " + abstractC49471c.getClass());
    }

    public final String toString() {
        return this.f422056a.toString();
    }
}
