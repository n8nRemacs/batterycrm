package com.avito.android.beduin.common.component.photo_picker;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinPhotoPickerComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/f;", "Lej/b;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "Lcom/avito/android/beduin/common/component/photo_picker/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC40113b<BeduinPhotoPickerModel, C28795a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f101978a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f101979b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f101980c;

    @Inject
    public f(@Y61.k w wVar, @Y61.k s sVar, @Y61.k p pVar) {
        this.f101978a = wVar;
        this.f101979b = sVar;
        this.f101980c = pVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new C28795a(interfaceC15523b, (BeduinPhotoPickerModel) beduinModel, eVar, this.f101978a, this.f101979b, this.f101980c);
    }
}
