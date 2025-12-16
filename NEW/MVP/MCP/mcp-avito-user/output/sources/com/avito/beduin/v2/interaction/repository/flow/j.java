package com.avito.beduin.v2.interaction.repository.flow;

import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: RepositoryObserveInteraction.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "LdU0/f;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337749l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.core.z f337750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
        super(1);
        this.f337749l = lVar;
        this.f337750m = zVar;
    }

    @Override // Y41.l
    public final dU0.f invoke(com.avito.beduin.v2.engine.field.d dVar) {
        return this.f337749l.t(this.f337750m.getF336594a().i(), new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", dVar)}));
    }
}
