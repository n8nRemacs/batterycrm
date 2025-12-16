package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.serp.adapter.vertical_main.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalSearchFilterSegmentedItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/segmented/f;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/segmented/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f273511b;

    public f(@k p pVar) {
        this.f273511b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        List arrayList;
        List<Filter.InnerOptions> options;
        g gVar = (g) eVar;
        com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e eVar2 = (com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e) aVar;
        int i13 = 0;
        gVar.I(eVar2.f273468e && eVar2.f273466c != null);
        Filter filter = eVar2.f273466c;
        if (filter == null || (options = filter.getOptions()) == null) {
            arrayList = C42784z0.f406748b;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                List<Filter.InnerOptions.Options> options2 = ((Filter.InnerOptions) it.next()).getOptions();
                if (options2 == null) {
                    options2 = C42784z0.f406748b;
                }
                C42745f0.h(options2, arrayList);
            }
        }
        if (!arrayList.isEmpty()) {
            List list = arrayList;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String title = ((Filter.InnerOptions.Options) it2.next()).getTitle();
                if (title == null) {
                    title = "";
                }
                arrayList2.add(title);
            }
            Filter filter2 = eVar2.f273466c;
            InlineFilterValue value = filter2 != null ? filter2.getValue() : null;
            InlineFilterValue.InlineFilterSelectValue inlineFilterSelectValue = value instanceof InlineFilterValue.InlineFilterSelectValue ? (InlineFilterValue.InlineFilterSelectValue) value : null;
            if (inlineFilterSelectValue != null) {
                Iterator it3 = arrayList.iterator();
                int i14 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (L.f(((Filter.InnerOptions.Options) it3.next()).getOptionId(), inlineFilterSelectValue.getSelectedOption())) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 != -1) {
                    i13 = i14;
                }
            }
            gVar.yw(i13, arrayList2);
        }
        gVar.A8(eVar2.f273473j);
        gVar.l0(new e(arrayList, eVar2, this));
    }
}
