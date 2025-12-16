package com.avito.android.gig_apply.domain;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GigSlotByTimeThresholdInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/domain/ActionWaitingFor;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionWaitingFor {

    /* renamed from: b, reason: collision with root package name */
    public static final ActionWaitingFor f159658b;

    /* renamed from: c, reason: collision with root package name */
    public static final ActionWaitingFor f159659c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ActionWaitingFor[] f159660d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159661e;

    static {
        ActionWaitingFor actionWaitingFor = new ActionWaitingFor("CHECK_OUT", 0);
        f159658b = actionWaitingFor;
        ActionWaitingFor actionWaitingFor2 = new ActionWaitingFor("CHECK_IN", 1);
        f159659c = actionWaitingFor2;
        ActionWaitingFor[] actionWaitingForArr = {actionWaitingFor, actionWaitingFor2};
        f159660d = actionWaitingForArr;
        f159661e = kotlin.enums.c.a(actionWaitingForArr);
    }

    public ActionWaitingFor() {
        throw null;
    }

    public static ActionWaitingFor valueOf(String str) {
        return (ActionWaitingFor) Enum.valueOf(ActionWaitingFor.class, str);
    }

    public static ActionWaitingFor[] values() {
        return (ActionWaitingFor[]) f159660d.clone();
    }
}
