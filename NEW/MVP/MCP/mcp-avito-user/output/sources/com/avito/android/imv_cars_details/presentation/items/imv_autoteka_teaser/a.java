package com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.L0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImvCarsDetailsAutotekaTeaserItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/a;", "LTV0/b;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/f;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/ImvCarsDetailsAutotekaTeaserItem;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<f, ImvCarsDetailsAutotekaTeaserItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f170078a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L0 f170079b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j f170080c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f170081d = new g.a<>(R.layout.imv_cars_details_autoteka_teaser_view, new C5031a());

    /* compiled from: ImvCarsDetailsAutotekaTeaserItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/konveyor/adapter/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.a$a, reason: collision with other inner class name */
    public static final class C5031a extends N implements p<ViewGroup, View, com.avito.konveyor.adapter.b> {
        public C5031a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new g(view, aVar.f170079b, aVar.f170080c);
        }
    }

    @Inject
    public a(@Y61.k d dVar, @Y61.k L0 l02, @Y61.k j jVar) {
        this.f170078a = dVar;
        this.f170079b = l02;
        this.f170080c = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f170078a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f170081d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ImvCarsDetailsAutotekaTeaserItem;
    }
}
