package com.avito.android.mortgage_calculator;

import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_calculator.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32710g extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204080l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32710g(MortgageCalculatorView mortgageCalculatorView) {
        super(0);
        this.f204080l = mortgageCalculatorView;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f204080l.getViewModel().accept(b.p.f204586b);
        return G0.f406611a;
    }
}
