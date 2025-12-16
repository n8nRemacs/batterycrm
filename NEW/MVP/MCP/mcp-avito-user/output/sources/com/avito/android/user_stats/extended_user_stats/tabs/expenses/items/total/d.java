package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TotalItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/d;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/c;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RJ0.a, G0> f317778b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super RJ0.a, G0> lVar) {
        this.f317778b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).mm((TotalItemData) aVar, this.f317778b);
    }
}
