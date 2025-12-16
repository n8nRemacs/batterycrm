package com.avito.android.serp.adapter.vertical_main.featured.navigation.chips;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedTabsItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeaturedChipsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/chips/b;", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/chips/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.serp.adapter.vertical_main.featured.navigation.chips.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f272901a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f272902b = new g.a<>(R.layout.featured_chips, a.f272903l);

    /* compiled from: FeaturedChipsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/chips/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/chips/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f272903l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public b(@k d dVar) {
        this.f272901a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f272901a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f272902b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof FeaturedTabsItem) && (((FeaturedTabsItem) aVar).f() instanceof FeaturedNavigation.Chips);
    }
}
