package com.avito.beduin.v2.repository.in_memory.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.repository.in_memory.interactions.a;
import kotlin.Metadata;
import mV0.C44020b;

/* compiled from: InMemoryRepositoryGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/b;", "Lcom/avito/beduin/v2/interaction/repository/flow/h;", "Lcom/avito/beduin/v2/repository/in_memory/interactions/a;", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends com.avito.beduin.v2.interaction.repository.flow.h<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C44020b f338282c;

    public b(@k C44020b c44020b) {
        super(a.C10482a.f338281b);
        this.f338282c = c44020b;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.h
    public final com.avito.beduin.v2.engine.field.d q(com.avito.beduin.v2.interaction.repository.flow.d dVar, C36272i c36272i) {
        com.avito.beduin.v2.engine.field.d dVar2 = (com.avito.beduin.v2.engine.field.d) this.f338282c.f414543a.f419806a.get(((a) dVar).f338280d);
        com.avito.beduin.v2.engine.field.d dVarH = dVar2 != null ? dVar2.h(F.f336593b) : null;
        return dVarH == null ? com.avito.beduin.v2.engine.field.entity.f.f336800b : dVarH;
    }
}
