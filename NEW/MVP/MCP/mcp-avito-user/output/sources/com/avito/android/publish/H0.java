package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.search.Theme;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PublishViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "activeFieldId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class H0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0 f231910b;

    public H0(C0 c02) {
        this.f231910b = c02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        GroupSlotActiveIdProvider groupSlotActiveIdProvider;
        List<String> fields;
        String str = (String) obj;
        C0 c02 = this.f231910b;
        CategoryPublishStep categoryPublishStepOe = c02.oe();
        String str2 = null;
        if (!kotlin.jvm.internal.L.f((categoryPublishStepOe == null || (fields = categoryPublishStepOe.getFields()) == null) ? null : Boolean.valueOf(fields.contains(str)), Boolean.FALSE) || !Theme.INSTANCE.isAvitoRe23(c02.ve())) {
            c02.f231861Y.o(str);
            return;
        }
        Iterator<T> it = c02.pe(c02.f231861Y.getStepIndex()).getParametersExceptOwnedBySlots().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ParameterSlot parameterSlot = (ParameterSlot) it.next();
            Slot<?> slot = parameterSlot instanceof Slot ? (Slot) parameterSlot : null;
            String strFindActiveSlotId = (slot == null || (groupSlotActiveIdProvider = c02.f231850N.get(slot.getSlotType())) == null) ? null : groupSlotActiveIdProvider.findActiveSlotId(slot, str, c02.f231873k0);
            if (strFindActiveSlotId != null) {
                str2 = strFindActiveSlotId;
                break;
            }
        }
        if (str2 != null) {
            str = str2;
        }
        c02.f231861Y.o(str);
    }
}
