package com.avito.android.mortgage_calculator;

import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_calculator.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32780j extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204832l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32780j(MortgageCalculatorView mortgageCalculatorView) {
        super(1);
        this.f204832l = mortgageCalculatorView;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f204832l.getViewModel().accept(new b.f(str));
        return G0.f406611a;
    }
}
