package com.avito.beduin.v2.interaction.navigation.flow;

import com.avito.beduin.v2.engine.InterfaceC36270g;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BackInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/e;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/navigation/flow/a;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends com.avito.beduin.v2.handler.flow.i<C36326a> implements FV0.h {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.interaction.navigation_controller.e f337522c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36270g f337523d;

    public e(@Y61.k com.avito.beduin.v2.interaction.navigation_controller.e eVar, @Y61.k InterfaceC36270g interfaceC36270g) {
        super(c.f337517b);
        this.f337522c = eVar;
        this.f337523d = interfaceC36270g;
    }

    @Override // FV0.h
    public final void P() {
        this.f337522c.P();
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        this.f337522c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i p(dU0.b bVar) {
        return C43175k.G(new d((C36326a) bVar, this, null));
    }
}
