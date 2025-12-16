package com.avito.beduin.v2.repository.in_memory.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.interaction.repository.flow.l;
import com.avito.beduin.v2.interaction.repository.flow.n;
import com.avito.beduin.v2.repository.in_memory.interactions.c;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mV0.C44020b;

/* compiled from: InMemoryRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/e;", "Lcom/avito/beduin/v2/interaction/repository/flow/n;", "Lcom/avito/beduin/v2/repository/in_memory/interactions/c;", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends n<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C44020b f338291c;

    public e(@k C44020b c44020b) {
        super(c.a.f338284b);
        this.f338291c = c44020b;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.n
    public final InterfaceC43160i q(l lVar, C36272i c36272i) {
        return C43175k.d(new d(this, (c) lVar, null));
    }
}
