package com.avito.android.beduin.common.container.checkbox_group;

import com.avito.android.beduin.common.container.checkbox_group.i;
import com.avito.android.beduin.common.form.transforms.CheckboxGroupTransform;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import lj.d;

/* compiled from: BeduinCheckboxGroupContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/d;", "Lcom/avito/android/beduin/common/container/checkbox_group/i$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f102976a;

    public d(a aVar) {
        this.f102976a = aVar;
    }

    @Override // com.avito.android.beduin.common.container.checkbox_group.i.a
    public final void a(@Y61.k String str, boolean z12) {
        a aVar = this.f102976a;
        BeduinModel beduinModelApply = aVar.f102968f.apply(new CheckboxGroupTransform(str, z12));
        BeduinCheckboxGroupModel beduinCheckboxGroupModel = aVar.f102968f;
        aVar.f102970h.h(new d.h(beduinCheckboxGroupModel, beduinModelApply));
        com.avito.android.beduin_shared.model.utils.a.a(aVar.f102971i, beduinCheckboxGroupModel.getOnSelectedActions());
    }
}
