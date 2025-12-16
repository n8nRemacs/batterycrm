package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: CreateMutableFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/J;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class J extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final J f336969a = new J();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336970b = "CreateMutable";

    /* compiled from: CreateMutableFunction.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "target", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.field.d, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.core.z f336971l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.field.d f336972m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.d dVar) {
            super(1);
            this.f336971l = zVar;
            this.f336972m = dVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.beduin.v2.engine.field.d dVar) throws BeduinPropertyException {
            com.avito.beduin.v2.engine.field.entity.l lVarE;
            dU0.f fVarT;
            com.avito.beduin.v2.engine.field.d dVar2 = dVar;
            com.avito.beduin.v2.engine.core.z zVarI = this.f336971l.getF336696a().i();
            com.avito.beduin.v2.engine.field.d dVar3 = this.f336972m;
            if (dVar3 != null) {
                try {
                    lVarE = dVar3.e(zVarI);
                } catch (Exception e12) {
                    throw new BeduinPropertyException("onSet", e12);
                }
            } else {
                lVarE = null;
            }
            if (lVarE != null && (fVarT = lVarE.t(zVarI, com.avito.beduin.v2.engine.field.entity.n.a(zVarI, new kotlin.Q("target", dVar2)))) != null) {
                zVarI.G(fVarT);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        com.avito.beduin.v2.engine.field.d dVarC = mVar.c("onSet");
        com.avito.beduin.v2.engine.field.d dVarC2 = mVar.c("get");
        if (dVarC2 == null) {
            dVarC2 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        return new com.avito.beduin.v2.engine.field.entity.p(zVar.d(zVar.getF336696a(), "value", dVarC2) ? (com.avito.beduin.v2.engine.core.u) zVar.C("value") : zVar.f(zVar.l(zVar.getF336696a(), "value"), dVarC2, dVarC2), new a(zVar, dVarC));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f336970b;
    }
}
