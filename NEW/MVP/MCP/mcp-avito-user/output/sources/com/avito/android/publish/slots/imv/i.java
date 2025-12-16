package com.avito.android.publish.slots.imv;

import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlotConfig;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;

/* compiled from: InstantMarketValueSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "parameter", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.l<EditableParameter<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f244267l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.f244267l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(EditableParameter<?> editableParameter) {
        String id2 = editableParameter.getId();
        k kVar = this.f244267l;
        if (C42756l.h(id2, ((InstantMarketValueSlotConfig) kVar.f244287b.getWidget().getConfig()).getTriggerAttributeIds())) {
            kVar.l();
        }
        return G0.f406611a;
    }
}
