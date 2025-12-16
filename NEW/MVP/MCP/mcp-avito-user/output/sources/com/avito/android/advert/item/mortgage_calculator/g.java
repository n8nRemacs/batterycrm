package com.avito.android.advert.item.mortgage_calculator;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage_calculator.MortgageCalculatorView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageCalculatorItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/mortgage_calculator/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/mortgage_calculator/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MortgageCalculatorView f77672b;

    static {
        int i12 = MortgageCalculatorView.f204050h;
    }

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.calculator);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.mortgage_calculator.MortgageCalculatorView");
        }
        this.f77672b = (MortgageCalculatorView) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.mortgage_calculator.f
    public final void ys() {
        this.f77672b.d();
    }
}
