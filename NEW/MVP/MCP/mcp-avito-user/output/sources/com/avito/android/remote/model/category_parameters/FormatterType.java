package com.avito.android.remote.model.category_parameters;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormatterType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FormatterType;", "", "(Ljava/lang/String;I)V", "PHONE", "PRICE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FormatterType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FormatterType[] $VALUES;

    @c("phone")
    public static final FormatterType PHONE = new FormatterType("PHONE", 0);

    @c("price")
    public static final FormatterType PRICE = new FormatterType("PRICE", 1);

    private static final /* synthetic */ FormatterType[] $values() {
        return new FormatterType[]{PHONE, PRICE};
    }

    static {
        FormatterType[] formatterTypeArr$values = $values();
        $VALUES = formatterTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(formatterTypeArr$values);
    }

    private FormatterType(String str, int i12) {
    }

    @k
    public static a<FormatterType> getEntries() {
        return $ENTRIES;
    }

    public static FormatterType valueOf(String str) {
        return (FormatterType) Enum.valueOf(FormatterType.class, str);
    }

    public static FormatterType[] values() {
        return (FormatterType[]) $VALUES.clone();
    }
}
