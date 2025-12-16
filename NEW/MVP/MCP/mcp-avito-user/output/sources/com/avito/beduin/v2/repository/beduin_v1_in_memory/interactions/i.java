package com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.interaction.repository.flow.B;
import com.avito.beduin.v2.interaction.repository.flow.x;
import com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions.h;
import kotlin.Metadata;

/* compiled from: BeduinV1InMemoryRepositoryUpdateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/interactions/i;", "Lcom/avito/beduin/v2/interaction/repository/flow/B;", "Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/interactions/h;", "beduin-v1-in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends B<h> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.repository.beduin_v1_in_memory.b f338133c;

    public i(@k com.avito.beduin.v2.repository.beduin_v1_in_memory.b bVar) {
        super(h.a.f338132b);
        this.f338133c = bVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.B
    public final void q(x xVar) {
        h hVar = (h) xVar;
        A aH2 = hVar.f338131e.h(F.f336593b);
        this.f338133c.c(hVar.f338130d, aH2);
    }
}
