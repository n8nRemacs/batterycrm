package com.avito.android.iac_analytics.public_module.analytics_models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacEnablingScenario.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_analytics/public_module/analytics_models/IacEnablingScenario;", "", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IacEnablingScenario {

    /* renamed from: b, reason: collision with root package name */
    public static final IacEnablingScenario f164281b;

    /* renamed from: c, reason: collision with root package name */
    public static final IacEnablingScenario f164282c;

    /* renamed from: d, reason: collision with root package name */
    public static final IacEnablingScenario f164283d;

    /* renamed from: e, reason: collision with root package name */
    public static final IacEnablingScenario f164284e;

    /* renamed from: f, reason: collision with root package name */
    public static final IacEnablingScenario f164285f;

    /* renamed from: g, reason: collision with root package name */
    public static final IacEnablingScenario f164286g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ IacEnablingScenario[] f164287h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f164288i;

    static {
        IacEnablingScenario iacEnablingScenario = new IacEnablingScenario("ITEM_PUBLISHING", 0);
        IacEnablingScenario iacEnablingScenario2 = new IacEnablingScenario("ITEM_EDITING", 1);
        IacEnablingScenario iacEnablingScenario3 = new IacEnablingScenario("SETTINGS", 2);
        f164281b = iacEnablingScenario3;
        IacEnablingScenario iacEnablingScenario4 = new IacEnablingScenario("CALL_REQUEST", 3);
        IacEnablingScenario iacEnablingScenario5 = new IacEnablingScenario("CALL_TIME", 4);
        f164282c = iacEnablingScenario5;
        IacEnablingScenario iacEnablingScenario6 = new IacEnablingScenario("SETTINGS_SYSTEM_MIC_PERMISSION", 5);
        IacEnablingScenario iacEnablingScenario7 = new IacEnablingScenario("SETTINGS_CUSTOM_MIC_PERMISSION", 6);
        IacEnablingScenario iacEnablingScenario8 = new IacEnablingScenario("ITEM_PUBLISHING_PERIODIC", 7);
        f164283d = iacEnablingScenario8;
        IacEnablingScenario iacEnablingScenario9 = new IacEnablingScenario("CALL_METHODS_FORCE", 8);
        f164284e = iacEnablingScenario9;
        IacEnablingScenario iacEnablingScenario10 = new IacEnablingScenario("PROFILE_SETTINGS", 9);
        IacEnablingScenario iacEnablingScenario11 = new IacEnablingScenario("IAC_PROBLEM_BANNER", 10);
        f164285f = iacEnablingScenario11;
        IacEnablingScenario iacEnablingScenario12 = new IacEnablingScenario("PRO_POPUP", 11);
        f164286g = iacEnablingScenario12;
        IacEnablingScenario[] iacEnablingScenarioArr = {iacEnablingScenario, iacEnablingScenario2, iacEnablingScenario3, iacEnablingScenario4, iacEnablingScenario5, iacEnablingScenario6, iacEnablingScenario7, iacEnablingScenario8, iacEnablingScenario9, iacEnablingScenario10, iacEnablingScenario11, iacEnablingScenario12};
        f164287h = iacEnablingScenarioArr;
        f164288i = c.a(iacEnablingScenarioArr);
    }

    public IacEnablingScenario() {
        throw null;
    }

    public static IacEnablingScenario valueOf(String str) {
        return (IacEnablingScenario) Enum.valueOf(IacEnablingScenario.class, str);
    }

    public static IacEnablingScenario[] values() {
        return (IacEnablingScenario[]) f164287h.clone();
    }
}
