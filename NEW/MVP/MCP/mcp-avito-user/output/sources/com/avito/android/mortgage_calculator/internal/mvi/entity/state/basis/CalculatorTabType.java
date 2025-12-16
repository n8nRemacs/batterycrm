package com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalculatorBasisState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/state/basis/CalculatorTabType;", "", "a", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CalculatorTabType {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f204618c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final CalculatorTabType f204619d;

    /* renamed from: e, reason: collision with root package name */
    public static final CalculatorTabType f204620e;

    /* renamed from: f, reason: collision with root package name */
    public static final CalculatorTabType f204621f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CalculatorTabType[] f204622g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f204623h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f204624b;

    /* compiled from: CalculatorBasisState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/state/basis/CalculatorTabType$a;", "", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        CalculatorTabType calculatorTabType = new CalculatorTabType("PROPERTY_COST", 0, "byCost");
        f204620e = calculatorTabType;
        CalculatorTabType calculatorTabType2 = new CalculatorTabType("MONTHLY_PAYMENT", 1, "byPayment");
        f204621f = calculatorTabType2;
        CalculatorTabType[] calculatorTabTypeArr = {calculatorTabType, calculatorTabType2};
        f204622g = calculatorTabTypeArr;
        f204623h = c.a(calculatorTabTypeArr);
        f204618c = new a(null);
        f204619d = calculatorTabType;
    }

    public CalculatorTabType(String str, int i12, String str2) {
        this.f204624b = str2;
    }

    public static CalculatorTabType valueOf(String str) {
        return (CalculatorTabType) Enum.valueOf(CalculatorTabType.class, str);
    }

    public static CalculatorTabType[] values() {
        return (CalculatorTabType[]) f204622g.clone();
    }
}
