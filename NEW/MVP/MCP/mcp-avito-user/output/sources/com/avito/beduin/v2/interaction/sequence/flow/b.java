package com.avito.beduin.v2.interaction.sequence.flow;

import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.l;
import com.avito.beduin.v2.engine.field.m;
import dU0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SequenceInteraction.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.a<f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.d f337844l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f337845m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z zVar, com.avito.beduin.v2.engine.field.d dVar) {
        super(0);
        this.f337844l = dVar;
        this.f337845m = zVar;
    }

    @Override // Y41.a
    public final f invoke() {
        com.avito.beduin.v2.engine.field.d dVar = this.f337844l;
        z zVar = this.f337845m;
        l lVarE = dVar.e(zVar);
        if (lVarE == null) {
            return null;
        }
        m.f336868b.getClass();
        return lVarE.t(zVar, m.f336869c);
    }
}
