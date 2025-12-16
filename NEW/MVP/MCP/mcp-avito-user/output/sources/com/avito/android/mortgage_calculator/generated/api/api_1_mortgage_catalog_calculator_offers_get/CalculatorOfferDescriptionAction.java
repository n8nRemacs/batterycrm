package com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import v10.g;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction;", "", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate;", "calculationFieldUpdate", "", "hint", "Lv10/g;", "navigation", "text", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction$Type;", "type", "<init>", "(Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate;Ljava/lang/String;Lv10/g;Ljava/lang/String;Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction$Type;)V", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate;", "a", "()Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lv10/g;", "c", "()Lv10/g;", "d", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction$Type;", "e", "()Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction$Type;", "Type", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CalculatorOfferDescriptionAction {

    @c("calculationFieldUpdate")
    @l
    private final DescriptionActionCalculationFieldUpdate calculationFieldUpdate;

    @c("hint")
    @l
    private final String hint;

    @c("navigation")
    @l
    private final g navigation;

    @c("text")
    @k
    private final String text;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Navigation", "CalculationUpdate", "CalculationFieldUpdate", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("calculation_field_update")
        public static final Type CalculationFieldUpdate;

        @c("calculation_update")
        public static final Type CalculationUpdate;

        @c("navigation")
        public static final Type Navigation;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f204082b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f204083c;

        static {
            Type type = new Type("Navigation", 0, "navigation");
            Navigation = type;
            Type type2 = new Type("CalculationUpdate", 1, "calculation_update");
            CalculationUpdate = type2;
            Type type3 = new Type("CalculationFieldUpdate", 2, "calculation_field_update");
            CalculationFieldUpdate = type3;
            Type[] typeArr = {type, type2, type3};
            f204082b = typeArr;
            f204083c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f204082b.clone();
        }
    }

    public CalculatorOfferDescriptionAction(@l DescriptionActionCalculationFieldUpdate descriptionActionCalculationFieldUpdate, @l String str, @l g gVar, @k String str2, @k Type type) {
        this.calculationFieldUpdate = descriptionActionCalculationFieldUpdate;
        this.hint = str;
        this.navigation = gVar;
        this.text = str2;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DescriptionActionCalculationFieldUpdate getCalculationFieldUpdate() {
        return this.calculationFieldUpdate;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final g getNavigation() {
        return this.navigation;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
