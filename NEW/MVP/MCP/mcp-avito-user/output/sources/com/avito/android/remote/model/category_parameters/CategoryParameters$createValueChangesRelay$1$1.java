package com.avito.android.remote.model.category_parameters;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.jakewharton.rxrelay3.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CategoryParameters.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public /* synthetic */ class CategoryParameters$createValueChangesRelay$1$1 extends H implements l<EditableParameter<?>, G0> {
    public CategoryParameters$createValueChangesRelay$1$1(Object obj) {
        super(1, obj, c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    @Override // Y41.l
    public /* bridge */ /* synthetic */ G0 invoke(EditableParameter<?> editableParameter) {
        invoke2(editableParameter);
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@k EditableParameter<?> editableParameter) {
        ((c) this.receiver).accept(editableParameter);
    }
}
