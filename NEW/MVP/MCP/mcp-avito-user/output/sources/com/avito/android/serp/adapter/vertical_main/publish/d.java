package com.avito.android.serp.adapter.vertical_main.publish;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.N0;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: VerticalPublishInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/publish/d;", "Lcom/avito/android/serp/adapter/vertical_main/publish/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<N0> f273087a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f273088b;

    @Inject
    public d(@Y61.k h31.e<N0> eVar, @Y61.k a aVar) {
        this.f273087a = eVar;
        this.f273088b = aVar;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.publish.c
    @Y61.k
    public final C42007e a(@Y61.k PublishAction publishAction) {
        Filter.Config config;
        this.f273088b.getClass();
        List<Filter> list = publishAction.f273081b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i12 = 0;
        for (Filter filter : list) {
            Filter.Widget widget = filter.getWidget();
            String externalId = (widget == null || (config = widget.getConfig()) == null) ? null : config.getExternalId();
            InlineFilterValue value = filter.getValue();
            if (externalId != null && value != null) {
                int i13 = i12 + 1;
                int size = linkedHashMap.size();
                if (value instanceof InlineFilterValue.InlineFilterBooleanValue) {
                    linkedHashMap.put(G.e(i12, "attributes[", "][value]"), String.valueOf(((InlineFilterValue.InlineFilterBooleanValue) value).getValue()));
                } else if (value instanceof InlineFilterValue.InlineFilterMultiSelectValue) {
                    List<String> selectedOptions = ((InlineFilterValue.InlineFilterMultiSelectValue) value).getSelectedOptions();
                    if (selectedOptions != null) {
                        int i14 = 0;
                        for (Object obj : selectedOptions) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            linkedHashMap.put("attributes[" + i12 + "][value][" + i14 + ']', (String) obj);
                            i14 = i15;
                        }
                    }
                } else if (value instanceof InlineFilterValue.InlineFilterNumericRangeValue) {
                    InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue = (InlineFilterValue.InlineFilterNumericRangeValue) value;
                    if (inlineFilterNumericRangeValue.getFrom() != null) {
                        linkedHashMap.put(G.e(i12, "attributes[", "][value][from]"), String.valueOf(inlineFilterNumericRangeValue.getFrom()));
                    }
                    if (inlineFilterNumericRangeValue.getTo() != null) {
                        linkedHashMap.put(G.e(i12, "attributes[", "][value][to]"), String.valueOf(inlineFilterNumericRangeValue.getTo()));
                    }
                } else if (value instanceof InlineFilterValue.InlineFilterSelectIntValue) {
                    linkedHashMap.put(G.e(i12, "attributes[", "][value]"), String.valueOf(((InlineFilterValue.InlineFilterSelectIntValue) value).getSelectedOption()));
                } else if (value instanceof InlineFilterValue.InlineFilterSelectValue) {
                    InlineFilterValue.InlineFilterSelectValue inlineFilterSelectValue = (InlineFilterValue.InlineFilterSelectValue) value;
                    String selectedOption = inlineFilterSelectValue.getSelectedOption();
                    if (selectedOption != null && selectedOption.length() != 0) {
                        linkedHashMap.put(G.e(i12, "attributes[", "][value]"), String.valueOf(inlineFilterSelectValue.getSelectedOption()));
                    }
                } else {
                    V2.f318762a.b("Unsupported filter value", null);
                }
                if (linkedHashMap.size() > size) {
                    linkedHashMap.put("attributes[" + i12 + "][id]", externalId);
                }
                i12 = i13;
            }
        }
        return new C42007e(new com.avito.android.advert.deeplinks.delivery.p(this, linkedHashMap, publishAction, 14));
    }
}
