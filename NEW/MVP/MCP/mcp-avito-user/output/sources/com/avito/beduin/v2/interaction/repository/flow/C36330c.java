package com.avito.beduin.v2.interaction.repository.flow;

import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: RepositoryGetInteraction.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "LdU0/f;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.beduin.v2.interaction.repository.flow.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36330c extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.core.z f337726m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36330c(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
        super(1);
        this.f337725l = lVar;
        this.f337726m = zVar;
    }

    @Override // Y41.l
    public final dU0.f invoke(com.avito.beduin.v2.engine.field.d dVar) {
        com.avito.beduin.v2.engine.field.d dVar2 = dVar;
        com.avito.beduin.v2.engine.field.entity.l lVar = this.f337725l;
        if (lVar != null) {
            return lVar.t(this.f337726m.getF336594a().i(), new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", dVar2)}));
        }
        return null;
    }
}
