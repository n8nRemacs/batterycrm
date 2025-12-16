package com.avito.android.remote.model.filters_parameter.slot;

import Y61.k;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Slot.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/filters_parameter/slot/ParameterHolder;", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "getParameters", "()Ljava/util/List;", "setParameters", "(Ljava/util/List;)V", "_avito-discouraged_avito-api_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ParameterHolder {
    @k
    List<ParameterSlot> getParameters();

    void setParameters(@k List<? extends ParameterSlot> list);
}
