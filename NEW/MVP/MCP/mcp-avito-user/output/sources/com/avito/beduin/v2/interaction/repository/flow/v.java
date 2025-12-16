package com.avito.beduin.v2.interaction.repository.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RepositoryUpdateInteraction.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class v extends N implements Y41.a<dU0.f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337798l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.core.z f337799m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
        super(0);
        this.f337798l = lVar;
        this.f337799m = zVar;
    }

    @Override // Y41.a
    public final dU0.f invoke() {
        com.avito.beduin.v2.engine.field.entity.l lVar = this.f337798l;
        if (lVar == null) {
            return null;
        }
        com.avito.beduin.v2.engine.core.z zVarI = this.f337799m.getF336594a().i();
        com.avito.beduin.v2.engine.field.m.f336868b.getClass();
        return lVar.t(zVarI, com.avito.beduin.v2.engine.field.m.f336869c);
    }
}
