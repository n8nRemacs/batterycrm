package com.avito.android.advert.item.fmp.products;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsFmpProductsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/products/a;", "LTV0/b;", "Lcom/avito/android/advert/item/fmp/products/k;", "Lcom/avito/android/advert/item/fmp/products/AdvertDetailsFmpProductsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<k, AdvertDetailsFmpProductsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f75592a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<n> f75593b = new g.a<>(R.layout.advert_details_fmp_products_item, C2243a.f75594l);

    /* compiled from: AdvertDetailsFmpProductsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/fmp/products/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/fmp/products/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.fmp.products.a$a, reason: collision with other inner class name */
    public static final class C2243a extends N implements p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2243a f75594l = new C2243a();

        public C2243a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f75592a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f75592a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<n> b() {
        return this.f75593b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsFmpProductsItem;
    }
}
