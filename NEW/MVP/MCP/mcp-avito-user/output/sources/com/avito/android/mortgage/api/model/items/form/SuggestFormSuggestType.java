package com.avito.android.mortgage.api.model.items.form;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestFormContentItemValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/SuggestFormSuggestType;", "", "(Ljava/lang/String;I)V", "FULL_NAME", "ADDRESS", "FMS_UNIT", "ORGANIZATION", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuggestFormSuggestType {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    public static final SuggestFormSuggestType ADDRESS;

    @com.google.gson.annotations.c("fmsUnit")
    public static final SuggestFormSuggestType FMS_UNIT;

    @com.google.gson.annotations.c("fullName")
    public static final SuggestFormSuggestType FULL_NAME;

    @com.google.gson.annotations.c("organization")
    public static final SuggestFormSuggestType ORGANIZATION;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SuggestFormSuggestType[] f198241b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f198242c;

    static {
        SuggestFormSuggestType suggestFormSuggestType = new SuggestFormSuggestType("FULL_NAME", 0);
        FULL_NAME = suggestFormSuggestType;
        SuggestFormSuggestType suggestFormSuggestType2 = new SuggestFormSuggestType("ADDRESS", 1);
        ADDRESS = suggestFormSuggestType2;
        SuggestFormSuggestType suggestFormSuggestType3 = new SuggestFormSuggestType("FMS_UNIT", 2);
        FMS_UNIT = suggestFormSuggestType3;
        SuggestFormSuggestType suggestFormSuggestType4 = new SuggestFormSuggestType("ORGANIZATION", 3);
        ORGANIZATION = suggestFormSuggestType4;
        SuggestFormSuggestType[] suggestFormSuggestTypeArr = {suggestFormSuggestType, suggestFormSuggestType2, suggestFormSuggestType3, suggestFormSuggestType4};
        f198241b = suggestFormSuggestTypeArr;
        f198242c = kotlin.enums.c.a(suggestFormSuggestTypeArr);
    }

    private SuggestFormSuggestType(String str, int i12) {
    }

    public static SuggestFormSuggestType valueOf(String str) {
        return (SuggestFormSuggestType) Enum.valueOf(SuggestFormSuggestType.class, str);
    }

    public static SuggestFormSuggestType[] values() {
        return (SuggestFormSuggestType[]) f198241b.clone();
    }
}
