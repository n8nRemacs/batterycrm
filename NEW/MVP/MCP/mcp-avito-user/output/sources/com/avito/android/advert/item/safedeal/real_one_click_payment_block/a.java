package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsSafeDealPaymentBlockBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/a;", "LTV0/b;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/h;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/AdvertDetailsSafeDealPaymentBlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<h, AdvertDetailsSafeDealPaymentBlockItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f78913a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f78914b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<j> f78915c = new g.a<>(R.layout.advert_details_safedeal_payment_block_item, new C2329a());

    /* compiled from: AdvertDetailsSafeDealPaymentBlockBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.real_one_click_payment_block.a$a, reason: collision with other inner class name */
    public static final class C2329a extends N implements p<ViewGroup, View, j> {
        public C2329a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j((ViewGroup) view, a.this.f78914b);
        }
    }

    @Inject
    public a(@k e eVar, @k com.avito.android.util.text.a aVar) {
        this.f78913a = eVar;
        this.f78914b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f78913a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f78915c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertDetailsSafeDealPaymentBlockItem;
    }
}
