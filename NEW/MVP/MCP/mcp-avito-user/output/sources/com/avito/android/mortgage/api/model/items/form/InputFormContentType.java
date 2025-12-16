package com.avito.android.mortgage.api.model.items.form;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InputFormContentItemValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/InputFormContentType;", "", "(Ljava/lang/String;I)V", "PLAIN", "PHONE", "DATE", "EMAIL", "PERCENT", "NUMBER", "FMS_UNIT_CODE", "PASSPORT_SERIES_NUMBER", "PERSON_INN", "ORGANIZATION_INN", "MONEY", "SHILS", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InputFormContentType {

    @com.google.gson.annotations.c("date")
    public static final InputFormContentType DATE;

    @com.google.gson.annotations.c("email")
    public static final InputFormContentType EMAIL;

    @com.google.gson.annotations.c("fmsUnitCode")
    public static final InputFormContentType FMS_UNIT_CODE;

    @com.google.gson.annotations.c("money")
    public static final InputFormContentType MONEY;

    @com.google.gson.annotations.c("number")
    public static final InputFormContentType NUMBER;

    @com.google.gson.annotations.c("organizationINN")
    public static final InputFormContentType ORGANIZATION_INN;

    @com.google.gson.annotations.c("passportSeriesNumber")
    public static final InputFormContentType PASSPORT_SERIES_NUMBER;

    @com.google.gson.annotations.c("percent")
    public static final InputFormContentType PERCENT;

    @com.google.gson.annotations.c("personInn")
    public static final InputFormContentType PERSON_INN;

    @com.google.gson.annotations.c("phone")
    public static final InputFormContentType PHONE;

    @com.google.gson.annotations.c("plain")
    public static final InputFormContentType PLAIN;

    @com.google.gson.annotations.c("snils")
    public static final InputFormContentType SHILS;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InputFormContentType[] f198232b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f198233c;

    static {
        InputFormContentType inputFormContentType = new InputFormContentType("PLAIN", 0);
        PLAIN = inputFormContentType;
        InputFormContentType inputFormContentType2 = new InputFormContentType("PHONE", 1);
        PHONE = inputFormContentType2;
        InputFormContentType inputFormContentType3 = new InputFormContentType("DATE", 2);
        DATE = inputFormContentType3;
        InputFormContentType inputFormContentType4 = new InputFormContentType("EMAIL", 3);
        EMAIL = inputFormContentType4;
        InputFormContentType inputFormContentType5 = new InputFormContentType("PERCENT", 4);
        PERCENT = inputFormContentType5;
        InputFormContentType inputFormContentType6 = new InputFormContentType("NUMBER", 5);
        NUMBER = inputFormContentType6;
        InputFormContentType inputFormContentType7 = new InputFormContentType("FMS_UNIT_CODE", 6);
        FMS_UNIT_CODE = inputFormContentType7;
        InputFormContentType inputFormContentType8 = new InputFormContentType("PASSPORT_SERIES_NUMBER", 7);
        PASSPORT_SERIES_NUMBER = inputFormContentType8;
        InputFormContentType inputFormContentType9 = new InputFormContentType("PERSON_INN", 8);
        PERSON_INN = inputFormContentType9;
        InputFormContentType inputFormContentType10 = new InputFormContentType("ORGANIZATION_INN", 9);
        ORGANIZATION_INN = inputFormContentType10;
        InputFormContentType inputFormContentType11 = new InputFormContentType("MONEY", 10);
        MONEY = inputFormContentType11;
        InputFormContentType inputFormContentType12 = new InputFormContentType("SHILS", 11);
        SHILS = inputFormContentType12;
        InputFormContentType[] inputFormContentTypeArr = {inputFormContentType, inputFormContentType2, inputFormContentType3, inputFormContentType4, inputFormContentType5, inputFormContentType6, inputFormContentType7, inputFormContentType8, inputFormContentType9, inputFormContentType10, inputFormContentType11, inputFormContentType12};
        f198232b = inputFormContentTypeArr;
        f198233c = kotlin.enums.c.a(inputFormContentTypeArr);
    }

    private InputFormContentType(String str, int i12) {
    }

    public static InputFormContentType valueOf(String str) {
        return (InputFormContentType) Enum.valueOf(InputFormContentType.class, str);
    }

    public static InputFormContentType[] values() {
        return (InputFormContentType[]) f198232b.clone();
    }
}
