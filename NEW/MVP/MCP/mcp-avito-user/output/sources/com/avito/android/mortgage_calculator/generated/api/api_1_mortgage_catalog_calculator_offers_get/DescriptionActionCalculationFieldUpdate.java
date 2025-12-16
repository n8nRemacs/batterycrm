package com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import v10.C49141c;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate;", "", "Lv10/c;", "event", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$Field;", "field", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$FieldV2;", "fieldV2", "", "value", "<init>", "(Lv10/c;Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$Field;Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$FieldV2;J)V", "Lv10/c;", "a", "()Lv10/c;", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$Field;", "getField", "()Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$Field;", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$FieldV2;", "b", "()Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$FieldV2;", "J", "c", "()J", "Field", "FieldV2", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DescriptionActionCalculationFieldUpdate {

    @c("event")
    @l
    private final C49141c event;

    @c("field")
    @k
    private final Field field;

    @c("fieldV2")
    @k
    private final FieldV2 fieldV2;

    @c("value")
    private final long value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$Field;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Term", "DownPayment", "PropertyCost", "LandCost", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Field {

        @c("downPayment")
        public static final Field DownPayment;

        @c("landCost")
        public static final Field LandCost;

        @c("propertyCost")
        public static final Field PropertyCost;

        @c("term")
        public static final Field Term;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Field[] f204087b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f204088c;

        static {
            Field field = new Field("Term", 0, "term");
            Term = field;
            Field field2 = new Field("DownPayment", 1, "downPayment");
            DownPayment = field2;
            Field field3 = new Field("PropertyCost", 2, "propertyCost");
            PropertyCost = field3;
            Field field4 = new Field("LandCost", 3, "landCost");
            LandCost = field4;
            Field[] fieldArr = {field, field2, field3, field4};
            f204087b = fieldArr;
            f204088c = kotlin.enums.c.a(fieldArr);
        }

        private Field(String str, int i12, String str2) {
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) f204087b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$FieldV2;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unknown", "Term", "DownPayment", "PropertyCost", "LandCost", "MonthlyPayment", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FieldV2 {

        @c("downPayment")
        public static final FieldV2 DownPayment;

        @c("landCost")
        public static final FieldV2 LandCost;

        @c("monthlyPayment")
        public static final FieldV2 MonthlyPayment;

        @c("propertyCost")
        public static final FieldV2 PropertyCost;

        @c("term")
        public static final FieldV2 Term;

        @c("unknown")
        public static final FieldV2 Unknown;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ FieldV2[] f204089b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f204090c;

        static {
            FieldV2 fieldV2 = new FieldV2("Unknown", 0, "unknown");
            Unknown = fieldV2;
            FieldV2 fieldV22 = new FieldV2("Term", 1, "term");
            Term = fieldV22;
            FieldV2 fieldV23 = new FieldV2("DownPayment", 2, "downPayment");
            DownPayment = fieldV23;
            FieldV2 fieldV24 = new FieldV2("PropertyCost", 3, "propertyCost");
            PropertyCost = fieldV24;
            FieldV2 fieldV25 = new FieldV2("LandCost", 4, "landCost");
            LandCost = fieldV25;
            FieldV2 fieldV26 = new FieldV2("MonthlyPayment", 5, "monthlyPayment");
            MonthlyPayment = fieldV26;
            FieldV2[] fieldV2Arr = {fieldV2, fieldV22, fieldV23, fieldV24, fieldV25, fieldV26};
            f204089b = fieldV2Arr;
            f204090c = kotlin.enums.c.a(fieldV2Arr);
        }

        private FieldV2(String str, int i12, String str2) {
        }

        public static FieldV2 valueOf(String str) {
            return (FieldV2) Enum.valueOf(FieldV2.class, str);
        }

        public static FieldV2[] values() {
            return (FieldV2[]) f204089b.clone();
        }
    }

    public DescriptionActionCalculationFieldUpdate(@l C49141c c49141c, @k Field field, @k FieldV2 fieldV2, long j12) {
        this.event = c49141c;
        this.field = field;
        this.fieldV2 = fieldV2;
        this.value = j12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C49141c getEvent() {
        return this.event;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final FieldV2 getFieldV2() {
        return this.fieldV2;
    }

    /* renamed from: c, reason: from getter */
    public final long getValue() {
        return this.value;
    }
}
