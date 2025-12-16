package com.avito.beduin.v2.repository.screen_lifecycle.interactions;

import FV0.h;
import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.interaction.repository.flow.l;
import com.avito.beduin.v2.interaction.repository.flow.n;
import com.avito.beduin.v2.repository.screen_lifecycle.interactions.c;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ScreenLifecycleRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/interactions/e;", "Lcom/avito/beduin/v2/interaction/repository/flow/n;", "Lcom/avito/beduin/v2/repository/screen_lifecycle/interactions/c;", "LFV0/h;", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends n<c> implements h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.repository.screen_lifecycle.k f338314c;

    public e(@k com.avito.beduin.v2.repository.screen_lifecycle.k kVar) {
        super(c.a.f338306b);
        this.f338314c = kVar;
    }

    @Override // FV0.h
    public final void P() {
        this.f338314c.P();
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f338314c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.n
    public final InterfaceC43160i q(l lVar, C36272i c36272i) {
        return C43175k.d(new d(this, c36272i, null));
    }
}
