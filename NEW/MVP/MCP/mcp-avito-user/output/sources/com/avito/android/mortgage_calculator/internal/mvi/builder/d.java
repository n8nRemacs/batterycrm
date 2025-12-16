package com.avito.android.mortgage_calculator.internal.mvi.builder;

import E10.b;
import F10.a;
import G10.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.deeplink.MortgageLandingLink;
import com.avito.android.mortgage.deeplink.PreApprovalFormLink;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import x10.C49742a;
import y10.C50036a;
import y10.C50037b;
import y10.C50038c;

/* compiled from: InitialCalculatorStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/builder/d;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f204500a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CalculatorTabType f204501b;

    @Inject
    public d(@k a aVar) {
        this.f204500a = aVar;
        CalculatorTabType.f204618c.getClass();
        this.f204501b = CalculatorTabType.f204619d;
    }

    @k
    public final E10.c a() {
        long jC2 = kotlin.math.b.c(2100000.0f);
        long jC3 = kotlin.math.b.c(700000.0f);
        long jC4 = kotlin.math.b.c(6300000.0f);
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.calculator_title, new Serializable[0]);
        PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.property_cost_tab_title, new Serializable[0]);
        C50037b c50037b = new C50037b(com.avito.android.printable_text.b.c(R.string.property_cost_input_title, new Serializable[0]), null, null, new y10.f(500000L, 100000000L), new y10.e("7000000", 7000000L));
        C50037b c50037b2 = new C50037b(com.avito.android.printable_text.b.c(R.string.down_payment_input_title, new Serializable[0]), new y10.d(new C50038c(com.avito.android.printable_text.b.c(R.string.cost_tab_down_payment_input_min, new Serializable[0]), 10.0f), new C50038c(com.avito.android.printable_text.b.c(R.string.cost_tab_down_payment_input_max, new Serializable[0]), 90.0f), 30.0f), com.avito.android.mortgage_calculator.internal.utils.c.a(30.0f), new y10.f(jC3, jC4), new y10.e(String.valueOf(jC2), jC2));
        CalculatorTabType calculatorTabType = CalculatorTabType.f204620e;
        CalculatorTabType calculatorTabType2 = this.f204501b;
        int i12 = (int) jC2;
        return this.f204500a.a(new E10.c("", null, 637640L, "primary", null, null, null, null, printableTextC, new a.b(printableTextC2, c50037b, null, c50037b2, calculatorTabType2 == calculatorTabType), new a.C0271a(com.avito.android.printable_text.b.c(R.string.monthly_payment_tab_title, new Serializable[0]), new C50037b(com.avito.android.printable_text.b.c(R.string.monthly_payment_input_title, new Serializable[0]), new y10.d(new C50038c(com.avito.android.printable_text.b.c(R.string.monthly_payment_input_min, new Serializable[0]), 20000.0f), new C50038c(com.avito.android.printable_text.b.c(R.string.monthly_payment_input_max, new Serializable[0]), 500000.0f), 30000.0f), null, new y10.f(20000L, 500000L), new y10.e("30000", 30000L)), new C50037b(com.avito.android.printable_text.b.c(R.string.down_payment_input_title, new Serializable[0]), new y10.d(new C50038c(com.avito.android.printable_text.b.c(R.string.payment_tab_down_payment_input_min, new Serializable[0]), 500000.0f), new C50038c(com.avito.android.printable_text.b.c(R.string.payment_tab_down_payment_input_max, new Serializable[0]), 9.0E7f), 3000000.0f), null, new y10.f(500000L, 90000000L), new y10.e("3000000", 3000000L)), calculatorTabType2 == CalculatorTabType.f204621f), new C50036a(com.avito.android.printable_text.b.c(R.string.credit_term_input_title, new Serializable[0]), C42745f0.U(new C50036a.C12884a("5", 5L, false, false, 12, null), new C50036a.C12884a("10", 10L, false, false, 12, null), new C50036a.C12884a("15", 15L, false, false, 12, null), new C50036a.C12884a("20", 20L, true, false, 8, null), new C50036a.C12884a("25", 25L, false, false, 12, null), new C50036a.C12884a("30", 30L, false, false, 12, null))), a.e.f6182a, new C49742a(com.avito.android.printable_text.b.c(R.string.landing_action_button, new Serializable[0]), new MortgageLandingLink(null, 7000000, null, Integer.valueOf(i12), "637640", "primary", 20, null, null, null, null, null, null, null, null, null, null, null, null, null, "new_landing", null, null, false, 15728517, null), false, false, false, 28, null), new C49742a(com.avito.android.printable_text.b.c(R.string.pre_approval_action_button, new Serializable[0]), new PreApprovalFormLink("primary", "637640", 7000000, null, Integer.valueOf(i12), 20, null, null, null, null, null, null, 4032, null), false, false, false, 28, null), null, b.C0211b.f3676a, null));
    }
}
