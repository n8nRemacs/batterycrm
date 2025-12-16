package com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api1MortgageCatalogCalculatorOffersGetRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ByCost", "ByPayment", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CalculatorType {

    @c("byCost")
    public static final CalculatorType ByCost;

    @c("byPayment")
    public static final CalculatorType ByPayment;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CalculatorType[] f204084c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f204085d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f204086b;

    static {
        CalculatorType calculatorType = new CalculatorType("ByCost", 0, "byCost");
        ByCost = calculatorType;
        CalculatorType calculatorType2 = new CalculatorType("ByPayment", 1, "byPayment");
        ByPayment = calculatorType2;
        CalculatorType[] calculatorTypeArr = {calculatorType, calculatorType2};
        f204084c = calculatorTypeArr;
        f204085d = kotlin.enums.c.a(calculatorTypeArr);
    }

    private CalculatorType(String str, int i12, String str2) {
        this.f204086b = str2;
    }

    public static CalculatorType valueOf(String str) {
        return (CalculatorType) Enum.valueOf(CalculatorType.class, str);
    }

    public static CalculatorType[] values() {
        return (CalculatorType[]) f204084c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f204086b.toString();
    }
}
