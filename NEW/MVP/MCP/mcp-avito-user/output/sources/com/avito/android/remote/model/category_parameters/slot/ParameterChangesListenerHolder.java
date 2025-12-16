package com.avito.android.remote.model.category_parameters.slot;

import Y61.l;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Slot.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R.\u0010\t\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/ParameterChangesListenerHolder;", "", "Lkotlin/Function1;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lkotlin/G0;", "getChangesListener", "()LY41/l;", "setChangesListener", "(LY41/l;)V", "changesListener", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ParameterChangesListenerHolder {
    @l
    Y41.l<EditableParameter<?>, G0> getChangesListener();

    void setChangesListener(@l Y41.l<? super EditableParameter<?>, G0> lVar);
}
