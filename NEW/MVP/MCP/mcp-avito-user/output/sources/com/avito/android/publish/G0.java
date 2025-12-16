package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import kotlin.Metadata;

/* compiled from: PublishViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class G0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0 f231909b;

    public G0(C0 c02) {
        this.f231909b = c02;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ParameterSlot parameterSlotFindParameterHolder;
        String id2;
        EditableParameter editableParameter = (EditableParameter) obj;
        CategoryParameters categoryParameters = this.f231909b.f231873k0;
        return (categoryParameters == null || (parameterSlotFindParameterHolder = categoryParameters.findParameterHolder(editableParameter.getId())) == null || (id2 = parameterSlotFindParameterHolder.getId()) == null) ? editableParameter.getId() : id2;
    }
}
