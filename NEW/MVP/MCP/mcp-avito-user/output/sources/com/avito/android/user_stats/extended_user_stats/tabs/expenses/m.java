package com.avito.android.user_stats.extended_user_stats.tabs.expenses;

import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom.TotalBottomItemData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExpensesUnitPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/m;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements com.avito.android.recycler.data_aware.a {
    @Inject
    public m() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (L.f(aVar != null ? Long.valueOf(aVar.getF117182c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF117182c()) : null) && (aVar instanceof TotalBottomItemData) && (aVar2 instanceof TotalBottomItemData)) {
            return Boolean.valueOf(!L.f(((TotalBottomItemData) aVar).f317789c, ((TotalBottomItemData) aVar2).f317789c));
        }
        return null;
    }
}
