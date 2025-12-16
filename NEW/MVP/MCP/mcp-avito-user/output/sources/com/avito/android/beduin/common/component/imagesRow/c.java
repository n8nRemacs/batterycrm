package com.avito.android.beduin.common.component.imagesRow;

import Ui.InterfaceC15523b;
import Y61.k;
import bi.C25654c;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinImagesRowComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/imagesRow/c;", "Lej/b;", "Lcom/avito/android/beduin/common/component/imagesRow/BeduinImagesRowModel;", "Lcom/avito/android/beduin/common/component/imagesRow/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC40113b<BeduinImagesRowModel, b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f101479a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f101480b;

    @Inject
    public c(@k h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar, @k f fVar) {
        this.f101479a = eVar;
        this.f101480b = fVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new b((BeduinImagesRowModel) beduinModel, new Wh.c(interfaceC15523b, eVar, new C25654c(this.f101479a)), this.f101480b);
    }
}
