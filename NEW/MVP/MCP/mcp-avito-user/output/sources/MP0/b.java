package MP0;

import Y61.k;
import com.avito.android.widget_filters.mvi.entity.d;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersCategoryWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersDatesWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersGuestsWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersLocationWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMP0/b;", "LMP0/a;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.widget_filters.utils.b f10679a;

    @Inject
    public b(@k com.avito.android.widget_filters.utils.b bVar) {
        this.f10679a = bVar;
    }

    @Override // MP0.a
    @k
    public final ArrayList a(@k List list, @k com.avito.android.widget_filters.mvi.entity.c cVar) {
        d.C10254d c10254d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WidgetFiltersWidget widgetFiltersWidget = (WidgetFiltersWidget) it.next();
            boolean z12 = widgetFiltersWidget instanceof WidgetFiltersCategoryWidget;
            com.avito.android.widget_filters.utils.b bVar = this.f10679a;
            if (z12) {
                d.a aVar = cVar.f330103j;
                if (aVar != null) {
                    arrayList.add(new com.avito.android.widget_filters.ui.items.category.g(aVar.f330113c, new com.avito.android.widget_filters.ui.items.d(aVar.f330114d, new com.avito.android.widget_filters.ui.items.a(bVar.b(), aVar.f330118h)), aVar.f330115e, aVar.f330117g, aVar.f330119i));
                }
            } else if (widgetFiltersWidget instanceof WidgetFiltersDatesWidget) {
                d.b bVar2 = cVar.f330102i;
                if (bVar2 != null) {
                    arrayList.add(new com.avito.android.widget_filters.ui.items.dates.e(bVar2.f330120c, new com.avito.android.widget_filters.ui.items.d(bVar2.f330121d, new com.avito.android.widget_filters.ui.items.a(bVar.b(), bVar2.f330125h)), bVar2.f330122e, bVar2.f330124g, bVar2.f330127j));
                }
            } else if (widgetFiltersWidget instanceof WidgetFiltersGuestsWidget) {
                d.c cVar2 = cVar.f330104k;
                if (cVar2 != null) {
                    arrayList.add(new com.avito.android.widget_filters.ui.items.guests.h(cVar2.f330129c, new com.avito.android.widget_filters.ui.items.d(cVar2.f330130d, new com.avito.android.widget_filters.ui.items.a(bVar.b(), cVar2.f330134h)), cVar2.f330131e, cVar2.f330133g, cVar2.f330135i, cVar2.f330136j));
                }
            } else if ((widgetFiltersWidget instanceof WidgetFiltersLocationWidget) && (c10254d = cVar.f330101h) != null) {
                arrayList.add(new com.avito.android.widget_filters.ui.items.location.e(c10254d.f330137c, new com.avito.android.widget_filters.ui.items.d(c10254d.f330138d, new com.avito.android.widget_filters.ui.items.a(bVar.b(), c10254d.f330142h)), c10254d.f330139e, c10254d.f330141g, c10254d.f330146l));
            }
        }
        return arrayList;
    }
}
