package com.avito.beduin.v2.interaction.navigation.flow;

import fT.C40335a;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CloseInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/i;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/navigation/flow/f;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.beduin.v2.handler.flow.i<f> implements FV0.h {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C40335a f337529c;

    public i(@Y61.k C40335a c40335a) {
        super(g.f337526b);
        this.f337529c = c40335a;
    }

    @Override // FV0.h
    public final void P() {
        this.f337529c.P();
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        this.f337529c.f395883b = aVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i p(dU0.b bVar) {
        return C43175k.G(new h((f) bVar, this, null));
    }
}
