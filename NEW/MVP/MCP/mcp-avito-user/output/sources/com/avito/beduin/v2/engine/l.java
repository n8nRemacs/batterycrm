package com.avito.beduin.v2.engine;

import com.avito.beduin.v2.engine.core.M;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EngineContext.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/M;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/core/M;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class l extends N implements Y41.l<M, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.core.manager.h f336895l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.avito.beduin.v2.engine.core.manager.h hVar) {
        super(1);
        this.f336895l = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(M m12) {
        this.f336895l.f336671a.add(m12);
        return G0.f406611a;
    }
}
