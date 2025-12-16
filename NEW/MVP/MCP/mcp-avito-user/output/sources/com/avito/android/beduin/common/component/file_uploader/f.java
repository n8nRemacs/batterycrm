package com.avito.android.beduin.common.component.file_uploader;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinFileUploaderComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/f;", "Lej/b;", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "Lcom/avito/android/beduin/common/component/file_uploader/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC40113b<BeduinFileUploaderModel, b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f101268a;

    @Inject
    public f(@Y61.k n nVar) {
        this.f101268a = nVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new b((BeduinFileUploaderModel) beduinModel, interfaceC15523b, eVar, this.f101268a);
    }
}
