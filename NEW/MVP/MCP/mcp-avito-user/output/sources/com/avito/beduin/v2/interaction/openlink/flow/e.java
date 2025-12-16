package com.avito.beduin.v2.interaction.openlink.flow;

import FV0.h;
import Y61.k;
import com.avito.beduin.v2.handler.flow.i;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OpenWebLinkInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/openlink/flow/e;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/openlink/flow/b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends i<b> implements h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.feature.openlink.a f337710c;

    public e(@k com.avito.android.lib.beduin_v2.feature.openlink.a aVar) {
        super(c.f337707b);
        this.f337710c = aVar;
    }

    @Override // FV0.h
    public final void P() {
        this.f337710c.P();
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f337710c.f176366b = aVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i p(dU0.b bVar) {
        return C43175k.G(new d(this, (b) bVar, null));
    }
}
