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

/* compiled from: InstallmentsV2CalculatorBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/calculator/x;", "LTV0/b;", "Lcom/avito/android/credits/calculator/l;", "Lcom/avito/android/credits/CreditCalculatorItem;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class x implements TV0.b<l, CreditCalculatorItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.q f128727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.x f128728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f128729c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<A> f128730d = new g.a<>(R.layout.credit_calculator_installments_v2, new a());

    /* compiled from: InstallmentsV2CalculatorBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/credits/calculator/A;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/credits/calculator/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, A> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final A invoke(ViewGroup viewGroup, View view) {
            x xVar = x.this;
            return new A(view, xVar.f128728b, xVar.f128729c);
        }
    }

    @Inject
    public x(@Y61.k com.avito.android.credits.q qVar, @Y61.k com.avito.android.credits.x xVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f128727a = qVar;
        this.f128728b = xVar;
        this.f128729c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f128727a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<A> b() {
        return this.f128730d;
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
            if (((CreditCalculatorItem) aVar).f128553b == CreditCalculator.Type.f128980e) {
                return true;
            }
        }
        return false;
    }
}
