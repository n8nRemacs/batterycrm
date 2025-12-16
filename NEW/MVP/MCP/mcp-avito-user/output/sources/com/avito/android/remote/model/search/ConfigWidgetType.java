package com.avito.android.remote.model.search;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineFilters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/search/ConfigWidgetType;", "", "(Ljava/lang/String;I)V", "SELECT", "CLEARANCE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConfigWidgetType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConfigWidgetType[] $VALUES;

    @c("select")
    public static final ConfigWidgetType SELECT = new ConfigWidgetType("SELECT", 0);

    @c("clearance")
    public static final ConfigWidgetType CLEARANCE = new ConfigWidgetType("CLEARANCE", 1);

    private static final /* synthetic */ ConfigWidgetType[] $values() {
        return new ConfigWidgetType[]{SELECT, CLEARANCE};
    }

    static {
        ConfigWidgetType[] configWidgetTypeArr$values = $values();
        $VALUES = configWidgetTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(configWidgetTypeArr$values);
    }

    private ConfigWidgetType(String str, int i12) {
    }

    @k
    public static a<ConfigWidgetType> getEntries() {
        return $ENTRIES;
    }

    public static ConfigWidgetType valueOf(String str) {
        return (ConfigWidgetType) Enum.valueOf(ConfigWidgetType.class, str);
    }

    public static ConfigWidgetType[] values() {
        return (ConfigWidgetType[]) $VALUES.clone();
    }
}
