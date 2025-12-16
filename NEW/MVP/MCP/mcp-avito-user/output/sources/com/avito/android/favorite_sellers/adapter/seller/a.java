package com.avito.android.favorite_sellers.adapter.seller;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/seller/a;", "LTV0/b;", "Lcom/avito/android/favorite_sellers/adapter/seller/h;", "Lcom/avito/android/favorite_sellers/adapter/seller/SellerItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<h, SellerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f155751a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f155752b = new g.a<>(R.layout.seller_item, C4562a.f155753l);

    /* compiled from: SellerItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/favorite_sellers/adapter/seller/SellerItemViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_sellers.adapter.seller.a$a, reason: collision with other inner class name */
    public static final class C4562a extends N implements p<ViewGroup, View, SellerItemViewImpl> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4562a f155753l = new C4562a();

        public C4562a() {
            super(2);
        }

        @Override // Y41.p
        public final SellerItemViewImpl invoke(ViewGroup viewGroup, View view) {
            return new SellerItemViewImpl(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f155751a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f155751a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f155752b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SellerItem;
    }
}
