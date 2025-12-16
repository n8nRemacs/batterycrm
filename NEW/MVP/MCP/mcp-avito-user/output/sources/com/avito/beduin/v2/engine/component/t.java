package com.avito.beduin.v2.engine.component;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Reader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/avito/beduin/v2/engine/field/m;", "externalParams", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/field/m;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class t extends N implements Y41.l<com.avito.beduin.v2.engine.field.m, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.core.z f336582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f336583m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
        super(1);
        this.f336582l = zVar;
        this.f336583m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.beduin.v2.engine.field.m mVar) {
        com.avito.beduin.v2.engine.core.z zVar = this.f336582l;
        com.avito.beduin.v2.engine.core.z zVarI = zVar.getF336594a().i();
        zVar.G(this.f336583m.t(zVarI, mVar));
        return G0.f406611a;
    }
}
