package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Portfolio.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/ActionType;", "", "(Ljava/lang/String;I)V", "Button", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;

    @c("Button")
    public static final ActionType Button = new ActionType("Button", 0);

    private static final /* synthetic */ ActionType[] $values() {
        return new ActionType[]{Button};
    }

    static {
        ActionType[] actionTypeArr$values = $values();
        $VALUES = actionTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(actionTypeArr$values);
    }

    private ActionType(String str, int i12) {
    }

    @k
    public static a<ActionType> getEntries() {
        return $ENTRIES;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
