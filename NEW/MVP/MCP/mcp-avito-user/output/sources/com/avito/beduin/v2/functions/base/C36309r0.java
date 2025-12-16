package com.avito.beduin.v2.functions.base;

import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: ObserveMutationFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "target", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.beduin.v2.functions.base.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36309r0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.field.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.p f337117l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337118m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.core.z f337119n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36309r0(com.avito.beduin.v2.engine.field.entity.p pVar, com.avito.beduin.v2.engine.field.entity.l lVar, com.avito.beduin.v2.engine.core.z zVar) {
        super(1);
        this.f337117l = pVar;
        this.f337118m = lVar;
        this.f337119n = zVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.beduin.v2.engine.field.d dVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.d dVar2 = dVar;
        com.avito.beduin.v2.engine.field.entity.p pVar = this.f337117l;
        com.avito.beduin.v2.engine.field.d dVarK = pVar.f336818b.k(com.avito.beduin.v2.engine.core.F.f336593b);
        com.avito.beduin.v2.engine.field.entity.l lVar = this.f337118m;
        if (lVar != null) {
            com.avito.beduin.v2.engine.core.z zVar = this.f337119n;
            dU0.f fVarT = lVar.t(zVar.getF336696a().i(), com.avito.beduin.v2.engine.field.entity.n.a(zVar, new kotlin.Q("prev", dVarK), new kotlin.Q("target", dVar2)));
            if (fVarT != null) {
                zVar.G(fVarT);
            }
        }
        pVar.f336819c.invoke(dVar2);
        return kotlin.G0.f406611a;
    }
}
