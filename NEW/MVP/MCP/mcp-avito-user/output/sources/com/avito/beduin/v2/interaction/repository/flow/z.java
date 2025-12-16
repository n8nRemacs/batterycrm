package com.avito.beduin.v2.interaction.repository.flow;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.repository.flow.x;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RepositoryUpdateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/z;", "Lcom/avito/beduin/v2/interaction/repository/flow/x;", "I", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/repository/flow/C;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class z<I extends x> extends com.avito.beduin.v2.handler.flow.i<I> implements C {
    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        return C43175k.d(new y(this, (x) bVar, interfaceC36238a, null));
    }

    @Y61.k
    public abstract HV0.c q();
}
