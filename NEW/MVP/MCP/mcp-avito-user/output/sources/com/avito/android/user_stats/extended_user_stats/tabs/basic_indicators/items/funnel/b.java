package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FunnelBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/b;", "LTV0/b;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/i;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/e;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<i, e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f317461a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final lE.g f317462b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f317463c = new g.a<>(R.layout.user_stats_funnel_item, new a());

    /* compiled from: FunnelBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            lE.g gVar = b.this.f317462b;
            return new k(view);
        }
    }

    @Inject
    public b(@Y61.k f fVar, @Y61.k lE.g gVar) {
        this.f317461a = fVar;
        this.f317462b = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f317461a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f317463c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof e;
    }
}
