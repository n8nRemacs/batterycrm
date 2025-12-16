package com.avito.android.advert_core.offers;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OffersItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/a;", "LTV0/b;", "Lcom/avito/android/advert_core/offers/g;", "Lcom/avito/android/advert_core/offers/OffersItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<g, OffersItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f83802a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f83803b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.offers.items.small_card.c f83804c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<h> f83805d = new g.a<>(R.layout.offers_item, new C2480a());

    /* compiled from: OffersItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/offers/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/offers/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.offers.a$a, reason: collision with other inner class name */
    public static final class C2480a extends N implements p<ViewGroup, View, h> {
        public C2480a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new h(view, aVar.f83803b, aVar.f83804c);
        }
    }

    @Inject
    public a(@k c cVar, @H9.d @k com.avito.konveyor.a aVar, @k com.avito.android.advert_core.offers.items.small_card.c cVar2) {
        this.f83802a = cVar;
        this.f83803b = aVar;
        this.f83804c = cVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f83802a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f83805d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof OffersItem;
    }
}
