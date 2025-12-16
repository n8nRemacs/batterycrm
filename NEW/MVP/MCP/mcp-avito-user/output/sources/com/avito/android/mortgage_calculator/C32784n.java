package com.avito.android.mortgage_calculator;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_calculator.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32784n extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204842l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32784n(MortgageCalculatorView mortgageCalculatorView) {
        super(1);
        this.f204842l = mortgageCalculatorView;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f204842l.getViewModel().accept(b.j.f204580b);
        return G0.f406611a;
    }
}
