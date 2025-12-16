package com.avito.beduin.v2.utils.filepicker;

import com.avito.beduin.v2.interaction.flow.file_picker.flow.j;
import kotlin.Metadata;

/* compiled from: ScreenAwareFilePickerClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/filepicker/l;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/g;", "file-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements com.avito.beduin.v2.interaction.flow.file_picker.flow.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j.a f338448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f338449b;

    public l(j.a aVar, g gVar) {
        this.f338448a = aVar;
        this.f338449b = gVar;
    }

    @Override // com.avito.beduin.v2.interaction.flow.file_picker.flow.g
    public final void a(@Y61.k com.avito.beduin.v2.interaction.flow.file_picker.flow.h hVar) {
        this.f338448a.a(hVar);
        this.f338449b.f338433d = null;
    }

    @Override // com.avito.beduin.v2.interaction.flow.file_picker.flow.g
    public final void onCancel() {
        this.f338448a.onCancel();
        this.f338449b.f338433d = null;
    }
}
