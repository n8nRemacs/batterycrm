package com.avito.android.mortgage_calculator;

import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/chips/b;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_calculator.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32704a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC27333b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204060l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32704a(MortgageCalculatorView mortgageCalculatorView) {
        super(1);
        this.f204060l = mortgageCalculatorView;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC27333b interfaceC27333b) {
        this.f204060l.getViewModel().accept(new b.q(interfaceC27333b));
        return G0.f406611a;
    }
}
