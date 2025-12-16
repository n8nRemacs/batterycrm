package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.g;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalculatorOneTimeEventProducer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/S;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class S implements com.avito.android.arch.mvi.t<CalculatorInternalAction, com.avito.android.mortgage_calculator.internal.mvi.entity.g> {
    @Inject
    public S() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.mortgage_calculator.internal.mvi.entity.g b(CalculatorInternalAction calculatorInternalAction) {
        CalculatorInternalAction calculatorInternalAction2 = calculatorInternalAction;
        if (calculatorInternalAction2 instanceof CalculatorInternalAction.HandleDeeplink) {
            return new g.a(((CalculatorInternalAction.HandleDeeplink) calculatorInternalAction2).f204551b);
        }
        if (calculatorInternalAction2 instanceof CalculatorInternalAction.OpenDisclaimer) {
            return new g.b(((CalculatorInternalAction.OpenDisclaimer) calculatorInternalAction2).f204563b);
        }
        return null;
    }
}
