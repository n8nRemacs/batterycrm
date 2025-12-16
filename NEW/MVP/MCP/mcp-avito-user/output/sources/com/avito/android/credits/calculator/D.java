package com.avito.android.credits.calculator;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SberCalculatorView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/calculator/D;", "Lcom/avito/android/credits/calculator/b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class D extends C29615b {

    /* renamed from: y, reason: collision with root package name */
    public final int f128648y;

    public D(@Y61.k View view, @Y61.k com.avito.android.credits.x xVar) {
        super(view, xVar, "sber_auto_calculator_tag");
        this.f128648y = R.style.SberCalculatorButton;
    }

    @Override // com.avito.android.credits.calculator.C29615b
    @Y61.k
    public final Integer E80() {
        return Integer.valueOf(this.f128648y);
    }
}
