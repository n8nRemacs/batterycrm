package com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem;", "", "", "message", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem$ValidatorType;", "validatorType", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem$ValidatorType;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem$ValidatorType;", "b", "()Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem$ValidatorType;", "c", "ValidatorType", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem {

    @c("message")
    @k
    private final String message;

    @c("validatorType")
    @k
    private final ValidatorType validatorType;

    @c("value")
    @k
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiTrxPromoConfigureV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem$ValidatorType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Equal", "NotEqual", "GreaterThan", "GreaterThanOrEqual", "LessThan", "LessThanOrEqual", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValidatorType {

        @c("equal")
        public static final ValidatorType Equal;

        @c("greater_than")
        public static final ValidatorType GreaterThan;

        @c("greater_than_or_equal")
        public static final ValidatorType GreaterThanOrEqual;

        @c("less_than")
        public static final ValidatorType LessThan;

        @c("less_than_or_equal")
        public static final ValidatorType LessThanOrEqual;

        @c("not_equal")
        public static final ValidatorType NotEqual;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ValidatorType[] f304185b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f304186c;

        static {
            ValidatorType validatorType = new ValidatorType("Equal", 0, "equal");
            Equal = validatorType;
            ValidatorType validatorType2 = new ValidatorType("NotEqual", 1, "not_equal");
            NotEqual = validatorType2;
            ValidatorType validatorType3 = new ValidatorType("GreaterThan", 2, "greater_than");
            GreaterThan = validatorType3;
            ValidatorType validatorType4 = new ValidatorType("GreaterThanOrEqual", 3, "greater_than_or_equal");
            GreaterThanOrEqual = validatorType4;
            ValidatorType validatorType5 = new ValidatorType("LessThan", 4, "less_than");
            LessThan = validatorType5;
            ValidatorType validatorType6 = new ValidatorType("LessThanOrEqual", 5, "less_than_or_equal");
            LessThanOrEqual = validatorType6;
            ValidatorType[] validatorTypeArr = {validatorType, validatorType2, validatorType3, validatorType4, validatorType5, validatorType6};
            f304185b = validatorTypeArr;
            f304186c = kotlin.enums.c.a(validatorTypeArr);
        }

        private ValidatorType(String str, int i12, String str2) {
        }

        public static ValidatorType valueOf(String str) {
            return (ValidatorType) Enum.valueOf(ValidatorType.class, str);
        }

        public static ValidatorType[] values() {
            return (ValidatorType[]) f304185b.clone();
        }
    }

    public ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem(@k String str, @k ValidatorType validatorType, @k String str2) {
        this.message = str;
        this.validatorType = validatorType;
        this.value = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ValidatorType getValidatorType() {
        return this.validatorType;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
