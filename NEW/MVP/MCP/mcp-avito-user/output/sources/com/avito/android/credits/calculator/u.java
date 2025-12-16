package com.avito.android.credits.calculator;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: HarabaCreditCalculatorView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/calculator/u;", "Lcom/avito/android/credits/calculator/b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u extends C29615b {

    /* renamed from: y, reason: collision with root package name */
    public final int f128720y;

    public u(@Y61.k View view, @Y61.k com.avito.android.credits.x xVar) {
        super(view, xVar, "haraba_auto_calculator_tag");
        this.f128720y = R.style.Re23_Button_PrimaryLarge;
        this.f128702d.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.credits_haraba_logo, 0);
    }

    @Override // com.avito.android.credits.calculator.C29615b
    @Y61.k
    public final Integer E80() {
        return Integer.valueOf(this.f128720y);
    }
}
