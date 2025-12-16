package com.avito.beduin.v2.interaction.flow.keyboard;

import Y61.k;
import com.avito.beduin.v2.handler.flow.i;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: HideKeyboardInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/keyboard/d;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/flow/keyboard/a;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends i<a> implements FV0.h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final KV0.a f337435c;

    public d(@k KV0.a aVar) {
        super(b.f337432b);
        this.f337435c = aVar;
    }

    @Override // FV0.h
    public final void P() {
        this.f337435c.P();
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f337435c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i p(dU0.b bVar) {
        return C43175k.G(new c(this, (a) bVar, null));
    }
}
