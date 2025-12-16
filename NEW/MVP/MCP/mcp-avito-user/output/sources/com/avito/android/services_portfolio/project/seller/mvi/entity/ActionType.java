package com.avito.android.services_portfolio.project.seller.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProjectSeller.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/entity/ActionType;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionType {

    /* renamed from: b, reason: collision with root package name */
    public static final ActionType f280250b;

    /* renamed from: c, reason: collision with root package name */
    public static final ActionType f280251c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ActionType[] f280252d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f280253e;

    static {
        ActionType actionType = new ActionType("BUTTON_ACTION_TYPE", 0);
        f280250b = actionType;
        ActionType actionType2 = new ActionType("SUPPORT_LINK_TYPE", 1);
        f280251c = actionType2;
        ActionType[] actionTypeArr = {actionType, actionType2};
        f280252d = actionTypeArr;
        f280253e = c.a(actionTypeArr);
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) f280252d.clone();
    }
}
