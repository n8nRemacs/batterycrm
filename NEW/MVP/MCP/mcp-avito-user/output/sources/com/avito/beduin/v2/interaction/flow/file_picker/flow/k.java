package com.avito.beduin.v2.interaction.flow.file_picker.flow;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.flow.file_picker.flow.i;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FilePickerInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/k;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/i;", "LFV0/h;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends com.avito.beduin.v2.handler.flow.i<i> implements FV0.h {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.utils.filepicker.g f337430c;

    public k(@Y61.k com.avito.beduin.v2.utils.filepicker.g gVar) {
        super(i.a.f337415b);
        this.f337430c = gVar;
    }

    @Override // FV0.h
    public final void P() {
        this.f337430c.P();
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        this.f337430c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        return C43175k.G(new j((i) bVar, this, interfaceC36238a, null));
    }
}
