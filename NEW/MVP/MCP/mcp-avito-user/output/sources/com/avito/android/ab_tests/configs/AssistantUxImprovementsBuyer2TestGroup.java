package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssistantUxImprovementsBuyer2TestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/AssistantUxImprovementsBuyer2TestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AssistantUxImprovementsBuyer2TestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AssistantUxImprovementsBuyer2TestGroup f67762c;

    /* renamed from: d, reason: collision with root package name */
    public static final AssistantUxImprovementsBuyer2TestGroup f67763d;

    /* renamed from: e, reason: collision with root package name */
    public static final AssistantUxImprovementsBuyer2TestGroup f67764e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AssistantUxImprovementsBuyer2TestGroup[] f67765f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67766g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67767b;

    static {
        AssistantUxImprovementsBuyer2TestGroup assistantUxImprovementsBuyer2TestGroup = new AssistantUxImprovementsBuyer2TestGroup("NONE", 0, "");
        f67762c = assistantUxImprovementsBuyer2TestGroup;
        AssistantUxImprovementsBuyer2TestGroup assistantUxImprovementsBuyer2TestGroup2 = new AssistantUxImprovementsBuyer2TestGroup("CONTROL", 1, "control");
        AssistantUxImprovementsBuyer2TestGroup assistantUxImprovementsBuyer2TestGroup3 = new AssistantUxImprovementsBuyer2TestGroup("NEW_UX_NO_SELLER_CAPTIONS", 2, "new_ux_no_seller_captions");
        f67763d = assistantUxImprovementsBuyer2TestGroup3;
        AssistantUxImprovementsBuyer2TestGroup assistantUxImprovementsBuyer2TestGroup4 = new AssistantUxImprovementsBuyer2TestGroup("NEW_UX_WITH_SELLER_CAPTIONS", 3, "new_ux_with_seller_captions");
        f67764e = assistantUxImprovementsBuyer2TestGroup4;
        AssistantUxImprovementsBuyer2TestGroup[] assistantUxImprovementsBuyer2TestGroupArr = {assistantUxImprovementsBuyer2TestGroup, assistantUxImprovementsBuyer2TestGroup2, assistantUxImprovementsBuyer2TestGroup3, assistantUxImprovementsBuyer2TestGroup4};
        f67765f = assistantUxImprovementsBuyer2TestGroupArr;
        f67766g = c.a(assistantUxImprovementsBuyer2TestGroupArr);
    }

    public AssistantUxImprovementsBuyer2TestGroup(String str, int i12, String str2) {
        this.f67767b = str2;
    }

    public static AssistantUxImprovementsBuyer2TestGroup valueOf(String str) {
        return (AssistantUxImprovementsBuyer2TestGroup) Enum.valueOf(AssistantUxImprovementsBuyer2TestGroup.class, str);
    }

    public static AssistantUxImprovementsBuyer2TestGroup[] values() {
        return (AssistantUxImprovementsBuyer2TestGroup[]) f67765f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67767b() {
        return this.f67767b;
    }
}
