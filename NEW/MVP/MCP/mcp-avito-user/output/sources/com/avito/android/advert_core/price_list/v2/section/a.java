package com.avito.android.advert_core.price_list.v2.section;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advert_core.price_list.AdvertPriceListSectionItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertPriceListSectionBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/price_list/v2/section/a;", "LTV0/b;", "Lcom/avito/android/advert_core/price_list/v2/section/c;", "Lcom/avito/android/advert_core/price_list/AdvertPriceListSectionItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<c, AdvertPriceListSectionItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f84157a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.e f84158b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f84159c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<g> f84160d = new g.a<>(R.layout.advert_details_price_list_section_item, new C2498a());

    /* compiled from: AdvertPriceListSectionBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/price_list/v2/section/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/price_list/v2/section/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.price_list.v2.section.a$a, reason: collision with other inner class name */
    public static final class C2498a extends N implements p<ViewGroup, View, g> {
        public C2498a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new g(view, aVar.f84158b, aVar.f84159c);
        }
    }

    @Inject
    public a(@Y61.k i iVar, @L9.a @Y61.k com.avito.android.recycler.data_aware.e eVar, @L9.a @Y61.k com.avito.konveyor.a aVar) {
        this.f84157a = iVar;
        this.f84158b = eVar;
        this.f84159c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f84157a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<g> b() {
        return this.f84160d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertPriceListSectionItem;
    }
}
