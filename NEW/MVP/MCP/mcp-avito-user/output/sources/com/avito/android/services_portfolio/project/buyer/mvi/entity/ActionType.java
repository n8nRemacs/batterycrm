package com.avito.android.services_portfolio.project.buyer.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProjectBuyer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/ActionType;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionType {

    /* renamed from: b, reason: collision with root package name */
    public static final ActionType f280035b;

    /* renamed from: c, reason: collision with root package name */
    public static final ActionType f280036c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ActionType[] f280037d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f280038e;

    static {
        ActionType actionType = new ActionType("PHONE", 0);
        f280035b = actionType;
        ActionType actionType2 = new ActionType("MESSAGE", 1);
        f280036c = actionType2;
        ActionType[] actionTypeArr = {actionType, actionType2};
        f280037d = actionTypeArr;
        f280038e = c.a(actionTypeArr);
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) f280037d.clone();
    }
}
