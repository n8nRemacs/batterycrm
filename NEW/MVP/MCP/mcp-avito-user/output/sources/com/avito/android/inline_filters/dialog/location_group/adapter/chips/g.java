package com.avito.android.inline_filters.dialog.location_group.adapter.chips;

import Y41.p;
import Y61.k;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GroupFilterItemChipsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/chips/g;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/chips/d;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<Integer, InlineFilterValue, G0> f171734b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k p<? super Integer, ? super InlineFilterValue, G0> pVar) {
        this.f171734b = pVar;
    }

    public static ArrayList k(Filter filter, boolean z12) {
        List<Filter.InnerOptions> options;
        LinkedList linkedList = new LinkedList();
        if (filter != null && (options = filter.getOptions()) != null) {
            for (Filter.InnerOptions innerOptions : options) {
                if (innerOptions.getTitle() != null) {
                    linkedList.addLast(innerOptions.getTitle());
                }
                List<Filter.InnerOptions.Options> options2 = innerOptions.getOptions();
                if (options2 != null) {
                    linkedList.addAll(options2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : linkedList) {
            int i13 = i12 + 1;
            a aVar = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                aVar = new a(str, str, z12);
            } else if (obj instanceof Filter.InnerOptions.Options) {
                Filter.InnerOptions.Options options3 = (Filter.InnerOptions.Options) obj;
                if (options3.getTitle() != null) {
                    aVar = new a(options3.getId(), options3.getTitle(), z12);
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            i12 = i13;
        }
        return arrayList;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        GroupFilterItem groupFilterItem = (GroupFilterItem) aVar;
        hVar.S00(groupFilterItem.f171706e);
        InlineFilterValue value = groupFilterItem.f171704c.getValue();
        if (value instanceof InlineFilterValue.InlineFilterRadiusSelectValue) {
            hVar.setTitle(null);
            hVar.qx(((InlineFilterValue.InlineFilterRadiusSelectValue) groupFilterItem.f171704c.getValue()).getSelectedOption(), k(groupFilterItem.f171704c, groupFilterItem.f171706e));
            hVar.jc(new e(this, i12));
            return;
        }
        if (value instanceof InlineFilterValue.InlineFilterFootWalkingMetroChipsValue) {
            hVar.setTitle(groupFilterItem.f171704c.getDisplayTitle());
            hVar.qx(((InlineFilterValue.InlineFilterFootWalkingMetroChipsValue) groupFilterItem.f171704c.getValue()).getSelectedOption(), k(groupFilterItem.f171704c, groupFilterItem.f171706e));
            hVar.jc(new f(this, i12));
        }
    }
}
