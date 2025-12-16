package com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions;

import Y61.k;
import com.avito.beduin.v2.interaction.repository.flow.q;
import com.avito.beduin.v2.interaction.repository.flow.u;
import com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions.f;
import kotlin.Metadata;

/* compiled from: BeduinV1InMemoryRepositoryRemoveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/interactions/g;", "Lcom/avito/beduin/v2/interaction/repository/flow/u;", "Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/interactions/f;", "beduin-v1-in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends u<f> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.repository.beduin_v1_in_memory.b f338129c;

    public g(@k com.avito.beduin.v2.repository.beduin_v1_in_memory.b bVar) {
        super(f.a.f338128b);
        this.f338129c = bVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.u
    public final void q(q qVar) {
        this.f338129c.remove(((f) qVar).f338127d);
    }
}
