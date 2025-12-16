package com.avito.android.advert_core.offers.items.small_card;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SmallCardOfferItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/items/small_card/a;", "LTV0/b;", "Lcom/avito/android/advert_core/offers/items/small_card/g;", "Lcom/avito/android/advert_core/offers/items/small_card/SmallCardOfferItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<g, SmallCardOfferItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f83833a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f83834b = new g.a<>(R.layout.small_card_offer_item, C2481a.f83835l);

    /* compiled from: SmallCardOfferItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/offers/items/small_card/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/offers/items/small_card/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.offers.items.small_card.a$a, reason: collision with other inner class name */
    public static final class C2481a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2481a f83835l = new C2481a();

        public C2481a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f83833a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f83833a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f83834b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SmallCardOfferItem;
    }
}
