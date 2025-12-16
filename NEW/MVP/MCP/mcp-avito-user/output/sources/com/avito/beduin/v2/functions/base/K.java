package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.C36264n;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: CreateObservableStateFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/K;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class K extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final K f336975a = new K();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336976b = "CreateObservableState";

    /* compiled from: CreateObservableStateFunction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<com.avito.beduin.v2.engine.field.d, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.beduin.v2.engine.field.d dVar) {
            ((com.avito.beduin.v2.engine.core.u) this.receiver).set(dVar);
            return kotlin.G0.f406611a;
        }
    }

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        dU0.f fVarT;
        com.avito.beduin.v2.engine.field.d dVarC = mVar.c("initial");
        if (dVarC == null) {
            dVarC = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.entity.l lVarT = mVar.t(zVar, "onStart");
        String str = jVar.getF336872b() + "@observable";
        com.avito.beduin.v2.engine.core.u uVarF = zVar.d(zVar.getF336696a(), str, dVarC) ? (com.avito.beduin.v2.engine.core.u) zVar.C(str) : zVar.f(zVar.l(zVar.getF336696a(), str), dVarC, dVarC);
        if (lVarT != null && (fVarT = lVarT.t(zVar.getF336696a().i(), new com.avito.beduin.v2.engine.field.m((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new kotlin.Q[]{new kotlin.Q("consumer", new com.avito.beduin.v2.engine.field.entity.p(new C36264n(zVar.A(), dVarC), new a(1, uVarF, com.avito.beduin.v2.engine.core.u.class, "set", "set(Ljava/lang/Object;)V", 0)))}))) != null) {
            zVar.G(fVarT);
        }
        return (com.avito.beduin.v2.engine.field.d) uVarF.k(zVar);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f336976b;
    }
}
