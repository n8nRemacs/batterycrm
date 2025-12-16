package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentGenericFormPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/payment/items/phone_item/g;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/payment/items/phone_item/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f214394b;

    public s(ParametersTree parametersTree) {
        this.f214394b = parametersTree;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.payment.items.phone_item.g gVar = (com.avito.android.payment.items.phone_item.g) obj;
        ParameterSlot parameterSlotFindParameter = this.f214394b.findParameter(gVar.f214492b);
        if (parameterSlotFindParameter == null || !(parameterSlotFindParameter instanceof PhoneParameter)) {
            return;
        }
        EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
        Object value = editableParameter.getValue();
        String str = gVar.f214494d;
        if (!kotlin.jvm.internal.L.f(value, str)) {
            editableParameter.setValue(str);
            editableParameter.setError(null);
        }
        ((PhoneParameter) parameterSlotFindParameter).setError(null);
    }
}
