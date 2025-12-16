package com.avito.android.credits.calculator;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoLoansCreditCalculatorView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/calculator/b;", "Lcom/avito/android/credits/calculator/q;", "a", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.credits.calculator.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C29615b extends q {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f128664x = 0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f128665q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f128666r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f128667s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Input f128668t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Input f128669u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final TextView f128670v;

    /* renamed from: w, reason: collision with root package name */
    public int f128671w;

    /* compiled from: AutoLoansCreditCalculatorView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/credits/calculator/b$a;", "", "<init>", "()V", "", "HARABA_AUTO_CALCULATOR_TAG", "Ljava/lang/String;", "SBER_AUTO_CALCULATOR_TAG", "TINKOFF_AUTO_CALCULATOR_TAG", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.credits.calculator.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ C29615b(View view, com.avito.android.credits.x xVar, String str, int i12, C42822w c42822w) {
        this(view, xVar, (i12 & 4) != 0 ? null : str);
    }

    @Override // com.avito.android.credits.calculator.q
    public final boolean C80() {
        return this.f128668t.hasFocus();
    }

    @Y61.l
    public Integer E80() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.credits.calculator.l
    public final void cE(@Y61.k Q q12, int i12, @Y61.k int[] iArr, @Y61.l String str, @Y61.k Q q13, @Y61.k String str2) throws Resources.NotFoundException {
        String str3 = (String) q12.f406620c;
        com.avito.android.credits.x xVar = this.f128701c;
        String strD = xVar.d(str3);
        String strC = xVar.c(str2);
        this.f128665q.setText(strD);
        this.f128666r.setText(strC);
        int iIntValue = ((Number) q13.f406619b).intValue();
        String strValueOf = String.valueOf(iIntValue);
        Input input = this.f128668t;
        String deformattedText = input.getDeformattedText();
        if (L.f(strValueOf, deformattedText) && this.f128671w == i12) {
            return;
        }
        input.setOnFocusChangeListener(null);
        Input input2 = this.f128669u;
        input2.setOnClickListener(null);
        if (!L.f(strValueOf, deformattedText)) {
            input.u(true, String.valueOf(iIntValue));
            input.setMaxLength(9);
            input.setSelection(Math.max(0, (input.m53getText() != null ? r4.length() : 0) - 2));
        }
        this.f128667s.setMessage(str);
        Integer numE80 = E80();
        if (numE80 != null) {
            this.f128704f.setAppearance(numE80.intValue());
        }
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 5));
        this.f128671w = i12;
        Input.t(input2, B80(i12, true), false, 6);
        input2.setOnClickListener(new ViewOnClickListenerC29614a(0, this, iArr));
    }

    @Override // com.avito.android.credits.calculator.l
    public final void f40() {
        this.f128668t.f();
        com.avito.android.credits.p pVar = this.f128709k;
        if (pVar != null) {
            pVar.yd(false);
        }
    }

    public C29615b(@Y61.k View view, @Y61.k com.avito.android.credits.x xVar, @Y61.l String str) {
        super(view, xVar);
        View viewFindViewById = view.findViewById(R.id.initial_payment);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128665q = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.monthly_payment);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128666r = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.loan_input_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f128667s = (ComponentContainer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.loan_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f128668t = (Input) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.term_input);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f128669u = (Input) viewFindViewById5;
        this.f128670v = (TextView) view.findViewById(R.id.contest);
        if (str != null) {
            view.setTag(str);
        }
    }
}
