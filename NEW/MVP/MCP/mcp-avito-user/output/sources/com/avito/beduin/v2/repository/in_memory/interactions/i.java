package com.avito.beduin.v2.repository.in_memory.interactions;

import Y61.k;
import com.avito.beduin.v2.interaction.repository.flow.B;
import com.avito.beduin.v2.interaction.repository.flow.x;
import com.avito.beduin.v2.repository.in_memory.interactions.h;
import kotlin.Metadata;
import mV0.C44020b;

/* compiled from: InMemoryRepositoryUpdateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/i;", "Lcom/avito/beduin/v2/interaction/repository/flow/B;", "Lcom/avito/beduin/v2/repository/in_memory/interactions/h;", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends B<h> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C44020b f338298c;

    public i(@k C44020b c44020b) {
        super(h.a.f338297b);
        this.f338298c = c44020b;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.B
    public final void q(x xVar) {
        h hVar = (h) xVar;
        String str = hVar.f338295d;
        this.f338298c.c(hVar.f338296e, str);
    }
}
