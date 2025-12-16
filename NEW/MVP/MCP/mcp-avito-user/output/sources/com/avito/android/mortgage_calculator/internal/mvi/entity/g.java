package com.avito.android.mortgage_calculator.internal.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_calculator.internal.items.DisclaimerDescription;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalculatorOneTimeEvent.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g$b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class g {

    /* compiled from: CalculatorOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f204607a;

        public a(@k DeepLink deepLink) {
            super(null);
            this.f204607a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f204607a, ((a) obj).f204607a);
        }

        public final int hashCode() {
            return this.f204607a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f204607a, ')');
        }
    }

    /* compiled from: CalculatorOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g$b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/g;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DisclaimerDescription f204608a;

        public b(@k DisclaimerDescription disclaimerDescription) {
            super(null);
            this.f204608a = disclaimerDescription;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f204608a, ((b) obj).f204608a);
        }

        public final int hashCode() {
            return this.f204608a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDisclaimer(disclaimer=" + this.f204608a + ')';
        }
    }

    public /* synthetic */ g(C42822w c42822w) {
        this();
    }

    public g() {
    }
}
