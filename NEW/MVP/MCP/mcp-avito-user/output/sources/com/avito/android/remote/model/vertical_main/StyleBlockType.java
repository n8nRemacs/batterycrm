package com.avito.android.remote.model.vertical_main;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchFormWidget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/StyleBlockType;", "", "(Ljava/lang/String;I)V", "CATEGORY_SEARCH_WIDGET", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StyleBlockType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StyleBlockType[] $VALUES;

    @c("categorySearchWidget")
    public static final StyleBlockType CATEGORY_SEARCH_WIDGET = new StyleBlockType("CATEGORY_SEARCH_WIDGET", 0);

    private static final /* synthetic */ StyleBlockType[] $values() {
        return new StyleBlockType[]{CATEGORY_SEARCH_WIDGET};
    }

    static {
        StyleBlockType[] styleBlockTypeArr$values = $values();
        $VALUES = styleBlockTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(styleBlockTypeArr$values);
    }

    private StyleBlockType(String str, int i12) {
    }

    @k
    public static a<StyleBlockType> getEntries() {
        return $ENTRIES;
    }

    public static StyleBlockType valueOf(String str) {
        return (StyleBlockType) Enum.valueOf(StyleBlockType.class, str);
    }

    public static StyleBlockType[] values() {
        return (StyleBlockType[]) $VALUES.clone();
    }
}
