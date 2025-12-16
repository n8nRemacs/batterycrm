package com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions.a;
import kotlin.Metadata;

/* compiled from: BeduinV1InMemoryRepositoryGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/interactions/b;", "Lcom/avito/beduin/v2/interaction/repository/flow/h;", "Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/interactions/a;", "beduin-v1-in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends com.avito.beduin.v2.interaction.repository.flow.h<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.repository.beduin_v1_in_memory.b f338116c;

    public b(@k com.avito.beduin.v2.repository.beduin_v1_in_memory.b bVar) {
        super(a.C10475a.f338115b);
        this.f338116c = bVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.h
    public final com.avito.beduin.v2.engine.field.d q(com.avito.beduin.v2.interaction.repository.flow.d dVar, C36272i c36272i) {
        return (com.avito.beduin.v2.engine.field.d) this.f338116c.a(c36272i, ((a) dVar).f338114d);
    }
}
