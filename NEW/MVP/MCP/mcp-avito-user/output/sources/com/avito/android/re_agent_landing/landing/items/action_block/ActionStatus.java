package com.avito.android.re_agent_landing.landing.items.action_block;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/ActionStatus;", "", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ActionStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final ActionStatus f250711b;

    /* renamed from: c, reason: collision with root package name */
    public static final ActionStatus f250712c;

    /* renamed from: d, reason: collision with root package name */
    public static final ActionStatus f250713d;

    /* renamed from: e, reason: collision with root package name */
    public static final ActionStatus f250714e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ActionStatus[] f250715f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f250716g;

    static {
        ActionStatus actionStatus = new ActionStatus("Default", 0);
        f250711b = actionStatus;
        ActionStatus actionStatus2 = new ActionStatus("Verification", 1);
        f250712c = actionStatus2;
        ActionStatus actionStatus3 = new ActionStatus("ProfileExists", 2);
        f250713d = actionStatus3;
        ActionStatus actionStatus4 = new ActionStatus("Error", 3);
        f250714e = actionStatus4;
        ActionStatus[] actionStatusArr = {actionStatus, actionStatus2, actionStatus3, actionStatus4};
        f250715f = actionStatusArr;
        f250716g = kotlin.enums.c.a(actionStatusArr);
    }

    public ActionStatus() {
        throw null;
    }

    public static ActionStatus valueOf(String str) {
        return (ActionStatus) Enum.valueOf(ActionStatus.class, str);
    }

    public static ActionStatus[] values() {
        return (ActionStatus[]) f250715f.clone();
    }
}
