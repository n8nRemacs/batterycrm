package com.avito.android.beduin.common.container.horizontal_slider;

import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import oj.InterfaceC44784a;

/* compiled from: HorizontalSliderContainerParametersExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/o;", "Loj/a;", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinHorizontalSliderContainerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements InterfaceC44784a<BeduinHorizontalSliderContainerModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44784a<BeduinModel>> f103124a;

    @Inject
    public o(@Y61.k h31.e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f103124a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel = (BeduinHorizontalSliderContainerModel) beduinModel;
        Map<String, Object> mapA = com.avito.android.beduin_shared.model.utils.q.a(beduinHorizontalSliderContainerModel.getChildren(), this.f103124a.get());
        return beduinHorizontalSliderContainerModel.getCurrentPageIndex() != null ? P0.k(Collections.singletonMap(beduinHorizontalSliderContainerModel.getF100853b(), Collections.singletonMap("currentPage", beduinHorizontalSliderContainerModel.getCurrentPageIndex())), mapA) : mapA;
    }
}
