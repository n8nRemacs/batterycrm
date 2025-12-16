package com.avito.android.loyalty.ui.criteria.items.card;

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

/* compiled from: CardItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/b;", "LTV0/b;", "Lcom/avito/android/loyalty/ui/criteria/items/card/f;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements TV0.b<f, com.avito.android.loyalty.ui.criteria.items.card.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f183484a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f183485b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f183486c = new g.a<>(R.layout.item_card, new a());

    /* compiled from: CardItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/loyalty/ui/criteria/items/card/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/loyalty/ui/criteria/items/card/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, f> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view, b.this.f183485b);
        }
    }

    @Inject
    public b(@k d dVar, @k g gVar) {
        this.f183484a = dVar;
        this.f183485b = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f183484a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f183486c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.loyalty.ui.criteria.items.card.a;
    }
}
