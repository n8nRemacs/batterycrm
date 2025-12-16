package com.avito.android.mortgage.pre_approval.form.model;

import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.printable_text.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreApprovalFormStep.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/model/PreApprovalFormStep;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreApprovalFormStep {

    /* renamed from: d, reason: collision with root package name */
    public static final PreApprovalFormStep f201845d;

    /* renamed from: e, reason: collision with root package name */
    public static final PreApprovalFormStep f201846e;

    /* renamed from: f, reason: collision with root package name */
    public static final PreApprovalFormStep f201847f;

    /* renamed from: g, reason: collision with root package name */
    public static final PreApprovalFormStep f201848g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ PreApprovalFormStep[] f201849h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f201850i;

    /* renamed from: b, reason: collision with root package name */
    public final int f201851b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f201852c;

    /* compiled from: PreApprovalFormStep.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PreApprovalFormStep.values().length];
            try {
                iArr[PreApprovalFormStep.f201845d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreApprovalFormStep.f201846e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreApprovalFormStep.f201847f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreApprovalFormStep.f201848g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        PreApprovalFormStep preApprovalFormStep = new PreApprovalFormStep("PURPOSE", 0, 1, b.c(R.string.mortgage_pre_approval_purpose_step_title, new Serializable[0]));
        f201845d = preApprovalFormStep;
        PreApprovalFormStep preApprovalFormStep2 = new PreApprovalFormStep("TERMS", 1, 2, b.c(R.string.mortgage_pre_approval_terms_step_title, new Serializable[0]));
        f201846e = preApprovalFormStep2;
        PreApprovalFormStep preApprovalFormStep3 = new PreApprovalFormStep("PROFILE", 2, 3, b.c(R.string.mortgage_pre_approval_profile_step_title, new Serializable[0]));
        f201847f = preApprovalFormStep3;
        PreApprovalFormStep preApprovalFormStep4 = new PreApprovalFormStep("INCOME", 3, 4, b.c(R.string.mortgage_pre_approval_income_step_title, new Serializable[0]));
        f201848g = preApprovalFormStep4;
        PreApprovalFormStep[] preApprovalFormStepArr = {preApprovalFormStep, preApprovalFormStep2, preApprovalFormStep3, preApprovalFormStep4};
        f201849h = preApprovalFormStepArr;
        f201850i = c.a(preApprovalFormStepArr);
    }

    public PreApprovalFormStep(String str, int i12, int i13, PrintableText printableText) {
        this.f201851b = i13;
        this.f201852c = printableText;
    }

    public static PreApprovalFormStep valueOf(String str) {
        return (PreApprovalFormStep) Enum.valueOf(PreApprovalFormStep.class, str);
    }

    public static PreApprovalFormStep[] values() {
        return (PreApprovalFormStep[]) f201849h.clone();
    }

    @l
    public final PreApprovalFormStep a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return f201846e;
        }
        if (iOrdinal == 1) {
            return f201847f;
        }
        if (iOrdinal == 2) {
            return f201848g;
        }
        if (iOrdinal == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public final PreApprovalFormStep b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return f201845d;
        }
        if (iOrdinal == 2) {
            return f201846e;
        }
        if (iOrdinal == 3) {
            return f201847f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
