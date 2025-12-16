package com.avito.android.publish.slots.universal_beduin;

import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin.UniversalBeduinSlotConfig;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: UniversalBeduinSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "parameter", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.l<EditableParameter<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f245048l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(1);
        this.f245048l = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(EditableParameter<?> editableParameter) {
        String id2 = editableParameter.getId();
        i iVar = this.f245048l;
        List<String> excludeAttributeIds = ((UniversalBeduinSlotConfig) iVar.f245049b.getWidget().getConfig()).getExcludeAttributeIds();
        if (excludeAttributeIds == null) {
            excludeAttributeIds = C42784z0.f406748b;
        }
        if (!excludeAttributeIds.contains(id2)) {
            iVar.l();
        }
        return G0.f406611a;
    }
}
