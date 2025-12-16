package com.avito.android.advert.item.delivery_suggests;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsDeliverySuggestsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/delivery_suggests/a;", "LTV0/b;", "Lcom/avito/android/advert/item/delivery_suggests/j;", "Lcom/avito/android/advert/item/delivery_suggests/AdvertDetailsDeliverySuggestsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<j, AdvertDetailsDeliverySuggestsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f75099a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f75100b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f75101c = new g.a<>(R.layout.advert_details_delivery_suggests_item, new C2230a());

    /* compiled from: AdvertDetailsDeliverySuggestsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/delivery_suggests/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/delivery_suggests/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.delivery_suggests.a$a, reason: collision with other inner class name */
    public static final class C2230a extends N implements Y41.p<ViewGroup, View, m> {
        public C2230a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view, a.this.f75100b);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f75099a = cVar;
        this.f75100b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f75099a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f75101c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsDeliverySuggestsItem;
    }
}
