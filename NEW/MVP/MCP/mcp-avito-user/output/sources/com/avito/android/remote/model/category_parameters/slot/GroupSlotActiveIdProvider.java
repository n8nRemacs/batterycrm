package com.avito.android.remote.model.category_parameters.slot;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.Metadata;

/* compiled from: GroupSlotActiveIdProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/GroupSlotActiveIdProvider;", "", "findActiveSlotId", "", "parameterSlot", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "activeFieldId", "categoryParameters", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface GroupSlotActiveIdProvider {
    @l
    String findActiveSlotId(@k Slot<?> parameterSlot, @k String activeFieldId, @l CategoryParameters categoryParameters);
}
