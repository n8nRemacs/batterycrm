package com.avito.beduin.v2.handler.flow;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.handler.flow.exception.UnregisteredInteractionHandlerException;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompositeChainInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/b;", "Lcom/avito/beduin/v2/handler/flow/a;", "Lcom/avito/beduin/v2/handler/flow/c;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a, c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f337160b;

    public b(@Y61.k f fVar) {
        this.f337160b = fVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.a
    @Y61.k
    public final InterfaceC43160i<dU0.f> b(@Y61.k InterfaceC36238a interfaceC36238a, @Y61.k dU0.f fVar) {
        InterfaceC43160i<dU0.f> interfaceC43160iB;
        String str = fVar.f393890a;
        j jVar = this.f337160b.f337162a.get(str);
        a aVar = jVar instanceof a ? (a) jVar : null;
        if (aVar == null || (interfaceC43160iB = aVar.b(interfaceC36238a, fVar)) == null) {
            throw new UnregisteredInteractionHandlerException(str);
        }
        return interfaceC43160iB;
    }
}
