package com.avito.android.mortgage_calculator.internal.mvi.entity.state;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalculatorField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/state/CalculatorField;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CalculatorField {

    /* renamed from: b, reason: collision with root package name */
    public static final CalculatorField f204610b;

    /* renamed from: c, reason: collision with root package name */
    public static final CalculatorField f204611c;

    /* renamed from: d, reason: collision with root package name */
    public static final CalculatorField f204612d;

    /* renamed from: e, reason: collision with root package name */
    public static final CalculatorField f204613e;

    /* renamed from: f, reason: collision with root package name */
    public static final CalculatorField f204614f;

    /* renamed from: g, reason: collision with root package name */
    public static final CalculatorField f204615g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ CalculatorField[] f204616h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f204617i;

    static {
        CalculatorField calculatorField = new CalculatorField("PROPERTY_COST", 0);
        f204610b = calculatorField;
        CalculatorField calculatorField2 = new CalculatorField("LAND_COST", 1);
        f204611c = calculatorField2;
        CalculatorField calculatorField3 = new CalculatorField("MONTHLY_PAYMENT", 2);
        f204612d = calculatorField3;
        CalculatorField calculatorField4 = new CalculatorField("DOWN_PAYMENT", 3);
        f204613e = calculatorField4;
        CalculatorField calculatorField5 = new CalculatorField("CREDIT_TERM", 4);
        f204614f = calculatorField5;
        CalculatorField calculatorField6 = new CalculatorField(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f204615g = calculatorField6;
        CalculatorField[] calculatorFieldArr = {calculatorField, calculatorField2, calculatorField3, calculatorField4, calculatorField5, calculatorField6};
        f204616h = calculatorFieldArr;
        f204617i = c.a(calculatorFieldArr);
    }

    public CalculatorField() {
        throw null;
    }

    public static CalculatorField valueOf(String str) {
        return (CalculatorField) Enum.valueOf(CalculatorField.class, str);
    }

    public static CalculatorField[] values() {
        return (CalculatorField[]) f204616h.clone();
    }
}
