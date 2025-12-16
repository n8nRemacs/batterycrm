package com.avito.android.remote.model.search;

import Y61.k;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineFilters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/search/ConfigCalendarSelectionType;", "", "(Ljava/lang/String;I)V", "DATE_RANGE", "SINGLE_DATE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConfigCalendarSelectionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConfigCalendarSelectionType[] $VALUES;

    @c(DateRangeParameter.TYPE)
    public static final ConfigCalendarSelectionType DATE_RANGE = new ConfigCalendarSelectionType("DATE_RANGE", 0);

    @c("singleDate")
    public static final ConfigCalendarSelectionType SINGLE_DATE = new ConfigCalendarSelectionType("SINGLE_DATE", 1);

    private static final /* synthetic */ ConfigCalendarSelectionType[] $values() {
        return new ConfigCalendarSelectionType[]{DATE_RANGE, SINGLE_DATE};
    }

    static {
        ConfigCalendarSelectionType[] configCalendarSelectionTypeArr$values = $values();
        $VALUES = configCalendarSelectionTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(configCalendarSelectionTypeArr$values);
    }

    private ConfigCalendarSelectionType(String str, int i12) {
    }

    @k
    public static a<ConfigCalendarSelectionType> getEntries() {
        return $ENTRIES;
    }

    public static ConfigCalendarSelectionType valueOf(String str) {
        return (ConfigCalendarSelectionType) Enum.valueOf(ConfigCalendarSelectionType.class, str);
    }

    public static ConfigCalendarSelectionType[] values() {
        return (ConfigCalendarSelectionType[]) $VALUES.clone();
    }
}
