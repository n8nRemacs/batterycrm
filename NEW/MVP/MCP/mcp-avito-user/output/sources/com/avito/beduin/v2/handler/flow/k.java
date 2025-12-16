package com.avito.beduin.v2.handler.flow;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.n;
import dU0.b;
import kotlin.Metadata;

/* compiled from: StateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/k;", "LdU0/b;", "T", "Lcom/avito/beduin/v2/handler/flow/l;", "Lcom/avito/beduin/v2/handler/flow/j;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class k<T extends dU0.b> implements l, j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dU0.c f337165b;

    public k(@Y61.k dU0.c cVar) {
        this.f337165b = cVar;
    }

    @Y61.k
    public m a(@Y61.l n nVar, @Y61.k T t12) {
        return new m(nVar, false, false);
    }

    @Override // com.avito.beduin.v2.handler.flow.l
    @Y61.k
    public final m b(@Y61.k InterfaceC36238a interfaceC36238a, @Y61.k dU0.f fVar) {
        return a(interfaceC36238a.getF336540d(), fVar.f393891b);
    }

    @Override // com.avito.beduin.v2.handler.flow.j
    @Y61.k
    public final String getType() {
        return getF337165b().f393887a;
    }

    @Override // com.avito.beduin.v2.handler.flow.j
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final dU0.c getF337165b() {
        return this.f337165b;
    }
}
