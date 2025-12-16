package com.avito.android.credits.calculator;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.credits.CreditCalculatorItem;
import com.avito.android.credits.models.CreditCalculator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsCalculatorBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/calculator/v;", "LTV0/b;", "Lcom/avito/android/credits/calculator/l;", "Lcom/avito/android/credits/CreditCalculatorItem;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v implements TV0.b<l, CreditCalculatorItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.q f128721a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.x f128722b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<G> f128723c = new g.a<>(R.layout.credit_calculator_installments, new a());

    /* compiled from: InstallmentsCalculatorBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/credits/calculator/G;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/credits/calculator/G;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, G> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G invoke(ViewGroup viewGroup, View view) {
            return new G(view, v.this.f128722b);
        }
    }

    @Inject
    public v(@Y61.k com.avito.android.credits.q qVar, @Y61.k com.avito.android.credits.x xVar) {
        this.f128721a = qVar;
        this.f128722b = xVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f128721a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<G> b() {
        return this.f128723c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof CreditCalculatorItem) {
            if (((CreditCalculatorItem) aVar).f128553b == CreditCalculator.Type.f128979d) {
                return true;
            }
        }
        return false;
    }
}
