package com.avito.android.iac_analytics.public_module.analytics_models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallEnablingScenario.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_analytics/public_module/analytics_models/CallEnablingScenario;", "", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallEnablingScenario {

    /* renamed from: b, reason: collision with root package name */
    public static final CallEnablingScenario f164273b;

    /* renamed from: c, reason: collision with root package name */
    public static final CallEnablingScenario f164274c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CallEnablingScenario[] f164275d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f164276e;

    static {
        CallEnablingScenario callEnablingScenario = new CallEnablingScenario("ITEM_PUBLISHING", 0);
        CallEnablingScenario callEnablingScenario2 = new CallEnablingScenario("ITEM_EDITING", 1);
        f164273b = callEnablingScenario2;
        CallEnablingScenario callEnablingScenario3 = new CallEnablingScenario("IAC_CHOSEN_SLOT", 2);
        f164274c = callEnablingScenario3;
        CallEnablingScenario[] callEnablingScenarioArr = {callEnablingScenario, callEnablingScenario2, callEnablingScenario3};
        f164275d = callEnablingScenarioArr;
        f164276e = c.a(callEnablingScenarioArr);
    }

    public CallEnablingScenario() {
        throw null;
    }

    public static CallEnablingScenario valueOf(String str) {
        return (CallEnablingScenario) Enum.valueOf(CallEnablingScenario.class, str);
    }

    public static CallEnablingScenario[] values() {
        return (CallEnablingScenario[]) f164275d.clone();
    }
}
