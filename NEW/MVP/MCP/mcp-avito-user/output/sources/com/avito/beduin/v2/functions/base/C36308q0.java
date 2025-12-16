package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: ObserveCalculationFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/q0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36308q0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36308q0 f337113a = new C36308q0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337114b = "ObserveCalculation";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        dU0.f fVarT;
        dU0.f fVarT2;
        dU0.f fVarT3;
        F.a aVar = com.avito.beduin.v2.engine.core.F.f336593b;
        com.avito.beduin.v2.engine.field.entity.l lVarT = mVar.t(aVar, "onCalculate");
        com.avito.beduin.v2.engine.field.entity.l lVarT2 = mVar.t(aVar, "onInit");
        com.avito.beduin.v2.engine.field.entity.l lVarT3 = mVar.t(aVar, "onChange");
        com.avito.beduin.v2.engine.field.d dVarP = mVar.p(zVar, "result");
        if (dVarP == null) {
            dVarP = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.core.u uVarF = zVar.d(zVar.getF336696a(), "wasInit", "") ? (com.avito.beduin.v2.engine.core.u) zVar.C("wasInit") : zVar.f(zVar.l(zVar.getF336696a(), "wasInit"), "", Boolean.FALSE);
        if (!((Boolean) uVarF.k(aVar)).booleanValue()) {
            com.avito.beduin.v2.engine.core.z zVarI = zVar.getF336696a().i();
            com.avito.beduin.v2.engine.field.m.f336868b.getClass();
            com.avito.beduin.v2.engine.field.m mVar2 = com.avito.beduin.v2.engine.field.m.f336869c;
            if (lVarT2 != null && (fVarT3 = lVarT2.t(zVarI, mVar2)) != null) {
                zVar.G(fVarT3);
            }
            uVarF.set(Boolean.TRUE);
        }
        com.avito.beduin.v2.engine.core.z zVarI2 = zVar.getF336696a().i();
        com.avito.beduin.v2.engine.field.m.f336868b.getClass();
        com.avito.beduin.v2.engine.field.m mVar3 = com.avito.beduin.v2.engine.field.m.f336869c;
        if (lVarT != null && (fVarT2 = lVarT.t(zVarI2, mVar3)) != null) {
            zVar.G(fVarT2);
        }
        com.avito.beduin.v2.engine.core.u uVarF2 = zVar.d(zVar.getF336696a(), "lastResult", "") ? (com.avito.beduin.v2.engine.core.u) zVar.C("lastResult") : zVar.f(zVar.l(zVar.getF336696a(), "lastResult"), "", com.avito.beduin.v2.engine.field.entity.f.f336800b);
        com.avito.beduin.v2.engine.core.u uVarF3 = zVar.d(zVar.getF336696a(), "isFirstResult", "") ? (com.avito.beduin.v2.engine.core.u) zVar.C("isFirstResult") : zVar.f(zVar.l(zVar.getF336696a(), "isFirstResult"), "", Boolean.TRUE);
        com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) uVarF2.k(aVar);
        if (((Boolean) uVarF3.k(aVar)).booleanValue() || !dVarP.b(zVar, dVar)) {
            uVarF3.set(Boolean.FALSE);
            com.avito.beduin.v2.engine.core.z zVarI3 = zVar.getF336696a().i();
            if (lVarT3 != null && (fVarT = lVarT3.t(zVarI3, mVar3)) != null) {
                zVar.G(fVarT);
            }
            uVarF2.set(dVarP);
        }
        return dVarP;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337114b;
    }
}
