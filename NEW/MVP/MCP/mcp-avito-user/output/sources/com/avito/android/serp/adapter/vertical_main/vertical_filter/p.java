package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.vertical_main.Form;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam;
import com.avito.android.serp.adapter.vertical_main.VerticalFormType;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/p;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements InterfaceC34876l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f273568a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f273569b;

    @Inject
    public p(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f273568a = eVar;
        this.f273569b = interfaceC35745a5;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34876l
    @Y61.k
    public final B0 a(@Y61.k final com.avito.android.serp.adapter.vertical_main.a aVar, @Y61.l Filter filter, @Y61.l InlineFilterValue inlineFilterValue, @Y61.k VerticalFormType verticalFormType) {
        LinkedHashMap linkedHashMap;
        String changedParamType;
        Long attrId;
        List<SearchFormWidgetSubmitParam> submitParams = aVar.getSubmitParams();
        if (submitParams != null) {
            linkedHashMap = new LinkedHashMap();
            for (SearchFormWidgetSubmitParam searchFormWidgetSubmitParam : submitParams) {
                linkedHashMap.put(searchFormWidgetSubmitParam.getKey(), searchFormWidgetSubmitParam.getValue());
            }
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (filter != null && (attrId = filter.getAttrId()) != null) {
            linkedHashMap2.put("changedParamId", String.valueOf(attrId.longValue()));
        }
        if (filter != null && (changedParamType = filter.getChangedParamType()) != null) {
            linkedHashMap2.put("changedParamType", changedParamType);
        }
        if (inlineFilterValue != null) {
            linkedHashMap2.putAll(inlineFilterValue.changedParamsMap());
        }
        linkedHashMap.putAll(linkedHashMap2);
        return this.f273568a.get().g(verticalFormType.f272523b, linkedHashMap).x0(this.f273569b.a()).T(C34877m.f273565b, Integer.MAX_VALUE).T(C34878n.f273566b, Integer.MAX_VALUE).d0(new l41.o() { // from class: com.avito.android.serp.adapter.vertical_main.vertical_filter.o
            @Override // l41.o
            public final Object apply(Object obj) {
                return aVar.a((Form) obj);
            }
        });
    }
}
