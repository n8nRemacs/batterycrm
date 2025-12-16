package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.C32739a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.Metadata;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "internalAction", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$b;", "invoke", "(Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;)Lcom/avito/android/mortgage_calculator/internal/mvi/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32759u extends kotlin.jvm.internal.N implements Y41.l<CalculatorInternalAction, C32739a.b> {

    /* renamed from: l, reason: collision with root package name */
    public static final C32759u f204709l = new C32759u();

    public C32759u() {
        super(1);
    }

    @Override // Y41.l
    public final C32739a.b invoke(CalculatorInternalAction calculatorInternalAction) {
        return calculatorInternalAction instanceof CalculatorInternalAction.LoadOffers ? C32739a.b.C6096b.f204480a : C32739a.b.C6095a.f204479a;
    }
}
