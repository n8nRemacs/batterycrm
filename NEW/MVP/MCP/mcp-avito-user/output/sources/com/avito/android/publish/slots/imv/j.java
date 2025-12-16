package com.avito.android.publish.slots.imv;

import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: InstantMarketValueSlotWrapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class j extends H implements Y41.l<EditableParameter<?>, G0> {
    @Override // Y41.l
    public final G0 invoke(EditableParameter<?> editableParameter) {
        ((com.jakewharton.rxrelay3.c) this.receiver).accept(editableParameter);
        return G0.f406611a;
    }
}
