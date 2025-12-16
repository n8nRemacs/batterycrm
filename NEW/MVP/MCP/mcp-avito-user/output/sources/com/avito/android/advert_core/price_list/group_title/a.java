package com.avito.android.advert_core.price_list.group_title;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advert_core.price_list.PriceListGroupTitleItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PriceListGroupTitleBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/price_list/group_title/a;", "LTV0/b;", "Lcom/avito/android/advert_core/price_list/group_title/f;", "Lcom/avito/android/advert_core/price_list/PriceListGroupTitleItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, PriceListGroupTitleItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f84095a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f84096b = new g.a<>(R.layout.advert_details_price_list_group_title_item, C2494a.f84097l);

    /* compiled from: PriceListGroupTitleBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/price_list/group_title/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/price_list/group_title/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.price_list.group_title.a$a, reason: collision with other inner class name */
    public static final class C2494a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2494a f84097l = new C2494a();

        public C2494a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f84095a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f84095a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f84096b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PriceListGroupTitleItem;
    }
}
