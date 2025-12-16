package com.avito.android.beduin.common.component.checkbox_list_item;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.q;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import oj.InterfaceC44784a;

/* compiled from: CheckboxListItemParametersExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/k;", "Loj/a;", "Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements InterfaceC44784a<BeduinCheckboxListItemModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44784a<BeduinModel>> f101000a;

    @Inject
    public k(@Y61.k h31.e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f101000a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinCheckboxListItemModel beduinCheckboxListItemModel = (BeduinCheckboxListItemModel) beduinModel;
        return P0.k(Collections.singletonMap(beduinCheckboxListItemModel.getId(), beduinCheckboxListItemModel.getState().f100927b), q.a(beduinCheckboxListItemModel.getContent().getChildren(), this.f101000a.get()));
    }
}
