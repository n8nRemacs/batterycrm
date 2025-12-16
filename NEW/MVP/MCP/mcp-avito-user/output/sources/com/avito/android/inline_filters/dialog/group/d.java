package com.avito.android.inline_filters.dialog.group;

import com.avito.android.inline_filters.dialog.group.b;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: GroupFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<List<? extends Q<Filter, ? extends InlineFilterValue>>, G0> f171562l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f171563m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Filter f171564n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f171565o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Y41.l<? super List<? extends Q<Filter, ? extends InlineFilterValue>>, G0> lVar, b bVar, Filter filter, Y41.a<G0> aVar) {
        super(0);
        this.f171562l = lVar;
        this.f171563m = bVar;
        this.f171564n = filter;
        this.f171565o = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.l<List<? extends Q<Filter, ? extends InlineFilterValue>>, G0> lVar = this.f171562l;
        if (lVar != null) {
            List<Filter> filters = this.f171564n.getFilters();
            if (filters == null) {
                filters = C42784z0.f406748b;
            }
            this.f171563m.getClass();
            ArrayList arrayList = new ArrayList();
            for (Filter filter : filters) {
                Filter.Widget widget = filter.getWidget();
                WidgetType type = widget != null ? widget.getType() : null;
                int i12 = type == null ? -1 : b.a.f171559a[type.ordinal()];
                if (i12 == 1) {
                    arrayList.add(new Q(filter, new InlineFilterValue.InlineFilterMultiSelectValue(null)));
                } else if (i12 == 2) {
                    arrayList.add(new Q(filter, new InlineFilterValue.InlineFilterNumericRangeValue(null, null)));
                }
            }
            lVar.invoke(arrayList);
        }
        this.f171565o.invoke();
        return G0.f406611a;
    }
}
