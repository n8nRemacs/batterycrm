package com.avito.android.advert_details_items.services_discount_and_gifts;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/services_discount_and_gifts/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/services_discount_and_gifts/g;", "Lcom/avito/android/advert_details_items/services_discount_and_gifts/AdvertDetailsServicesDiscountAndBuyerGiftItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<g, AdvertDetailsServicesDiscountAndBuyerGiftItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f85660a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<i> f85661b = new g.a<>(R.layout.advert_details_services_discount_and_buyer_gift, C2547a.f85662l);

    /* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/services_discount_and_gifts/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/services_discount_and_gifts/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.services_discount_and_gifts.a$a, reason: collision with other inner class name */
    public static final class C2547a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2547a f85662l = new C2547a();

        public C2547a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f85660a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f85660a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<i> b() {
        return this.f85661b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AdvertDetailsServicesDiscountAndBuyerGiftItem) {
            AdvertDetailsServicesDiscountAndBuyerGiftItem advertDetailsServicesDiscountAndBuyerGiftItem = (AdvertDetailsServicesDiscountAndBuyerGiftItem) aVar;
            if (advertDetailsServicesDiscountAndBuyerGiftItem.f85656h != null || advertDetailsServicesDiscountAndBuyerGiftItem.f85655g != null) {
                return true;
            }
        }
        return false;
    }
}
