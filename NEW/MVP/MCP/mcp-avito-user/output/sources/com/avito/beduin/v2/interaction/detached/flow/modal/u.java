package com.avito.beduin.v2.interaction.detached.flow.modal;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.detached.flow.modal.r;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: ShowModalInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/modal/u;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/detached/flow/modal/r;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u extends com.avito.beduin.v2.handler.flow.i<r> implements FV0.h {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.utils.detached.b f337387c;

    public u(@Y61.k com.avito.beduin.v2.utils.detached.b bVar) {
        super(r.a.f337379b);
        this.f337387c = bVar;
    }

    @Override // FV0.h
    public final void P() {
        this.f337387c.P();
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        this.f337387c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        return new X(C43175k.G(new s((r) bVar, this, null)), new t(3, null));
    }
}
