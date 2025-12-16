package com.avito.android.promo.mini;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.promo.PromoWidgetItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromoWidgetItemMiniBlueprintImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promo/mini/b;", "Lcom/avito/android/promo/mini/a;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.promo.mini.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f231652a;

    /* compiled from: PromoWidgetItemMiniBlueprintImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/promo/mini/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/promo/mini/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, h> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, b.this.f231652a);
        }
    }

    @Inject
    public b(@k d dVar) {
        this.f231652a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f231652a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.main_vertical_promo, new a());
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        String image;
        if (aVar instanceof PromoWidgetItem) {
            PromoWidgetItem promoWidgetItem = (PromoWidgetItem) aVar;
            if (promoWidgetItem.getView() == PromoWidgetItem.ViewType.f231613c && promoWidgetItem.I4() && promoWidgetItem.p4() != null && ((image = promoWidgetItem.getImage()) == null || image.length() == 0)) {
                return true;
            }
        }
        return false;
    }
}
