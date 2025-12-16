package com.avito.android.str_calendar.seller.calandar_parameters.domain.children;

import com.avito.android.remote.model.category_parameters.ChildrenAgesParameter;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AvailableChildrenAgesBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/children/a;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @Y61.l
    Q<Integer, Integer> a(@Y61.l Integer num, @Y61.k Collection<Integer> collection, @Y61.k Collection<Integer> collection2, @Y61.k Set<Integer> set);

    @Y61.k
    LinkedHashSet b(@Y61.l Integer num, @Y61.k Collection collection, @Y61.k Set set);

    @Y61.k
    LinkedHashSet c(@Y61.k Collection collection, @Y61.k Set set);

    @Y61.k
    Set<Integer> d(@Y61.k Collection<ChildrenAgesParameter> collection);
}
