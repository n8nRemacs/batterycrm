package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CalculatorFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "LE10/c;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class O extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.mortgage_calculator.internal.mvi.entity.b, CalculatorInternalAction, E10.c, com.avito.android.mortgage_calculator.internal.mvi.entity.g>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f204458l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C32739a f204459m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S f204460n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(U u12, C32739a c32739a, S s5) {
        super(1);
        this.f204458l = u12;
        this.f204459m = c32739a;
        this.f204460n = s5;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.mortgage_calculator.internal.mvi.entity.b, CalculatorInternalAction, E10.c, com.avito.android.mortgage_calculator.internal.mvi.entity.g> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.mortgage_calculator.internal.mvi.entity.b, CalculatorInternalAction, E10.c, com.avito.android.mortgage_calculator.internal.mvi.entity.g> qVar2 = qVar;
        qVar2.f92011g = this.f204458l;
        qVar2.f92009e = this.f204459m;
        qVar2.f92010f = this.f204460n;
        qVar2.f92014j = new com.avito.android.arch.mvi.r(true, true);
        return G0.f406611a;
    }
}
