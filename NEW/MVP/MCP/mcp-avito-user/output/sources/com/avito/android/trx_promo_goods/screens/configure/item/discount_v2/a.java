package com.avito.android.trx_promo_goods.screens.configure.item.discount_v2;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoDiscountV2BannerBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/discount_v2/a;", "LTV0/b;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/discount_v2/j;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/discount_v2/c;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<j, c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f303518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f303519b;

    /* compiled from: TrxPromoDiscountV2BannerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/trx_promo_goods/screens/configure/item/discount_v2/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/trx_promo_goods/screens/configure/item/discount_v2/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.a$a, reason: collision with other inner class name */
    public static final class C9291a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.util.text.a f303520l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9291a(com.avito.android.util.text.a aVar) {
            super(2);
            this.f303520l = aVar;
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view, this.f303520l);
        }
    }

    @Inject
    public a(@Y61.k d dVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f303518a = dVar;
        this.f303519b = new g.a<>(R.layout.trx_promo_discount_banner_v2, new C9291a(aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f303518a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f303519b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof c;
    }
}
