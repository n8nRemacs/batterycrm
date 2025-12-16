package com.avito.android.beduin.common.container.horizontal_slider;

import Ui.InterfaceC15523b;
import bi.C25654c;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.utils.C28814j;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinHorizontalSliderContainerFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/i;", "Lej/b;", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinHorizontalSliderContainerModel;", "Lcom/avito/android/beduin/common/container/horizontal_slider/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC40113b<BeduinHorizontalSliderContainerModel, f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f103113a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Th.a f103114b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C28814j f103115c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AbstractC35201t f103116d;

    @Inject
    public i(@Y61.k h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar, @Y61.k Th.a aVar, @Y61.k C28814j c28814j, @Y61.k AbstractC35201t abstractC35201t) {
        this.f103113a = eVar;
        this.f103114b = aVar;
        this.f103115c = c28814j;
        this.f103116d = abstractC35201t;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new f(eVar, interfaceC15523b, (BeduinHorizontalSliderContainerModel) beduinModel, new C25654c(this.f103113a), this.f103114b, this.f103115c, this.f103116d);
    }
}
