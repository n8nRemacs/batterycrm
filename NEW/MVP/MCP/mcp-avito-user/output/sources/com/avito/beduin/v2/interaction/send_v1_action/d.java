package com.avito.beduin.v2.interaction.send_v1_action;

import Y61.k;
import com.avito.beduin.v2.handler.flow.i;
import com.avito.beduin.v2.interaction.send_v1_action.b;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SendV1ActionsInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/send_v1_action/d;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/send_v1_action/b;", "send-v1-action_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends i<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f337834c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PU0.b f337835d;

    public d(@k a aVar, @k PU0.b bVar) {
        super(b.C10468b.f337831b);
        this.f337834c = aVar;
        this.f337835d = bVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i p(dU0.b bVar) {
        return C43175k.G(new c(this, (b) bVar, null));
    }
}
