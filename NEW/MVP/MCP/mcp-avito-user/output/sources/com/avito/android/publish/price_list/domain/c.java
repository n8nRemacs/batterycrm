package com.avito.android.publish.price_list.domain;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.Restrictions;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.price_list.PriceListGroup;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SelectPriceListDataProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/domain/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {
    @Y61.k
    ObjectsParameter a();

    @Y61.l
    String b();

    @Y61.l
    List<List<ParameterSlot>> c();

    @Y61.l
    String d();

    @Y61.k
    List<ParcelableEntity<String>> e();

    @Y61.l
    Q<Integer, List<ParameterSlot>> f(@Y61.k String str);

    @Y61.k
    String g();

    @Y61.l
    List<PriceListGroup> getGroups();

    void h(@Y61.k ObjectsParameter objectsParameter);

    @Y61.k
    TreeMap i();

    @Y61.l
    ParcelableEntity<String> j();

    @Y61.l
    ObjectsParameter.Summary k();

    @Y61.l
    String l();

    @Y61.l
    String m();

    @Y61.l
    Restrictions n();
}
