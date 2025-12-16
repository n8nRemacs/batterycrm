package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssistantUxImprovementsBuyerTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/AssistantUxImprovementsBuyerTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AssistantUxImprovementsBuyerTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AssistantUxImprovementsBuyerTestGroup f67768c;

    /* renamed from: d, reason: collision with root package name */
    public static final AssistantUxImprovementsBuyerTestGroup f67769d;

    /* renamed from: e, reason: collision with root package name */
    public static final AssistantUxImprovementsBuyerTestGroup f67770e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AssistantUxImprovementsBuyerTestGroup[] f67771f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67772g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67773b;

    static {
        AssistantUxImprovementsBuyerTestGroup assistantUxImprovementsBuyerTestGroup = new AssistantUxImprovementsBuyerTestGroup("NONE", 0, "");
        f67768c = assistantUxImprovementsBuyerTestGroup;
        AssistantUxImprovementsBuyerTestGroup assistantUxImprovementsBuyerTestGroup2 = new AssistantUxImprovementsBuyerTestGroup("CONTROL", 1, "control");
        f67769d = assistantUxImprovementsBuyerTestGroup2;
        AssistantUxImprovementsBuyerTestGroup assistantUxImprovementsBuyerTestGroup3 = new AssistantUxImprovementsBuyerTestGroup("TEST", 2, "assistant_ux_improvements");
        f67770e = assistantUxImprovementsBuyerTestGroup3;
        AssistantUxImprovementsBuyerTestGroup[] assistantUxImprovementsBuyerTestGroupArr = {assistantUxImprovementsBuyerTestGroup, assistantUxImprovementsBuyerTestGroup2, assistantUxImprovementsBuyerTestGroup3};
        f67771f = assistantUxImprovementsBuyerTestGroupArr;
        f67772g = c.a(assistantUxImprovementsBuyerTestGroupArr);
    }

    public AssistantUxImprovementsBuyerTestGroup(String str, int i12, String str2) {
        this.f67773b = str2;
    }

    public static AssistantUxImprovementsBuyerTestGroup valueOf(String str) {
        return (AssistantUxImprovementsBuyerTestGroup) Enum.valueOf(AssistantUxImprovementsBuyerTestGroup.class, str);
    }

    public static AssistantUxImprovementsBuyerTestGroup[] values() {
        return (AssistantUxImprovementsBuyerTestGroup[]) f67771f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67778b() {
        return this.f67773b;
    }
}
