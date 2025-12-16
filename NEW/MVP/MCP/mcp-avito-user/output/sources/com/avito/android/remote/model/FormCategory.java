package com.avito.android.remote.model;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConsultationFormData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/FormCategory;", "", "(Ljava/lang/String;I)V", "NewBuildings", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FormCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FormCategory[] $VALUES;
    public static final FormCategory NewBuildings = new FormCategory("NewBuildings", 0);

    private static final /* synthetic */ FormCategory[] $values() {
        return new FormCategory[]{NewBuildings};
    }

    static {
        FormCategory[] formCategoryArr$values = $values();
        $VALUES = formCategoryArr$values;
        $ENTRIES = c.a(formCategoryArr$values);
    }

    private FormCategory(String str, int i12) {
    }

    @k
    public static a<FormCategory> getEntries() {
        return $ENTRIES;
    }

    public static FormCategory valueOf(String str) {
        return (FormCategory) Enum.valueOf(FormCategory.class, str);
    }

    public static FormCategory[] values() {
        return (FormCategory[]) $VALUES.clone();
    }
}
