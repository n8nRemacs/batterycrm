package com.avito.android.publish.slots.parameters_suggest;

import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.parameters_suggest.ParametersSuggestByAddressSlotConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParametersSuggestByAddressSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "parameter", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f244670b;

    public b(f fVar) {
        this.f244670b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String id2 = ((EditableParameter) obj).getId();
        f fVar = this.f244670b;
        if (L.f(id2, ((ParametersSuggestByAddressSlotConfig) fVar.f244674b.getWidget().getConfig()).getAddressFieldId())) {
            fVar.f244677e.f231872j0 = true;
        }
    }
}
