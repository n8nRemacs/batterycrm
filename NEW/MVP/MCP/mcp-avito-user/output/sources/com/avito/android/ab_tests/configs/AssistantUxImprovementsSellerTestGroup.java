package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssistantUxImprovementsSellerTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/AssistantUxImprovementsSellerTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AssistantUxImprovementsSellerTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AssistantUxImprovementsSellerTestGroup f67774c;

    /* renamed from: d, reason: collision with root package name */
    public static final AssistantUxImprovementsSellerTestGroup f67775d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AssistantUxImprovementsSellerTestGroup[] f67776e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67777f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67778b;

    static {
        AssistantUxImprovementsSellerTestGroup assistantUxImprovementsSellerTestGroup = new AssistantUxImprovementsSellerTestGroup("NONE", 0, "");
        f67774c = assistantUxImprovementsSellerTestGroup;
        AssistantUxImprovementsSellerTestGroup assistantUxImprovementsSellerTestGroup2 = new AssistantUxImprovementsSellerTestGroup("CONTROL", 1, "control");
        AssistantUxImprovementsSellerTestGroup assistantUxImprovementsSellerTestGroup3 = new AssistantUxImprovementsSellerTestGroup("TEST", 2, "assistant_ux_improvements");
        f67775d = assistantUxImprovementsSellerTestGroup3;
        AssistantUxImprovementsSellerTestGroup[] assistantUxImprovementsSellerTestGroupArr = {assistantUxImprovementsSellerTestGroup, assistantUxImprovementsSellerTestGroup2, assistantUxImprovementsSellerTestGroup3};
        f67776e = assistantUxImprovementsSellerTestGroupArr;
        f67777f = c.a(assistantUxImprovementsSellerTestGroupArr);
    }

    public AssistantUxImprovementsSellerTestGroup(String str, int i12, String str2) {
        this.f67778b = str2;
    }

    public static AssistantUxImprovementsSellerTestGroup valueOf(String str) {
        return (AssistantUxImprovementsSellerTestGroup) Enum.valueOf(AssistantUxImprovementsSellerTestGroup.class, str);
    }

    public static AssistantUxImprovementsSellerTestGroup[] values() {
        return (AssistantUxImprovementsSellerTestGroup[]) f67776e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67782b() {
        return this.f67778b;
    }
}
