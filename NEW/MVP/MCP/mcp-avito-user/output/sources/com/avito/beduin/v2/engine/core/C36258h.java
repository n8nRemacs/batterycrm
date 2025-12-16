package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.engine.core.manager.c;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalculationValue.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/core/h;", "Lcom/avito/beduin/v2/engine/core/d;", "Lcom/avito/beduin/v2/engine/core/M;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.core.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36258h implements InterfaceC36254d, M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336617a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f336618b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.engine.field.b<Object> f336619c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.engine.field.m f336620d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Exception, ? extends Object> f336621e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Object f336622f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f336623g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f336624h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.e f336625i = new com.avito.beduin.v2.engine.core.manager.e(this);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.i f336626j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.c f336627k;

    public C36258h(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        this.f336617a = interfaceC36274k;
        this.f336618b = str;
        this.f336626j = com.avito.beduin.v2.engine.m.a(interfaceC36274k, this);
        this.f336627k = new com.avito.beduin.v2.engine.core.manager.c(interfaceC36274k, false, false, 6, null);
    }

    @Override // com.avito.beduin.v2.engine.core.K
    /* renamed from: c, reason: from getter */
    public final boolean getF336644d() {
        return this.f336623g;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
        if (this.f336624h) {
            return;
        }
        this.f336624h = true;
        this.f336625i.b();
        this.f336627k.a();
        this.f336626j.b();
        if (this.f336623g) {
            this.f336620d = null;
            this.f336619c = null;
            this.f336621e = null;
        }
    }

    @Override // com.avito.beduin.v2.engine.core.M
    public final void e(@Y61.k Y41.l<? super M, G0> lVar) {
        if (!this.f336623g || this.f336624h) {
            return;
        }
        this.f336622f = null;
        this.f336623g = false;
        this.f336626j.d(lVar);
    }

    @Override // com.avito.beduin.v2.engine.core.N
    @Y61.k
    public final N.a f(@Y61.k M m12, boolean z12) {
        return this.f336624h ? N.d.f336599a : this.f336626j.a(m12, z12);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336642b() {
        return this.f336617a;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
        if (this.f336624h) {
            return;
        }
        this.f336627k.b();
    }

    @Override // com.avito.beduin.v2.engine.core.K
    @Y61.l
    public final Object k(@Y61.k z zVar) {
        Object objInvoke;
        Y41.l<? super Exception, ? extends Object> lVar;
        if (!this.f336624h) {
            zVar.w(this);
        }
        if (!this.f336623g) {
            com.avito.beduin.v2.engine.core.manager.e eVar = this.f336625i;
            String str = this.f336618b;
            boolean z12 = this.f336624h;
            InterfaceC36274k interfaceC36274k = this.f336617a;
            com.avito.beduin.v2.engine.core.manager.c cVar = this.f336627k;
            z vVar = !z12 ? new v(interfaceC36274k, new c.a(cVar.f336658a, cVar.f336660c)) : interfaceC36274k.i();
            Y41.l<? super Exception, ? extends Object> lVar2 = this.f336621e;
            if (lVar2 == null) {
                lVar2 = C36255e.f336604a;
            }
            try {
                try {
                    com.avito.beduin.v2.engine.field.b<Object> bVar = this.f336619c;
                    if (bVar instanceof com.avito.beduin.v2.engine.field.entity.c) {
                        RU0.b bVar2 = RU0.b.f14467a;
                        LogLevel[] logLevelArr = LogLevel.f337864b;
                        bVar2.getClass();
                        if (RU0.b.f14469c <= 0) {
                            RU0.b.f14468b.f(RU0.b.f14470d + ":Component", "Calculate: " + ((com.avito.beduin.v2.engine.field.entity.c) bVar).f336788c);
                        }
                    }
                    objInvoke = bVar.o(vVar, this.f336620d);
                    Set<N> setH = vVar.H();
                    c.a aVarG = vVar.getF336697b();
                    RU0.b bVar3 = RU0.b.f14467a;
                    LogLevel[] logLevelArr2 = LogLevel.f337864b;
                    bVar3.getClass();
                    if (RU0.b.f14469c <= 0) {
                        RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Invalidating"), "CalculationValue " + str + " calculated");
                    }
                    this.f336623g = true;
                    eVar.a(setH);
                    cVar.c(aVarG);
                } catch (Exception e12) {
                    objInvoke = lVar2.invoke(e12);
                    Set<N> setH2 = vVar.H();
                    c.a aVarG2 = vVar.getF336697b();
                    RU0.b bVar4 = RU0.b.f14467a;
                    LogLevel[] logLevelArr3 = LogLevel.f337864b;
                    bVar4.getClass();
                    if (RU0.b.f14469c <= 0) {
                        RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Invalidating"), "CalculationValue " + str + " calculated");
                    }
                    this.f336623g = true;
                    eVar.a(setH2);
                    cVar.c(aVarG2);
                    if (this.f336624h) {
                        lVar = null;
                        this.f336620d = null;
                        this.f336619c = null;
                    }
                }
                if (this.f336624h) {
                    lVar = null;
                    this.f336620d = null;
                    this.f336619c = null;
                    this.f336621e = lVar;
                }
                vVar.close();
                this.f336622f = objInvoke;
            } catch (Throwable th2) {
                Set<N> setH3 = vVar.H();
                c.a aVarG3 = vVar.getF336697b();
                RU0.b bVar5 = RU0.b.f14467a;
                LogLevel[] logLevelArr4 = LogLevel.f337864b;
                bVar5.getClass();
                if (RU0.b.f14469c <= 0) {
                    RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Invalidating"), "CalculationValue " + str + " calculated");
                }
                this.f336623g = true;
                eVar.a(setH3);
                cVar.c(aVarG3);
                if (this.f336624h) {
                    this.f336620d = null;
                    this.f336619c = null;
                    this.f336621e = null;
                }
                vVar.close();
                throw th2;
            }
        }
        return this.f336622f;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
        this.f336626j.c(m12);
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36254d
    @Y61.k
    public final InterfaceC36254d o(@Y61.k com.avito.beduin.v2.engine.field.b<Object> bVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.l Y41.l<? super Exception, ? extends Object> lVar) {
        if (this.f336624h) {
            throw new IllegalStateException("Forbidden to modify a destroyed node");
        }
        com.avito.beduin.v2.engine.field.b<Object> bVar2 = this.f336619c;
        com.avito.beduin.v2.engine.field.m mVar2 = this.f336620d;
        this.f336619c = bVar;
        this.f336620d = mVar;
        Y41.l lVar2 = C36255e.f336604a;
        this.f336621e = lVar != null ? new C36256f(bVar, this, lVar) : null;
        if (!kotlin.jvm.internal.L.f(bVar2, bVar) || !kotlin.jvm.internal.L.f(mVar2, mVar)) {
            com.avito.beduin.v2.engine.core.manager.h hVar = new com.avito.beduin.v2.engine.core.manager.h();
            e(new com.avito.beduin.v2.engine.l(hVar));
            this.f336617a.b(hVar);
        }
        return this;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p, reason: from getter */
    public final boolean getF20191j() {
        return this.f336624h;
    }
}
