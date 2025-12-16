package com.avito.android.imv_cars_details.presentation.items.title_Item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImvCarsDetailsTitleBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/title_Item/a;", "LTV0/b;", "Lcom/avito/android/imv_cars_details/presentation/items/title_Item/e;", "Lcom/avito/android/imv_cars_details/presentation/items/title_Item/ImvCarsDetailsTitleItem;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<e, ImvCarsDetailsTitleItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f170244a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f170245b = new g.a<>(R.layout.imv_cars_details_title_item_view, C5038a.f170246l);

    /* compiled from: ImvCarsDetailsTitleBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/imv_cars_details/presentation/items/title_Item/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/imv_cars_details/presentation/items/title_Item/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.imv_cars_details.presentation.items.title_Item.a$a, reason: collision with other inner class name */
    public static final class C5038a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5038a f170246l = new C5038a();

        public C5038a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f170244a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f170244a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f170245b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ImvCarsDetailsTitleItem;
    }
}
