package com.avito.android.comparison.menu_bottom_sheet;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetButtonModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/menu_bottom_sheet/ActionType;", "", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionType {

    /* renamed from: b, reason: collision with root package name */
    public static final ActionType f124090b;

    /* renamed from: c, reason: collision with root package name */
    public static final ActionType f124091c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ActionType[] f124092d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f124093e;

    static {
        ActionType actionType = new ActionType("MESSAGE", 0);
        f124090b = actionType;
        ActionType actionType2 = new ActionType("REMOVE", 1);
        f124091c = actionType2;
        ActionType[] actionTypeArr = {actionType, actionType2};
        f124092d = actionTypeArr;
        f124093e = kotlin.enums.c.a(actionTypeArr);
    }

    public ActionType() {
        throw null;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) f124092d.clone();
    }
}
