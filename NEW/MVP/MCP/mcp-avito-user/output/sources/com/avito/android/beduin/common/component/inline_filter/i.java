package com.avito.android.beduin.common.component.inline_filter;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilterValueKt;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import oj.InterfaceC44784a;

/* compiled from: InlineFilterParametersExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/i;", "Loj/a;", "Lcom/avito/android/beduin/common/component/inline_filter/BeduinInlineFilterModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC44784a<BeduinInlineFilterModel> {
    @Inject
    public i() {
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        Map mapQueryMap$default;
        List<Filter> filters = ((BeduinInlineFilterModel) beduinModel).getFilters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : filters) {
            InlineFilterValue value = ((Filter) obj).getValue();
            if (value != null ? InlineFilterValueKt.isNotEmpty(value) : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Filter filter = (Filter) it.next();
            InlineFilterValue value2 = filter.getValue();
            if (value2 != null) {
                String id2 = filter.getId();
                if (id2 == null) {
                    id2 = "";
                }
                mapQueryMap$default = InlineFilterValue.queryMap$default(value2, id2, null, null, 6, null);
            } else {
                mapQueryMap$default = null;
            }
            if (mapQueryMap$default != null) {
                arrayList2.add(mapQueryMap$default);
            }
        }
        LinkedHashMap linkedHashMapD = C35755b0.d(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapD.entrySet()) {
            if (!C43066x.K((String) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
