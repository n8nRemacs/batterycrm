package com.avito.android.mortgage_calculator.internal.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculatorPrivateAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/h;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/a;", "a", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/h$a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface h extends com.avito.android.mortgage_calculator.internal.mvi.entity.a {

    /* compiled from: CalculatorPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/h$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/h;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final D10.a f204609b;

        public a(@k D10.a aVar) {
            this.f204609b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f204609b, ((a) obj).f204609b);
        }

        public final int hashCode() {
            return this.f204609b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdatePrivateState(privateState=" + this.f204609b + ')';
        }
    }
}
