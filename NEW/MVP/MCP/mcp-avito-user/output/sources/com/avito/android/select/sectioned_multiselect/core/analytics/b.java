package com.avito.android.select.sectioned_multiselect.core.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/analytics/b;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {
    void a(@l String str);

    void b();

    void c(@l String str, @l List<SectionedMultiselectParameter.Tab> list, @k List<? extends ParcelableEntity<String>> list2, @k String str2, int i12);
}
