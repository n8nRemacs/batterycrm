package com.avito.android.mortgage_calculator;

import com.avito.android.mortgage_calculator.internal.S0;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/S0;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage_calculator/internal/S0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class K extends kotlin.jvm.internal.N implements Y41.a<S0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204048l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(MortgageCalculatorView mortgageCalculatorView) {
        super(0);
        this.f204048l = mortgageCalculatorView;
    }

    @Override // Y41.a
    public final S0 invoke() {
        return this.f204048l.getViewModelProvider$_avito_mortgage_calculator_util().get();
    }
}
