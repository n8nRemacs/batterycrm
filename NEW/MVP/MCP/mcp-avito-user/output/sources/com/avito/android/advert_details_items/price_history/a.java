package com.avito.android.advert_details_items.price_history;

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

/* compiled from: PriceHistoryBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/price_history/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/price_history/i;", "Lcom/avito/android/advert_details_items/price_history/PriceHistoryItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<i, PriceHistoryItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f85386a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f85387b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<j> f85388c = new g.a<>(R.layout.advert_details_price_history, new C2543a());

    /* compiled from: PriceHistoryBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/price_history/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/price_history/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.price_history.a$a, reason: collision with other inner class name */
    public static final class C2543a extends N implements p<ViewGroup, View, j> {
        public C2543a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, a.this.f85386a);
        }
    }

    @Inject
    public a(@k com.avito.android.util.text.a aVar, @k f fVar) {
        this.f85386a = aVar;
        this.f85387b = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f85387b;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f85388c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PriceHistoryItem;
    }
}
