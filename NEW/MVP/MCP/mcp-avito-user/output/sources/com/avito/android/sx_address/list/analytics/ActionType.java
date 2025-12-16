package com.avito.android.sx_address.list.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddressActionClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/analytics/ActionType;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActionType {

    /* renamed from: b, reason: collision with root package name */
    public static final ActionType f293042b;

    /* renamed from: c, reason: collision with root package name */
    public static final ActionType f293043c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ActionType[] f293044d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f293045e;

    static {
        ActionType actionType = new ActionType("DELETE", 0);
        f293042b = actionType;
        ActionType actionType2 = new ActionType("EDIT", 1);
        f293043c = actionType2;
        ActionType[] actionTypeArr = {actionType, actionType2};
        f293044d = actionTypeArr;
        f293045e = kotlin.enums.c.a(actionTypeArr);
    }

    public ActionType() {
        throw null;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) f293044d.clone();
    }
}
