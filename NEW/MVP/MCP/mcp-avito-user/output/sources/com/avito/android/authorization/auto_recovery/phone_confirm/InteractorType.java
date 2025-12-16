package com.avito.android.authorization.auto_recovery.phone_confirm;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoRecoveryCodeCheckScenarioDiModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/phone_confirm/InteractorType;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InteractorType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InteractorType[] f93196b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f93197c;

    static {
        InteractorType[] interactorTypeArr = {new InteractorType("REQUEST", 0), new InteractorType("RE_REQUEST", 1)};
        f93196b = interactorTypeArr;
        f93197c = kotlin.enums.c.a(interactorTypeArr);
    }

    public InteractorType() {
        throw null;
    }

    public static InteractorType valueOf(String str) {
        return (InteractorType) Enum.valueOf(InteractorType.class, str);
    }

    public static InteractorType[] values() {
        return (InteractorType[]) f93196b.clone();
    }
}
