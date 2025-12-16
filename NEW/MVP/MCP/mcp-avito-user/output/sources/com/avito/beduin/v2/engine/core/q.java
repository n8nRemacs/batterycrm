package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.N;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalculationValue.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/q;", "Lcom/avito/beduin/v2/engine/core/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements InterfaceC36254d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336678a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.engine.field.b<Object> f336679b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.engine.field.m f336680c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Exception, ? extends Object> f336681d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Object f336682e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f336683f;

    public q(@Y61.k InterfaceC36274k interfaceC36274k) {
        this.f336678a = interfaceC36274k;
    }

    @Override // com.avito.beduin.v2.engine.core.K
    /* renamed from: c, reason: from getter */
    public final boolean getF336633e() {
        return this.f336683f;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final N.a f(M m12, boolean z12) {
        return N.d.f336599a;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336630b() {
        return this.f336678a;
    }

    @Override // com.avito.beduin.v2.engine.core.K
    @Y61.l
    public final Object k(@Y61.k z zVar) {
        Object objInvoke;
        if (!this.f336683f) {
            z zVarI = this.f336678a.i();
            Y41.l<? super Exception, ? extends Object> lVar = this.f336681d;
            if (lVar == null) {
                lVar = C36255e.f336604a;
            }
            try {
                try {
                    objInvoke = this.f336679b.o(zVarI, this.f336680c);
                    zVarI.H();
                    zVarI.g();
                    this.f336683f = true;
                    this.f336680c = null;
                    this.f336679b = null;
                } catch (Exception e12) {
                    objInvoke = lVar.invoke(e12);
                    zVarI.H();
                    zVarI.g();
                    this.f336683f = true;
                    this.f336680c = null;
                    this.f336679b = null;
                }
                this.f336681d = null;
                zVarI.close();
                this.f336682e = objInvoke;
            } catch (Throwable th2) {
                zVarI.H();
                zVarI.g();
                this.f336683f = true;
                this.f336680c = null;
                this.f336679b = null;
                this.f336681d = null;
                zVarI.close();
                throw th2;
            }
        }
        return this.f336682e;
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36254d
    @Y61.k
    public final InterfaceC36254d o(@Y61.k com.avito.beduin.v2.engine.field.b<Object> bVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.l Y41.l<? super Exception, ? extends Object> lVar) {
        if (this.f336683f) {
            throw new IllegalStateException("Forbidden to modify a calculated lazy node");
        }
        this.f336679b = bVar;
        this.f336680c = mVar;
        Y41.l lVar2 = C36255e.f336604a;
        this.f336681d = lVar != null ? new C36256f(bVar, this, lVar) : null;
        return this;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p */
    public final boolean getF336634f() {
        return true;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
    }
}
