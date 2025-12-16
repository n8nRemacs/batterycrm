package com.avito.android.remote.model.category_parameters;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SortDirection.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SortDirection;", "", "(Ljava/lang/String;I)V", "Ascending", "Descending", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SortDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SortDirection[] $VALUES;

    @c("asc")
    public static final SortDirection Ascending = new SortDirection("Ascending", 0);

    @c("desc")
    public static final SortDirection Descending = new SortDirection("Descending", 1);

    private static final /* synthetic */ SortDirection[] $values() {
        return new SortDirection[]{Ascending, Descending};
    }

    static {
        SortDirection[] sortDirectionArr$values = $values();
        $VALUES = sortDirectionArr$values;
        $ENTRIES = kotlin.enums.c.a(sortDirectionArr$values);
    }

    private SortDirection(String str, int i12) {
    }

    @k
    public static a<SortDirection> getEntries() {
        return $ENTRIES;
    }

    public static SortDirection valueOf(String str) {
        return (SortDirection) Enum.valueOf(SortDirection.class, str);
    }

    public static SortDirection[] values() {
        return (SortDirection[]) $VALUES.clone();
    }
}
