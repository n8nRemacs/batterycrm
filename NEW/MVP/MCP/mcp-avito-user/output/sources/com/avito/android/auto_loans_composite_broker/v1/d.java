package com.avito.android.auto_loans_composite_broker.v1;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.credits.calculator.C29615b;
import com.avito.android.credits.x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsCompositeBrokerBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/d;", "LTV0/b;", "Lcom/avito/android/credits/calculator/b;", "Lcom/avito/android/auto_loans_composite_broker/v1/AdvertDetailsCompositeBrokerV1Item;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.b<C29615b, AdvertDetailsCompositeBrokerV1Item> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f95540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f95541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<C29615b> f95542c = new g.a<>(R.layout.credit_auto_loans_calculator, new a());

    /* compiled from: AdvertDetailsCompositeBrokerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/credits/calculator/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/credits/calculator/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, C29615b> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C29615b invoke(ViewGroup viewGroup, View view) {
            return new C29615b(view, d.this.f95541b, "composite_broker_calculator_tag");
        }
    }

    @Inject
    public d(@Y61.k g gVar, @Y61.k x xVar) {
        this.f95540a = gVar;
        this.f95541b = xVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f95540a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C29615b> b() {
        return this.f95542c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsCompositeBrokerV1Item;
    }
}
