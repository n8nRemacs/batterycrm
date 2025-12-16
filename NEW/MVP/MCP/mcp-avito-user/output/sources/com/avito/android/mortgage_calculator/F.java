package com.avito.android.mortgage_calculator;

import androidx.fragment.app.p0;
import androidx.view.T0;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Landroidx/lifecycle/T0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F extends kotlin.jvm.internal.N implements Y41.a<T0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204041l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(MortgageCalculatorView mortgageCalculatorView) {
        super(0);
        this.f204041l = mortgageCalculatorView;
    }

    @Override // Y41.a
    public final T0 invoke() {
        MortgageCalculatorView mortgageCalculatorView = this.f204041l;
        try {
            return p0.a(mortgageCalculatorView);
        } catch (IllegalStateException unused) {
            return mortgageCalculatorView.f204053d;
        }
    }
}
