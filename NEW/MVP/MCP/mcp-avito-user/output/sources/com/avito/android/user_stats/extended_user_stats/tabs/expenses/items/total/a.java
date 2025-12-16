package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TotalBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/a;", "LTV0/b;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/f;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/TotalItemData;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.b<f, TotalItemData> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f317772a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f317773b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<g> f317774c = new g.a<>(R.layout.user_stats_total_expenses_item, new C9860a());

    /* compiled from: TotalBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.a$a, reason: collision with other inner class name */
    public static final class C9860a extends N implements p<ViewGroup, View, g> {
        public C9860a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view, a.this.f317773b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar) {
        this.f317772a = cVar;
        this.f317773b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f317772a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f317774c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof TotalItemData;
    }
}
