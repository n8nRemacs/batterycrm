package com.avito.android.advert_details_items.price;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsPriceBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/price/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/price/g;", "Lcom/avito/android/advert_details_items/price/AdvertDetailsPriceItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<g, AdvertDetailsPriceItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f85163a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<h> f85164b = new g.a<>(R.layout.advert_details_price, C2531a.f85165l);

    /* compiled from: AdvertDetailsPriceBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/price/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/price/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.price.a$a, reason: collision with other inner class name */
    public static final class C2531a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2531a f85165l = new C2531a();

        public C2531a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f85163a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f85163a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<h> b() {
        return this.f85164b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        AdvertDetailsPriceItem advertDetailsPriceItem;
        String str;
        return (aVar instanceof AdvertDetailsPriceItem) && !(((str = (advertDetailsPriceItem = (AdvertDetailsPriceItem) aVar).f85142f) != null && !C43066x.K(str)) || advertDetailsPriceItem.f85149m || advertDetailsPriceItem.f85151o || advertDetailsPriceItem.f85152p || advertDetailsPriceItem.f85153q || advertDetailsPriceItem.f85154r || advertDetailsPriceItem.f85148l != null);
    }
}
