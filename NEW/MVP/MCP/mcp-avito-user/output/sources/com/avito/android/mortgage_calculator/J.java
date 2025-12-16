package com.avito.android.mortgage_calculator;

import androidx.view.S0;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J extends kotlin.jvm.internal.N implements Y41.a<S0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204047l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(MortgageCalculatorView mortgageCalculatorView) {
        super(0);
        this.f204047l = mortgageCalculatorView;
    }

    @Override // Y41.a
    public final S0 invoke() {
        return this.f204047l.getClosestViewModelStoreOwner().getF42820b();
    }
}
