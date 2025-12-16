package com.avito.android.credits.calculator;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CashLoansCalculatorView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/calculator/h;", "Lcom/avito/android/credits/calculator/q;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.credits.calculator.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29621h extends q {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f128676w = 0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f128677q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f128678r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f128679s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Input f128680t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Input f128681u;

    /* renamed from: v, reason: collision with root package name */
    public int f128682v;

    public C29621h(@Y61.k View view, @Y61.k com.avito.android.credits.x xVar) {
        super(view, xVar);
        View viewFindViewById = view.findViewById(R.id.inputs_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f128677q = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.monthly_payment);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128678r = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.loan_input_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f128679s = (ComponentContainer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.loan_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f128680t = (Input) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.term_input);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f128681u = (Input) viewFindViewById5;
    }

    @Override // com.avito.android.credits.calculator.q
    public final boolean C80() {
        return this.f128680t.hasFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.credits.calculator.l
    public final void cE(@Y61.k Q q12, int i12, @Y61.k int[] iArr, @Y61.l String str, @Y61.k Q q13, @Y61.k String str2) {
        this.f128678r.setText("от ".concat(this.f128701c.c(str2)));
        int iIntValue = ((Number) q13.f406619b).intValue();
        String strValueOf = String.valueOf(iIntValue);
        Input input = this.f128680t;
        String deformattedText = input.getDeformattedText();
        if (L.f(strValueOf, deformattedText) && this.f128682v == i12) {
            return;
        }
        input.setOnFocusChangeListener(null);
        if (!L.f(strValueOf, deformattedText)) {
            input.u(true, String.valueOf(iIntValue));
            input.setMaxLength(9);
            input.setSelection(Math.max(0, (input.m53getText() != null ? r3.length() : 0) - 2));
        }
        this.f128679s.setMessage(str);
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 6));
        this.f128682v = i12;
        String strB80 = B80(i12, true);
        Input input2 = this.f128681u;
        Input.t(input2, strB80, false, 6);
        input2.setOnClickListener(new ViewOnClickListenerC29614a(1, this, iArr));
    }

    @Override // com.avito.android.credits.calculator.l
    public final void f40() {
        this.f128680t.f();
        com.avito.android.credits.p pVar = this.f128709k;
        if (pVar != null) {
            pVar.yd(false);
        }
    }

    @Override // com.avito.android.credits.calculator.q, com.avito.android.credits.calculator.l
    public final void yp(@Y61.l AttributedText attributedText, @Y61.k String str, @Y61.l String str2) {
        super.yp(attributedText, str, str2);
        if (str2 == null || str2.length() == 0) {
            D6.c(this.f128677q, null, Integer.valueOf(y6.b(16)), null, 0, 5);
        } else {
            int iB2 = y6.b(8);
            D6.c(this.f128677q, null, Integer.valueOf(y6.b(20)), null, Integer.valueOf(iB2), 5);
        }
    }
}
