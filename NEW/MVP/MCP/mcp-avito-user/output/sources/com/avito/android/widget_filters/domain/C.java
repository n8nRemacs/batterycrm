package com.avito.android.widget_filters.domain;

import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.widget_filters.domain.AbstractC36153a;
import com.avito.android.widget_filters.mvi.entity.d;
import com.avito.android.widget_filters.remote.model.widgets.DateParam;
import java.util.Comparator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersParametersValidator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/domain/C;", "Lcom/avito/android/widget_filters/domain/B;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C implements B {

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(((com.avito.android.widget_filters.mvi.entity.d) t12).getF330112b()), Integer.valueOf(((com.avito.android.widget_filters.mvi.entity.d) t13).getF330112b()));
        }
    }

    @Inject
    public C() {
    }

    @Override // com.avito.android.widget_filters.domain.B
    @Y61.k
    public final AbstractC36153a a(@Y61.k com.avito.android.widget_filters.mvi.entity.c cVar) {
        NP0.m mVar;
        for (com.avito.android.widget_filters.mvi.entity.d dVar : C42745f0.B0(C42756l.B(new com.avito.android.widget_filters.mvi.entity.d[]{cVar.f330101h, cVar.f330102i, cVar.f330104k, cVar.f330103j}), new a())) {
            if (dVar instanceof d.a) {
                NP0.d dVar2 = ((d.a) dVar).f330119i;
                if (dVar2 == null) {
                    continue;
                } else {
                    boolean zIsEmpty = dVar2.f11438g.isEmpty();
                    if (dVar2.f11433b && zIsEmpty) {
                        return new AbstractC36153a.C10249a(((d.a) dVar).f330116f, dVar2.f11436e);
                    }
                }
            } else if (dVar instanceof d.b) {
                NP0.g gVar = ((d.b) dVar).f330127j;
                if (gVar == null) {
                    continue;
                } else {
                    SelectedDateRange selectedDateRange = gVar.f11451h;
                    boolean z12 = (selectedDateRange != null ? selectedDateRange.f286645b : null) == null;
                    boolean z13 = gVar.f11445b;
                    if (z13 && z12) {
                        int i12 = ((d.b) dVar).f330123f;
                        DateParam dateParam = gVar.f11449f;
                        return new AbstractC36153a.C10249a(i12, dateParam != null ? dateParam.getText() : null);
                    }
                    boolean z14 = (selectedDateRange != null ? selectedDateRange.f286646c : null) == null;
                    if (z13 && z14 && !gVar.f11454k) {
                        int i13 = ((d.b) dVar).f330123f;
                        DateParam dateParam2 = gVar.f11450g;
                        return new AbstractC36153a.C10249a(i13, dateParam2 != null ? dateParam2.getText() : null);
                    }
                }
            } else if (dVar instanceof d.c) {
                NP0.j jVar = ((d.c) dVar).f330135i;
                if (jVar != null) {
                    boolean z15 = jVar.f11483q == 0;
                    if (jVar.f11468b && z15) {
                        return new AbstractC36153a.C10249a(((d.c) dVar).f330132f, jVar.f11471e);
                    }
                } else {
                    continue;
                }
            } else if ((dVar instanceof d.C10254d) && (mVar = ((d.C10254d) dVar).f330146l) != null) {
                boolean z16 = mVar.f11499h == null;
                if (mVar.f11493b && z16) {
                    return new AbstractC36153a.C10249a(((d.C10254d) dVar).f330140f, mVar.f11496e);
                }
            }
        }
        return AbstractC36153a.b.f329849a;
    }
}
