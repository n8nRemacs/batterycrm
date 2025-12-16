package com.avito.beduin.v2.interaction.navigation.flow;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.navigation.flow.l;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: NavigateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/n;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/navigation/flow/l;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n extends com.avito.beduin.v2.handler.flow.i<l> implements FV0.h {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f337539c;

    public n(@Y61.k p pVar) {
        super(l.a.f337536b);
        this.f337539c = pVar;
    }

    @Override // FV0.h
    public final void P() {
        this.f337539c.P();
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        this.f337539c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        return C43175k.G(new m(this, (l) bVar, null));
    }
}
