package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FactorUnavailableReasonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/RadioState;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RadioState {

    /* renamed from: b, reason: collision with root package name */
    public static final RadioState f93165b;

    /* renamed from: c, reason: collision with root package name */
    public static final RadioState f93166c;

    /* renamed from: d, reason: collision with root package name */
    public static final RadioState f93167d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ RadioState[] f93168e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f93169f;

    static {
        RadioState radioState = new RadioState("EMPTY", 0);
        f93165b = radioState;
        RadioState radioState2 = new RadioState("FACTOR_NOT_AVAILABLE", 1);
        f93166c = radioState2;
        RadioState radioState3 = new RadioState("MESSAGE_NOT_COMING", 2);
        f93167d = radioState3;
        RadioState[] radioStateArr = {radioState, radioState2, radioState3};
        f93168e = radioStateArr;
        f93169f = c.a(radioStateArr);
    }

    public RadioState() {
        throw null;
    }

    public static RadioState valueOf(String str) {
        return (RadioState) Enum.valueOf(RadioState.class, str);
    }

    public static RadioState[] values() {
        return (RadioState[]) f93168e.clone();
    }
}
