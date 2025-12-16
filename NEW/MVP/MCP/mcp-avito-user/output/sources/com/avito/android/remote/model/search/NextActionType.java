package com.avito.android.remote.model.search;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineFilters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/search/NextActionType;", "", "(Ljava/lang/String;I)V", "Autocomplete", "FocusField", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NextActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NextActionType[] $VALUES;

    @c("autocomplete")
    public static final NextActionType Autocomplete = new NextActionType("Autocomplete", 0);

    @c("focusField")
    public static final NextActionType FocusField = new NextActionType("FocusField", 1);

    private static final /* synthetic */ NextActionType[] $values() {
        return new NextActionType[]{Autocomplete, FocusField};
    }

    static {
        NextActionType[] nextActionTypeArr$values = $values();
        $VALUES = nextActionTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(nextActionTypeArr$values);
    }

    private NextActionType(String str, int i12) {
    }

    @k
    public static a<NextActionType> getEntries() {
        return $ENTRIES;
    }

    public static NextActionType valueOf(String str) {
        return (NextActionType) Enum.valueOf(NextActionType.class, str);
    }

    public static NextActionType[] values() {
        return (NextActionType[]) $VALUES.clone();
    }
}
