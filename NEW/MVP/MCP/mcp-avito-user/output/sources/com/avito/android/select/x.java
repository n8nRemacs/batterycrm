package com.avito.android.select;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SelectableGroupConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/x;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface x {
    @Y61.k
    List<ParcelableEntity<String>> a(@Y61.l List<MultiselectParameter.Displaying.Group> list, @Y61.k List<? extends ParcelableEntity<String>> list2);

    @Y61.k
    List<ParcelableEntity<String>> b(@Y61.l List<MultiselectParameter.Displaying.Group> list, @Y61.k List<? extends ParcelableEntity<String>> list2);
}
