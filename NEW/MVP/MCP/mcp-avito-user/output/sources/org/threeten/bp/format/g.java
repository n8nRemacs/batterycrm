package org.threeten.bp.format;

import org.threeten.bp.o;
import w81.AbstractC49471c;

/* compiled from: DateTimePrintContext.java */
/* loaded from: classes8.dex */
class g extends AbstractC49471c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.threeten.bp.chrono.c f422052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC49471c f422053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.threeten.bp.chrono.j f422054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f422055e;

    public g(org.threeten.bp.chrono.c cVar, AbstractC49471c abstractC49471c, org.threeten.bp.chrono.j jVar, o oVar) {
        this.f422052b = cVar;
        this.f422053c = abstractC49471c;
        this.f422054d = jVar;
        this.f422055e = oVar;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        org.threeten.bp.chrono.c cVar = this.f422052b;
        return (cVar == null || !hVar.e()) ? this.f422053c.b(hVar) : cVar.b(hVar);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        return jVar == org.threeten.bp.temporal.i.f422199b ? (R) this.f422054d : jVar == org.threeten.bp.temporal.i.f422198a ? (R) this.f422055e : jVar == org.threeten.bp.temporal.i.f422200c ? (R) this.f422053c.f(jVar) : jVar.a(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        org.threeten.bp.chrono.c cVar = this.f422052b;
        return (cVar == null || !hVar.e()) ? this.f422053c.l(hVar) : cVar.l(hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        org.threeten.bp.chrono.c cVar = this.f422052b;
        return (cVar == null || !hVar.e()) ? this.f422053c.m(hVar) : cVar.m(hVar);
    }
}
