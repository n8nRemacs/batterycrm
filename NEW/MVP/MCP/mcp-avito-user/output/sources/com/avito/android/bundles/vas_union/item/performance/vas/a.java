package com.avito.android.bundles.vas_union.item.performance.vas;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PerformanceVasBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/performance/vas/a;", "LTV0/b;", "Lcom/avito/android/bundles/vas_union/item/performance/vas/h;", "Lcom/avito/android/bundles/vas_union/item/performance/vas/c;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<h, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f108637a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f108638b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<i> f108639c = new g.a<>(R.layout.union_performance_vas_item, new C3252a());

    /* compiled from: PerformanceVasBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/bundles/vas_union/item/performance/vas/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/bundles/vas_union/item/performance/vas/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bundles.vas_union.item.performance.vas.a$a, reason: collision with other inner class name */
    public static final class C3252a extends N implements p<ViewGroup, View, i> {
        public C3252a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, a.this.f108638b);
        }
    }

    @Inject
    public a(@k d dVar, @k com.avito.android.util.text.a aVar) {
        this.f108637a = dVar;
        this.f108638b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f108637a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f108639c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
