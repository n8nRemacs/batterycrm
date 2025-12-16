package com.avito.beduin.v2.handler.flow;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import dU0.b;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ChainInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/i;", "LdU0/b;", "T", "Lcom/avito/beduin/v2/handler/flow/j;", "Lcom/avito/beduin/v2/handler/flow/a;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class i<T extends dU0.b> implements j, a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dU0.c f337164b;

    public i(@Y61.k dU0.c cVar) {
        this.f337164b = cVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.a
    @Y61.k
    public final InterfaceC43160i<dU0.f> b(@Y61.k InterfaceC36238a interfaceC36238a, @Y61.k dU0.f fVar) {
        return o(interfaceC36238a, fVar.f393891b);
    }

    @Override // com.avito.beduin.v2.handler.flow.j
    @Y61.k
    public final String getType() {
        return getF337165b().f393887a;
    }

    @Override // com.avito.beduin.v2.handler.flow.j
    @Y61.k
    /* renamed from: k, reason: from getter */
    public dU0.c getF337165b() {
        return this.f337164b;
    }

    @Y61.k
    public InterfaceC43160i<dU0.f> o(@Y61.k InterfaceC36238a interfaceC36238a, @Y61.k T t12) {
        interfaceC36238a.getClass();
        return p(t12);
    }

    @Y61.k
    public InterfaceC43160i p(@Y61.k dU0.b bVar) {
        return C43175k.G(new h(2, null));
    }
}
