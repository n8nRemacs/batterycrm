package com.avito.android.vas_performance.ui.items.competitive_vas;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas/a;", "LTV0/b;", "Lcom/avito/android/vas_performance/ui/items/competitive_vas/i;", "Lcom/avito/android/vas_performance/ui/items/competitive_vas/d;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.b<i, d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f321615a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<j> f321616b = new g.a<>(R.layout.competitive_vas_item_promoblock, C9953a.f321617l);

    /* compiled from: CompetitiveVasBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/vas_performance/ui/items/competitive_vas/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/vas_performance/ui/items/competitive_vas/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.vas_performance.ui.items.competitive_vas.a$a, reason: collision with other inner class name */
    public static final class C9953a extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public static final C9953a f321617l = new C9953a();

        public C9953a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view);
        }
    }

    @Inject
    public a(@k e eVar) {
        this.f321615a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f321615a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f321616b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof d;
    }
}
