package com.avito.android.sbc.create.mvi.util;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldsWithValidation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/util/FieldsWithValidation;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FieldsWithValidation {

    /* renamed from: b, reason: collision with root package name */
    public static final FieldsWithValidation f259889b;

    /* renamed from: c, reason: collision with root package name */
    public static final FieldsWithValidation f259890c;

    /* renamed from: d, reason: collision with root package name */
    public static final FieldsWithValidation f259891d;

    /* renamed from: e, reason: collision with root package name */
    public static final FieldsWithValidation f259892e;

    /* renamed from: f, reason: collision with root package name */
    public static final FieldsWithValidation f259893f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ FieldsWithValidation[] f259894g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f259895h;

    static {
        FieldsWithValidation fieldsWithValidation = new FieldsWithValidation("EnteredRublesDiscount", 0);
        f259889b = fieldsWithValidation;
        FieldsWithValidation fieldsWithValidation2 = new FieldsWithValidation("EnteredPercentDiscount", 1);
        f259890c = fieldsWithValidation2;
        FieldsWithValidation fieldsWithValidation3 = new FieldsWithValidation("Audience", 2);
        f259891d = fieldsWithValidation3;
        FieldsWithValidation fieldsWithValidation4 = new FieldsWithValidation("EnteredBudget", 3);
        f259892e = fieldsWithValidation4;
        FieldsWithValidation fieldsWithValidation5 = new FieldsWithValidation("ValidityDays", 4);
        f259893f = fieldsWithValidation5;
        FieldsWithValidation[] fieldsWithValidationArr = {fieldsWithValidation, fieldsWithValidation2, fieldsWithValidation3, fieldsWithValidation4, fieldsWithValidation5};
        f259894g = fieldsWithValidationArr;
        f259895h = kotlin.enums.c.a(fieldsWithValidationArr);
    }

    public FieldsWithValidation() {
        throw null;
    }

    public static FieldsWithValidation valueOf(String str) {
        return (FieldsWithValidation) Enum.valueOf(FieldsWithValidation.class, str);
    }

    public static FieldsWithValidation[] values() {
        return (FieldsWithValidation[]) f259894g.clone();
    }
}
