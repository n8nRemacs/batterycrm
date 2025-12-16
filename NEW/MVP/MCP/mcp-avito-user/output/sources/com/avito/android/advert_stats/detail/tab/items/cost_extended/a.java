package com.avito.android.advert_stats.detail.tab.items.cost_extended;

import TV0.g;
import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import eb.InterfaceC40078a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CostExtendedByPeriodBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/cost_extended/a;", "LTV0/b;", "Lcom/avito/android/advert_stats/detail/tab/items/cost_extended/f;", "Lcom/avito/android/advert_stats/detail/tab/items/cost_extended/CostExtendedByPeriodItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, CostExtendedByPeriodItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f86410a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f86411b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC40078a, G0> f86412c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<g> f86413d = new g.a<>(R.layout.extended_cost_item, new C2577a());

    /* compiled from: CostExtendedByPeriodBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_stats/detail/tab/items/cost_extended/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_stats/detail/tab/items/cost_extended/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_stats.detail.tab.items.cost_extended.a$a, reason: collision with other inner class name */
    public static final class C2577a extends N implements p<ViewGroup, View, g> {
        public C2577a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            com.avito.android.util.text.a aVar2 = aVar.f86411b;
            return new g(aVar.f86412c, view, aVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar, @k l<? super InterfaceC40078a, G0> lVar) {
        this.f86410a = cVar;
        this.f86411b = aVar;
        this.f86412c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86410a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f86413d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CostExtendedByPeriodItem;
    }
}
